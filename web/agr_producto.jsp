
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
    <center>
      <p> Ingrese los datos del producto </p> 
      
           <div class="card text-center" style="width: 18rem;">
  <div class="card-body">
  <h5 class="card-title"></h5>
    <p class="card-text"> <h2> Aqui se piden los datos </h2>    
       <p>  Por favor introduce la información:</p> 
      <form action="ver_producto.jsp" method="post">    
         
                  
                  <td align="right"> id_producto: </td>      
                  <td><input type="text" name="txtID"></td>      
                    
                  <td align="right"> Nombre: </td>      
                  <td><input type="text" name="nombre"></td>      
            
                  <td align="right"> des_producto: </td>     
                  <td> <input type="text" name="desp"> </td><br><br>    
              
                  <td align="right"> stock: </td>
                  <td> <input type="text" name="stockp"> </td><br><br>     
             
                  <td align="right"> precio: </td>      
                  <td><input type="text" name="preciop"></td><br><br>     
                
                  <td align="right"> unidad de medida: </td>      
                  <td><input type="text" name="unidadp"></td><br>      
               
                  <td align="right"> estado del producto: </td>      
                  <td><input type="text" name="estadop"></td>      
               
                  <td align="right"> categoria: </td>      
                  <td><input type="text" name="categoriap"></td><br>     
                 
                  <td align="right"> fecha de entrada: </td>      
                  <td><input type="text" name="fechap"></td><br><br>   
                 
     
          <input type="reset" value="Borrar">    
          <input type="submit" value="Enviar">   
      </form> 
       </center>
    </body>
</html>
