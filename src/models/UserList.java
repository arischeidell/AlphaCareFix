/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author ariannascheidell
 */
public class UserList implements Authenticateable{
    private ArrayList<User> users;
    
    /**
     * This is the default constructor for the UserList class.
     */
    public UserList() {
        this.users = new ArrayList();
    }
    
    /**
     * Adds a user to the list.
     * @param u A User to be added to the list.
     */
    public void addUser(User u) {
        
    }
    
    /**
     * Removes a user from the list.
     * @param u A user to be removed from the list.
     */
    public void removeUser(User u) {
        
    }
    
    /**
     * This method checks authenticates the user. Checks to see if username and password match with a User in the ArrayList.
     * @param username The user's username.
     * @param password The user's password.
     * @return A boolean representing whether authentication is successful.
     */
    @Override
    public boolean authenticate(String username, char[] password) {
        return false;
    }

    /**
     * Checks whether a user exists in the ArrayList of users.
     * @param username The user's username.
     * @return A boolean representing whether user exists.
     */
    @Override
    public boolean userExists(String username) {
        return false;
    }
}
