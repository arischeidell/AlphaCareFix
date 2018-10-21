/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.MedicationView;

/**
 *
 * @author Paul
 */
public class MedicationController {

    private MedicationView view;

    public MedicationController() {
        System.out.println("Medication Controller"); //for testing purposes
        view = new MedicationView();
    }

    /**
     * Adds medication to an AlphaCare user object
     *
     */
    public void addMedicationToUser() {

    }

    /**
     * Creates a medication that can be assigned to a user
     *
     */
    public void createMedication() {

    }

    /**
     * Disables a medication so it cannot be assigned a user
     *
     */
    public void inactivateMedication() {

    }

    /**
     * Updates medication information
     *
     */
    public void updateMedication() {

    }

    /**
     * Removes a prescription medication from a user
     *
     */
    public void removeMedicationFromUser() {

    }

    /**
     * Updates prescription information for a user
     *
     */
    public void updateMedicationForUser() {

    }

}
