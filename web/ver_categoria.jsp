<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <!-- Popper JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <h1>Vista de la tabla </h1>
        
        
             <table class="table" Style="width: 40%">
                <thead>
                    <tr>
                        <th scope="col"> ID categoria </th>
                        <th scope="col"> Nombre de categoria </th>
                        <th scope="col"> Estado de categoria </th>
                    </tr>
                </thead>
                <tbody>
    <c:forEach var="listacom" items="${sessionScope.persona}">
                    <tr>
                        <td>${listacom.id}</td>
                        <td>${listacom.nom}</td>
                        <td> ${listacom.est}</td>
                        <td><a  href="actualizarC.do?accion=editar&&id=${listacom.id}" role="button">Editar</a></td>
                        <td><a  href="actualizarC.do?accion=eliminar&&id=${listacom.id}" role="button">Eliminar</a></td>
                    </tr>
                   
    </c:forEach>
                    <tr>
                        <td colspan="3" align="center">
                            <a class="btn btn-primary" href="index.jsp" role="button">Regresar</a>
                            
                        </td>
                    </tr>
                     </tbody>
            </table>
        </center>
        
    </body>
</html>
