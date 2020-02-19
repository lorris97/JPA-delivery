/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.ensup.SERVLET;

import eu.ensup.BO.CoursBO;
import eu.ensup.SERVICE.CoursSERVICE;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
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
@WebServlet(name = "ListerCourSERVLET", urlPatterns = {"/ListerCourSERVLET"})
public class ListerCourSERVLET extends HttpServlet {
 public static final String VUE = "/ListeCours.jsp";

    
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        CoursSERVICE service = new CoursSERVICE();
           ArrayList<CoursBO> liste = new ArrayList<CoursBO>();
        try {
             liste = service.liste();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListerCourSERVLET.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ListerCourSERVLET.class.getName()).log(Level.SEVERE, null, ex);
        }

        request.setAttribute("liste", liste);
         this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
}
}
