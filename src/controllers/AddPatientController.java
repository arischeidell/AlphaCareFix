/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import models.Address;
import models.Patient;
import models.User;
import models.UserStore;

/**
 * FXML Controller class
 *
 * @author pss5205
 */
public class AddPatientController implements Initializable {

    @FXML
    private TextField firstNameTextField;
    @FXML
    private PasswordField passwordPasswordField;
    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private TextField streetTextField;
    @FXML
    private TextField zipTextField;
    @FXML
    private TextField cityTextField;
    @FXML
    private TextField heightTextField;
    @FXML
    private TextField weightTextField;
    @FXML
    private TextField ageTextField;
    @FXML
    private Button saveButton;
    private ArrayList<TextField> fieldList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        fieldList = new ArrayList<>();
        fieldList.add(firstNameTextField);
        fieldList.add(passwordPasswordField);
        fieldList.add(usernameTextField);
        fieldList.add(lastNameTextField);
        fieldList.add(streetTextField);
        fieldList.add(zipTextField);
        fieldList.add(cityTextField);
        fieldList.add(heightTextField);
        fieldList.add(weightTextField);
        fieldList.add(ageTextField);
    }

    @FXML
    private void onSaveButtonAction(ActionEvent event) {
        if (validatePatient()) {
            Patient p = new Patient(this.usernameTextField.getText(), this.passwordPasswordField.getText().toCharArray(),
                    new Address(streetTextField.getText(), "", this.cityTextField.getText(), "", this.zipTextField.getText()), "NA");
            p.setAge(Integer.parseInt(this.ageTextField.getText()));
            p.setFirstName(this.firstNameTextField.getText());
            p.setLastName(this.lastNameTextField.getText());
            p.setWeight(Double.parseDouble(this.weightTextField.getText()));
            p.setHeight(Double.parseDouble(this.heightTextField.getText()));
            UserStore.getInstance().addUser(p);
        } else {
            //Display Error Message
        }
    }

    //Validate that the patient values are of the correct type
    
    private boolean validatePatient(){
      for(TextField tf : this.fieldList){
          if(tf.getText().isEmpty() || tf.getText() == null){
              return false;
          }
      }
      if(!this.tryParseDouble(this.weightTextField.getText())){
          return false;
      }
      if(!this.tryParseDouble(this.ageTextField.getText())){
          return false;
      }
      if(!this.tryParseDouble(this.heightTextField.getText())){
          return false;
      }
      String username = this.usernameTextField.getText();
      if(UserStore.getInstance().doesUserExist(username)){
          return false;
      }
      
      return true;
    }

    //Show the add patient UI
    public void showAddPatientUI() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/AddPatientView.fxml"));
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

    //Close the add patient UI
    public void closeAddPatientUI() {
        Stage stage = (Stage) saveButton.getScene().getWindow();
        stage.close();
    }

    //Tries to parse an int. If there's an exception, it catches it and returns false instead.
    //https://stackoverflow.com/questions/8391979/does-java-have-a-int-tryparse-that-doesnt-throw-an-exception-for-bad-data
    private boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //Same as above for double.
    private boolean tryParseDouble(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
