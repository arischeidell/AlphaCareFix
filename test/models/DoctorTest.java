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
public class DoctorTest {

    public DoctorTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addMeeting method, of class Doctor.
     */
    @Test
    public void testAddMeeting() {
        System.out.println("addMeeting");
        ArrayList<User> users = new ArrayList();
        Date d = new Date();
        Meeting m = new Meeting(users, d, "");
        char[] pw = {'a', 'b', 'c'};
        Doctor instance = new Doctor("test", pw);
        instance.addMeeting(m);
    }

    /**
     * Test of removeMeeting method, of class Doctor.
     */
    @Test
    public void testRemoveMeeting() {
        System.out.println("removeMeeting");
        ArrayList<User> users = new ArrayList();
        Date d = new Date();
        Meeting m = new Meeting(users, d, "");
        char[] pw = {'a', 'b', 'c'};
        Doctor instance = new Doctor("test", pw);
        instance.removeMeeting(m);
    }

}
