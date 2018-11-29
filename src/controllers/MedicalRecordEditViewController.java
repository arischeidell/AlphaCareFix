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
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import models.AppointmentStore;
import models.Bill;
import models.Patient;
import models.ScheduleTableEntry;
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
    @FXML
    private TableView<ScheduleTableEntry> visitTableView;
    private ObservableList<ScheduleTableEntry> scheduledTableList;
    @FXML
    private TableColumn<ScheduleTableEntry, Boolean> prognosisColumn;

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
        this.chickenPoxDatePicker.setValue(authU.getRecord().getChickenpox().getDateAdministered());
        this.fluDatePicker.setValue(authU.getRecord().getFlu().getDateAdministered());
        this.mmrDatePicker.setValue(authU.getRecord().getMMR().getDateAdministered());
        this.tetanusDatePicker.setValue(authU.getRecord().getTetanus().getDateAdministered());
        prognosisColumn.setCellValueFactory(new PropertyValueFactory<>("prognosisGiven"));

        this.checkDates();
    }

    //close the edit UI
    public void closeEditUI() {
        Stage stage = (Stage) this.nameField.getScene().getWindow();
        stage.close();
    }

    //show the edit UI
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

    //set the User
    public void setUser(User u) {
        authU = (Patient) u;

        this.ageField.setText(Integer.toString(authU.getAge()));
        this.weightField.setText(Double.toString(authU.getWeight()));
        this.heightField.setText(Double.toString(authU.getHeight()));
        this.nameField.setText(authU.getFirstName() + " " + authU.getLastName());

        this.chickenPoxDatePicker.setValue(authU.getRecord().getChickenpox().getDateAdministered());
        this.fluDatePicker.setValue(authU.getRecord().getFlu().getDateAdministered());
        this.mmrDatePicker.setValue(authU.getRecord().getMMR().getDateAdministered());
        this.tetanusDatePicker.setValue(authU.getRecord().getTetanus().getDateAdministered());

        if (!authU.getUsername().equals(UserStore.getInstance().getCurrentlyAuthenticatedUser().getUsername()) || UserStore.getInstance().getCurrentlyAuthenticatedUser().isAdmin()) {
            this.chickenPoxDatePicker.setDisable(false);
            this.mmrDatePicker.setDisable(false);
            this.fluDatePicker.setDisable(false);
            this.tetanusDatePicker.setDisable(false);
        }
        this.checkDates();
        List<ScheduleTableEntry> savedScheduleData = AppointmentStore.getInstance().getScheduleTableStore();
        List<ScheduleTableEntry> usersScheduleData = new ArrayList<>();
        for (ScheduleTableEntry ste : savedScheduleData) {
            if (ste.getUser().getUsername().equals(authU.getUsername())) {
                usersScheduleData.add(ste);
            }
        }
        scheduledTableList = FXCollections.observableArrayList(usersScheduleData);
        visitTableView.setItems(this.scheduledTableList);

    }

    //check if dates are valid
    private void checkDates() {
        ArrayList<DatePicker> datePickerList = new ArrayList<>();
        datePickerList.add(fluDatePicker);
        datePickerList.add(mmrDatePicker);
        datePickerList.add(tetanusDatePicker);
        datePickerList.add(chickenPoxDatePicker);
        for (DatePicker dp : datePickerList) {
            if (dp.getValue().getYear() == 1900) {
                dp.setValue(null);
            }
        }

    }

    //save changes
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
        if (this.chickenPoxDatePicker.getValue() != null) {
            for (Vaccine v : authPatient.getRecord().getVacs()) {
                if (v.getName().equals("Chickenpox")) {
                    v.setDateAdministered(this.chickenPoxDatePicker.getValue());
                }
            }
        }

        if (this.fluDatePicker.getValue() != null) {
            for (Vaccine v : authPatient.getRecord().getVacs()) {
                if (v.getName().equals("Flu")) {
                    v.setDateAdministered(this.fluDatePicker.getValue());
                }
            }
        }

        if (this.mmrDatePicker.getValue() != null) {
            for (Vaccine v : authPatient.getRecord().getVacs()) {
                if (v.getName().equals("MMR")) {
                    v.setDateAdministered(this.mmrDatePicker.getValue());
                }
            }
        }

        if (this.tetanusDatePicker.getValue() != null) {
            for (Vaccine v : authPatient.getRecord().getVacs()) {
                if (v.getName().equals("Tetanus")) {
                    v.setDateAdministered(this.tetanusDatePicker.getValue());
                }
            }
        }
        UserStore.getInstance().saveUserList();
        this.closeEditUI();
        MedicalRecordController mc = new MedicalRecordController();
        if (authU.equals(UserStore.getInstance().getCurrentlyAuthenticatedUser())) {
            mc.showMedicalRecordUI();
        } else {
            mc.showMedicalRecordUI(authU);
        }

    }

    //try to parse an int. If it works, return true, if not, return false
    private boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //try to parse an int. If it works, return true, if not, return false
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

    //Show appointment details
    @FXML
    private void onVisitTableViewClick(MouseEvent event) {
        //Need to check and make sure user has admin access
        User u = UserStore.getInstance().getCurrentlyAuthenticatedUser();
        Stage stage = (Stage) this.visitTableView.getScene().getWindow();
        stage.focusedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
            if (visitTableView != null) {
                visitTableView.refresh();
            }
        });
        //this.visitTableView.getSelectionModel().
        if (u.isAdmin()) {
            ScheduleTableEntry currentlySelectedAppointment = (ScheduleTableEntry) this.visitTableView.getSelectionModel().getSelectedItem();
            //BillDetailController bdc = new BillDetailController();
            //bdc.showBillDetailUI(currentlySelectedBill);
            if (currentlySelectedAppointment != null) {
                AppointmentDetailViewController advc = new AppointmentDetailViewController();
                advc.showAppointmentDetailUI(currentlySelectedAppointment);
            }
        }
    }

    
    @FXML
    private void onVisitTableViewSort(SortEvent event) {
        this.visitTableView.getSelectionModel().clearSelection();
    }
}
