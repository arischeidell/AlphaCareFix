/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pss5205
 */
public class MedicalRecordTest {
    
    public MedicalRecordTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCreation method, of class MedicalRecord.
     */
    @Test
    public void testGetCreation() {
        System.out.println("getCreation");
        MedicalRecord instance = new MedicalRecord();
        Date expResult = new Date();
        Date result = instance.getCreation();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastUpdated method, of class MedicalRecord.
     */
    @Test
    public void testSetLastUpdated() {
        System.out.println("setLastUpdated");
        Date update = new Date();
        MedicalRecord instance = new MedicalRecord();
        instance.setLastUpdated(update);
    }

    /**
     * Test of getRecordDescription method, of class MedicalRecord.
     */
    @Test
    public void testGetRecordDescription() {
        System.out.println("getRecordDescription");
        MedicalRecord instance = new MedicalRecord();
        instance.setRecordDescription("test");
        String expResult = "test";
        String result = instance.getRecordDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRecordDescription method, of class MedicalRecord.
     */
    @Test
    public void testSetRecordDescription() {
        System.out.println("setRecordDescription");
        String recordDescription = "test";
        MedicalRecord instance = new MedicalRecord();
        instance.setRecordDescription(recordDescription);
    }

    /**
     * Test of getMeds method, of class MedicalRecord.
     */
    @Test
    public void testGetMeds() {
        System.out.println("getMeds");
        MedicalRecord instance = new MedicalRecord();
        ArrayList<Medication> expResult = new ArrayList();
        ArrayList<Medication> result = instance.getMeds();
        assertEquals(expResult, result);
    }

    /**
     * Test of addMed method, of class MedicalRecord.
     */
    @Test
    public void testAddMed() {
        System.out.println("addMed");
        Medication m = new Medication("Test");
        MedicalRecord instance = new MedicalRecord();
        instance.addMed(m);
    }

    /**
     * Test of removeMed method, of class MedicalRecord.
     */
    @Test
    public void testRemoveMed() {
        System.out.println("removeMed");
        Medication m = new Medication("test");
        MedicalRecord instance = new MedicalRecord();
        instance.removeMed(m);
    }
    
}
