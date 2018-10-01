/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author pss5205
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({controllers.MeetingControllerTest.class, controllers.MedicalRecordControllerTest.class, controllers.UserControllerTest.class, controllers.MedicationControllerTest.class, controllers.SearchControllerTest.class})
public class ControllersSuite {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
