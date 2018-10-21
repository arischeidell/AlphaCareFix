/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ariannascheidell
 */
public class Meeting {

    private ArrayList<User> attendees;
    private Date datetime;
    private String place;

    /**
     * This is the default constructor for the Meeting class.
     *
     * @param attendees An ArrayList of Users representing meeting attendees.
     * @param datetime A Calendar representing the date and time of the meeting.
     * @param place A string representing the place the meeting will be held.
     */
    public Meeting(ArrayList<User> attendees, Date datetime, String place) {
        this.attendees = attendees;
        this.datetime = datetime;
        this.place = place;
    }

    /**
     * Returns the ArrayList of attendees.
     *
     * @return An ArrayList of Users representing the attendees.
     */
    public ArrayList<User> getAttendees() {
        return attendees;
    }

    /**
     * Sets the meeting attendees.
     *
     * @param attendees An ArrayList of Users representing the attendees.
     */
    public void setAttendees(ArrayList<User> attendees) {
        this.attendees = attendees;
    }

    /**
     * Returns a Date representing the date and time of the meeting.
     *
     * @return A Date representing the date and time of the meeting.
     */
    public Date getDatetime() {
        return datetime;
    }

    /**
     * Sets the date and time of the meeting.
     *
     * @param datetime A Date representing the date and time of the meeting.
     */
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    /**
     * Returns a String representing the place of the meeting.
     *
     * @return a String representing the place of the meeting.
     */
    public String getPlace() {
        return place;
    }

    /**
     * Sets the place of the meeting.
     *
     * @param place A string representing the place of the meeting.
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * Adds an attendee to the meeting.
     *
     * @param u A user representing an attendee.
     */
    public void addAttendee(User u) {

    }

    /**
     * Removes an attendee from the meeting.
     *
     * @param u A user representing an attendee.
     */
    public void removeAttendee(User u) {

    }
}
