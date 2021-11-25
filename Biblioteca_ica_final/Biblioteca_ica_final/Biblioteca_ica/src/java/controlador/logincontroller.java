package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Usuario;
import modelo.UsuarioDAO;

@WebServlet(name = "logincontroller", urlPatterns = {"/logincontroller"})
public class logincontroller extends HttpServlet {
    UsuarioDAO usuarioDAO = new UsuarioDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
        PrintWriter out = response.getWriter();
        Usuario usu = new Usuario();
        usu.setUsulogin(request.getParameter("usuario"));
        usu.setUsucontrasena(request.getParameter("contrasena"));
        usu = usuarioDAO.identificar(request.getParameter("usuario"), request.getParameter("contrasena"));
        
        if (usu!= null) {
            this.printMessage("Acceso permitido", true, response);
            request.getSession().setAttribute("usuario", usu);        
            RequestDispatcher dispatcher= request.getRequestDispatcher("/biblioteca/inicio.jsp");
            dispatcher.forward(request, response);            
        } else {          
            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
            out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
            out.println("<script src='https://unpkg.com/sweetalert/dist/sweetalert.min.js'></script>");
            out.println("<script language=JavaScript>");
            out.println("$(document).ready(function(){");
            out.println("swal('Error','Usuario y/o contraseña incorrectas','success');");
            out.println("});");
            out.println("</script>");
            request.getRequestDispatcher("/biblioteca/index.jsp").include(request, response);  
        }
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

    private void printMessage(String msj, boolean rpt, HttpServletResponse response) throws IOException {
        response.getWriter().print("{\"rpt\": " + rpt + ", \"msj\": \"" + msj + "\"}");
    }    
}
