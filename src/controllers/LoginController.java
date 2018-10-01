/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.UserList;

/**
 *
 * @author ariannascheidell
 */
public class LoginController {
    private UserList ul;
    private UserController userController;
    private HomeController homeController;
    
    public LoginController() {
        ul = new UserList();
    }
    
    public void addUser(){
        userController = new UserController();
    }
    
    public void authenticate(String username, char[] pw) {
        boolean auth = ul.authenticate(username, pw);
        if (auth) {
            homeController = new HomeController();
        } else { //incorrect username/password, try again
            
        }
    }
}
