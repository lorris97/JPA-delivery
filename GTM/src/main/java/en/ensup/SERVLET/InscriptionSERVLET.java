package en.ensup.SERVLET;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import eu.ensup.BO.EtudiantBO;
import eu.ensup.SERVICE.InscriptionSERVICE;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author lorris
 */
@WebServlet("/Creer")
public class InscriptionSERVLET extends HttpServlet {
    public static final String VUE = "/Menu.jsp";
	
    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
 
        
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
    

public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
    
    EtudiantBO bo = new EtudiantBO();
     bo.setNom ( request.getParameter("nom"));
     bo.setPrenom(request.getParameter("prenom"));
     bo.setEmail(request.getParameter("email"));
     //bo.setDt_naiss(request.getParameter("date"));
     bo.setTelephone(request.getParameter("telephone"));
     bo.setAdresse(request.getParameter("adresse"));
     InscriptionSERVICE service = new InscriptionSERVICE();
        try {
            service.inscritpiton(bo);
            
            //this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InscriptionSERVLET.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InscriptionSERVLET.class.getName()).log(Level.SEVERE, null, ex);
        }
        
           this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
}