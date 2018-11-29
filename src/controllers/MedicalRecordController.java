/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import models.AppointmentStore;
import models.Patient;
import models.ScheduleTableEntry;
import models.User;
import models.UserStore;

/**
 * FXML Controller class
 *
 * @author ariannascheidell
 */
public class MedicalRecordController implements Initializable {

    @FXML
    private Text nameText;
    @FXML
    private Text ageText;
    @FXML
    private Text heightText;
    @FXML
    private Text weightText;
    @FXML
    private Button profileEditButton;
    @FXML
    private Text vac1Text;
    @FXML
    private Text vac2Text;
    @FXML
    private Text vac3Text;
    @FXML
    private Text vac4Text;
    @FXML
    private Text visitText;
    @FXML
    private Text nameValueText;
    @FXML
    private Text heightValueText;
    @FXML
    private Text weightValueText;
    @FXML
    private Text ageValueText;
    @FXML
    private TableView visitTableView;

    private User selectedUser;

    private ObservableList<ScheduleTableEntry> scheduledTableList;
    @FXML
    private Button logoutButton;
    @FXML
    private Text fluDateText;
    @FXML
    private Text tetanusDateText;
    @FXML
    private Text MMRDateText;
    @FXML
    private Text chickenBoxDateText;

    //init components
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("MedicalRecordController");
        Patient authU = (Patient) UserStore.getInstance().getCurrentlyAuthenticatedUser();
        this.ageValueText.setText(Integer.toString(authU.getAge()));
        this.weightValueText.setText(Double.toString(authU.getWeight()));
        this.heightValueText.setText(Double.toString(authU.getHeight()));
        this.nameValueText.setText(authU.getFirstName() + " " + authU.getLastName());

        if (authU.getRecord().getMMR().getDateAdministered().getYear() != 1900) {
            this.MMRDateText.setText(authU.getRecord().getMMR().getDateAdministered().toString());
        }
        if (authU.getRecord().getChickenpox().getDateAdministered().getYear() != 1900) {
            this.chickenBoxDateText.setText(authU.getRecord().getChickenpox().getDateAdministered().toString());
        }
        if (authU.getRecord().getFlu().getDateAdministered().getYear() != 1900) {
            this.fluDateText.setText(authU.getRecord().getFlu().getDateAdministered().toString());
        }
        if (authU.getRecord().getTetanus().getDateAdministered().getYear() != 1900) {
            this.tetanusDateText.setText(authU.getRecord().getTetanus().getDateAdministered().toString());
        }

        List<ScheduleTableEntry> savedScheduleData = AppointmentStore.getInstance().getScheduleTableStore();
        scheduledTableList = FXCollections.observableArrayList(savedScheduleData);
        visitTableView.setItems(this.scheduledTableList);
    }

    //close the medical record UI
    public void closeMedicalRecordUI() {
        Stage stage = (Stage) nameText.getScene().getWindow();
        stage.close();
    }

    //show the medical record UI
    public void showMedicalRecordUI() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/MedicalRecordView.fxml"));
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

    //Show the medical record UI for a specific patient
    public void showMedicalRecordUI(Patient p) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/MedicalRecordView.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("AlphaCare");
            stage.setScene(new Scene(root1));
            stage.show();

            MedicalRecordController mrc = fxmlLoader.getController();
            mrc.setPatient(p);
            //mrc.homeButton.setVisible(false);

        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Set patient values
    public void setPatient(Patient p) {
        this.ageValueText.setText(Integer.toString(p.getAge()));
        this.weightValueText.setText(Double.toString(p.getWeight()));
        this.heightValueText.setText(Double.toString(p.getHeight()));
        this.nameValueText.setText(p.getFirstName() + " " + p.getLastName());
        if (p.getRecord().getMMR().getDateAdministered().getYear() != 1900) {
            this.MMRDateText.setText(p.getRecord().getMMR().getDateAdministered().toString());
        }
        if (p.getRecord().getChickenpox().getDateAdministered().getYear() != 1900) {
            this.chickenBoxDateText.setText(p.getRecord().getChickenpox().getDateAdministered().toString());
        }
        if (p.getRecord().getFlu().getDateAdministered().getYear() != 1900) {
            this.fluDateText.setText(p.getRecord().getFlu().getDateAdministered().toString());
        }
        if (p.getRecord().getTetanus().getDateAdministered().getYear() != 1900) {
            this.tetanusDateText.setText(p.getRecord().getTetanus().getDateAdministered().toString());
        }
        List<ScheduleTableEntry> savedScheduleData = AppointmentStore.getInstance().getScheduleTableStore();
        List<ScheduleTableEntry> usersScheduleData = new ArrayList<>();
        for (ScheduleTableEntry ste : savedScheduleData) {
            if (ste.getUser().getUsername().equals(p.getUsername())) {
                usersScheduleData.add(ste);
            }
        }
        scheduledTableList = FXCollections.observableArrayList(usersScheduleData);
        visitTableView.setItems(this.scheduledTableList);
        this.selectedUser = p;
    }

    @FXML
    private void goHome(ActionEvent event) {
        this.closeMedicalRecordUI();
        HomeController homeController = new HomeController();
        homeController.startHomeUI();
    }

    @FXML
    private void onEditButtonEvent(ActionEvent event) {
        this.closeMedicalRecordUI();
        MedicalRecordEditViewController editController = new MedicalRecordEditViewController();
        if (selectedUser == null) {
            selectedUser = UserStore.getInstance().getCurrentlyAuthenticatedUser();
        }
        editController.showEditUI(selectedUser);
    }
}
