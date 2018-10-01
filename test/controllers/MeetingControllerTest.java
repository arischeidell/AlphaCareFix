/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Meeting;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author pss5205
 */
public class MeetingControllerTest {
    
    public MeetingControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of scheduleMeeting method, of class MeetingController.
     */
    @Test
    public void testScheduleMeeting() {
        System.out.println("scheduleMeeting");
        MeetingController instance = new MeetingController();
        instance.scheduleMeeting();
    }

    /**
     * Test of getMeetingFromUser method, of class MeetingController.
     */
    @Test
    public void testGetMeetingFromUser() {
        System.out.println("getMeetingFromUser");
        MeetingController instance = new MeetingController();
        Meeting expResult = null;
        Meeting result = instance.getMeetingFromUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of updateMeeting method, of class MeetingController.
     */
    @Test
    public void testUpdateMeeting() {
        System.out.println("updateMeeting");
        MeetingController instance = new MeetingController();
        instance.updateMeeting();
    }

    /**
     * Test of addMeetingParticipant method, of class MeetingController.
     */
    @Test
    public void testAddMeetingParticipant() {
        System.out.println("addMeetingParticipant");
        MeetingController instance = new MeetingController();
        instance.addMeetingParticipant();
    }

    /**
     * Test of removeMeetingParticipant method, of class MeetingController.
     */
    @Test
    public void testRemoveMeetingParticipant() {
        System.out.println("removeMeetingParticipant");
        MeetingController instance = new MeetingController();
        instance.removeMeetingParticipant();
    }
    
}
