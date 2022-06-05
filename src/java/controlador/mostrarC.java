
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.datosC;


@WebServlet(name = "mostrarC", urlPatterns = {"/mostrarC.do"})
public class mostrarC extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    datosC p = new datosC(); // Conectar a la BD
        ArrayList<datosC> personas = new ArrayList<>();
        personas = p.ConsultarR(); // Consulta los registros y los almacena en nuevo array llamado personas
        request.getSession().setAttribute("personas", personas); //Asignar valores a la sesion
        request.getRequestDispatcher("ver_categoria.jsp").forward(request, response);
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
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
