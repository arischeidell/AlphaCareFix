/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author ariannascheidell
 */
public class Address {

    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipcode;

    /**
     * Default constructor for an Address object.
     *
     * @param addressLine1 A string representing the first line of the address.
     * @param addressLine2 A string representing the second line of the address.
     * @param city A string representing the city.
     * @param state A string representing the state.
     * @param zipcode A string representing the zipcode.
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public Address() {
        this.addressLine1 = "";
        this.addressLine2 = "";
        this.city = "";
        this.state = "";
        this.zipcode = "";
    }

    /**
     * Gets the first address line from an an address object.
     *
     * @return addressLine1 A string representing the first line of the address.
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the first address line.
     *
     * @param addressLine1 A string representing new first line of the address.
     */
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * Gets the second address line.
     *
     * @return A string representing the second line of the address.
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the second address line.
     *
     * @param addressLine2 A string representing the new second line of the
     * address.
     */
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * Returns the city from address as a string.
     *
     * @return A string representing the city.
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city of an address object.
     *
     * @param city A string representing the new city.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Returns the state from address as a string.
     *
     * @return A string representing the state.
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the state of an address object.
     *
     * @param state A string representing the new state.
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the zip code from an address object.
     *
     * @return A string representing the zip code.
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * Sets the zip code on an address object.
     *
     * @param zipcode A string representing the new zip code.
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        //return "Address{" + "addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + '}';
        return addressLine1;
    }
}
