/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.ensup.SERVLET;

import eu.ensup.SERVICE.AuthentificationSERVICE;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lorris
 */
public class RedirectInscriptionEtudiantSERVLET extends HttpServlet{
    
    public static final String VUE = "/inscription.jsp";
	
    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
        /* Affichage de la page d'inscription */
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
    

public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
    
     
        
              this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
        
    }
}
