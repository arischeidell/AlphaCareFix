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
public class Doctor extends User {



    /**
     * Constructor to create a Doctor object
     *
     * @param username The doctor's username.
     * @param password The doctor's password.
     */
    public Doctor(String username, char[] password) {
        super(username, password);
    }

    /**
     * Adds a meeting to a doctor's schedule.
     *
     * @param m An object holding information about a meeting.
     */

}
