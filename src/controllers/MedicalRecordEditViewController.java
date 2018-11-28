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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import models.Patient;
import models.User;
import models.UserStore;
import models.Vaccine;

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
    private Patient authU;
    @FXML
    private Text nameText;
    @FXML
    private Text ageText;
    @FXML
    private Text heightText;
    @FXML
    private Text weightText;
    @FXML
    private Text vac2Text;
    @FXML
    private Text vac4Text;
    @FXML
    private Text vac1Text;
    @FXML
    private Text vac3Text;
    @FXML
    private DatePicker fluDatePicker;
    @FXML
    private DatePicker tetanusDatePicker;
    @FXML
    private DatePicker mmrDatePicker;
    @FXML
    private DatePicker chickenPoxDatePicker;
    @FXML
    private Text visitText;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Patient authU = (Patient) UserStore.getInstance().getCurrentlyAuthenticatedUser();
        this.ageField.setText(Integer.toString(authU.getAge()));
        this.weightField.setText(Double.toString(authU.getWeight()));
        this.heightField.setText(Double.toString(authU.getHeight()));
        this.nameField.setText(authU.getFirstName() + " " + authU.getLastName());
    }

    public void closeEditUI() {
        Stage stage = (Stage) this.nameField.getScene().getWindow();
        stage.close();
    }

    public void showEditUI(User u) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/MedicalRecordEditView.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("AlphaCare");
            stage.setScene(new Scene(root1));
            stage.show();
            MedicalRecordEditViewController mrevc = fxmlLoader.getController();
            mrevc.setUser(u);
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setUser(User u){
                 authU = (Patient) u;

            this.ageField.setText(Integer.toString(authU.getAge()));
        this.weightField.setText(Double.toString(authU.getWeight()));
        this.heightField.setText(Double.toString(authU.getHeight()));
        this.nameField.setText(authU.getFirstName() + " " + authU.getLastName());
        if(!authU.getUsername().equals(UserStore.getInstance().getCurrentlyAuthenticatedUser().getUsername())){
            this.chickenPoxDatePicker.setDisable(false);
            this.mmrDatePicker.setDisable(false);
            this.fluDatePicker.setDisable(false);
            this.tetanusDatePicker.setDisable(false);
        }
    }

    @FXML
    private void onSaveButtonAction(ActionEvent event) {
        Patient authPatient = authU;
        if (this.tryParseInt(this.ageField.getText())) {
            authPatient.setAge(Integer.parseInt(this.ageField.getText()));
        }
        if (this.tryParseDouble(this.heightField.getText())) {
            authPatient.setHeight(Double.parseDouble(this.heightField.getText()));
        }
        if (this.tryParseDouble(this.weightField.getText())) {
            authPatient.setWeight(Double.parseDouble(this.weightField.getText()));
        }
        if (this.nameField.getText().split(" ").length > 1) {
            authPatient.setFirstName(this.nameField.getText().split(" ")[0]);
            authPatient.setLastName(this.nameField.getText().split(" ")[1]);
        }
       if(this.chickenPoxDatePicker.getValue() != null){
           for(Vaccine v : authPatient.getRecord().getVacs()){
                if(v.getName().equals("Chickenpox")){
                    v.setDateAdministered(this.chickenPoxDatePicker.getValue());
                }
           }
       }
       
       if(this.fluDatePicker.getValue() != null){
           for(Vaccine v : authPatient.getRecord().getVacs()){
                if(v.getName().equals("Flu")){
                    v.setDateAdministered(this.fluDatePicker.getValue());
                }
           }
       }
       
       if(this.mmrDatePicker.getValue() != null){
           for(Vaccine v : authPatient.getRecord().getVacs()){
                if(v.getName().equals("MMR")){
                    v.setDateAdministered(this.mmrDatePicker.getValue());
                }
           }
       }
       
       if(this.tetanusDatePicker.getValue() != null){
           for(Vaccine v : authPatient.getRecord().getVacs()){
                if(v.getName().equals("Tetanus")){
                    v.setDateAdministered(this.tetanusDatePicker.getValue());
                }
           }
       }
        UserStore.getInstance().saveUserList();
        this.closeEditUI();
        MedicalRecordController mc = new MedicalRecordController();
        if(authU.equals(UserStore.getInstance().getCurrentlyAuthenticatedUser())){
        mc.showMedicalRecordUI();
        }
        else{
            mc.showMedicalRecordUI(authU);
        }

    }

    private boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean tryParseDouble(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @FXML
    private void onFluDatePickerAction(ActionEvent event) {
    }

    @FXML
    private void onTetanusDatePickerAction(ActionEvent event) {
    }

    @FXML
    private void onMmrDatePickerAction(ActionEvent event) {
    }

    @FXML
    private void onChickenPoxDatePickerAction(ActionEvent event) {
    }
}
