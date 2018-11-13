/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import models.Bill;

/**
 *
 * @author pss5205
 */
public class BillController implements Initializable{

    @FXML private ObservableList<Bill> obsBillList;
    @FXML private Button homeButton;
    @FXML private TableView billTableView;
    @FXML private TableColumn<Bill, Date> dateTableColumn;
    @FXML private TableColumn<Bill, String> itemTableColumn;
    @FXML private TableColumn<Bill, Double> costTableColumn;
    @FXML private TableColumn<Bill, Double> insuranceTableColumn;
    @FXML private TableColumn<Bill, Double> dueTableColumn;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<Bill> billList = new ArrayList<>();
        billList.add(new Bill(new Date(), "Vaccine", 121.40, 100.00));
        billList.add(new Bill(new Date(), "Checkup", 250, 200));
        obsBillList = FXCollections.observableArrayList(billList);
        billTableView.setItems(obsBillList);
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("billDate"));
        itemTableColumn.setCellValueFactory(new PropertyValueFactory<>("itemDesc"));
        costTableColumn.setCellValueFactory(new PropertyValueFactory<>("totalCost"));
        insuranceTableColumn.setCellValueFactory(new PropertyValueFactory<>("insuranceCover"));
        dueTableColumn.setCellValueFactory(new PropertyValueFactory<>("totalDue"));
    }
    
    
     public void closeBillUI() {
        Stage stage = (Stage) homeButton.getScene().getWindow();
        stage.close();
    }

    public void showBillUI() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/BillView.fxml"));
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
    
    @FXML public void onBillTableViewMouseClick(MouseEvent me){
        
    }
    
    @FXML public void onHomeButtonAction(ActionEvent e){
        this.closeBillUI();
        HomeController homeController = new HomeController();
        homeController.startHomeUI();
    }
}
