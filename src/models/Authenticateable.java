/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author ariannascheidell
 */
public interface Authenticateable {

    /**
     * This method checks authenticates the user.
     *
     * @param username The user's username.
     * @param password The user's password.
     * @return A boolean representing whether authentication is successful.
     */
    public boolean authenticate(String username, char[] password);

    /**
     * Checks whether a user exists.
     *
     * @param username The user's username.
     * @return A boolean representing whether user exists.
     */
    public boolean userExists(String username);
}
