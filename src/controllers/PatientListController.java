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
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import models.Patient;
import models.UserStore;

/**
 *
 * @author pss5205
 */
public class PatientListController implements Initializable{

    @FXML
    private TableView<Patient> patientTableView;
    @FXML
    private TableColumn<Patient, String> firstNameColumn;
    @FXML
    private TableColumn<Patient, String> lastNameColumn;
    @FXML
    private TableColumn<Patient, Integer>ageColumn;
    @FXML
    private TableColumn<Patient, Double> heightColumn;
    @FXML
    private TableColumn<Patient, Double> weightColumn;
    @FXML
    private Button homeButton;
    private ObservableList<Patient> patientList;

    //Opens a detailed view for the bill (the user medical record)
    @FXML
    private void onBillTableViewMouseClick(MouseEvent event) {
       Patient currentlySelectedPatient = (Patient) this.patientTableView.getSelectionModel().getSelectedItem();
       if(currentlySelectedPatient != null){
       MedicalRecordController mrc = new MedicalRecordController();
       mrc.showMedicalRecordUI(currentlySelectedPatient);
       }
        Stage stage = (Stage)patientTableView.getScene().getWindow();
        stage.focusedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
            if(patientTableView != null)
                patientTableView.refresh();
       });
       
    }

    //Show home UI
    @FXML
    private void onHomeButtonAction(ActionEvent event) {
        this.closePatientListUI();
        HomeController homeController = new HomeController();
        homeController.startHomeUI();
    }

    //init components
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        UserStore.getInstance().loadUserList();
        this.patientList = UserStore.getInstance().getObsPatientList();
        patientTableView.setItems(patientList);
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        heightColumn.setCellValueFactory(new PropertyValueFactory<>("height"));
        weightColumn.setCellValueFactory(new PropertyValueFactory<>("weight"));
       
    }
    
    //show the patient list UI
    public void showPatientListUI(){
          try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/PatientListView.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setTitle("AlphaCare");
            stage.setScene(new Scene(root1));
            stage.show();
            
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //close the patient list UI
    public void closePatientListUI(){
        Stage stage = (Stage) homeButton.getScene().getWindow();
        stage.close();
    }

    //Show add patient UI
    @FXML
    private void onAddUserButtonAction(ActionEvent event) {
        AddPatientController apc = new AddPatientController();
        apc.showAddPatientUI();
    }

    @FXML
    private void onPatientTableSort(SortEvent event) {
        this.patientTableView.getSelectionModel().clearSelection();
    }
}
