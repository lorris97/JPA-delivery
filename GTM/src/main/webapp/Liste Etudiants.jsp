<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Liste étudiants</title>
    </head>
    <body>


        <table class="table table-striped table-dark">
            <thead>     
                <tr>
                    <th>Nom </th>
                    <th>Prenom</th>
                    <th>Email</th>
                    <th></th>
                    <th></th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>

            <c:forEach items="${liste}" var="etudiant">



                <tbody>
                    <tr>
                        <td> ${etudiant.nom}</td>
                <td>${etudiant.prenom}</td>
                <td> ${etudiant.email}</td>   
<!--                <td>Adresse : ${etudiant.adresse}</td><br>
                <td> Téléphone :${etudiant.telephone}</td><br>-->
                <td>
                    <form method="post" action="afficher">
                        <input id="id" name="id" type="hidden" value="${etudiant.id}">        
                        <input class="btn btn-light" type="submit" value="Afficher" class="sansLabel" />
                    </form>
                </td>
                <form method="post" action="modifier">
                    <input id="id" name="id" type="hidden" value="${etudiant.id}">
                <td><input class="btn btn-light" type="submit" value="Modifier" class="sansLabel" /></td>
                </form>
                
                <form method="post" action="ListerCourSERVLET">
                <td><input class="btn btn-light" type="submit" value="Lier a un cours" class="sansLabel" /></td>
                </form>
                <td>
                    <form method="post" action="supprimer">
                        <input id="id" name="id" type="hidden" value="${etudiant.id}">       
                        <input class="btn btn-light" type="submit" value="Supprimer" class="sansLabel" />
                    </form>
                </td>
            </tr>
        </tbody>
    </c:forEach>
        <tr>
           
        </tr>
        <tr>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td>
            <form method="post" action="menu">
                           
                                    
                                <input type="submit" class="btn btn-light" value="Retour accueil"/>
                            
                             </form>
            <td>
        </tr>
</table>


</body>
</html>