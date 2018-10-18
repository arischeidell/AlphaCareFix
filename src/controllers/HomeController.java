/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import models.Patient;
import models.User;
import models.UserStore;
import views.HomeView;

/**
 *
 * @author ariannascheidell
 */
public class HomeController implements Initializable{
    private MedicalRecordController mrc;
    private MedicationController medController;
    private MeetingController meetingController;
    private SearchController sc;
    private HomeView homeView;
    @FXML
    private Text patientNameText;
    @FXML
    private Text patientAddressText;
    @FXML
    private Text patientPhoneText;
    @FXML
    private Text currentDateText;
    
    
    public HomeController() {
        System.out.println("Home Controller"); //for testing purposes
        //this.homeView = new HomeView();
         
    }
    
    public void startHomeUI(){
         try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/HomeView.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("AlphaCare");
            stage.setScene(new Scene(root1));  
            stage.show();
          } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void closeHomeUI(){
           Stage stage = (Stage) patientNameText.getScene().getWindow();
            stage.close();
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
    
    @FXML
    private void onLogoutButtonAction(ActionEvent event){
        UserStore.getInstance().clearAuthenticatedUser();
        this.closeHomeUI();
        LoginController lc = new LoginController();
        lc.getLoginUI();
    }
    
    @FXML
    private void onAppointmentSchedulerButtonAction(ActionEvent event){
        this.closeHomeUI();
        ScheduleController sc = new ScheduleController();
        sc.showScheduleUI();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    Patient authUser = (Patient) UserStore.getInstance().getCurrentlyAuthenticatedUser();
    this.patientNameText.setText(authUser.getUsername());
    this.currentDateText.setText(LocalDate.now().toString());
    this.patientPhoneText.setText(authUser.getPhone());
    this.patientAddressText.setText(authUser.getAddress().toString());
    }    
        
    
}
