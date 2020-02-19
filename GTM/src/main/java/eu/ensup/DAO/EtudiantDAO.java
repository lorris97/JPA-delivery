/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensup.DAO;

import eu.ensup.BO.EtudiantBO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author lorris
 */
public class EtudiantDAO {

    public ArrayList<EtudiantBO> getList(Statement stm) throws ClassNotFoundException, SQLException {

        ArrayList<EtudiantBO> ArrayListProfil = new ArrayList<EtudiantBO>();

        try {

            ResultSet res = stm.executeQuery("SELECT * FROM etudiantbo");

            while (res.next()) {
                EtudiantBO bo = new EtudiantBO();
                bo.setId(res.getInt("id"));
                bo.setNom(res.getString("nom"));
                bo.setPrenom(res.getString("prenom"));
                bo.setAdresse(res.getString("adresse"));
                bo.setTelephone(res.getString("telephone"));
                bo.setEmail(res.getString("email"));
                //bo.setDt_naiss(res.getString("date_naissance"));

                ArrayListProfil.add(bo);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return ArrayListProfil;
    }

    public ArrayList<EtudiantBO> SearchByID(Statement stm, int id) throws ClassNotFoundException, SQLException {

        ArrayList<EtudiantBO> ArrayListProfil = new ArrayList<EtudiantBO>();

        try {

                ResultSet res = stm.executeQuery("SELECT * FROM `etudiant` WHERE id = '" + id + "'");
            

            while (res.next()) {

                EtudiantBO bo = new EtudiantBO();
                bo.setNom(res.getString("nom"));
                bo.setPrenom(res.getString("prenom"));
                bo.setAdresse(res.getString("adresse"));
                bo.setTelephone(res.getString("telephone"));
                bo.setEmail(res.getString("email"));
                bo.setDt_naiss(res.getString("date_naissance"));
                bo.setId(res.getInt("id"));

                ArrayListProfil.add(bo);
            }
            
            stm.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        

        return ArrayListProfil;
    }

    public void InsertNewEtudiant(Statement stm, EtudiantBO bo) throws ClassNotFoundException, SQLException {

//        try {
//
//            stm.executeUpdate("INSERT INTO `etudiant`(`nom`, `prenom`, `email`, `adresse`, `telephone`, `date_naissance`) VALUES ('" + bo.getNom() + "','" + bo.getPrenom() + "','" + bo.getEmail() + "','" + bo.getAdresse() + "','" + bo.getTelephone() + "','" + bo.getDt_naiss() + "')");
//            stm.close();
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }

        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();
		
		// 2 : Ouverture transaction 
		EntityTransaction tx =  em.getTransaction();
		tx.begin();
		
		// 3 : Instanciation Objet métier
               
		
		// 4 : Persistance Objet/Relationnel : création d'un enregistrement en base
		 em.persist(bo);
		
		// 5 : Fermeture transaction 
		 tx.commit();
		
		// 6 : Fermeture unité de travail JPA 
		em.close();
		emf.close();	
    }

    public void DeleteProfil(Statement stm, int id) throws ClassNotFoundException, SQLException {

        try {

            stm.executeUpdate("DELETE FROM `etudiant` WHERE id = " + id);
            stm.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

     public void UpdateEtudiant(Statement stm, EtudiantBO bo) throws ClassNotFoundException, SQLException {

        try {
            String request ="UPDATE `etudiant` SET `nom`='"+ bo.getNom()+"',`prenom`='"+ bo.getPrenom()+"',`email`='"+ bo.getEmail()+"',`adresse`='"+ bo.getAdresse()+"',`telephone`='"+ bo.getTelephone()+"' WHERE id = "+ bo.getId()+"";
            stm.executeUpdate(request);
            stm.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

     
      public void lierEtudiantCours(Statement stm, int idEtu, int idCours) throws ClassNotFoundException, SQLException {

        try {

            stm.executeUpdate("UPDATE `etudiant` SET `idCours`='"+ idCours +"' WHERE id = "+ idEtu +"");
            stm.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
