/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.MedicalRecord;
import views.MedicalRecordView;

/**
 *
 * @author Paul
 */
public class MedicalRecordController {
    private MedicalRecordView view;
    
    public MedicalRecordController() {
        System.out.println("MedicalRecord Controller"); //for testing purposes
        view = new MedicalRecordView();
    }
    
    /**Creates a medical record in the AlphaCare Database 
     *
     */
    public void createMedicalRecord(){
               
    }
    
    /** Deactivates a medical record in the AlphaCare database
     *
     */
    public void deactivateMedicalRecord(){
        
    }
    
    /** Updates a medical record
     *
     */
    public void updateMedicalRecord(){
        
    }
    
    /** Gets a medical record for specified parameters
     *
     * @return A MedicalRecord.
     */
    public MedicalRecord getMedicalRecord(){
        return null;
    }
}
