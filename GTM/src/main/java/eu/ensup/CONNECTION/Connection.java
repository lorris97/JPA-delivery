    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensup.CONNECTION;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lorris
 */
    public class Connection {
    
    public Statement Connect() throws ClassNotFoundException, SQLException
    {
        String url = "jdbc:mysql://localhost/ensupbdd";
        String login = "root";
        String mdp = "";
        java.sql.Connection con = null;
        Statement st = null;

    

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, login, mdp);
            st = con.createStatement();
                
        return st;
    }
  
    
}
