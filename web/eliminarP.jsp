<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : eliminarP
    Created on : 06-01-2022, 11:55:31 PM
    Author     : sampc
--%>

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
           <h1>Eliminar Datos</h1>
    <from action="deleteP.do" method="post">
        <c:forEach var="LT" items="${sessionScope.datosP}">
            <input type="text" name="txtid_producto" values="${LT.id_producto}" readonly="true">
             <input type="text" name="txtnom_producto" values="${LT.nom_producto}">
             <input type="text" name="txtdes_producto" values="${LT.des_producto}">
             <input type="text" name="txtstock" values="${LT.stock}">
             <input type="text" name="txtprecio" values="${LT.precio}">
             <input type="text" name="txtunidad_de_medida" values="${LT.unidad_de_medida}">
             <input type="text" name="txtestado_producto" values="${LT.estado_producto}">
             <input type="text" name="txtcategoria" values="${LT.categoria}">
             <input type="text" name="txtfecha_entrada" values="${LT.fecha_entrada}">
           </c:forEach>
    </from>
    </body>
</html>
