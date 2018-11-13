/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author pss5205
 */
public class Bill {
    private Date   billDate;
    private String itemDesc;
    private double totalCost;
    private double insuranceCover;
    private double totalDue;

    public Bill(Date billDate, String itemDesc, double totalCost, double insuranceCover) {
        this.billDate = billDate;
        this.itemDesc = itemDesc;
        this.totalCost = totalCost;
        this.insuranceCover = insuranceCover;
        this.totalDue = totalCost - insuranceCover;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getInsuranceCover() {
        return insuranceCover;
    }

    public void setInsuranceCover(double insuranceCover) {
        this.insuranceCover = insuranceCover;
    }

    public double getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(double totalDue) {
        this.totalDue = totalDue;
    }
    
    
}
