/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul
 */
public class LoginControllerTest {

    public LoginControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addUser method, of class LoginController.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        LoginController instance = new LoginController();
        UserController actResult = instance.addUser();
        assertNotNull(actResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of authenticate method, of class LoginController.
     */
//    @Test
//    public void testAuthenticate() {
//        System.out.println("authenticate");
//        String username = "testUser";
//        char[] pw = "password".toCharArray();
//        LoginController instance = new LoginController();
//        boolean actResult = instance.authenticate(username, pw);
//        boolean expResult = false;
//        assertEquals(actResult, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        //      fail("The test case is a prototype.");
//
//    }

}
