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
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import models.Bill;

/**
 *
 * @author pss5205
 */
public class BillDetailController implements Initializable{

    @FXML private Text dateText;
    @FXML private Text descText;
    @FXML private Text billAmountText;
    @FXML private Text insuranceText;
    @FXML private Text dueText;
    @FXML private Button backButton;
    private Bill bill;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void setBill(Bill bill){
        this.bill = bill;
        dateText.setText(this.bill.getBillDate().toString());
        descText.setText(this.bill.getItemDesc());
        billAmountText.setText(Double.toString(this.bill.getTotalCost()));
        insuranceText.setText(Double.toString(this.bill.getInsuranceCover()));
        dueText.setText(Double.toString(this.bill.getTotalDue()));                
    }
    
     public void closeBillDetailUI() {
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
    }

    public void showBillDetailUI(Bill bill) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/BillDetailView.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("AlphaCare");
            stage.setScene(new Scene(root1));
            stage.show();
            BillDetailController bdc = fxmlLoader.getController();
            bdc.setBill(bill);

        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      @FXML public void onBackButtonAction(ActionEvent e){
        this.closeBillDetailUI();
        BillController bc = new BillController();
        bc.showBillUI();
    }
}
