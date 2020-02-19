/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensup.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lorris
 */
public class EnseignantDAO {
    
    
     public int Connection(Statement stm, String nom , String password) throws ClassNotFoundException, SQLException {
	
        
     
                  int rep = 0;
		try {

			ResultSet res = stm.executeQuery("SELECT count(*) FROM `enseignant` WHERE nom = '"+nom+"' and password = '"+password+"'");

			while (res.next()) {
			rep = 	res.getInt("count(*)");
				
			}

		}

		catch (Exception e) {
			System.out.println(e);
		}
                stm.close();
		return rep;
	}

    
}
