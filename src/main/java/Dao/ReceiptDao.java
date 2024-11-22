package Dao;

import Entity.Receipt;
import Util.DatabaseUtil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReceiptDao {
    public Receipt insert(Receipt enity) throws SQLException{
        String sql = "insert into Receipt(ID, Name, Amount, IDType, Note, ReceiptDate, username) Values(?,?,?,?,?,?,?) ";
        try{
            Connection con = new DatabaseUtil().connectSQL();
            PreparedStatement prstm = con.prepareStatement(sql);
            prstm.setString(1, enity.getID());
            prstm.setString(2, enity.getName());
            prstm.setDouble(3, enity.getAmount());
            prstm.setString(4, enity.getIDType());
            prstm.setString(5, enity.getNote());
            java.sql.Date date = new Date(enity.getReceiptDate().getTime());
            prstm.setDate(6, date);
            prstm.setString(7, enity.getUsername());
            prstm.executeUpdate();
        
            return enity;
            
            
        } catch (SQLException e) {
            System.out.println("Loi:"+e.getMessage());
        }
        return null;
    }
    
    public boolean update(Receipt enity) throws SQLException{
        String sql = "update Receipt set Name=?, Amount=?, IDType=?, Note=?, ReceiptDate=?  where ID=? ";
        try{
            Connection con = new DatabaseUtil().connectSQL();
            PreparedStatement prstm = con.prepareStatement(sql);
            prstm.setString(1, enity.getName());
            prstm.setDouble(2, enity.getAmount());
            prstm.setString(3, enity.getIDType());
            prstm.setString(4, enity.getNote());
            java.sql.Date date = new Date(enity.getReceiptDate().getTime());
            prstm.setDate(5, date);
            prstm.setString(6,enity.getID());
        
            return prstm.executeUpdate()>0;
            
            
        } catch (SQLException e) {
            System.out.println("Loi:"+e.getMessage());
        }
        return false;
    }
    
    public boolean delete(String id) throws SQLException{
        String sql = "delete from Receipt where ID=? ";
        try{
            Connection con = new DatabaseUtil().connectSQL();
            PreparedStatement prstm = con.prepareStatement(sql);
            prstm.setString(1, id);
        
            return prstm.executeUpdate()>0;
        } catch (SQLException e) {
            System.out.println("Loi:"+e.getMessage());
        }
        return false;
    }
    
    public List findAll() throws SQLException{
        String sql = "select * from Receipt ";
        try{
            Connection con = new DatabaseUtil().connectSQL();
            PreparedStatement prstm = con.prepareStatement(sql);
            
            List<Receipt> list = new ArrayList<>();
            
            ResultSet rs = prstm.executeQuery();
            while(rs.next())
            {
                Receipt entity = new Receipt();
                entity.setID(rs.getString("ID"));
                entity.setName(rs.getString("Name"));
                entity.setAmount(rs.getDouble("Amount"));
                entity.setIDType(rs.getString("IDType"));
                entity.setNote(rs.getString("Note"));
                entity.setReceiptDate(rs.getDate("ReceiptDate"));
                entity.setUsername(rs.getString("username"));
                list.add(entity);
            }
            return list;
        } catch (SQLException e) {
            System.out.println("Loi:"+e.getMessage());
        }
        return null;
    }
    
    public Receipt findById(String Id) throws SQLException{
        String sql = "select * from Receipt where ID=? ";
        try{
            Connection con = new DatabaseUtil().connectSQL();
            PreparedStatement prstm = con.prepareStatement(sql);
            prstm.setString(1, Id);
            
            ResultSet rs = prstm.executeQuery();
            if(rs.next())
            {
                Receipt entity = new Receipt();
                entity.setID(rs.getString("ID"));
                entity.setName(rs.getString("Name"));
                entity.setAmount(rs.getDouble("Amount"));
                entity.setIDType(rs.getString("IDType"));
                entity.setNote(rs.getString("Note"));
                entity.setReceiptDate(rs.getDate("ReceiptDate"));
                entity.setUsername(rs.getString("username"));
                return entity;
            }
            return null;
        } catch (SQLException e) {
            System.out.println("Loi:"+e.getMessage());
        }
        return null;
    }
}
