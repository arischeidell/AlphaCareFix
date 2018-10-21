/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDateTime;

/**
 *
 * @author ariannascheidell
 */
public class Vaccine {

    private String dateAdministered;
    private String name;

    public Vaccine(String dateAdministered, String name) {
        this.dateAdministered = dateAdministered;
        this.name = name;
    }

    public Vaccine() {
        this.dateAdministered = "";
        this.name = "";
    }

    public Vaccine(String name) {
        this.dateAdministered = "---";
        this.name = name;
    }

    public String getDateAdministered() {
        return dateAdministered;
    }

    public String getName() {
        return name;
    }

    public void setDateAdministered(String dateAdministered) {
        this.dateAdministered = dateAdministered;
    }

    public void setName(String name) {
        this.name = name;
    }
}
