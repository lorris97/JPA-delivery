<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Modification</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" >

    </head>
    <body>

      
            <table class="table table-striped table-dark">
                <thead>
                    <tr>
                        <th>Inscription Etudiant</th>
                        <th></th>
                        <th></th>

                    </tr>
                </thead>
                <tbody>
                      <form method="post" action="update">
                     <c:forEach items="${liste}" var="etudiant">
                    <tr>
                        <td>Nom </td>
                        <td><input type="text" id="nom" name="nom" value="${etudiant.nom}" /></td>
                    </tr>
                    <tr>
                        <td>Prénom</td>
                        <td>
                            <input type="text" id="prenom" name="prenom" value="${etudiant.prenom}"/>
                        </td>
                    </tr>


                    <tr>
                        <td>Adresse email</td>
                        <td>
                            <input type="text" id="email" name="email" value="${etudiant.email}"/>

                        </td>
                    </tr>


                    <tr>
                        <td>Adresse</td>
                        <td>
                            <input type="text" id="adresse" name="adresse" value="${etudiant.adresse}"/>

                        </td>
                    </tr>

                    <tr>
                        <td>Numero de téléphone</td>
                        <td>
                            <input type="text" id="telephone" name="telephone" value="${etudiant.telephone}"/>

                        </td>
                    </tr>                

                   
                    <tr>
                        <td></td>
                        <td>    
                             <input id="id" name="id" type="hidden" value="${etudiant.id}">       
                             <input id="nom" name="nomp" type="hidden" value="${etudiant.nom}">       
                             <input id="prenom" name="prenom" type="hidden" value="${etudiant.prenom}">       
                             <input id="email" name="email" type="hidden" value="${etudiant.email}">       
                             <input id="adresse" name="adresse" type="hidden" value="${etudiant.adresse}">       
                             <input id="telephone" name="telephone" type="hidden" value="${etudiant.adresse}">     
                            <input class="btn btn-light" type="submit" value="Valider" class="sansLabel" />
                        </td>
                    </tr>
                    
                        </c:forEach>
                    </form>
                    <tr>
                        <td></td>
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