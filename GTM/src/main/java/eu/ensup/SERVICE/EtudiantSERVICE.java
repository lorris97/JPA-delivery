/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensup.SERVICE;

import eu.ensup.BO.EtudiantBO;
import eu.ensup.CONNECTION.Connection;
import eu.ensup.DAO.EtudiantDAO;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lorris
 */
public class EtudiantSERVICE {
    
    public ArrayList<EtudiantBO> liste() throws ClassNotFoundException, SQLException
            
    {
         Connection con = new Connection();
        Statement stm = con.Connect();
         EtudiantDAO dao = new EtudiantDAO();
     ArrayList<EtudiantBO> liste = new ArrayList<EtudiantBO>();
     liste = dao.getList(stm);
     stm.close();
     
     return liste;
    }
  
     public ArrayList<EtudiantBO> getOneById(int id) throws ClassNotFoundException, SQLException 
            
    {
         Connection con = new Connection();
        Statement stm = con.Connect();
         EtudiantDAO dao = new EtudiantDAO();
     ArrayList<EtudiantBO> liste = new ArrayList<EtudiantBO>();
     liste = dao.SearchByID(stm, id);
     //stm.close();
     
     return liste;
    }
     
     public void supprimerById(int id) throws ClassNotFoundException, SQLException
     {
         Connection con = new Connection();
        Statement stm = con.Connect();
         EtudiantDAO dao = new EtudiantDAO();
        dao.DeleteProfil(stm, id);
     stm.close();
         
     }
    
     
     public void updateByID(EtudiantBO bo) throws ClassNotFoundException, SQLException
     {
         Connection con = new Connection();
        Statement stm = con.Connect();
        EtudiantDAO dao = new EtudiantDAO();
        dao.UpdateEtudiant(stm, bo);
        stm.close();
         
     }
     
     public void lierEtudiantCours(int idEtu, int idCours) throws ClassNotFoundException, SQLException
     {
           Connection con = new Connection();
        Statement stm = con.Connect();
         EtudiantDAO etuDAO = new EtudiantDAO();
         etuDAO.lierEtudiantCours(stm, idEtu, idCours);
                 
     }
}
