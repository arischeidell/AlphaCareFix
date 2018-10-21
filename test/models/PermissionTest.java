/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.File;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pss5205
 */
public class PermissionTest {

    public PermissionTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of canWrite method, of class Permission.
     */
    @Test
    public void testCanWrite() {
        System.out.println("canWrite");
        Permission instance = new Permission(false, false, false, new File(""));
        boolean expResult = false;
        boolean result = instance.canWrite();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCanWrite method, of class Permission.
     */
    @Test
    public void testSetCanWrite() {
        System.out.println("setCanWrite");
        boolean canWrite = false;
        Permission instance = new Permission(true, true, true, new File(""));
        instance.setCanWrite(canWrite);
    }

    /**
     * Test of canRead method, of class Permission.
     */
    @Test
    public void testCanRead() {
        System.out.println("canRead");
        Permission instance = new Permission(false, false, false, new File(""));
        boolean expResult = false;
        boolean result = instance.canRead();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCanRead method, of class Permission.
     */
    @Test
    public void testSetCanRead() {
        System.out.println("setCanRead");
        boolean canRead = false;
        Permission instance = new Permission(true, true, true, new File(""));
        instance.setCanRead(canRead);
    }

    /**
     * Test of canExecute method, of class Permission.
     */
    @Test
    public void testCanExecute() {
        System.out.println("canExecute");
        Permission instance = new Permission(true, true, true, new File(""));
        boolean expResult = true;
        boolean result = instance.canExecute();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCanExecute method, of class Permission.
     */
    @Test
    public void testSetCanExecute() {
        System.out.println("setCanExecute");
        boolean canExecute = false;
        Permission instance = new Permission(true, true, true, new File(""));
        instance.setCanExecute(canExecute);
    }

    /**
     * Test of getFile method, of class Permission.
     */
    @Test
    public void testGetFile() {
        System.out.println("getFile");
        Permission instance = new Permission(true, true, true, new File("test.txt"));
        File expResult = new File("test.txt");
        File result = instance.getFile();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFile method, of class Permission.
     */
    @Test
    public void testSetFile() {
        System.out.println("setFile");
        File file = new File("test.txt");
        Permission instance = new Permission(true, true, true, new File(""));
        instance.setFile(file);
    }

}
