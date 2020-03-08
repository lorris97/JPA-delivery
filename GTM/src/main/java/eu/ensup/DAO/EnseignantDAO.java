/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensup.DAO;

import eu.ensup.BO.EnseignantBO;
import eu.ensup.BO.EtudiantBO;
import static java.lang.Math.E;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author lorris
 */
public class EnseignantDAO {
    
    
     public int Connection(String nom , String password) throws ClassNotFoundException, SQLException {
	
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
        EntityManager em = emf.createEntityManager();

        List<EtudiantBO> ListProfil;
        ListProfil = em.createNativeQuery("SELECT * FROM `enseignant` WHERE nom = ? and password = ?", EnseignantBO.class)
                .setParameter(1, nom)
                .setParameter(2, password)
                .getResultList();

        em.close();
        emf.close();

        
        return ListProfil.size();
     
	}

    
}
