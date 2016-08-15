/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rundown_v1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author DeeptoTV
 */
public class LoginValidation {
    
    Connection conn = null;
    Statement statement1 = null; 
    ResultSet rs = null;

    public LoginValidation() throws SQLException {
        

    }
    
    public boolean validation(String user_name,String pass) throws SQLException{
        conn = ConnectDB_scheduler.connectDb();
        PreparedStatement pst = conn.prepareStatement("SELECT * from registration where user_id = ? and password = ?");
        pst.setString(1, user_name);
        pst.setString(2, pass);
        rs = pst.executeQuery();
        
        if(rs.next())
        {
            conn.close();
            return true;
        }
        else
        {
            conn.close();
            return false;
        }
            
    
    }
     
    
    
    
    
    
    
}
