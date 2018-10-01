/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

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
public class SearchControllerTest {
    
    public SearchControllerTest() {
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
     * Test of searchUser method, of class SearchController.
     */
    @Test
    public void testSearchUser() {
        System.out.println("searchUser");
        String query = "";
        SearchController instance = new SearchController();
        instance.searchUser(query);
    }

    /**
     * Test of searchUserByLastName method, of class SearchController.
     */
    @Test
    public void testSearchUserByLastName() {
        System.out.println("searchUserByLastName");
        String lastName = "";
        SearchController instance = new SearchController();
        instance.searchUserByLastName(lastName);
    }

    /**
     * Test of serachUserByFirstName method, of class SearchController.
     */
    @Test
    public void testSerachUserByFirstName() {
        System.out.println("serachUserByFirstName");
        String firstName = "";
        SearchController instance = new SearchController();
        instance.serachUserByFirstName(firstName);
    }

    /**
     * Test of searchUserByID method, of class SearchController.
     */
    @Test
    public void testSearchUserByID() {
        System.out.println("searchUserByID");
        int id = 0;
        SearchController instance = new SearchController();
        instance.searchUserByID(id);
    }
    
}
