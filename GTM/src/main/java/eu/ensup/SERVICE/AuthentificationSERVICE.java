/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensup.SERVICE;

import eu.ensup.CONNECTION.Connection;
import eu.ensup.DAO.EnseignantDAO;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lorris
 */
public class AuthentificationSERVICE {
    
    
    public boolean connection(String nom, String password ) throws ClassNotFoundException, SQLException
    {
        boolean connection = false;
        EnseignantDAO  dao = new EnseignantDAO();
       int res =  dao.Connection( nom, password);
       if(res != 0 )
       {
           connection = true;
       }
        
        return connection;
    }
            
    
}
