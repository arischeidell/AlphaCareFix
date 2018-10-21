/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pss5205
 */
public class MedicationTest {

    public MedicationTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Medication.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Medication instance = new Medication("Test");
        String expResult = "Test";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Medication.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Test";
        Medication instance = new Medication("");
        instance.setName(name);
    }

    /**
     * Test of getDescription method, of class Medication.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Medication instance = new Medication("");
        instance.setDescription("Test");
        String expResult = "Test";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescription method, of class Medication.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "Test";
        Medication instance = new Medication("");
        instance.setDescription(description);
    }

    /**
     * Test of getSideEffects method, of class Medication.
     */
    @Test
    public void testGetSideEffects() {
        System.out.println("getSideEffects");
        Medication instance = new Medication("");
        ArrayList<String> expResult = new ArrayList();
        ArrayList<String> result = instance.getSideEffects();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSideEffects method, of class Medication.
     */
    @Test
    public void testSetSideEffects() {
        System.out.println("setSideEffects");
        ArrayList<String> sideEffects = new ArrayList();
        Medication instance = new Medication("");
        instance.setSideEffects(sideEffects);
    }

    /**
     * Test of addSideEffect method, of class Medication.
     */
    @Test
    public void testAddSideEffect() {
        System.out.println("addSideEffect");
        String se = "SideEffect";
        Medication instance = new Medication("");
        instance.addSideEffect(se);
    }

    /**
     * Test of removeSideEffect method, of class Medication.
     */
    @Test
    public void testRemoveSideEffect() {
        System.out.println("removeSideEffect");
        String se = "SideEffect";
        Medication instance = new Medication("");
        instance.removeSideEffect(se);
    }

}
