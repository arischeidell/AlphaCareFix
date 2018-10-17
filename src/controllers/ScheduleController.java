/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import models.ScheduleTableEntry;
import java.net.URL;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.stage.Modality;
import javafx.stage.Stage;
import models.AppointmentStore;

/**
 *
 * @author pss5205
 */
public class ScheduleController implements Initializable {
    
    private ObservableList<ScheduleTableEntry> scheduledTableList;
    
    @FXML
    private Button clearButton;
    @FXML
    private Button saveButton;
    @FXML
    private TextArea reasonTextField;
    @FXML
    private DatePicker appointmentDatePicker;
    @FXML
    private ChoiceBox physicianSelect;
    @FXML
    private TableView<ScheduleTableEntry> scheduledTable;
    @FXML
    private ChoiceBox timeSelect;
    
    
    @FXML
    private void onPhysicianSelect(ActionEvent event){
        //Should Update Avail. Dates and Times
    }
    
    @FXML
    private void onDatePick(ActionEvent event){
        //Should update aval. times
    }
    
    @FXML
    private void onSaveButtonPress(ActionEvent event){
        LocalDate localDate = appointmentDatePicker.getValue();     
        LocalTime localTime = (LocalTime) timeSelect.getSelectionModel().getSelectedItem();
        LocalDateTime ldt = LocalDateTime.of(localDate, localTime);
        Date date = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
        String physName = physicianSelect.getSelectionModel().getSelectedItem().toString();
        ScheduleTableEntry newEntry = new ScheduleTableEntry(physName, date);
        scheduledTable.getItems().add(newEntry);
        List<ScheduleTableEntry> savedScheduleData = AppointmentStore.getInstance().getScheduleTableStore();
        savedScheduleData.add(newEntry);
        AppointmentStore.getInstance().saveScheduleTableEntryList();
        this.onClearButtonPress(event);
    }
    
    @FXML
    private void onClearButtonPress(ActionEvent event){
        this.physicianSelect.getSelectionModel().clearSelection();
        this.timeSelect.getSelectionModel().clearSelection();        
        this.appointmentDatePicker.getEditor().clear();
        this.appointmentDatePicker.setValue(null);
    }
    
    @FXML
    private void onTimeSelect(ActionEvent event){
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         physicianSelect.setItems(FXCollections.observableArrayList(
            "Haynes, Steven D.O.", "Lipniskis, Jeffery M.D.", "Jobs, Steven P.A.", "Murphy, Alison M.D.")
        );
         
         List<LocalTime> availibleTimes = getAvailibleTimes();
         timeSelect.setItems(FXCollections.observableArrayList(availibleTimes));
         List<ScheduleTableEntry> savedScheduleData = AppointmentStore.getInstance().getScheduleTableStore();
         scheduledTableList = FXCollections.observableArrayList(savedScheduleData);
         scheduledTable.setItems(this.scheduledTableList);
         
    }

    private List<LocalTime> getAvailibleTimes(){
        ArrayList<LocalTime> times = new ArrayList<>();        
        for(int hoursInDay = 8; hoursInDay < 17; hoursInDay++){
              times.add(LocalTime.of(hoursInDay, 0));
        }
    
        return times;
    }
    
    public void closeScheduleUI(){
          Stage stage = (Stage) this.appointmentDatePicker.getScene().getWindow();
            stage.close();
    }
    
    public void showScheduleUI(){
         try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/ScheduleAppointment.fxml"));
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
    
}
