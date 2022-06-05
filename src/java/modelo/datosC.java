
package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class datosC {


    
      int id;
    String nom;
    int est;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEst() {
        return est;
    }

    public void setEst(int est) {
        this.est = est;
    }
    
       Connection cnn; 
    Statement state;
    ResultSet result;
    
     public datosC(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_inventario?zeroDateTimeBehavior=convertToNull","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(datosC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(datosC.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
         public datosC(int id, String nom, int est) {
        this.id = id;
        this.nom = nom;
        this.est = est;
       
    }
          public boolean InsertarDatos(){
            try{
                String miQuery="insert into tb_categoria values('" + id + "','" + nom + "','" + est + "');";
                int es=0;
                state=cnn.createStatement();
                es=state.executeUpdate(miQuery);
                if (es==1){
                    return true;
                }
            } catch (SQLException ex){
                        Logger.getLogger(datosC.class.getName()).log(Level.SEVERE, null, ex);
                        }
                return false;
            }
            
      public boolean ActualizarD(datosC person) {
        try{
                String miQuery="Update tb_categoria set nom_categoria = '" + person.getNom() + "', estado_categoria = '" + person.getEst() + "' where id_categoria = '" + person.getId() + "';";
                int es=0;
                state=cnn.createStatement();
                es=state.executeUpdate(miQuery);
                if (es==1){
                    return true;
                }
            } catch (SQLException ex){
                        Logger.getLogger(datosC.class.getName()).log(Level.SEVERE, null, ex);
                        }
                return false;
            }
  

   public ArrayList<datosC> ConsultarR(){
    ArrayList<datosC> person = new ArrayList(); // Crear el arrat de almacenamiento de tipo persona
    try{
        String miQuery = "SELECT * FROM tb_categoria;";
        state = cnn.createStatement();
        result = state.executeQuery(miQuery);
        while(result.next()){
            person.add(new datosC(result.getInt("id_categoria"), result.getString("nom_categoria"), result.getInt("estado_categoria")));
            }
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(datosC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return person;
    }
    
     public ArrayList ConsultarCR(int id){
        ArrayList<datosC> person = new ArrayList(); // Crear el arrat de almacenamiento de tipo persona
        try{
            String miQuery = "SELECT * FROM tb_categoria where id_categoria = " + id;
            state = cnn.createStatement();
            result = state.executeQuery(miQuery);
            while(result.next()){
                person.add(new datosC(result.getInt("id_categoria"), result.getString("nom_categoria"), result.getInt("estado_categoria")));
            }
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(datosC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return person;
    }
    
  public boolean eliminar(int id){
        try{
            String miQuery = "Delete From tb_categoria where id_categoria = '" + id + "';";
            int estado = 0; //Estado de la inserción
            state = cnn.createStatement();
            estado = state.executeUpdate(miQuery);
            if(estado == 1){
                return true;
            }
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(datosC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}

