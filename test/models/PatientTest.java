/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

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
public class PatientTest {
    
    public PatientTest() {
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
     * Test of getAddress method, of class Patient.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        char [] pw = {};
        Patient instance = new Patient();
        instance.setAddress(new Address("Test", "Test", "Test", "Test", "12345"));
        Address expResult = new Address("Test", "Test", "Test", "Test", "12345");
        Address result = instance.getAddress();
        assertEquals(expResult.getAddressLine1(), result.getAddressLine1());
    }

    /**
     * Test of setAddress method, of class Patient.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        Address address = new Address("Test", "Test", "Test", "Test", "12345");
        Patient instance = new Patient();
        instance.setAddress(address);
    }

    /**
     * Test of getPhone method, of class Patient.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        Patient instance = new Patient();
        instance.setPhone("1234567");
        String expResult = "1234567";
        String result = instance.getPhone();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhone method, of class Patient.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String phone = "1234567";
        Patient instance = new Patient();
        instance.setPhone(phone);
    }

    /**
     * Test of getRecord method, of class Patient.
     */
    @Test
    public void testGetRecord() {
        System.out.println("getRecord");
        Patient instance = new Patient();
        MedicalRecord expResult = new MedicalRecord();
        MedicalRecord result = instance.getRecord();
        assertEquals(expResult.getRecordDescription(), result.getRecordDescription());
    }

    /**
     * Test of getBalance method, of class Patient.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        Patient instance = new Patient();
        instance.setBalance(45.6);
        double expResult = 45.6;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setBalance method, of class Patient.
     */
    @Test
    public void testSetBalance() {
        System.out.println("setBalance");
        double balance = 12.7;
        Patient instance = new Patient();
        instance.setBalance(balance);
    }
    
}
