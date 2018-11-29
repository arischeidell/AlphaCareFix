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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import models.UserStore;

/**
 *
 * @author ariannascheidell
 */
public class LoginController implements Initializable {

    private HomeController homeController;
    @FXML
    private TextField userNameTextField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;
    @FXML
    private Text loginFailedText;
    @FXML
    private Button forgotPasswordButton;
    @FXML
    private Button newUserButton;

    //Display testing credentials. Remove before production!!!
    @FXML
    private void onForgotPasswordButtonAction(ActionEvent event) {
        //Call forgot password button controller and launch new UI
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Forgot Password");
        alert.setHeaderText("AlphaCare Testing Credentials");
        alert.setContentText("Username: testuser | Password: testpass");
        alert.showAndWait();
    }

    //Display a message that user needs to contact their physician to be added.
    //On the admin side, users can be added
    @FXML
    private void onNewUserButtonAction(ActionEvent event) {
        //Call new user ui and launch new UI
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("New User");
        //alert.setHeaderText("AlphaCare Testing Credentials");
        alert.setContentText("Contact your Physician to be added to the AlphaCare.");
        alert.showAndWait();
    }

    //Attempt to login
    @FXML
    private void onLoginButtonAction(ActionEvent event) {

        if (UserStore.getInstance().authenticateUser(userNameTextField.getText(), passwordField.getText())) {
            this.loginFailedText.setVisible(false);
            Stage stage = (Stage) loginButton.getScene().getWindow();
            stage.close();
            requestHomeController();
        } else {
            this.loginFailedText.setVisible(true);
        }

    }

    //Show home UI
    private void requestHomeController() {
        System.out.println("Home Controller Started");
        homeController = new HomeController();
        homeController.startHomeUI();

    }

    //init components
    @Override
    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        //This sets login button to default so when you hit enter it's like pressing the login button
        this.loginButton.setDefaultButton(true);
        this.loginFailedText.setVisible(false);

    }

    //show login UI
    public void getLoginUI() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/LoginView.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            //stage.initStyle(StageStyle.UNDECORATED);
            //stage.setTitle("AlphaCare");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
