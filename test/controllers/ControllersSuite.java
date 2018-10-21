/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author pss5205
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({MedicationControllerTest.class, MeetingControllerTest.class, MedicalRecordControllerTest.class, HomeControllerTest.class, LoginControllerTest.class, SearchControllerTest.class, UserControllerTest.class})
public class ControllersSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}
