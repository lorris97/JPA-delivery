/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensup.SERVICE;

import eu.ensup.BO.CoursBO;
import eu.ensup.BO.EtudiantBO;
import eu.ensup.CONNECTION.Connection;
import eu.ensup.DAO.CoursDAO;
import eu.ensup.DAO.EtudiantDAO;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lorris
 */
public class CoursSERVICE {
    
     public ArrayList<CoursBO> liste() throws ClassNotFoundException, SQLException
            
    {
         Connection con = new Connection();
        Statement stm = con.Connect();
         CoursDAO dao = new CoursDAO();
     ArrayList<CoursBO> liste = new ArrayList<CoursBO>();
     liste = dao.getList(stm);
     stm.close();
     
     return liste;
    }
    
}
