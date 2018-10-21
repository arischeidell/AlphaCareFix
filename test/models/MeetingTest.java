/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pss5205
 */
public class MeetingTest {

    public MeetingTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAttendees method, of class Meeting.
     */
    @Test
    public void testGetAttendees() {
        System.out.println("getAttendees");
        ArrayList<User> users = new ArrayList();
        Meeting instance = new Meeting(users, new Date(), "");
        ArrayList<User> expResult = new ArrayList();
        ArrayList<User> result = instance.getAttendees();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAttendees method, of class Meeting.
     */
    @Test
    public void testSetAttendees() {
        System.out.println("setAttendees");
        ArrayList<User> attendees = new ArrayList();
        Meeting instance = new Meeting(new ArrayList(), new Date(), "");
        instance.setAttendees(attendees);
    }

    /**
     * Test of getDatetime method, of class Meeting.
     */
    @Test
    public void testGetDatetime() {
        System.out.println("getDatetime");
        Meeting instance = new Meeting(new ArrayList(), new Date(), "");
        Date expResult = new Date();
        Date result = instance.getDatetime();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDatetime method, of class Meeting.
     */
    @Test
    public void testSetDatetime() {
        System.out.println("setDatetime");
        Date datetime = new Date();
        Meeting instance = new Meeting(new ArrayList(), new Date(), "");
        instance.setDatetime(datetime);
    }

    /**
     * Test of getPlace method, of class Meeting.
     */
    @Test
    public void testGetPlace() {
        System.out.println("getPlace");
        Meeting instance = new Meeting(new ArrayList(), new Date(), "IST");
        String expResult = "IST";
        String result = instance.getPlace();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlace method, of class Meeting.
     */
    @Test
    public void testSetPlace() {
        System.out.println("setPlace");
        String place = "Test";
        Meeting instance = new Meeting(new ArrayList(), new Date(), "IST");
        instance.setPlace(place);
    }

    /**
     * Test of addAttendee method, of class Meeting.
     */
    @Test
    public void testAddAttendee() {
        System.out.println("addAttendee");
        char[] pw = {};
        User u = new Doctor("test", pw);
        Meeting instance = new Meeting(new ArrayList(), new Date(), "");
        instance.addAttendee(u);
    }

    /**
     * Test of removeAttendee method, of class Meeting.
     */
    @Test
    public void testRemoveAttendee() {
        System.out.println("removeAttendee");
        char[] pw = {};
        User u = new Doctor("test", pw);
        Meeting instance = new Meeting(new ArrayList(), new Date(), "");
        instance.removeAttendee(u);
    }

}
