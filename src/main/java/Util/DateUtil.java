/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class DateUtil {
    public String pattern = "dd/MM/yyyy";
    private SimpleDateFormat sdf = new SimpleDateFormat(pattern);
    
    public String toString(Date date){
        return sdf.format(date);
    }
    
    public Date toDate(String stDate) throws ParseException{
        return sdf.parse(stDate);
    }
}
