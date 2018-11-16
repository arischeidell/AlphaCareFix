
import controllers.HomeController;
import java.util.ArrayList;
import models.Doctor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pss5205
 */
public class TestHarness {

    public TestHarness() {
        //double controllerTests = testControllers();
        //double modelTests = testModels();
        HomeController hc = new HomeController();
        hc.viewMedicalRecord();
        hc.viewMeds();
       // hc.viewMeetings();
        hc.viewSearch();
    }
    //Tests were created using JUnit and they are located in the tests package.

//    private double testControllers(){
//        ArrayList<Double> controllerTests = new ArrayList<>();
//        controllerTests.add(testMedicalRecordController());
//        controllerTests.add(testMedicationController());
//        controllerTests.add(testMeetingController());
//        controllerTests.add(testSearchController());
//        controllerTests.add(testUserController());        
//        return 0;
//    }
//    
//    private double testModels(){
//        ArrayList<Double> modelTests = new ArrayList<>();
//        modelTests.add(testAddress());
//        modelTests.add(testDoctor());
//        modelTests.add(testMedicalRecord());
//        modelTests.add(testMedication());
//        modelTests.add(testMeeting());
//        modelTests.add(testPatient());
//        modelTests.add(testPermission());
//        return 0;
//    }
//    
//    private void out(String className, boolean testPassed){
//        
//    }
//
//    private void out(String output){
//        
//    }
//    
//    private Double testMedicalRecordController() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private Double testMedicationController() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private Double testMeetingController() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private Double testSearchController() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private Double testUserController() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private Double testAddress() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private Double testMedicalRecord() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private Double testMedication() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private Double testMeeting() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private Double testPatient() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private Double testPermission() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private Double testDoctor() {
//        out("Testing Doctor Class");
//        boolean testPassed = true;
//        String userName = "TestUser";
//        char[] password = "TestPass".toCharArray();
//        Doctor testDoctor = new Doctor(userName, password);
//        if(testDoctor == null){
//            testPassed = false;
//            out("Failure: Create Doctor Object");
//        }
//        else{
//            out("Success: Create Doctor Object");
//        }
//        
//        return 0.0;
//    }
}
