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
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import models.Patient;
import models.User;
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

    @FXML
    private void onBillTableViewMouseClick(MouseEvent event) {
    }

    @FXML
    private void onHomeButtonAction(ActionEvent event) {
        this.closePatientListUI();
        HomeController homeController = new HomeController();
        homeController.startHomeUI();
    }

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
    
    public void showPatientListUI(){
          try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/PatientListView.fxml"));
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
    
    public void closePatientListUI(){
        Stage stage = (Stage) homeButton.getScene().getWindow();
        stage.close();
    }
}
