/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rundown_v1;

import java.net.SocketException;

/**
 *
 * @author DeeptoTV
 */
public class Rundown_v1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SocketException {
        // TODO code application logic here
        Login_form login = new Login_form();
        login.setLocation(300,200);
        login.setVisible(true);
    }
    
}
