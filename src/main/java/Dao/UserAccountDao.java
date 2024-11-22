package Dao;

import Entity.UserAccount;
import Util.DatabaseUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserAccountDao {
    public boolean find(UserAccount entity) throws SQLException{
        String sql = "select * from UserAccount where username=? and password=? ";
        try{
            Connection con = new DatabaseUtil().connectSQL();
            PreparedStatement prstm = con.prepareStatement(sql);
            prstm.setString(1, entity.getUsername());
            prstm.setString(2, entity.getPassword());
            
            ResultSet rs = prstm.executeQuery();
            
            //Nếu trả về true tức là đúng tên tài khoản và mật khẩu
            return rs.next();
            
            
        } catch (SQLException e) {
            System.out.println("Loi:"+e.getMessage());
        }
        return false;
    }
}
