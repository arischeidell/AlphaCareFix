/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.SearchView;

/**
 *
 * @author Paul
 */
public class SearchController {
    private SearchView view;
    
    public SearchController() {
        System.out.println("Search Controller"); //for testing purposes
        view = new SearchView();
    }
    
    /**Takes in a search query to find and return a user from AlphaCare DB
     *
     * @param query
     */
    public void searchUser(String query){
        
    }
    
    /**Searches DB for user based on last name
     *
     * @param lastName
     */
    public void searchUserByLastName(String lastName){
        
    }
    
    /**Searches DB for user based on first name
     *
     * @param firstName
     */
    public void serachUserByFirstName(String firstName){
        
    }
    
    /**Searches for a user based on the user id
     *
     * @param id
     */
    public void searchUserByID(int id){
        
    }
    
}
