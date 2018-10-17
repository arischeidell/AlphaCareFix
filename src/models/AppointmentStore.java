/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pss5205
 */
public class AppointmentStore {
    
    private List<ScheduleTableEntry> scheduleTableStore;
    
    private AppointmentStore() {
    }
    
    public static AppointmentStore getInstance() {
        return AppointmentStoreHolder.INSTANCE;
    }
    
    private static class AppointmentStoreHolder {

        private static final AppointmentStore INSTANCE = new AppointmentStore();
    }
    
      public void loadScheduleTableEntryList() {
        Gson gson = new Gson();

        try {
          
            BufferedReader br = new BufferedReader(
                    new FileReader("ScheduleTableStore.json"));
            String str = br.readLine();
            if(str == null || str.isEmpty()){           
            this.scheduleTableStore = new ArrayList<>();
            }
            else if(str.contentEquals("null")){
               this.scheduleTableStore = new ArrayList<>();
            }
            else
            {
            br = new BufferedReader(
                    new FileReader("ScheduleTableStore.json"));
            Type ListType = new TypeToken<List<ScheduleTableEntry>>(){}.getType();

            List<ScheduleTableEntry> ingredientList = gson.fromJson(br, ListType); 
            this.scheduleTableStore = ingredientList;
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveScheduleTableEntryList() {
        File file = new File("ScheduleTableStore.json");
        System.out.println("Path: " + file.getAbsolutePath());
        try (Writer writer = new FileWriter("ScheduleTableStore.json")) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(scheduleTableStore, writer);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(AppointmentStore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<ScheduleTableEntry> getScheduleTableStore() {
        this.loadScheduleTableEntryList();
        if(scheduleTableStore == null){
            return new ArrayList<>();
        }
        return scheduleTableStore;
    }
    
}
