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
import java.util.List;

/**
 *
 * @author lorris
 */


public class EtudiantSERVICE {

    public List<EtudiantBO> liste() throws ClassNotFoundException, SQLException {
        EtudiantDAO dao = new EtudiantDAO();
        List<EtudiantBO> liste;
        liste = dao.getList();

        return liste;
    }

    public List<EtudiantBO> getOneById(int id) throws ClassNotFoundException, SQLException {
        EtudiantDAO dao = new EtudiantDAO();
        List<EtudiantBO> liste;
        liste = dao.SearchByID(id);

        return liste;
    }

    public void supprimerById(int id) throws ClassNotFoundException, SQLException {
        EtudiantDAO dao = new EtudiantDAO();
        dao.DeleteProfil(id);

    }

    public void updateByID(EtudiantBO bo) throws ClassNotFoundException, SQLException {
        EtudiantDAO dao = new EtudiantDAO();
        dao.UpdateEtudiant(bo);

    }

    public void lierEtudiantCours(int idEtu, int idCours) throws ClassNotFoundException, SQLException {
        Connection con = new Connection();
        Statement stm = con.Connect();
        EtudiantDAO etuDAO = new EtudiantDAO();
        etuDAO.lierEtudiantCours(stm, idEtu, idCours);

    }
}
