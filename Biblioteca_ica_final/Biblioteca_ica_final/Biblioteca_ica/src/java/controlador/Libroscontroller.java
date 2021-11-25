
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

import modelo.Idioma;
import modelo.IdiomaDAO;

import modelo.Libros;
import modelo.Autor;
import modelo.Materia;
import modelo.Editorial;
import modelo.Idioma;
import modelo.Signaturatopografica;
import modelo.Inventario;

import modelo.LibrosDAO;
import modelo.AutorDAO;
import modelo.MateriaDAO;
import modelo.EditorialDAO;
import modelo.IdiomaDAO;
import modelo.InventarioDAO;
import modelo.SignaturatopograficaDAO;
import modelo.Tbiblioteca;
import modelo.TbibliotecaDAO;


@WebServlet(name = "Libroscontroller", urlPatterns = {"/libroscontroller"})
public class Libroscontroller extends HttpServlet {
    private static final long serialVersionUID = 1L;
    LibrosDAO librosDAO = new LibrosDAO();
    AutorDAO autorDAO = new AutorDAO();
    MateriaDAO materiaDAO = new MateriaDAO();
    EditorialDAO editorialDAO = new EditorialDAO();
    IdiomaDAO idiomaDAO = new IdiomaDAO();
    SignaturatopograficaDAO signaturatopograficaDAO = new SignaturatopograficaDAO();
    TbibliotecaDAO tbibliotecaDAO = new TbibliotecaDAO();
    InventarioDAO inventarioDAO = new InventarioDAO();
    
    
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
	RequestDispatcher dispatcher= request.getRequestDispatcher("/biblioteca/Libros.jsp");
	dispatcher.forward(request, response);
    }    
    
    private void insertar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
            Libros libro = new Libros(request.getParameter("codigo"), request.getParameter("titulo"), 
                    Integer.parseInt(request.getParameter("paginas")), Integer.parseInt(request.getParameter("autor")), 
                    Integer.parseInt(request.getParameter("materia")), Integer.parseInt(request.getParameter("editorial")),
                    Integer.parseInt(request.getParameter("idioma")), request.getParameter("signatura"));
            librosDAO.insertar(libro);
            Signaturatopografica signatura = new Signaturatopografica(request.getParameter("signatura"), Integer.parseInt(request.getParameter("biblioteca")), request.getParameter("codigo"));
            signaturatopograficaDAO.insertarSignaturaLibro(signatura);
            Inventario inventario = new Inventario(0,request.getParameter("codigo"),"",Integer.parseInt(request.getParameter("cantidad")),0);
            inventarioDAO.insertar(inventario);
            mostrar(request, response);
    }    
    
    private void nuevo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/biblioteca/crearLibro.jsp");
            List<Autor> listaAutor= autorDAO.listar();
            request.setAttribute("listaAutor", listaAutor); 
            List<Materia> listaMateria= materiaDAO.listar();
            request.setAttribute("listaMateria", listaMateria); 
            List<Editorial> listaEditorial= editorialDAO.listar();
            request.setAttribute("listaEditorial", listaEditorial); 
            List<Idioma> listaIdioma= idiomaDAO.listar();
            request.setAttribute("listaIdioma", listaIdioma); 
            List<Tbiblioteca> listaTbiblioteca= tbibliotecaDAO.listar();
            request.setAttribute("listaBiblioteca", listaTbiblioteca);            
            dispatcher.forward(request, response);
    } 
    
    private void mostrar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException , ServletException{
            RequestDispatcher dispatcher = request.getRequestDispatcher("/biblioteca/listarLibros.jsp");
            List<Libros> listaLibros= librosDAO.listar();
            request.setAttribute("lista", listaLibros);
            dispatcher.forward(request, response);
    } 
    
    private void showEditar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
            String codigo = request.getParameter("codigo");
            Libros libro = librosDAO.buscar(request.getParameter("codigo"));
            Signaturatopografica signatura = signaturatopograficaDAO.buscarSignaturaLibro(request.getParameter("codigo"));
            request.setAttribute("libro", libro);
            request.setAttribute("signatura", signatura);
            List<Autor> listaAutor= autorDAO.listar();
            request.setAttribute("listaAutor", listaAutor); 
            List<Materia> listaMateria= materiaDAO.listar();
            request.setAttribute("listaMateria", listaMateria); 
            List<Editorial> listaEditorial= editorialDAO.listar();
            request.setAttribute("listaEditorial", listaEditorial); 
            List<Idioma> listaIdioma= idiomaDAO.listar();
            request.setAttribute("listaIdioma", listaIdioma); 
            List<Tbiblioteca> listaTbiblioteca= tbibliotecaDAO.listar();
            request.setAttribute("listaBiblioteca", listaTbiblioteca);            
            RequestDispatcher dispatcher = request.getRequestDispatcher("/biblioteca/editarLibro.jsp");
            dispatcher.forward(request, response);
    }    
    
    private void editar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
            String codigoAntLib = request.getParameter("codigoAntLib");
            String codigoAntSig = request.getParameter("codigoAntSig");
            Libros libro = new Libros(request.getParameter("codigo"), request.getParameter("titulo"), 
                    Integer.parseInt(request.getParameter("paginas")), Integer.parseInt(request.getParameter("autor")), 
                    Integer.parseInt(request.getParameter("materia")), Integer.parseInt(request.getParameter("editorial")),
                    Integer.parseInt(request.getParameter("idioma")), request.getParameter("signatura"));
            librosDAO.modificar(libro, codigoAntLib);
            Signaturatopografica signatura = new Signaturatopografica(request.getParameter("signatura"), Integer.parseInt(request.getParameter("biblioteca")), request.getParameter("codigo"));
            signaturatopograficaDAO.modificarSignaturaLibro(signatura, codigoAntSig);
            inventarioDAO.eliminar(codigoAntLib);
            Inventario inventario = new Inventario(0,request.getParameter("codigo"),"",Integer.parseInt(request.getParameter("cantidad")),0);
            inventarioDAO.insertar(inventario);            
            mostrar(request, response);
    }    
        
    private void eliminar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
            signaturatopograficaDAO.eliminarSignaturaLibro(request.getParameter("codigo"));
            inventarioDAO.eliminar(request.getParameter("codigo"));
            librosDAO.eliminar(request.getParameter("codigo"));
            mostrar(request, response);
    }
}
