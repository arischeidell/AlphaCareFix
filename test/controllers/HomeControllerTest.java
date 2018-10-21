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
public class HomeControllerTest {

    public HomeControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of viewMedicalRecord method, of class HomeController.
     */
    @Test
    public void testViewMedicalRecord() {
        System.out.println("viewMedicalRecord");
        HomeController instance = new HomeController();
        instance.viewMedicalRecord();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of viewMeds method, of class HomeController.
     */
    @Test
    public void testViewMeds() {
        System.out.println("viewMeds");
        HomeController instance = new HomeController();
        instance.viewMeds();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of viewMeetings method, of class HomeController.
     */
    @Test
    public void testViewMeetings() {
        System.out.println("viewMeetings");
        HomeController instance = new HomeController();
        instance.viewMeetings();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of viewSearch method, of class HomeController.
     */
    @Test
    public void testViewSearch() {
        System.out.println("viewSearch");
        HomeController instance = new HomeController();
        instance.viewSearch();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
