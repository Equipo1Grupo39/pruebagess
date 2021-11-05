package controlador;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Libros;
import modelo.LibrosDAO;

@WebServlet(name = "libroscontroller", urlPatterns = {"/libroscontroller"})
public class libroscontroller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        LibrosDAO librosdao = null;
        try {
            librosdao = new LibrosDAO();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(libroscontroller.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        String accion;
        RequestDispatcher dispatcher = null;

        accion = request.getParameter("accion");
        if (accion == null || accion.isEmpty()) {
            dispatcher = request.getRequestDispatcher("biblioteca/Libros.jsp");
            List<Libros> listalibros = librosdao.listarlibros();
            request.setAttribute("lista", listalibros);

        }
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
