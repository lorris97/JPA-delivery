/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensup.DAO;

import eu.ensup.BO.CoursBO;
import eu.ensup.BO.EtudiantBO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lorris
 */
public class CoursDAO {
    
    
    public ArrayList<CoursBO> getList(Statement stm) throws ClassNotFoundException, SQLException {

        ArrayList<CoursBO> ArrayListProfil = new ArrayList<CoursBO>();

        try {

            ResultSet res = stm.executeQuery("SELECT * FROM cours");

            while (res.next()) {
                CoursBO bo = new CoursBO();
                bo.setId(res.getInt("id"));
                bo.setHeures(res.getString("heures"));
                bo.setTheme(res.getString("theme"));

                ArrayListProfil.add(bo);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return ArrayListProfil;
    }

    
}
