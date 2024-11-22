/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
//interface Serializable cho phép đối tượng của lớp có thể chuyển đổi thành 1 dòng byte
public class ExpenditureType implements Serializable{
    private String Id;
    private String Name;

    public ExpenditureType() {
    }

    public ExpenditureType(String Id, String Name) {
        this.Id = Id;
        this.Name = Name;
    }
    
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public String toString() {
        return Id + " - "+Name;
    }
    
    
}
