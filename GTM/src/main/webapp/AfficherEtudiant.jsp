<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" >
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Liste �tudiants</title>
    </head>
    <body>





       
            <table class="table table-striped table-dark">
                <thead>
                    <tr>
                        <th>
                            PROFIL
                        </th>
                        <th>
                            Nom
                        </th>
                        <th>
                            Prenom
                        </th>
                        <th>
                            Email
                        </th>
                        <th>
                            Adresse
                        </th>
                        <th>
                            T�l�phone
                        </th>
                        <th>
                            Action
                        </th>
                        <th>
                            Action
                        </th>

                    </tr>
                </thead>


                <tbody>

                    <c:forEach items="${liste}" var="etudiant">
                        <tr>
                            <td></td>
                            <td>${etudiant.nom}</td>
                            <td>${etudiant.prenom}</td>
                            <td>${etudiant.email}</td>
                            <td>${etudiant.adresse}</td>
                            <td>${etudiant.telephone}</td>
                             
                            <form method="post" action="modifier">
                            <td> 
                                 <input id="id" name="id" type="hidden" value="${etudiant.id}">       
                                <input type="submit" value="Modifier" class="btn btn-light" />
                            </td>
                             </form>
                             <form method="post" action="supprimer">
                            <td> 
                                <input id="id" name="id" type="hidden" value="${etudiant.id}">       
                                <input class="btn btn-light" type="submit" value="Supprimer" class="sansLabel" />
                            </td>
                             </form>
                            <form method="post" action="suppression">
                            <td> 
                                <input id="id" name="id" type="hidden" value="${etudiant.id}">       
                                <input type="submit" class="btn btn-light" value="Lier a un cours"/>
                            </td>
                             </form>
                            


                        </tr>
                    </c:forEach>
                        <tr>
                            <td>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                
                            </td>
                            <td>
                                
                            </td>
                            <td>
                                
                            </td>
                            <td>
                                
                            </td>
                            <td>
                                
                            </td>
                            <td>
                                
                            </td>
                            <td>
                                
                            </td>
                            <td>
                                
                            </td>
                            <td>
                                <form method="post" action="menu">
                           
                                    
                                <input type="submit" class="btn btn-light" value="Retour accueil"/>
                            
                             </form>
                                
                            </td>
                        </tr>
                </tbody>
            </table>
       





    </body>
</html>