/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class Expenditure implements Serializable{
    private String ID;
    private String Name;
    private double Amount;
    private String IDType;
    private String note;
    private Date ExpenditureDate;
    private String username;

    public Expenditure() {
    }

    public Expenditure(String ID, String Name, double Amount, String IDType, String note, Date ExpenditureDate, String username) {
        this.ID = ID;
        this.Name = Name;
        this.Amount = Amount;
        this.IDType = IDType;
        this.note = note;
        this.ExpenditureDate = ExpenditureDate;
        this.username = username;
    }
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    public String getIDType() {
        return IDType;
    }

    public void setIDType(String IDType) {
        this.IDType = IDType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getExpenditureDate() {
        return ExpenditureDate;
    }

    public void setExpenditureDate(Date ExpenditureDate) {
        this.ExpenditureDate = ExpenditureDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
