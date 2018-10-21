/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paul
 */
public class UserStore {

    private List<User> userList;
    private final String fileName = "UserList.json";
    private User currentlyAuthenticatedUser;

    private UserStore() {
        userList = new ArrayList<>();
//        userList.add(new Patient("testuser", "testpass".toCharArray(), new Address(), "NA"));
//        Patient p1 = (Patient)userList.get(0);
//        p1.setFirstName("John");
//        p1.setLastName("Doe");
//        p1.setAge(55);
//        p1.setHeight(66.5);
//        p1.setWeight(145.3);
        loadUserList();
    }

    public static UserStore getInstance() {
        return UserStoreHolder.INSTANCE;
    }

    private static class UserStoreHolder {

        private static final UserStore INSTANCE = new UserStore();
    }

    public boolean authenticateUser(String username, String password) {
        userList.stream().filter((u) -> (u.getUsername().equals(username))).filter((u) -> (Arrays.equals(u.getPassword(), password.toCharArray()))).forEachOrdered((u) -> {
            this.currentlyAuthenticatedUser = u;
        });
        return userList.stream().filter((u) -> (u.getUsername().equals(username))).anyMatch((u) -> (Arrays.equals(u.getPassword(), password.toCharArray())));
    }

    public User getCurrentlyAuthenticatedUser() {
        return this.currentlyAuthenticatedUser;
    }

    public void clearAuthenticatedUser() {
        this.currentlyAuthenticatedUser = null;
    }

    public void loadUserList() {
        Gson gson = new Gson();

        try {

            BufferedReader br = new BufferedReader(
                    new FileReader(fileName));
            String str = br.readLine();
            if (str == null || str.isEmpty()) {
                this.userList = new ArrayList<>();
            } else if (str.contentEquals("null")) {
                this.userList = new ArrayList<>();
            } else {
                br = new BufferedReader(
                        new FileReader(fileName));
                Type ListType = new TypeToken<List<Patient>>() {
                }.getType();

                List<User> uList = gson.fromJson(br, ListType);
                this.userList = uList;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveUserList() {

        File file = new File(fileName);
        System.out.println("Path: " + file.getAbsolutePath());
        try (Writer writer = new FileWriter(fileName)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(this.userList, writer);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(UserStore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
