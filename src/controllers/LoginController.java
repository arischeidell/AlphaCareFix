/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import models.UserList;
import models.UserStore;

/**
 *
 * @author ariannascheidell
 */
public class LoginController {
    private UserList ul;
    private UserController userController;
    private HomeController homeController;
    @FXML
    private TextField userNameTextField;
    @FXML
    private PasswordField passwordField;
    
    public LoginController() {
        ul = new UserList();
    }
    
    public UserController addUser(){
        userController = new UserController();
        return userController;
    }
    
    public boolean authenticate(String username, char[] pw) {
        boolean auth = ul.authenticate(username, pw);
        if (auth) {
            homeController = new HomeController();
            return true;
        } else { //incorrect username/password, try again
            return false;
        }
    }
    
    @FXML
    private void onForgotPasswordButtonAction(ActionEvent event){
        //Call forgot password button controller and launch new UI
    }
    
    @FXML
    private void onNewUserButtonAction(ActionEvent event){
        //Call new user ui and launch new UI
    }
    
    @FXML
    private void onLoginButtonAction(ActionEvent event){
        
        if(UserStore.getInstance().authenticateUser(userNameTextField.getText(), passwordField.getText())){
            requestHomeController();
        }
        else{
            System.out.println("Login Failed");
        }
 
    }
    
    private void requestHomeController(){
        System.out.println("Home Controller Started");
    }
    
}
