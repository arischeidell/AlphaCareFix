/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Meeting;
import views.MeetingView;

/**
 *
 * @author Paul
 */
public class MeetingController {

    private MeetingView view;

    public MeetingController() {
        System.out.println("Meeting Controller"); //for testing purposes
        view = new MeetingView();
    }

    /**
     * Schedules a meeting for users
     *
     */
    public void scheduleMeeting() {

    }

    /**
     * Gets all the meetings for a user
     *
     * @return Meeting Object
     */
    public Meeting getMeetingFromUser() {
        return null;
    }

    /**
     * Updates meeting information
     *
     */
    public void updateMeeting() {

    }

    /**
     * Adds a user to a meeting
     *
     */
    public void addMeetingParticipant() {

    }

    /**
     * Removes a user from a meeting
     *
     */
    public void removeMeetingParticipant() {

    }

}
