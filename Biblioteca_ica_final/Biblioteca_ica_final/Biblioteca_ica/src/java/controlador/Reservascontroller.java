
package controlador;

import java.io.IOException;
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
import modelo.Reservas;
import modelo.Usuario;
import modelo.Audiosyvideos;
import modelo.Inventario;
import modelo.Prestamos;

import modelo.LibrosDAO;
import modelo.ReservasDAO;
import modelo.UsuarioDAO;
import modelo.AudiosyvideosDAO;
import modelo.InventarioDAO;
import modelo.PrestamosDAO;



@WebServlet(name = "Reservascontroller", urlPatterns = {"/reservascontroller"})
public class Reservascontroller extends HttpServlet {
    private static final long serialVersionUID = 1L;
    LibrosDAO librosDAO = new LibrosDAO();
    ReservasDAO reservasDAO = new ReservasDAO();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    AudiosyvideosDAO audiosyvideosDAO = new AudiosyvideosDAO();
    InventarioDAO inventarioDAO = new InventarioDAO();
    PrestamosDAO prestamosDAO = new PrestamosDAO();
    
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
		case "cancelar":
			cancelar(request, response);
			break;
		case "nuevo":
			nuevo(request, response);
			break;
		case "register":
			insertar(request, response);
			break;
		case "prestar":
			prestar(request, response);
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
	RequestDispatcher dispatcher= request.getRequestDispatcher("/biblioteca/listarReservas.jsp");
	dispatcher.forward(request, response);
    }    
    

    private void mostrar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException , ServletException{
            Usuario usuario = usuarioDAO.buscar(request.getParameter("cedula"));
            request.setAttribute("usuarioRe", usuario);
            
            List<Reservas> listaReservas= reservasDAO.listar(usuario.getIdusuario());
            request.setAttribute("lista", listaReservas);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/biblioteca/listarReservas.jsp");
            dispatcher.forward(request, response);
    } 
    
    private void nuevo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/biblioteca/crearReserva.jsp");
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
                Reservas reservas = new Reservas(Integer.parseInt(request.getParameter("usuarioRe")),
                            Integer.parseInt(request.getParameter("administrador")), request.getParameter("libro"),
                            date1);
                reservasDAO.insertarLib(reservas);                
            }
            
            if(!request.getParameter("audio").equals("")){
                Reservas reservas = new Reservas(Integer.parseInt(request.getParameter("usuarioRe")),
                            Integer.parseInt(request.getParameter("administrador")), request.getParameter("audio"),
                            date1);
                reservasDAO.insertarAud(reservas);                
            }    
                        
            Usuario usuario = usuarioDAO.buscar(Integer.parseInt(request.getParameter("usuarioRe")));
            request.setAttribute("usuarioRe", usuario);
            
            List<Reservas> listaReservas= reservasDAO.listar(usuario.getIdusuario());
            request.setAttribute("lista", listaReservas);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/biblioteca/listarReservas.jsp");
            dispatcher.forward(request, response);            
    }    
    
    
    private void cancelar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
            reservasDAO.modificar(Integer.parseInt(request.getParameter("reserva")), "C");
                        
            Usuario usuario = usuarioDAO.buscar(Integer.parseInt(request.getParameter("usuario")));
            request.setAttribute("usuarioRe", usuario);
            
            List<Reservas> listaReservas= reservasDAO.listar(usuario.getIdusuario());
            request.setAttribute("lista", listaReservas);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/biblioteca/listarReservas.jsp");
            dispatcher.forward(request, response);            
    }    
        
    private void prestar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException, Exception{
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String dt = simpleDateFormat.format(new Date());
            Date date1 = new  SimpleDateFormat( "yyyy-MM-dd" ).parse(dt);
                
            reservasDAO.modificar(Integer.parseInt(request.getParameter("reserva")), "P");
            
            Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
            
            Reservas reserva = reservasDAO.buscar(Integer.parseInt(request.getParameter("reserva")));
            
            if(reserva.getTipo().equals("L")){
                Prestamos prestamos = new Prestamos(reserva.getResidusuario(), usuario.getIdusuario(),
                            reserva.getCodigo(),date1);                                
                prestamosDAO.insertarLib(prestamos);  
                inventarioDAO.actualizarInv(reserva.getCodigo(),""); 
            }
            
            if(reserva.getTipo().equals("A")){
                Prestamos prestamos = new Prestamos(reserva.getResidusuario(), usuario.getIdusuario(),
                            reserva.getCodigo(),date1);                                
                prestamosDAO.insertarAud(prestamos);  
                inventarioDAO.actualizarInv("",reserva.getCodigo());
            }   
                                                       
            Usuario usuarioPr = usuarioDAO.buscar(reserva.getResidusuario());
            request.setAttribute("usuarioPr", usuarioPr);
            
            List<Prestamos> listaPrestamos= prestamosDAO.listar(usuarioPr.getIdusuario());
            request.setAttribute("lista", listaPrestamos);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/biblioteca/listarPrestamos.jsp");
            dispatcher.forward(request, response);                 
    }        
}
