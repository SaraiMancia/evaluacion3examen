
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.datosP;


public class productoR extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
          int IDP = Integer.parseInt(request.getParameter("txtID"));
        String nom=request.getParameter("nombre");
        String des=request.getParameter("desp");
         double stk= Integer.parseInt(request.getParameter("stockp"));
             double prc= Integer.parseInt(request.getParameter("preciop"));
             String udm=request.getParameter("unidadp");
              int ep = Integer.parseInt(request.getParameter("estadop"));
               int c= Integer.parseInt(request.getParameter("categoriap"));
               String fe = request.getParameter("fechap");
       
       
        datosP person= new datosP();
        person.setIdP(IDP);
        person.setNomP(nom);
        person.setDesP(des);
         person.setStockP(stk);
        person.setPrecioP(prc);
        person.setUnidadP(udm);
         person.setEstP(ep);
        person.setCatP(c);
        person.setFechaP(fe);
        
        if(person.insertarD()==true){
            request.getRequestDispatcher("exito.jsp").forward(request, response);
        }else{
          request.getRequestDispatcher("noexito.jsp").forward(request, response);   
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
