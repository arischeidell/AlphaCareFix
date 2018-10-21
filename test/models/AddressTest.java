/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pss5205
 */
public class AddressTest {

    public AddressTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAddressLine1 method, of class Address.
     */
    @Test
    public void testGetAddressLine1() {
        System.out.println("getAddressLine1");
        Address instance = new Address("123 Testing Here", "", "", "", "");
        String expResult = "123 Testing Here";
        String result = instance.getAddressLine1();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAddressLine1 method, of class Address.
     */
    @Test
    public void testSetAddressLine1() {
        System.out.println("setAddressLine1");
        String addressLine1 = "345 Test";
        Address instance = new Address();
        instance.setAddressLine1(addressLine1);
    }

    /**
     * Test of getAddressLine2 method, of class Address.
     */
    @Test
    public void testGetAddressLine2() {
        System.out.println("getAddressLine2");
        Address instance = new Address("", "987 Test Test", "", "", "");
        String expResult = "987 Test Test";
        String result = instance.getAddressLine2();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAddressLine2 method, of class Address.
     */
    @Test
    public void testSetAddressLine2() {
        System.out.println("setAddressLine2");
        String addressLine2 = "123 Test";
        Address instance = new Address();
        instance.setAddressLine2(addressLine2);
    }

    /**
     * Test of getCity method, of class Address.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Address instance = new Address("", "", "State College", "", "");
        String expResult = "State College";
        String result = instance.getCity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCity method, of class Address.
     */
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "State College";
        Address instance = new Address();
        instance.setCity(city);
    }

    /**
     * Test of getState method, of class Address.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        Address instance = new Address("", "", "", "Pennsylvania", "");
        String expResult = "Pennsylvania";
        String result = instance.getState();
        assertEquals(expResult, result);
    }

    /**
     * Test of setState method, of class Address.
     */
    @Test
    public void testSetState() {
        System.out.println("setState");
        String state = "Pennsylvania";
        Address instance = new Address();
        instance.setState(state);
    }

    /**
     * Test of getZipcode method, of class Address.
     */
    @Test
    public void testGetZipcode() {
        System.out.println("getZipcode");
        Address instance = new Address("", "", "", "", "12345");
        String expResult = "12345";
        String result = instance.getZipcode();
    }

    /**
     * Test of setZipcode method, of class Address.
     */
    @Test
    public void testSetZipcode() {
        System.out.println("setZipcode");
        String zipcode = "12345";
        Address instance = new Address();
        instance.setZipcode(zipcode);
    }

    /**
     * Test of toString method, of class Address.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Address instance = new Address("Test", "Test", "Test", "Test", "12345");
        //String expResult = "Address{addressLine1=Test, addressLine2=Test, city=Test, state=Test, zipcode=12345}";
        String expResult = instance.getAddressLine1();
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}
