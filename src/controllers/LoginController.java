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
}
