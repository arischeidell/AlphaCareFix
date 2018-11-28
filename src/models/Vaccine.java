/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author ariannascheidell
 */
public class Vaccine {

    private LocalDate dateAdministered;
    private String name;

    public Vaccine(LocalDate dateAdministered, String name) {
        this.dateAdministered = dateAdministered;
        this.name = name;
    }

    public Vaccine() {
//        this.dateAdministered = LocalDate.now();
//        this.name = "";
    }

    public Vaccine(String name) {
        this.dateAdministered = LocalDate.now();
        this.name = name;
    }

    public LocalDate getDateAdministered() {
        return dateAdministered;
    }

    public String getName() {
        return name;
    }

    public void setDateAdministered(LocalDate dateAdministered) {
        this.dateAdministered = dateAdministered;
    }

    public void setName(String name) {
        this.name = name;
    }
}
