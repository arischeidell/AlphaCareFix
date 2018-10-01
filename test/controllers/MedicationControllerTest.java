/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pss5205
 */
public class MedicationControllerTest {
    
    public MedicationControllerTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addMedicationToUser method, of class MedicationController.
     */
    @Test
    public void testAddMedicationToUser() {
        System.out.println("addMedicationToUser");
        MedicationController instance = new MedicationController();
        instance.addMedicationToUser();
    }

    /**
     * Test of createMedication method, of class MedicationController.
     */
    @Test
    public void testCreateMedication() {
        System.out.println("createMedication");
        MedicationController instance = new MedicationController();
        instance.createMedication();
    }

    /**
     * Test of inactivateMedication method, of class MedicationController.
     */
    @Test
    public void testInactivateMedication() {
        System.out.println("inactivateMedication");
        MedicationController instance = new MedicationController();
        instance.inactivateMedication();
    }

    /**
     * Test of updateMedication method, of class MedicationController.
     */
    @Test
    public void testUpdateMedication() {
        System.out.println("updateMedication");
        MedicationController instance = new MedicationController();
        instance.updateMedication();
    }

    /**
     * Test of removeMedicationFromUser method, of class MedicationController.
     */
    @Test
    public void testRemoveMedicationFromUser() {
        System.out.println("removeMedicationFromUser");
        MedicationController instance = new MedicationController();
        instance.removeMedicationFromUser();
    }

    /**
     * Test of updateMedicationForUser method, of class MedicationController.
     */
    @Test
    public void testUpdateMedicationForUser() {
        System.out.println("updateMedicationForUser");
        MedicationController instance = new MedicationController();
        instance.updateMedicationForUser();
    }
    
}
