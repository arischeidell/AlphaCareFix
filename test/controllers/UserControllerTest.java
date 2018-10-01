/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import models.Meeting;
import models.Permission;
import models.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pss5205
 */
public class UserControllerTest {
    
    public UserControllerTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createUser method, of class UserController.
     */
    @Test
    public void testCreateUser() {
        System.out.println("createUser");
        UserController instance = new UserController();
        instance.createUser();
    }

    /**
     * Test of getUserDetails method, of class UserController.
     */
    @Test
    public void testGetUserDetails() {
        System.out.println("getUserDetails");
        UserController instance = new UserController();
        User expResult = null;
        User result = instance.getUserDetails();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUserMeetings method, of class UserController.
     */
    @Test
    public void testGetUserMeetings() {
        System.out.println("getUserMeetings");
        UserController instance = new UserController();
        List<Meeting> expResult = null;
        List<Meeting> result = instance.getUserMeetings();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUserPermissions method, of class UserController.
     */
    @Test
    public void testGetUserPermissions() {
        System.out.println("getUserPermissions");
        UserController instance = new UserController();
        List<Permission> expResult = null;
        List<Permission> result = instance.getUserPermissions();
        assertEquals(expResult, result);
    }

    /**
     * Test of hasUserPermission method, of class UserController.
     */
    @Test
    public void testHasUserPermission() {
        System.out.println("hasUserPermission");
        UserController instance = new UserController();
        boolean expResult = false;
        boolean result = instance.hasUserPermission();
        assertEquals(expResult, result);
    }
    
}
