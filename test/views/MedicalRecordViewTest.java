/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javafx.fxml.FXMLLoader;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul
 */
public class MedicalRecordViewTest {

    public MedicalRecordViewTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testMedicalRecordViewExist() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/MedicalRecordView.fxml"));
        assertNotNull(fxmlLoader);
    }

}
