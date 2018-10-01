/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.HomeView;

/**
 *
 * @author ariannascheidell
 */
public class HomeController {
    private MedicalRecordController mrc;
    private MedicationController medController;
    private MeetingController meetingController;
    private SearchController sc;
    private HomeView homeView;
    
    public HomeController() {
        System.out.println("Home Controller"); //for testing purposes
        this.homeView = new HomeView();
    }
    
    public void viewMedicalRecord() {
        this.mrc = new MedicalRecordController();
    }
    
    public void viewMeds(){
        medController = new MedicationController();
    }
    
    public void viewMeetings(){
        meetingController = new MeetingController();
    }
    
    public void viewSearch() {
        sc = new SearchController();
    }
}
