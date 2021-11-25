package controlador;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Autor;
import modelo.AutorDAO;

@WebServlet(name = "Autorcontroller", urlPatterns = {"/autorcontroller"})
public class Autorcontroller extends HttpServlet {
    private static final long serialVersionUID = 1L;
    AutorDAO autorDAO = new AutorDAO();
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        
        System.out.println("Hola Servlet..");
        String action = request.getParameter("action");
        System.out.println(action);  
                
        if (action == null) {
            action = "mostrar";
        }

        try {
            switch (action) {
		case "index":
			index(request, response);
			break;
		case "nuevo":
			nuevo(request, response);
			break;
		case "register":
			System.out.println("entro");
			insertar(request, response);
			break;
		case "mostrar":
			mostrar(request, response);
			break;
		case "showedit":
			showEditar(request, response);
			break;	
		case "editar":
			editar(request, response);
			break;
		case "eliminar":
			eliminar(request, response);
			break;
		default:
			break;
		}			
	} catch (SQLException e) {
            e.getStackTrace();
	}        
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

    
    private void index (HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
	mostrar(request, response);
	RequestDispatcher dispatcher= request.getRequestDispatcher("/biblioteca/listarAutores.jsp");
	dispatcher.forward(request, response);
    }    
    
    private void insertar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
            String nombre = request.getParameter("nombre");
            autorDAO.insertar(request.getParameter("nombre"), request.getParameter("nacionalidad"));
            mostrar(request, response);
    }    
    
    private void nuevo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/biblioteca/crearAutor.jsp");
            dispatcher.forward(request, response);
    } 
    
    private void mostrar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException , ServletException{
            RequestDispatcher dispatcher = request.getRequestDispatcher("/biblioteca/listarAutores.jsp");
            List<Autor> listaAutor= autorDAO.listar();
            request.setAttribute("lista", listaAutor);
            dispatcher.forward(request, response);
    } 
    
    private void showEditar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
            String codigo = request.getParameter("codigo");
            Autor autor = autorDAO.buscar(Integer.parseInt(request.getParameter("codigo")));
            request.setAttribute("autor", autor);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/biblioteca/editarAutor.jsp");
            dispatcher.forward(request, response);
    }    
    
    private void editar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
            String codigo = request.getParameter("codigo");
            String nombre = request.getParameter("nombre");
            Autor autor = new Autor(Integer.parseInt(request.getParameter("codigo")), request.getParameter("nombre"), request.getParameter("nacionalidad"));
            autorDAO.modificar(autor);
            mostrar(request, response);
    }    
        
    private void eliminar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
            autorDAO.eliminar(request.getParameter("codigo"));
            mostrar(request, response);
    }
}
