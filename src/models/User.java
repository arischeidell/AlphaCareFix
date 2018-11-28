/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 * Class represents a user
 *
 * @author ariannascheidell
 */
public abstract class User {

    private String firstName;
    private String lastName;
    private String username;
    private char[] password;
    private ArrayList<Permission> permissions;
    private boolean isAdmin = false;

    /**
     * Constructs a user object.
     *
     * @param username The user's username.
     * @param password The user's password.
     */
    public User(String username, char[] password) {
        this.username = username;
        this.password = password;
        this.permissions = new ArrayList();
        this.firstName = "";
        this.lastName = "";
    }

    public void setPermissions(ArrayList<Permission> permissions) {
        this.permissions = permissions;
    }
    
    public User(){
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public User() {
//        this.username = "";
//        this.firstName = "";
//        this.lastName = "";
//        char[] pw = {};
//        this.password = pw;
//        this.permissions = new ArrayList();
//    }

    /**
     * Gets the username for a user.
     *
     * @return A string representing the user's username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username for a user.
     *
     * @param username A string representing the user's new username.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the password for a user
     *
     * @return A char[] representing the user's password.
     */
    public char[] getPassword() {
        return password;
    }

    /**
     * Sets the password for a user
     *
     * @param password A char[] representing the new password.
     */
    public void setPassword(char[] password) {
        this.password = password;
    }

    /**
     * Adds a permission to a user record
     *
     * @param p The Permission to be added.
     */
    public void addPermission(Permission p) {
        permissions.add(p);
    }

    /**
     * Removes access permission from a user
     *
     * @param p The Permission to be removed.
     */
    public void removePermission(Permission p) {

    }

    /**
     * Gets an array list of all permissions a user has
     *
     * @return permissions An ArrayList containing the user's permissions.
     */
    public ArrayList<Permission> getPermissions() {
        return permissions;
    }

}
