package Dao;

import Entity.ExpenditureType;
import Util.DatabaseUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ExpenditureTypeDao {
    public ExpenditureType insert(ExpenditureType enity) throws SQLException{
        String sql = "insert into ExpenditureType(IDType,NameType) Values(?,?) ";
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
    
    public boolean update(ExpenditureType enity) throws SQLException{
        String sql = "update ExpenditureType set NameType=? where IDType=? ";
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
        String sql = "delete from ExpenditureType where IDType=? ";
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
        String sql = "select * from ExpenditureType ";
        try{
            Connection con = new DatabaseUtil().connectSQL();
            PreparedStatement prstm = con.prepareStatement(sql);
            
            List<ExpenditureType> list = new ArrayList<>();
            
            ResultSet rs = prstm.executeQuery();
            while(rs.next())
            {
                ExpenditureType entity = new ExpenditureType();
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
    
    public ExpenditureType findById(String Id) throws SQLException{
        String sql = "select * from ExpenditureType where IDType=? ";
        try{
            Connection con = new DatabaseUtil().connectSQL();
            PreparedStatement prstm = con.prepareStatement(sql);
            prstm.setString(1, Id);
            
            ResultSet rs = prstm.executeQuery();
            if(rs.next())
            {
                ExpenditureType entity = new ExpenditureType();
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
