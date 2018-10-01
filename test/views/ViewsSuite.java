/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Paul
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({views.AddUserViewTest.class, views.HomeViewTest.class, views.MeetingViewTest.class, views.LoginViewTest.class, views.SearchViewTest.class, views.MedicalRecordViewTest.class, views.MedicationViewTest.class})
public class ViewsSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
