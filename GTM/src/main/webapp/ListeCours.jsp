<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table class="table table-striped table-dark">
            <thead>     
                <tr>
                    <th>Matiere </th>
                    <th>Nombre d'heures</th>
                </tr>
            </thead>

            <c:forEach items="${liste}" var="cours">



                <tbody>
                    <tr>
                        <td> ${cours.theme}</td>
                        <td>${cours.heures}</td>
                        <td>
                            <input type="checkbox" id="cour${cours.id}" name="scales" checked>
                        </td>

                    </tr>
                </tbody>
            </c:forEach>
            <tr>

            </tr>
            <tr>

                <td></td>
                <td></td>
                <td>
                    <form method="post" action="lier" name="lierForm">


                        <input class="btn btn-light" value="Valider" onclick="check()"/>

                    </form>
                </td>
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
<script>
    function check() {
        
    document.getElementById("cour1").checked = true;
    document.getElementById("lierForm").submit();
}
    
</script>