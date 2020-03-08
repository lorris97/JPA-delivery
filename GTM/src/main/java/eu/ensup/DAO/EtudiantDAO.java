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
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author lorris
 */
public class EtudiantDAO {

    public List<EtudiantBO> getList() throws ClassNotFoundException, SQLException {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
        EntityManager em = emf.createEntityManager();

        List<EtudiantBO> ListProfil;
        ListProfil = em.createNativeQuery("SELECT * FROM etudiant,cours where etudiant.idCours = cours.id", EtudiantBO.class).getResultList();

        em.close();
        emf.close();
        return ListProfil;

    }

    public List<EtudiantBO> SearchByID(int id) throws ClassNotFoundException, SQLException {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
        EntityManager em = emf.createEntityManager();

        List<EtudiantBO> ListProfil;
        ListProfil = em.createNativeQuery("SELECT * FROM `etudiant` WHERE id = ?", EtudiantBO.class)
                .setParameter(1, id)
                .getResultList();

        em.close();
        emf.close();

        return ListProfil;
    }

    public void InsertNewEtudiant(EtudiantBO bo) throws ClassNotFoundException, SQLException {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(bo);
        tx.commit();
        em.close();
        emf.close();
    }

    public void DeleteProfil(int id) throws ClassNotFoundException, SQLException {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        List<EtudiantBO> liste = this.SearchByID(id);
       EtudiantBO bo = em.merge(liste.get(0));
        em.remove(bo);
        tx.commit();
        em.close();
        emf.close();

    }

    public void UpdateEtudiant(EtudiantBO bo) throws ClassNotFoundException, SQLException {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(bo);
        tx.commit();
        em.close();
        emf.close();

    }

    public void lierEtudiantCours(Statement stm, int idEtu, int idCours) throws ClassNotFoundException, SQLException {

        try {

            stm.executeUpdate("UPDATE `etudiant` SET `idCours`='" + idCours + "' WHERE id = " + idEtu + "");
            stm.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
