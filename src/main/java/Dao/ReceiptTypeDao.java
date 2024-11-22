/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Entity.ReceiptType;
import Util.DatabaseUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class ReceiptTypeDao {
    public ReceiptType insert(ReceiptType enity) throws SQLException{
        String sql = "insert into ReceiptType(IDType,NameType) Values(?,?) ";
        try{
            Connection con = new DatabaseUtil().connectSQL();
            PreparedStatement prstm = con.prepareStatement(sql);
            prstm.setString(1, enity.getId());
            prstm.setString(2, enity.getName());
            prstm.executeUpdate();
        
            return enity;
            
            
        } catch (SQLException e) {
            System.out.println("Loi:"+e.getMessage());
        }
        return null;
    }
    
    public boolean update(ReceiptType enity) throws SQLException{
        String sql = "update ReceiptType set NameType=? where IDType=? ";
        try{
            Connection con = new DatabaseUtil().connectSQL();
            PreparedStatement prstm = con.prepareStatement(sql);
            prstm.setString(1, enity.getName());
            prstm.setString(2, enity.getId());
        
            return prstm.executeUpdate()>0;
            
            
        } catch (SQLException e) {
            System.out.println("Loi:"+e.getMessage());
        }
        return false;
    }
    
    public boolean delete(String id) throws SQLException{
        String sql = "delete from ReceiptType where IDType=? ";
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
        String sql = "select * from ReceiptType ";
        try{
            Connection con = new DatabaseUtil().connectSQL();
            PreparedStatement prstm = con.prepareStatement(sql);
            
            List<ReceiptType> list = new ArrayList<>();
            
            ResultSet rs = prstm.executeQuery();
            while(rs.next())
            {
                ReceiptType entity = new ReceiptType();
                entity.setId(rs.getString("IDType"));
                entity.setName(rs.getString("NameType"));
                
                list.add(entity);
            }
            return list;
        } catch (SQLException e) {
            System.out.println("Loi:"+e.getMessage());
        }
        return null;
    }
    
    public ReceiptType findById(String Id) throws SQLException{
        String sql = "select * from ReceiptType where IDType=? ";
        try{
            Connection con = new DatabaseUtil().connectSQL();
            PreparedStatement prstm = con.prepareStatement(sql);
            prstm.setString(1, Id);
            
            ResultSet rs = prstm.executeQuery();
            if(rs.next())
            {
                ReceiptType entity = new ReceiptType();
                entity.setId(rs.getString("IDType"));
                entity.setName(rs.getString("NameType"));
                return entity;
            }
            
        } catch (SQLException e) {
            System.out.println("Loi:"+e.getMessage());
        }
        return null;
    }
}
