
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Libros;
import modelo.Prestamos;
import modelo.Usuario;
import modelo.Audiosyvideos;
import modelo.Inventario;
import modelo.Facturasmulta;

import modelo.LibrosDAO;
import modelo.PrestamosDAO;
import modelo.UsuarioDAO;
import modelo.AudiosyvideosDAO;
import modelo.InventarioDAO;
import modelo.FacturasmultaDAO;



@WebServlet(name = "Prestamoscontroller", urlPatterns = {"/prestamoscontroller"})
public class Prestamoscontroller extends HttpServlet {
    private static final long serialVersionUID = 1L;
    LibrosDAO librosDAO = new LibrosDAO();
    PrestamosDAO prestamosDAO = new PrestamosDAO();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    AudiosyvideosDAO audiosyvideosDAO = new AudiosyvideosDAO();
    InventarioDAO inventarioDAO = new InventarioDAO();
    FacturasmultaDAO facturasmultaDAO = new FacturasmultaDAO();
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        
        System.out.println("Hola Servlet..");
        String action = request.getParameter("action");
        System.out.println(action);       
        
        if (action == null) {
            action = "index";
        }

        try {
            switch (action) {
		case "index":
			index(request, response);
			break;
                case "mostrar":
			mostrar(request, response);
			break;
		case "entregar":
			entregar(request, response);
			break;
		case "nuevo":
			nuevo(request, response);
			break;
		case "register":
			insertar(request, response);
			break;
		case "pagar":
			pagar(request, response);
			break;
                default:
			break;
		}			
	} catch (SQLException e) {
            e.getStackTrace();
	} catch (Exception e){
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
	RequestDispatcher dispatcher= request.getRequestDispatcher("/biblioteca/listarPrestamos.jsp");
        request.setAttribute("multas", "0");
	dispatcher.forward(request, response);
    }    
    

    private void mostrar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException , ServletException{
            PrintWriter out = response.getWriter();
            Usuario usuario = usuarioDAO.buscar(request.getParameter("cedula"));
            request.setAttribute("usuarioPr", usuario);
            
            Integer cantidad = facturasmultaDAO.cantidad(usuario.getIdusuario());
            request.setAttribute("multas", cantidad);
            
            List<Prestamos> listaPrestamos= prestamosDAO.listar(usuario.getIdusuario());
            request.setAttribute("lista", listaPrestamos);
            
            if (cantidad!= null && cantidad != 0) {
                out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
                out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
                out.println("<script src='https://unpkg.com/sweetalert/dist/sweetalert.min.js'></script>");
                out.println("<script language=JavaScript>");
                out.println("$(document).ready(function(){");
                out.println("swal('Alerta','El usuario presenta multas vigentes.  Por favor cancele sus multas para poder solicitar nuevos prestamos.','success');");
                out.println("});");
                out.println("</script>");
            }
                        
            request.getRequestDispatcher("/biblioteca/listarPrestamos.jsp").include(request, response);
            //dispatcher.forward(request, response);
    } 
    
    private void nuevo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
            String pridusuario = request.getParameter("pridusuario");
            request.setAttribute("pridusuario", pridusuario);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/biblioteca/crearPrestamo.jsp");
            List<Usuario> listaUsuario= usuarioDAO.listarTipoUsu("U");
            request.setAttribute("listaUsuario", listaUsuario); 
            List<Usuario> listaAdmon= usuarioDAO.listarTipoUsu("A");
            request.setAttribute("listaAdmon", listaAdmon); 
            List<Libros> listaLibros= librosDAO.listar();
            request.setAttribute("listaLibros", listaLibros); 
            List<Audiosyvideos> listaAudios= audiosyvideosDAO.listar();
            request.setAttribute("listaAudios", listaAudios); 
            dispatcher.forward(request, response);
    } 
   
    private void insertar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException, Exception  {            
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String dt = simpleDateFormat.format(new Date());
            Date date1 = new  SimpleDateFormat( "yyyy-MM-dd" ).parse(dt);
                        
            if(!request.getParameter("libro").equals("")){
                Prestamos prestamos = new Prestamos(Integer.parseInt(request.getParameter("usuarioPr")),
                            Integer.parseInt(request.getParameter("administrador")), request.getParameter("libro"),
                            date1);
                prestamosDAO.insertarLib(prestamos);                
            }
            
            if(!request.getParameter("audio").equals("")){
                Prestamos prestamos = new Prestamos(Integer.parseInt(request.getParameter("usuarioPr")),
                            Integer.parseInt(request.getParameter("administrador")), request.getParameter("audio"),
                            date1);
                prestamosDAO.insertarAud(prestamos);                
            }    
            
            inventarioDAO.actualizarInv(request.getParameter("libro"),request.getParameter("audio"));
            
            Usuario usuario = usuarioDAO.buscar(Integer.parseInt(request.getParameter("usuarioPr")));
            request.setAttribute("usuarioPr", usuario);
            
            Integer cantidad = facturasmultaDAO.cantidad(usuario.getIdusuario());
            request.setAttribute("multas", cantidad);
                        
            List<Prestamos> listaPrestamos= prestamosDAO.listar(usuario.getIdusuario());
            request.setAttribute("lista", listaPrestamos);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/biblioteca/listarPrestamos.jsp");
            dispatcher.forward(request, response);            
    }    
    
    
    private void entregar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
            if(request.getParameter("multa").equals("0")){
                prestamosDAO.modificar(Integer.parseInt(request.getParameter("prestamo")),"D");
            } else{
                prestamosDAO.modificar(Integer.parseInt(request.getParameter("prestamo")),"E");
            }    
                
            if(request.getParameter("tipo").equals("L")){
                inventarioDAO.devolverInv(request.getParameter("codigo"),"");
            } else {
                inventarioDAO.devolverInv("",request.getParameter("codigo"));
            }
            
            Usuario usuario = usuarioDAO.buscar(Integer.parseInt(request.getParameter("pridusuario")));
            request.setAttribute("usuarioPr", usuario);

            Integer cantidad = facturasmultaDAO.cantidad(usuario.getIdusuario());
            request.setAttribute("multas", cantidad);
                        
            List<Prestamos> listaPrestamos= prestamosDAO.listar(usuario.getIdusuario());
            request.setAttribute("lista", listaPrestamos);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/biblioteca/listarPrestamos.jsp");
            dispatcher.forward(request, response);            
    }    
        
    private void pagar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
            facturasmultaDAO.modificar(Integer.parseInt(request.getParameter("multa")));
                        
            Usuario usuario = usuarioDAO.buscar(Integer.parseInt(request.getParameter("pridusuario")));
            request.setAttribute("usuarioPr", usuario);

            Integer cantidad = facturasmultaDAO.cantidad(usuario.getIdusuario());
            request.setAttribute("multas", cantidad);
                        
            List<Prestamos> listaPrestamos= prestamosDAO.listar(usuario.getIdusuario());
            request.setAttribute("lista", listaPrestamos);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/biblioteca/listarPrestamos.jsp");
            dispatcher.forward(request, response);            
    }    
    
}
