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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ariannascheidell
 */
public class MedicalRecordEditViewController implements Initializable {
    @FXML
    private TextField nameField;
    @FXML
    private TextField ageField;
    @FXML
    private TextField heightField;
    @FXML
    private TextField weightField;
    @FXML
    private Button saveButton;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void closeEditUI(){
        Stage stage = (Stage) this.nameField.getScene().getWindow();
        stage.close();
    }
    
    public void showEditUI(){
         try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/MedicalRecordEditView.fxml"));
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
    
    @FXML
    private void onSaveButtonAction(ActionEvent event) {
        this.closeEditUI();
        MedicalRecordController mc = new MedicalRecordController();
        mc.showMedicalRecordUI();
    }
}
