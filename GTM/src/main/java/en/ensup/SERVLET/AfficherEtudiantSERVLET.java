/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.ensup.SERVLET;

import static en.ensup.SERVLET.InscriptionSERVLET.VUE;
import eu.ensup.BO.EtudiantBO;
import eu.ensup.SERVICE.EtudiantSERVICE;
import eu.ensup.SERVICE.InscriptionSERVICE;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lorris
 */
@WebServlet("/Afficher")
public class AfficherEtudiantSERVLET extends HttpServlet {
     public static final String VUE = "/AfficherEtudiant.jsp";


    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
 
        
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
    

public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
    
    EtudiantBO bo = new EtudiantBO();
     bo.setId( Integer.parseInt(request.getParameter("id")));
     int id = bo.getId();
     EtudiantSERVICE service = new EtudiantSERVICE();
     List<EtudiantBO> liste = null ;
        try {
            liste = service.getOneById(id);
            
            //this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InscriptionSERVLET.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InscriptionSERVLET.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.setAttribute("liste", liste );
        
           this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
}
