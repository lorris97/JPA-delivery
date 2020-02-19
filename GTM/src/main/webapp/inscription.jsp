<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Inscription</title>
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
                     <form method="post" action="inscription">
                    <tr>
                        <td>Nom</td>
                        <td><input type="text" id="nom" name="nom" /></td>
                    </tr>
                    <tr>
                        <td>Prénom</td>
                        <td>
                            <input type="text" id="prenom" name="prenom" />
                        </td>
                    </tr>


                    <tr>
                        <td>Adresse email</td>
                        <td>
                            <input type="text" id="prenom" name="email" />

                        </td>
                    </tr>


                    <tr>
                        <td>Adresse</td>
                        <td>
                            <input type="text" id="adresse" name="adresse" />

                        </td>
                    </tr>

                    <tr>
                        <td>Numero de téléphone</td>
                        <td>
                            <input type="text" id="telephone" name="telephone" />

                        </td>
                    </tr>                

                    <tr>
                        <td> Date de naissance</td>
                        <td>
                            <input type="date" id="date" name="date" />

                        </td>
                    </tr> 
                    <tr>
                        <td></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>    
                            <input class="btn btn-light" type="submit" value="Inscription" class="sansLabel" />
                              </form>
                            
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td> <form method="post" action="menu">
                           
                                    
                                <input type="submit" class="btn btn-light" value="Retour accueil"/>
                            
                             </form>    </td>
                            
                    </tr>

                </tbody>
            </table>
      
    </body>
</html>