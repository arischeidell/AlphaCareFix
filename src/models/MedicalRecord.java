/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.Date;

/**
 *Abstract class that represents any type of medical record.
 * @author Paul
 */
public class MedicalRecord {
    private Date creation;
    private Date lastUpdated;
    private String recordDescription;
    private ArrayList<Medication> meds;
    private ArrayList<Vaccine> vacs;

    public MedicalRecord() {
        this.creation = new Date();
        this.recordDescription = "";
        this.meds = new ArrayList();
        this.vacs = initVacs();
    }
    
    public ArrayList<Vaccine> initVacs() {
        ArrayList<Vaccine> vacs = new ArrayList();
        vacs.add(new Vaccine ("Flu"));
        vacs.add(new Vaccine ("MMR")); //Measles, Mumps, Rubella
        vacs.add(new Vaccine ("Tetanus"));
        vacs.add(new Vaccine ("Chickenpox"));
        
        return vacs;
    }
    
    /**
     * Gets the creation date of a medical record.
     * @return createDate A date representing the creation of the medical record.
     */
    public Date getCreation() {
        return creation;
    }

    /**
     * Sets the creation date and time of a medical record.
     * @param update A date representing the new update date and time.
     */
    public void setLastUpdated(Date update) {
        this.lastUpdated = update;
    }

    /**
     * Gets the text description of a medical record.
     * @return A string representing the description of a medical record.
     */
    public String getRecordDescription() {
        return recordDescription;
    }

    /**
     *Sets the text description of a medical record.
     * @param recordDescription A string representing the description of a medical record.
     */
    public void setRecordDescription(String recordDescription) {
        this.recordDescription = recordDescription;
    }
    
    /**
     * Gets all medications associated with a patient.
     * @return An ArrayList of the patient's Medications.
     */
    public ArrayList<Medication> getMeds() {
        return meds;
    }
    
    /**
     * Adds a medication to a patient record.
     * @param m The medication to be added.
     */
    public void addMed(Medication m) {
        
    }
    
    /**
     * Removes a medication from a patient record.
     * @param m The medication to be removed.
     */
    public void removeMed(Medication m) {
        
    }
}
