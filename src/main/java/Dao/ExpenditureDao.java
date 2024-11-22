package Dao;

import Entity.Expenditure;
import Util.DatabaseUtil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExpenditureDao {
    public Expenditure insert(Expenditure enity) throws SQLException{
        String sql = "insert into Expenditure(ID, Name, Amount, IDType, Note, ExpenditureDate, username) Values(?,?,?,?,?,?,?) ";
        try{
            Connection con = new DatabaseUtil().connectSQL();
            PreparedStatement prstm = con.prepareStatement(sql);
            prstm.setString(1, enity.getID());
            prstm.setString(2, enity.getName());
            prstm.setDouble(3, enity.getAmount());
            prstm.setString(4, enity.getIDType());
            prstm.setString(5, enity.getNote());
            java.sql.Date date = new Date(enity.getExpenditureDate().getTime());
            prstm.setDate(6, date);
            prstm.setString(7, enity.getUsername());
            prstm.executeUpdate();
        
            return enity;
            
            
        } catch (SQLException e) {
            System.out.println("Loi:"+e.getMessage());
        }
        return null;
    }
    
    public boolean update(Expenditure enity) throws SQLException{
        String sql = "update Expenditure set Name=?, Amount=?, IDType=?, Note=?, ExpenditureDate=?  where ID=? ";
        try{
            Connection con = new DatabaseUtil().connectSQL();
            PreparedStatement prstm = con.prepareStatement(sql);
            prstm.setString(1, enity.getName());
            prstm.setDouble(2, enity.getAmount());
            prstm.setString(3, enity.getIDType());
            prstm.setString(4, enity.getNote());
            java.sql.Date date = new Date(enity.getExpenditureDate().getTime());
            prstm.setDate(5, date);
            prstm.setString(6,enity.getID());
        
            return prstm.executeUpdate()>0;
            
            
        } catch (SQLException e) {
            System.out.println("Loi:"+e.getMessage());
        }
        return false;
    }
    
    public boolean delete(String id) throws SQLException{
        String sql = "delete from Expenditure where ID=? ";
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
        String sql = "select * from Expenditure ";
        try{
            Connection con = new DatabaseUtil().connectSQL();
            PreparedStatement prstm = con.prepareStatement(sql);
            
            List<Expenditure> list = new ArrayList<>();
            
            ResultSet rs = prstm.executeQuery();
            while(rs.next())
            {
                Expenditure entity = new Expenditure();
                entity.setID(rs.getString("ID"));
                entity.setName(rs.getString("Name"));
                entity.setAmount(rs.getDouble("Amount"));
                entity.setIDType(rs.getString("IDType"));
                entity.setNote(rs.getString("Note"));
                entity.setExpenditureDate(rs.getDate("ExpenditureDate"));
                entity.setUsername(rs.getString("username"));
                list.add(entity);
            }
            return list;
        } catch (SQLException e) {
            System.out.println("Loi:"+e.getMessage());
        }
        return null;
    }
    
    public Expenditure findById(String Id) throws SQLException{
        String sql = "select * from Expenditure where ID=? ";
        try{
            Connection con = new DatabaseUtil().connectSQL();
            PreparedStatement prstm = con.prepareStatement(sql);
            prstm.setString(1, Id);
            
            ResultSet rs = prstm.executeQuery();
            if(rs.next())
            {
                Expenditure entity = new Expenditure();
                entity.setID(rs.getString("ID"));
                entity.setName(rs.getString("Name"));
                entity.setAmount(rs.getDouble("Amount"));
                entity.setIDType(rs.getString("IDType"));
                entity.setNote(rs.getString("Note"));
                entity.setExpenditureDate(rs.getDate("ExpenditureDate"));
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
