
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.datosC;



public class categoriaR extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          int idc = Integer.parseInt(request.getParameter("txtI"));
        String nomc=request.getParameter("txtcat");
        int esc=Integer.parseInt(request.getParameter("txte"));
        
         datosC dc= new datosC();
         dc.setId(idc);
        dc.setNom(nomc);
        dc.setEst(esc);
            
        if(dc.InsertarDatos()==true){
            request.getRequestDispatcher("exito.jsp").forward(request, response);
        }else{
          request.getRequestDispatcher("noexito.jsp").forward(request, response);   
        }
   
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
