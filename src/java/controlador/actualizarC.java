/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.datosC;

/**
 *
 * @author sampc
 */
public class actualizarC extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
           
            String accion = request.getParameter("accion");
            String idc = request.getParameter("id");
            
            
            datosC p = new datosC();
            ArrayList<datosC> persona = new ArrayList<>();
        
        if(accion.equals("editar"))
        {
         
            persona = p.ConsultarCR(Integer.parseInt(idc));
            request.getSession().setAttribute("persona", persona); //Asignar valores a la sesion
        
            request.getRequestDispatcher("modificarC.jsp").forward(request, response);
        } else if (accion.equals("eliminar"))
        {
            persona = p.ConsultarCR(Integer.parseInt(idc)); // Consulta los registros y los almacena en nuevo array llamado personas
            request.getSession().setAttribute("persona", persona); //Asignar valores a la sesion
            request.getRequestDispatcher("eliminarC.jsp").forward(request, response);
        }
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