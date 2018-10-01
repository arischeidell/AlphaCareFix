/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import models.Meeting;
import models.Permission;
import models.User;
import views.AddUserView;

/**
 *
 * @author Paul
 */
public class UserController {
    private AddUserView view;
            
    public UserController() {
        System.out.println("User Controller"); //for testing purposes
        view = new AddUserView();
    }
    
    /**Creates a user object
     *
     */
    public void createUser(){
        
    }
    
    /**Gets user details
     *
     * @return userObject
     */
    public User getUserDetails(){
        return null;
    }
    
    /**Gets all the meetings a user has scheduled
     *
     * @return listOfMeetings
     */
    public List<Meeting> getUserMeetings(){
        return null;
    }
    
    /**Gets list of all user permissions assigned
     *
     * @return permissionList
     */
    public List<Permission> getUserPermissions(){
        return null;
    }
    
    /**Checks if user has specific permission
     *
     * @return hasPermission
     */
    public boolean hasUserPermission(){
        return false;
    }
}
