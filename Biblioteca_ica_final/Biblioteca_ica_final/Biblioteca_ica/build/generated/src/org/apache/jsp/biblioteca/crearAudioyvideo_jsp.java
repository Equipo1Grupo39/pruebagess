package org.apache.jsp.biblioteca;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class crearAudioyvideo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("\n");
      out.write("        <title>Audios y videos | Sistema Biblioteca</title>\n");
      out.write("\n");
      out.write("        <!-- Font Awesome Icons -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/plugins/fontawesome-free/css/all.min.css\">\n");
      out.write("        <!-- Theme style -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/plugins/datatables-bs4/css/dataTables.bootstrap4.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/dist/css/adminlte.min.css\">\n");
      out.write("        <!--SweetAlert -->\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/sweetAlert/sweetalert.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Google Font: Source Sans Pro -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function enviarForma(enviar)\n");
      out.write("        {\n");
      out.write("            var codigo = document.forms[\"crear\"][\"codigo\"];\n");
      out.write("            var titulo = document.forms[\"crear\"][\"titulo\"];\n");
      out.write("            var contenido = document.forms[\"crear\"][\"contenido\"];\n");
      out.write("            var signatura = document.forms[\"crear\"][\"signatura\"];\n");
      out.write("            var cantidad = document.forms[\"crear\"][\"cantidad\"];\n");
      out.write("            \n");
      out.write("            if (codigo.value == \"\") {\n");
      out.write("                codigo.focus();\n");
      out.write("                return false;\n");
      out.write("            }            \n");
      out.write("\n");
      out.write("            if (titulo.value == \"\") {\n");
      out.write("                titulo.focus();\n");
      out.write("                return false;\n");
      out.write("            }            \n");
      out.write("\n");
      out.write("            if (contenido.value == \"\") {\n");
      out.write("                contenido.focus();\n");
      out.write("                return false;\n");
      out.write("            }            \n");
      out.write("\n");
      out.write("            if (signatura.value == \"\") {\n");
      out.write("                signatura.focus();\n");
      out.write("                return false;\n");
      out.write("            }            \n");
      out.write("\n");
      out.write("            if (cantidad.value == \"\") {\n");
      out.write("                cantidad.focus();\n");
      out.write("                return false;\n");
      out.write("            }            \n");
      out.write("            \n");
      out.write("            document.crear.action.value = enviar;\n");
      out.write("            document.crear.submit();\n");
      out.write("            \n");
      out.write("        }\n");
      out.write(" </script>  \n");
      out.write("\n");
      out.write("<body class=\"hold-transition sidebar-mini\">\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("        <!-- Navbar -->\n");
      out.write("        <nav class=\"main-header navbar navbar-expand navbar-white navbar-light\">\n");
      out.write("            <!-- Left navbar links -->\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" data-widget=\"pushmenu\" href=\"#\"><i class=\"fas fa-bars\"></i></a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item d-none d-sm-inline-block\">\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/inicio.jsp\" class=\"nav-link\">Home</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item d-none d-sm-inline-block\">\n");
      out.write("                    <a href=\"#\" class=\"nav-link\">Contact</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                <div class=\"navbar-custom-menu\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li class=\"dropdown user user-menu\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">                                   \n");
      out.write("                                <span class=\"hidden-xs\">Cerrar Sesión</span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <!-- User image -->\n");
      out.write("                                <li class=\"user-header\">\n");
      out.write("                                    <img src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/dist/img/usuario.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("                                    <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.usunombresapellidos}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>  \n");
      out.write("                                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </p>\n");
      out.write("                                </li>\n");
      out.write("                                <!-- Menu Footer-->\n");
      out.write("                                <li class=\"user-footer\">\n");
      out.write("                                    <div class=\"pull-left\">\n");
      out.write("                                        <a data-toggle=\"modal\" href=\"#logout\" class=\"btn btn-danger btn-flat\"><i class=\"fa fa-power-off\"></i>  Salir</a>\n");
      out.write("                                        <!--<a href=\"Empleado?accion=ce\" class=\"btn btn-danger btn-flat\"><i class=\"fa fa-power-off\"></i> Salir</a>-->\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        <!-- /.navbar -->  \n");
      out.write("            <!-- /.navbar -->\n");
      out.write("            <div class=\"modal fade\" id=\"logout\" aria-hidden=\"false\">\n");
      out.write("                <div class=\"modal-dialog\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                            <h4 class=\"modal-title\"><i class=\"fas fa-sign-in-alt\"></i> Salir</h4>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <p>¿Seguro que quieres salir?</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <a type=\"button\" class=\"btn btn-danger\" href=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/index.jsp\">Sí, Salir</a>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Cancelar</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.modal-content -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.modal-dialog -->\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- Main Sidebar Container -->\n");
      out.write("        <aside class=\"main-sidebar sidebar-dark-primary elevation-4\">\n");
      out.write("            <!-- Brand Logo -->\n");
      out.write("            <a href=\"index3.html\" class=\"brand-link\">\n");
      out.write("                <img src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/dist/img/AdminLTELogo.png\" alt=\"AdminLTE Logo\" class=\"brand-image img-circle elevation-3\"\n");
      out.write("                     style=\"opacity: .8\">\n");
      out.write("                <span class=\"brand-text font-weight-light\">Sistema Biblioteca</span>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <!-- Sidebar -->\n");
      out.write("            <div class=\"sidebar\">\n");
      out.write("                <!-- Sidebar user panel (optional) -->\n");
      out.write("                <div class=\"user-panel mt-3 pb-3 mb-3 d-flex\">\n");
      out.write("                    <div class=\"image\">\n");
      out.write("                        <img src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/dist/img/usuario.jpg\" class=\"img-circle elevation-2\" alt=\"User Image\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"info\">\n");
      out.write("                        <a href=\"#\" class=\"d-block\">Bienvenido, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.usunombresapellidos}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Sidebar Menu -->\n");
      out.write("                <nav class=\"mt-2\">\n");
      out.write("                    <ul class=\"nav nav-pills nav-sidebar flex-column\" data-widget=\"treeview\" role=\"menu\" data-accordion=\"false\">\n");
      out.write("                        <!-- Add icons to the links using the .nav-icon class\n");
      out.write("                             with font-awesome or any other icon font library -->\n");
      out.write("                        <li class=\"nav-item has-treeview menu-open\">\n");
      out.write("                            <a href=\"#\" class=\"nav-link active\">\n");
      out.write("                                <i class=\"nav-icon fas fa-tachometer-alt\"></i>\n");
      out.write("                                <p>\n");
      out.write("                                    Menu Principal\n");
      out.write("                                    <i class=\"right fas fa-angle-left\"></i>\n");
      out.write("                                </p>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"nav nav-treeview\">\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/inicio.jsp\" class=\"nav-link\">\n");
      out.write("                                        <i class=\"fas fa-store-alt nav-icon\"></i>\n");
      out.write("                                        <p>Pagina Principal</p>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_2.setPageContext(_jspx_page_context);
      _jspx_th_c_if_2.setParent(null);
      _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.usutipo == 'A'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <li class=\"nav-item\">\n");
          out.write("                                    <a href=\"");
          out.print(request.getContextPath());
          out.write("/tbibliotecaController?action=mostrar\" class=\"nav-link\">\n");
          out.write("                                        <i class=\"fas fa-archway nav-icon\"></i>\n");
          out.write("                                        <p>Bibliotecas</p>\n");
          out.write("                                    </a>\n");
          out.write("                                </li>\n");
          out.write("                                <li class=\"nav-item\">\n");
          out.write("                                    <a href=\"");
          out.print(request.getContextPath());
          out.write("/idiomacontroller?action=mostrar\" class=\"nav-link\">\n");
          out.write("                                        <i class=\"fas fa-bullhorn nav-icon\"></i>\n");
          out.write("                                        <p>Idiomas</p>\n");
          out.write("                                    </a>\n");
          out.write("                                </li>\n");
          out.write("                                <li class=\"nav-item\">\n");
          out.write("                                    <a href=\"");
          out.print(request.getContextPath());
          out.write("/materiacontroller?action=mostrar\" class=\"nav-link\">\n");
          out.write("                                        <i class=\"fas fa-window-restore nav-icon\"></i>\n");
          out.write("                                        <p>Materias</p>\n");
          out.write("                                    </a>\n");
          out.write("                                </li>\n");
          out.write("                                <li class=\"nav-item\">\n");
          out.write("                                    <a href=\"");
          out.print(request.getContextPath());
          out.write("/editorialcontroller?action=mostrar\" class=\"nav-link\">\n");
          out.write("                                        <i class=\"fas fa-scroll nav-icon\"></i>\n");
          out.write("                                        <p>Editoriales</p>\n");
          out.write("                                    </a>\n");
          out.write("                                </li>\n");
          out.write("                                <li class=\"nav-item\">\n");
          out.write("                                    <a href=\"");
          out.print(request.getContextPath());
          out.write("/autorcontroller?action=mostrar\" class=\"nav-link\">\n");
          out.write("                                        <i class=\"fas fa-user-circle nav-icon\"></i>\n");
          out.write("                                        <p>Autores</p>\n");
          out.write("                                    </a>\n");
          out.write("                                </li>\n");
          out.write("                                <li class=\"nav-item\">\n");
          out.write("                                    <a href=\"");
          out.print(request.getContextPath());
          out.write("/libroscontroller?action=mostrar\" class=\"nav-link\">\n");
          out.write("                                        <i class=\"fas fa-book nav-icon\"></i>\n");
          out.write("                                        <p>Libros</p>\n");
          out.write("                                    </a>\n");
          out.write("                                </li>\n");
          out.write("                                <li class=\"nav-item\">\n");
          out.write("                                    <a href=\"");
          out.print(request.getContextPath());
          out.write("/audiosyvideoscontroller?action=mostrar\" class=\"nav-link active\">\n");
          out.write("                                        <i class=\"fas fa-video nav-icon\"></i>\n");
          out.write("                                        <p>Audios y videos</p>\n");
          out.write("                                    </a>\n");
          out.write("                                </li>    \n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      out.write("\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/reservascontroller?action=index\" class=\"nav-link\">\n");
      out.write("                                        <i class=\"fas fa-clipboard-list nav-icon\"></i>\n");
      out.write("                                        <p>Reservas</p>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/prestamoscontroller?action=index\" class=\"nav-link\">\n");
      out.write("                                        <i class=\"fas fa-clipboard-check nav-icon\"></i>\n");
      out.write("                                        <p>Prestamos</p>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_3.setPageContext(_jspx_page_context);
      _jspx_th_c_if_3.setParent(null);
      _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.usutipo == 'A'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <li class=\"nav-item\">\n");
          out.write("                                    <a href=\"");
          out.print(request.getContextPath());
          out.write("/usuariocontroller?action=mostrar\" class=\"nav-link\">\n");
          out.write("                                        <i class=\"fas fa-address-book nav-icon\"></i>\n");
          out.write("                                        <p>Usuarios</p>\n");
          out.write("                                    </a>\n");
          out.write("                                </li>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("                <!-- /.sidebar-menu -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.sidebar -->\n");
      out.write("        </aside>\n");
      out.write("        \n");
      out.write("        <!-- Content Wrapper. Contains page content -->\n");
      out.write("        <div class=\"content-wrapper\">\n");
      out.write("            <!-- Content Header (Page header) -->\n");
      out.write("            <div class=\"content-header\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row mb-2\">\n");
      out.write("                        <div class=\"col-sm-6\" style=\"padding-right: unset; padding-left: unset\">\n");
      out.write("                            <h1 class=\"m-0 text-dark\">Audio y video</h1>\n");
      out.write("                        </div><!-- /.col -->\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <ol class=\"breadcrumb float-sm-right\">\n");
      out.write("                                <li class=\"breadcrumb-item\"><a href=\"#\">Menu Principal</a></li>\n");
      out.write("                                <li class=\"breadcrumb-item active\">Audio y video</li>\n");
      out.write("                            </ol>\n");
      out.write("                        </div><!-- /.col -->\n");
      out.write("                    </div><!-- /.row -->                       \n");
      out.write("                </div>\n");
      out.write("            </div>    \n");
      out.write("            \n");
      out.write("            <section class=\"content\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-header\">\n");
      out.write("                                    <h3 class=\"card-title\">Crear Audio y video</h3>\n");
      out.write("                                </div>            \n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <form name=\"crear\" class=\"form-signin\" method=\"post\" action=\"");
      out.print(request.getContextPath());
      out.write("/audiosyvideoscontroller\">  \n");
      out.write("                                        <input type=\"hidden\" name=\"action\" value=\"register\">\n");
      out.write("                                        <table class=\"table table-bordered table-hover\">\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Código: </td>\n");
      out.write("                                                <td><input type=\"text\" name=\"codigo\" size=\"100\" required></td>\n");
      out.write("                                            </tr> \n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Título:  </td>\n");
      out.write("                                                <td><input type=\"text\" name=\"titulo\" size=\"100\" required></td>\n");
      out.write("                                            </tr> \n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Contenido: </td>\n");
      out.write("                                                <td><input type=\"text\" name=\"contenido\" size=\"50\" required></td>     \n");
      out.write("                                            </tr>  \n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Autor: </td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <select name=\"autor\">\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    </select> \n");
      out.write("                                                </td>                          \n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Materia:</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <select name=\"materia\">\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    </select> \n");
      out.write("                                                </td>                          \n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Editorial:</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <select name=\"editorial\">\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    </select> \n");
      out.write("                                                </td>                          \n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Idioma:</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <select name=\"idioma\">\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    </select> \n");
      out.write("                                                </td>                          \n");
      out.write("                                            </tr>\n");
      out.write("                                        </table>\n");
      out.write("                                        <br />\n");
      out.write("                                        <h2  class=\"form-signin-heading\" align=\"center\">Asignar Signatura Topográfica</h2>\n");
      out.write("                                        <table class=\"table table-bordered table-hover\">\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Código: </td>\n");
      out.write("                                                <td><input type=\"text\" name=\"signatura\" size=\"100\" required></td>\n");
      out.write("                                            </tr> \n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Biblioteca: </td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <select name=\"biblioteca\">\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    </select> \n");
      out.write("                                                </td>                          \n");
      out.write("                                            </tr> \n");
      out.write("                                        </table>\n");
      out.write("                                        <br />    \n");
      out.write("                                        <h2  class=\"form-signin-heading\" align=\"center\">Inventario</h2>\n");
      out.write("                                        <table class=\"table table-bordered table-hover\">\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Número total de ejemplares: </td>\n");
      out.write("                                                <td><input type=\"number\" name=\"cantidad\" size=\"10\" required></td>\n");
      out.write("                                            </tr> \n");
      out.write("                                        </table>\n");
      out.write("                                        <br />                \n");
      out.write("                                        <div class=\"modal-footer justify-content-between\">\n");
      out.write("                                            <input type= \"submit\" onclick=\"javascript:enviarForma('register')\" class=\"btn btn-primary \" value=\"Guardar\">&nbsp;\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/plugins/jquery/jquery.min.js\"></script>\n");
      out.write("    <!-- Bootstrap 4 -->\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <!-- AdminLTE App -->\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/dist/js/adminlte.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/alertify.js\" type=\"text/javascript\"></script>                                      \n");
      out.write("</body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.usutipo == 'A'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <b>Administrador</b>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.usutipo != 'A'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <b>Usuario</b>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("autor");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listaAutor}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${autor.codigoautor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${autor.autnombresapellidos}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("materia");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listaMateria}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${materia.codigomateria}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${materia.matnombremateria}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("editorial");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listaEditorial}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${editorial.codigoeditorial}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${editorial.edinombreeditorial}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setVar("idioma");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listaIdioma}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${idioma.codigoidioma}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${idioma.idinombreidioma}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setVar("biblioteca");
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listaBiblioteca}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${biblioteca.idtbiblioteca}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${biblioteca.tbinombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }
}