
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
     
       
       <div class="card text-center" style="width: 18rem;">
  <div class="card-body">
  <h5 class="card-title"></h5>
    <p class="card-text"> <h2> Aqui se piden los datos </h2>    
       <p>  Por favor introduce la información:</p> 
        <form action="mostrarC.do" method="post">       
           
              
                   <td align="right">   Id_categoria: </td>              
                   <td><input type="text" name="txtI"></td> <br><br>          
                           
                   <td align="right"> nom_categoria: </td>                  
                   <td> <input type="text" name="txtcat"> </td>  <br><br>         
                      <td align="right"> estado_categoria: </td>                  
                      <td> <input type="text" name="txte"> </td> <br><br>          
                      
         
           <input type="reset" value="Borrar" class="btn btn-primary">     
           <input type="submit" value="Agregar">    
       </form>  
 
  </div>
</div>
        
       </center>
    </body>
</html>
