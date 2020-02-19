package en.ensup.SERVLET;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import eu.ensup.BO.EtudiantBO;
import eu.ensup.SERVICE.AuthentificationSERVICE;
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
@WebServlet("/Connection")
public class ConnectionSERVLET extends HttpServlet {
    public static final String VUE = "/index.jsp";
    public static final String VUE2 = "/Menu.jsp";
	
    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
        /* Affichage de la page d'inscription */
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
       
    }
    

public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
    
        String nom = request.getParameter("nom");
        String password = request.getParameter("password");
        AuthentificationSERVICE service = new AuthentificationSERVICE();
//        System.out.println("******************************************");
//        System.out.println(request.getMethod());
//        System.out.println(request.getAuthType());
//        System.out.println(request.getPathInfo());
//        System.out.println(request.getClass());
//        System.out.println(request.getLocalName());
//        System.out.println(request.getLocalPort());
//        System.out.println(request.getUserPrincipal());
//        System.out.println("******************************************");
        
        boolean co = false;
        try {
            co = service.connection(nom, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionSERVLET.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionSERVLET.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(co == false)
        {
              this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
        }
        if(co == true)
        {
              this.getServletContext().getRequestDispatcher( VUE2 ).forward( request, response );
        }
         
    }
}