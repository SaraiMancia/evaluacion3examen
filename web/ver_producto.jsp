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
         <h1>PRODUCTO</h1>
  
             <table class="table" Style="width: 40%">
                <thead>
                    <tr>
                        <th scope="col"> ID del producto </th>
                        <th scope="col"> Nombre del producto </th>
                        <th scope="col"> Descripcion del producto </th>
                        <th scope="col"> Stock </th>
                        <th scope="col"> Precio</th>
                        <th scope="col"> Unidad de medida </th>
                        <th scope="col"> Estado del producto </th>
                        <th scope="col"> Fecha de entrada </th>
                    </tr>
                </thead>
                <tbody>
    <c:forEach var="listacomp" items="${sessionScope.DAT}">
                    <tr>
                        <td>${listacomp.idP}</td>
                        <td>${listacomp.nomP}</td>
                        <td> ${listacomp.estP}</td
                         <td>${listacomp.desP}</td>
                        <td>${listacomp.stockP}</td>
                        <td> ${listacomp.precioP}</td>
                         <td>${listacomp.unidadP}</td>
                        <td>${listacomp.estP}</td>
                        <td> ${listacomp.fechaP}</td>
                        <td><a  href="Actualizar.do?accion=editar&&dui=${listacomp.idP}" role="button">Editar</a></td>
                        <td><a  href="Actualizar.do?accion=eliminar&&dui=${listacomp.idP}" role="button">Eliminar</a></td>
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
