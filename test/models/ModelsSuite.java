/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author pss5205
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({models.PatientTest.class, models.AddressTest.class, models.UserListTest.class, models.MedicalRecordTest.class, models.MedicationTest.class, models.MeetingTest.class, models.PermissionTest.class, models.DoctorTest.class})
public class ModelsSuite {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}
