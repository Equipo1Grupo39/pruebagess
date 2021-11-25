
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

import modelo.Audiosyvideos;
import modelo.Autor;
import modelo.Materia;
import modelo.Editorial;
import modelo.Idioma;
import modelo.Signaturatopografica;
import modelo.Inventario;

import modelo.AudiosyvideosDAO;
import modelo.AutorDAO;
import modelo.MateriaDAO;
import modelo.EditorialDAO;
import modelo.IdiomaDAO;
import modelo.Inventario;
import modelo.SignaturatopograficaDAO;
import modelo.Tbiblioteca;
import modelo.TbibliotecaDAO;
import modelo.InventarioDAO;


@WebServlet(name = "Audiosyvideoscontroller", urlPatterns = {"/audiosyvideoscontroller"})
public class Audiosyvideoscontroller extends HttpServlet {
    private static final long serialVersionUID = 1L;
    AudiosyvideosDAO audiosyvideosDAO = new AudiosyvideosDAO();
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
	RequestDispatcher dispatcher= request.getRequestDispatcher("/biblioteca/listarAudiosyvideos.jsp");
	dispatcher.forward(request, response);
    }    
    
    private void insertar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
            Audiosyvideos audio = new Audiosyvideos(request.getParameter("codigo"), request.getParameter("titulo"), 
                    request.getParameter("contenido"), Integer.parseInt(request.getParameter("autor")), 
                    Integer.parseInt(request.getParameter("materia")), Integer.parseInt(request.getParameter("editorial")),
                    Integer.parseInt(request.getParameter("idioma")), request.getParameter("signatura"),
                    Integer.parseInt(request.getParameter("cantidad")));
            audiosyvideosDAO.insertar(audio);
            Signaturatopografica signatura = new Signaturatopografica(request.getParameter("signatura"), Integer.parseInt(request.getParameter("biblioteca")), request.getParameter("codigo"));
            signaturatopograficaDAO.insertarSignaturaAudio(signatura); 
            Inventario inventario = new Inventario(0,request.getParameter("codigo"),"",Integer.parseInt(request.getParameter("cantidad")),0);
            inventarioDAO.insertarAud(inventario);            
            mostrar(request, response);
    }    
    
    private void nuevo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/biblioteca/crearAudioyvideo.jsp");
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
            RequestDispatcher dispatcher = request.getRequestDispatcher("/biblioteca/listarAudiosyvideos.jsp");
            List<Audiosyvideos> listaAudiosyvideos= audiosyvideosDAO.listar();
            request.setAttribute("lista", listaAudiosyvideos);
            dispatcher.forward(request, response);
    } 
    
    private void showEditar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
            String codigo = request.getParameter("codigo");
            Audiosyvideos audio = audiosyvideosDAO.buscar(request.getParameter("codigo"));
            Signaturatopografica signatura = signaturatopograficaDAO.buscarSignaturaAudio(request.getParameter("codigo"));            
            request.setAttribute("audio", audio);
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
            RequestDispatcher dispatcher = request.getRequestDispatcher("/biblioteca/editarAudioyvideo.jsp");
            dispatcher.forward(request, response);
    }    
    
    private void editar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
            String codigoAntAud = request.getParameter("codigoAntAud");
            String codigoAntSig = request.getParameter("codigoAntSig");
            Audiosyvideos audio = new Audiosyvideos(request.getParameter("codigo"), request.getParameter("titulo"), 
                    request.getParameter("contenido"), Integer.parseInt(request.getParameter("autor")), 
                    Integer.parseInt(request.getParameter("materia")), Integer.parseInt(request.getParameter("editorial")),
                    Integer.parseInt(request.getParameter("idioma")), request.getParameter("signatura"),
                    Integer.parseInt(request.getParameter("cantidad")));
            audiosyvideosDAO.modificar(audio, codigoAntAud);
            Signaturatopografica signatura = new Signaturatopografica(request.getParameter("signatura"), Integer.parseInt(request.getParameter("biblioteca")), request.getParameter("codigo"));
            signaturatopograficaDAO.modificarSignaturaAudio(signatura, codigoAntSig);  
            inventarioDAO.eliminarAud(codigoAntAud);
            Inventario inventario = new Inventario(0,request.getParameter("codigo"),"",Integer.parseInt(request.getParameter("cantidad")),0);
            inventarioDAO.insertarAud(inventario);                        
            mostrar(request, response);
    }    
        
    private void eliminar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
            signaturatopograficaDAO.eliminarSignaturaAudio(request.getParameter("codigo"));
            audiosyvideosDAO.eliminar(request.getParameter("codigo"));
            mostrar(request, response);
    }

    
}
