/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensup.SERVICE;

import eu.ensup.CONNECTION.Connection;
import eu.ensup.BO.EtudiantBO;
import eu.ensup.DAO.EtudiantDAO;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lorris
 */
public class InscriptionSERVICE {

    public InscriptionSERVICE() {
    }
    
    
    
    
    
    public void inscritpiton(EtudiantBO bo) throws ClassNotFoundException, SQLException
    {
        EtudiantDAO dao = new EtudiantDAO();
        dao.InsertNewEtudiant(bo);
    }
            
    
}
