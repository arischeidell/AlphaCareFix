/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import models.ScheduleTableEntry;
import models.ScheduleTableEntry;

/**
 * FXML Controller class
 *
 * @author Paul
 */
public class AppointmentDetailViewController implements Initializable {

    @FXML
    private TextArea resolutionTextArea;
    @FXML
    private ComboBox physicianComboBox;
    @FXML
    private Text patientText;
    @FXML
    private TextArea reasonTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          physicianComboBox.setItems(FXCollections.observableArrayList(
                "Haynes, Steven D.O.", "Lipniskis, Jeffery M.D.", "Jobs, Steven P.A.", "Murphy, Alison M.D.")
        );
    }    
    
      public void showAppointmentDetailUI(ScheduleTableEntry ste) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/AppointmentDetailView.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("AlphaCare");
            stage.setScene(new Scene(root1));
            stage.show();
            AppointmentDetailViewController apdvc = fxmlLoader.getController();
//            mrevc.setUser(u);
            apdvc.setAppointmentDetails(ste);
        } catch (IOException ex) {
            Logger.getLogger(AppointmentDetailViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
     public void setAppointmentDetails(ScheduleTableEntry ste){
         patientText.setText(ste.getUser().getLastName() + ", " + ste.getUser().getFirstName());
         this.reasonTextArea.setText(ste.getAppointmentDescription());
         this.physicianComboBox.setValue(ste.getPhysicianName());
     }
}
