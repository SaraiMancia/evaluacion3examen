

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
    <from action="deleteC.do" method="post">
        <c:forEach var="listaTotal" items="${sessionScope.persona}">
            <input type="text" name="textId_categoria" value="${listaTotal.Id_categoria}" readnly="true"> 
             <input type="text" name="textnom_categoria" value="${listaTotal.nom_categoria}"> 
             <input type="text" name="textestado_categoria" value="${listaTotal.estado_categoria}"> 
        </c:forEach>
    </from>
    </body>
</html>
