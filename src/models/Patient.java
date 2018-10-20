/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *Model class represents a patient
 * @author ariannascheidell
 */
public class Patient extends User{
    private Address address;
    private String phone;
    private MedicalRecord record;
    private double balance;
    private double height;
    private double weight;
    private int age;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Constructor for a patient object.
     * @param username The patient's username.
     * @param password The patient's password.
     * @param address The patient's address.
     * @param phone The patient's phone number.
     */
    public Patient(String username, char[] password, Address address, String phone) {
        super(username, password);
        this.address = address;
        this.phone = phone;
        this.record = new MedicalRecord();
        this.balance = 0.0;
    }
    
    public Patient() {
        this.address = new Address();
        this.phone = "";
        this.record = new MedicalRecord();
        this.balance = 0.0;
    }

    /**
     * Gets the address of a patient.
     * @return An address object representing the patient's address.
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the address of a patient.
     * @param address An address object representing the patient's new address.
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Gets the phone number for a patient.
     * @return A string representing the phone number.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone number for a patient.
     * @param phone A string representing the new phone number.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Returns the patient's MedicalRecord.
     * @return The patient's MedicalRecord.
     */
    public MedicalRecord getRecord() {
        return record;
    }

    /**
     * Returns the patient's outstanding balance.
     * @return A double representing the patient's outstanding balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the patient's outstanding balance.
     * @param balance A double representing the patient's new balance.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
