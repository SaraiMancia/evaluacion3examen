

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <h1>Modificar Datos</h1>
        <<form action="updateC.do">
            
            <c:forEach var="listaTotal" items="${sessionScope.persona}">
                
                id_categoria<input type="text" name="txtid_categoria" value="${listaTotal.id_categoria}" readonly="true">
                nom_categoria<input type="text" name="txtid_categoria" value="${listaTotal.nom_categoria}" readonly="true">
                estado_categoria<input type="text" name="txtid_categoria" value="${listaTotal.estado_categoria}" readonly="true">
                
                
            </c:forEach>
                <a href="index.jsp">volver</a>
                <input type="submit" value="Modificar">
        </form>
    </body>
</html>
