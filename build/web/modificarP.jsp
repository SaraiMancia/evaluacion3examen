<%-- 
    Document   : modificarP
    Created on : 06-01-2022, 06:48:28 PM
    Author     : sampc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
           <h1>Modificar Datos</h1>
        <<form action="updateP.do">
            
            <c:forEach var="listaTotal" items="${sessionScope.persona}">
                
                id_producto<input type="text" name="txtid_categoria" value="${listaTotal.id_producto}" readonly="true">
                des_producto<input type="text" name="txtid_categoria" value="${listaTotal.des_producto}" readonly="true">
                stock<input type="text" name="txtid_categoria" value="${listaTotal.stock}" readonly="true">
                 precio<input type="text" name="txtid_categoria" value="${listaTotal.precio}" readonly="true">
                 unidad_de_medida<input type="text" name="txtid_categoria" value="${listaTotal.unidad_de_medida}" readonly="true">
                 categoria<input type="text" name="txtid_categoria" value="${listaTotal.categoria}" readonly="true">
                 fecha_entrada<input type="text" name="txtid_categoria" value="${listaTotal.fecha_entrada}" readonly="true">
                 estado_producto<input type="text" name="txtid_categoria" value="${listaTotal.estado_producto}" readonly="true">
                
                
            </c:forEach>
                <a href="index.jsp">volver</a>
                <input type="submit" value="Modificar">
        </form>
    </body>
</html>
