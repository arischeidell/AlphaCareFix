/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author pss5205
 */
public class ScheduleTableEntry {
   private final SimpleStringProperty physicianName = new SimpleStringProperty("");
   private final SimpleStringProperty appointmentDate = new SimpleStringProperty("");
   private final SimpleStringProperty appointmentDescription = new SimpleStringProperty("");

    public ScheduleTableEntry() {
        this("", new Date(), "");
    }
 
    public ScheduleTableEntry(String name, Date appointmentDate, String appointmentDesc) {
        setPhysicianName(name);
        setAppointmentDate(appointmentDate.toString());
        this.setAppointmentDescription(appointmentDesc);
        
    }

    public String getPhysicianName() {
        return physicianName.get();
    }
 
    public void setPhysicianName(String fName) {
        physicianName.set(fName);
    }
        
    public String getAppointmentDate() {
        return appointmentDate.get();
    }
    
    public void setAppointmentDate(String date) {
        appointmentDate.set(date);
    }
    
    public String getAppointmentDescription(){
        return this.appointmentDescription.get();
    }
    public void setAppointmentDescription(String appointmentDesc){
        this.appointmentDescription.set(appointmentDesc);
    }
    

}

