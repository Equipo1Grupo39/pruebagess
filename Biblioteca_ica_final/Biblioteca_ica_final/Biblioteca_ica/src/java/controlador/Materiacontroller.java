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

import modelo.Materia;
import modelo.MateriaDAO;

@WebServlet(name = "Materiacontroller", urlPatterns = {"/materiacontroller"})
public class Materiacontroller extends HttpServlet {
    private static final long serialVersionUID = 1L;
    MateriaDAO materiaDAO = new MateriaDAO();
    
    
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
	RequestDispatcher dispatcher= request.getRequestDispatcher("/biblioteca/listarMaterias.jsp");
	dispatcher.forward(request, response);
    }    
    
    private void insertar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
            String nombre = request.getParameter("nombre");
            Materia materia = new Materia(Integer.parseInt(request.getParameter("codigo")), request.getParameter("nombre"));
            materiaDAO.insertar(materia);
            mostrar(request, response);
    }    
    
    private void nuevo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/biblioteca/crearMateria.jsp");
            dispatcher.forward(request, response);
    } 
    
    private void mostrar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException , ServletException{
            RequestDispatcher dispatcher = request.getRequestDispatcher("/biblioteca/listarMaterias.jsp");
            List<Materia> listaMateria= materiaDAO.listar();
            request.setAttribute("lista", listaMateria);
            dispatcher.forward(request, response);
    } 
    
    private void showEditar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
            String codigo = request.getParameter("codigo");
            Materia materia = materiaDAO.buscar(Integer.parseInt(request.getParameter("codigo")));
            request.setAttribute("materia", materia);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/biblioteca/editarMateria.jsp");
            dispatcher.forward(request, response);
    }    
    
    private void editar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
            String codigo = request.getParameter("codigo");
            String nombre = request.getParameter("nombre");
            Integer codigoAnt = Integer.parseInt(request.getParameter("codigoAnt"));
            Materia materia = new Materia(Integer.parseInt(request.getParameter("codigo")), request.getParameter("nombre"));
            materiaDAO.modificar(materia, codigoAnt);
            mostrar(request, response);
    }    
        
    private void eliminar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
            materiaDAO.eliminar(request.getParameter("codigo"));
            mostrar(request, response);
    }
}
