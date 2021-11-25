package org.apache.jsp.biblioteca;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=”Content-Type” content=”text/html; charset=UTF-8″>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>Iniciar Sesion | Sistema Biblioteca</title>\n");
      out.write("        <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/css/alertify.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/plugins/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Ionicons -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css\">\n");
      out.write("        <!-- icheck bootstrap -->\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/plugins/icheck-bootstrap/icheck-bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Theme style -->\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/dist/css/adminlte.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Google Font: Source Sans Pro -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"hold-transition login-page\">\n");
      out.write("        <div class=\"login-box\">\n");
      out.write("            <div class=\"login-logo\">\n");
      out.write("                <a href=\"#\"><b>Sistema Biblioteca</b></a>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.login-logo -->\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-body login-card-body\">\n");
      out.write("                    <p class=\"login-box-msg\">Iniciar Sesion</p>\n");
      out.write("\n");
      out.write("                    <form id=\"frmLogin\" method=\"post\" action=\"");
      out.print(request.getContextPath());
      out.write("/logincontroller\">\n");
      out.write("                        <div class=\"input-group mb-3\">\n");
      out.write("                            <input type=\"txtUsuario\" id=\"txtNombre\" class=\"form-control\" name=\"usuario\" value=\"\" required>\n");
      out.write("                            <div class=\"input-group-append\">\n");
      out.write("                                <div class=\"input-group-text\">\n");
      out.write("                                    <span class=\"fas fa-envelope\"></span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-group mb-3\">\n");
      out.write("                            <input type=\"password\" id=\"txtClave\" class=\"form-control\" name=\"contrasena\" required>\n");
      out.write("                            <div class=\"input-group-append\">\n");
      out.write("                                <div class=\"input-group-text\">\n");
      out.write("                                    <span class=\"fas fa-lock\"></span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-8\">\n");
      out.write("                                <div class=\"icheck-primary\">\n");
      out.write("                                    <input type=\"checkbox\" checked=\"\" id=\"remember\">\n");
      out.write("                                    <label for=\"remember\">\n");
      out.write("                                        Recuérdame\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.col -->\n");
      out.write("                            <div class=\"col-4\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary btn-block\">Ingresar</button>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.col -->\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <div class=\"social-auth-links text-center mb-3\">\n");
      out.write("                        <p>- Alerta del Sistema -</p>\n");
      out.write("                        <div id=\"contenedor\" class=\"alert alert-success\" role=\"alert\">\n");
      out.write("                            Verificación de las credenciales!\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <p class=\"mb-1\">\n");
      out.write("                        <a href=\"#\">Olvidé mi contraseña</a>\n");
      out.write("                    </p>\n");
      out.write("                    <p class=\"mb-0\">\n");
      out.write("                        <a href=\"#\" class=\"text-center\">Registrarme</a>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.login-card-body -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /.login-box -->\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/alertify.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/plugins/jquery/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- Bootstrap 4 -->\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/plugins/bootstrap/js/bootstrap.bundle.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- AdminLTE App -->\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/dist/js/adminlte.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/js/login.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
