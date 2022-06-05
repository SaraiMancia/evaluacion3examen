
package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;

public class datosP {
    
       int idP;
    String nomP;
    String desP;
    double stockP;
    double precioP;
    String unidadP;
    int estP;
    int catP;
    String fechaP;

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getNomP() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    public String getDesP() {
        return desP;
    }

    public void setDesP(String desP) {
        this.desP = desP;
    }

    public double getStockP() {
        return stockP;
    }

    public void setStockP(double stockP) {
        this.stockP = stockP;
    }

    public double getPrecioP() {
        return precioP;
    }

    public void setPrecioP(double precioP) {
        this.precioP = precioP;
    }

    public String getUnidadP() {
        return unidadP;
    }

    public void setUnidadP(String unidadP) {
        this.unidadP = unidadP;
    }

    public int getEstP() {
        return estP;
    }

    public void setEstP(int estP) {
        this.estP = estP;
    }

    public int getCatP() {
        return catP;
    }

    public void setCatP(int catP) {
        this.catP = catP;
    }

    public String getFechaP() {
        return fechaP;
    }

    public void setFechaP(String fechaP) {
        this.fechaP = fechaP;
    }
 Connection cnn; 
    Statement state;
    ResultSet result;

       public datosP(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_inventario?zeroDateTimeBehavior=convertToNull","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(datosP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(datosP.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    
    public datosP(int idP, String nomP, String desP,Double stockP,Double precioP,String unidadP,int estP, int catP, String fechaP) {
        this.idP = idP;
        this.nomP = nomP;
        this.desP = desP;
        this.stockP = stockP;
        this.precioP = precioP;
        this.unidadP = unidadP;
        this.estP = estP;
        this.catP = catP;
        this.fechaP = fechaP;
    }
    


    
         public boolean insertarD(){
            try{
                String miQuery="insert into tb_producto values('" + idP + "','" + nomP + "','" + desP + "','" + stockP + "','" + precioP + "','" + unidadP + "','" + estP + "','" + catP + "','" + fechaP + "');";
                int estado=0;
                state=cnn.createStatement();
                estado=state.executeUpdate(miQuery);
                if (estado==1){
                    return true;
                }
            } catch (SQLException ex){
                        Logger.getLogger(datosP.class.getName()).log(Level.SEVERE, null, ex);
                        }
                return false;
            }

           public boolean ActualizarD(datosP person) {
        try{
                String miQuery="Update tb_producto set nom_producto = '" + person.getNomP() + "', des_producto = '" + person.getDesP()  + "', stock = '" + person.getStockP() + "', precio = '" + person.getPrecioP()  + "', unidad_de_medida = '"
                        + person.getUnidadP() + "',estado_producto = '" + person.getEstP() + "',categoria = '" + person.getCatP()  + "',fecha_entrada = '" + person.getFechaP() + "' where id_producto = '" + person.getIdP() + "';";
                int es=0;
                state=cnn.createStatement();
                es=state.executeUpdate(miQuery);
                if (es==1){
                    return true;
                }
            } catch (SQLException ex){
                        Logger.getLogger(datosP.class.getName()).log(Level.SEVERE, null, ex);
                        }
                return false;
            }
              public ArrayList<datosP> ConsultarP(){
        ArrayList<datosP> pers = new ArrayList(); // Crear el arrat de almacenamiento de tipo persona
        try{
            String miQuery = "SELECT * FROM tb_producto;";
            state = cnn.createStatement();
            result = state.executeQuery(miQuery);
            while(result.next()){
                pers.add(new datosP(result.getInt("id_producto"), result.getString("nom_producto"), result.getString("des_producto"), result.getDouble("stock"), result.getDouble("precio"), result.getString("unidad_de_medida"), result.getInt("estado_producto"), result.getInt("categoria"), result.getString("fecha_entrada")));
            }
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(datosP.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pers;
    }
    
     public ArrayList ConsultarR(int dui){
        ArrayList<datosP> person = new ArrayList(); // Crear el arrat de almacenamiento de tipo persona
        try{
            String miQuery = "SELECT * FROM tb_producto where id_producto = " + dui;
            state = cnn.createStatement();
            result = state.executeQuery(miQuery);
            while(result.next()){
                person.add(new datosP(result.getInt("id_producto"), result.getString("nom_producto"), result.getString("des_producto"), result.getDouble("stock"), result.getDouble("precio"), result.getString("unidad_de_medida"), result.getInt("estado_producto"), result.getInt("categoria"), result.getString("fecha_entrada")));
            }
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(datosP.class.getName()).log(Level.SEVERE, null, ex);
        }
        return person;
    }
  
    
         
         public boolean eliminarP(int idP){
        try {
            String miQuery = "DELETE FROM  tb_producto WHERE id_producto= '" + idP +  "');";
            int  estado = 0;
            state = cnn.createStatement();
            estado = state.executeUpdate(miQuery);
            if(estado == 1){
                return true;
            }
        }catch (SQLException ex) {
            Logger.getLogger(datosP.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    }
    

