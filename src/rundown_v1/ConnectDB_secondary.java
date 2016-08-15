/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Tauwab Uz Zahir
 */
package rundown_v1;
import java.sql.*;
import javax.swing.*;
public class ConnectDB_secondary {
    Connection conn = null;
    public static Connection connectDb(){
        
      
        try{
       Class.forName("com.mysql.jdbc.Driver");  
       Connection conn=DriverManager.getConnection("jdbc:mysql://10.3.10.191:3306/casparcg","root","password");  
      //JOptionPane.showMessageDialog(null, "connected");
       System.out.print("Connected\n");
       return conn;
        }catch(Exception e){
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return null;
        }
        
    }
    
}
