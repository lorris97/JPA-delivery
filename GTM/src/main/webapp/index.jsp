<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" >

        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Connexion</title>
    </head>

    <body>


        <form method="post" action="connection">

            <table class="table table-striped table-dark">
                <thead>
                    <tr>
                        <th>
                            Connection
                        </th>
                        <th></th>

                    </tr>
                </thead>


                <tbody>


                    <tr>
                        <td><label for="nom"> Nom <span class="requis">*</span></label></td>
                        <td><input  class="fadeIn second" type="text" id="nom" name="nom" /></td>

                    </tr>

                    <tr>
                <td> mot de passe <span class="requis">*</td>
                <td><input class="fadeIn third" type="text" id="password" name="password" /></td>

                </tr>
                <tr>
                    <td>
                    </td>
                    <td>
                        <input class="btn btn-light" class="fadeIn fourth" type="submit" value="Connection" />
                    </td>
                </tr>


                </tbody>
            </table>
        </form>


    </body>
</html>
