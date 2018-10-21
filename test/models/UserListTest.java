/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pss5205
 */
public class UserListTest {

    public UserListTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addUser method, of class UserList.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        User u = new Patient();
        UserList instance = new UserList();
        instance.addUser(u);
    }

    /**
     * Test of removeUser method, of class UserList.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        User u = new Patient();
        UserList instance = new UserList();
        instance.removeUser(u);
    }

    /**
     * Test of authenticate method, of class UserList.
     */
    @Test
    public void testAuthenticate() {
        System.out.println("authenticate");
        String username = "test";
        char[] password = {'t', 'e', 's', 't'};
        UserList instance = new UserList();
        boolean expResult = false;
        boolean result = instance.authenticate(username, password);
        assertEquals(expResult, result);
    }

    /**
     * Test of userExists method, of class UserList.
     */
    @Test
    public void testUserExists() {
        System.out.println("userExists");
        String username = "Test";
        UserList instance = new UserList();
        boolean expResult = false;
        boolean result = instance.userExists(username);
        assertEquals(expResult, result);
    }

}
