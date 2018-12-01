package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import models.AppointmentStore;
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
    @FXML
    private Button saveButton;
    private ScheduleTableEntry currentAppointment;
    @FXML
    private Text dateText;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        physicianComboBox.setItems(FXCollections.observableArrayList(
                "Haynes, Steven D.O.", "Lipniskis, Jeffery M.D.", "Jobs, Steven P.A.", "Murphy, Alison M.D.")
        );
    }
    
    //Show the appointment detail UI
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
            apdvc.setAppointmentDetails(ste);
        } catch (IOException ex) {
            Logger.getLogger(AppointmentDetailViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Show the details of the appointment
    public void setAppointmentDetails(ScheduleTableEntry ste) {
        patientText.setText(ste.getUser().getLastName() + ", " + ste.getUser().getFirstName());
        this.reasonTextArea.setText(ste.getAppointmentDescription());
        this.physicianComboBox.setValue(ste.getPhysicianName());
        this.resolutionTextArea.setText(ste.getAppointmentResolution());
        this.currentAppointment = ste;
        this.dateText.setText(ste.getAppointmentDate());
    }

    //Called when the save button is pressed
    @FXML
    private void onSaveButtonAction(ActionEvent event) {
        this.currentAppointment.setPhysicianName(physicianComboBox.getValue().toString());
        this.currentAppointment.setAppointmentResolution(this.resolutionTextArea.getText());
        AppointmentStore.getInstance().saveScheduleTableEntryList();
        Stage s = (Stage) resolutionTextArea.getScene().getWindow();
        s.close();
    }
}
