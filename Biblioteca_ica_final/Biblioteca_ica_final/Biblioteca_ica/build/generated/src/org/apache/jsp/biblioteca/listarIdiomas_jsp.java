package org.apache.jsp.biblioteca;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listarIdiomas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\r\n");
      out.write("\r\n");
      out.write("        <title>Idiomas | Sistema Biblioteca</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Font Awesome Icons -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/plugins/fontawesome-free/css/all.min.css\">\r\n");
      out.write("        <!-- Theme style -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/plugins/datatables-bs4/css/dataTables.bootstrap4.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/dist/css/adminlte.min.css\">\r\n");
      out.write("        <!--SweetAlert -->\r\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/sweetAlert/sweetalert.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <!-- Google Font: Source Sans Pro -->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body class=\"hold-transition sidebar-mini\">\r\n");
      out.write("        <div class=\"wrapper\">    \r\n");
      out.write("            \r\n");
      out.write("            <!-- Navbar -->\r\n");
      out.write("            <nav class=\"main-header navbar navbar-expand navbar-white navbar-light\">\r\n");
      out.write("                <!-- Left navbar links -->\r\n");
      out.write("                <ul class=\"navbar-nav\">\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" data-widget=\"pushmenu\" href=\"#\"><i class=\"fas fa-bars\"></i></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item d-none d-sm-inline-block\">\r\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/inicio.jsp\" class=\"nav-link\">Home</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item d-none d-sm-inline-block\">\r\n");
      out.write("                        <a href=\"#\" class=\"nav-link\">Contact</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("                    <div class=\"navbar-custom-menu\">\r\n");
      out.write("                        <ul class=\"nav navbar-nav\">\r\n");
      out.write("                            <li class=\"dropdown user user-menu\">\r\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">                                   \r\n");
      out.write("                                    <span class=\"hidden-xs\">Cerrar Sesión</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <ul class=\"dropdown-menu\">\r\n");
      out.write("                                    <!-- User image -->\r\n");
      out.write("                                    <li class=\"user-header\">\r\n");
      out.write("                                        <img src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/dist/img/usuario.jpg\" class=\"img-circle\" alt=\"User Image\">\r\n");
      out.write("                                        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.usunombresapellidos}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>  \r\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <!-- Menu Footer-->\r\n");
      out.write("                                    <li class=\"user-footer\">\r\n");
      out.write("                                        <div class=\"pull-left\">\r\n");
      out.write("                                            <a data-toggle=\"modal\" href=\"#logout\" class=\"btn btn-danger btn-flat\"><i class=\"fa fa-power-off\"></i>  Salir</a>\r\n");
      out.write("                                            <!--<a href=\"Empleado?accion=ce\" class=\"btn btn-danger btn-flat\"><i class=\"fa fa-power-off\"></i> Salir</a>-->\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <!-- /.navbar -->            \r\n");
      out.write("            \r\n");
      out.write("            <!-- /.navbar -->\r\n");
      out.write("            <div class=\"modal fade\" id=\"logout\" aria-hidden=\"false\">\r\n");
      out.write("                <div class=\"modal-dialog\">\r\n");
      out.write("                    <div class=\"modal-content\">\r\n");
      out.write("                        <div class=\"modal-header\">\r\n");
      out.write("                            <h4 class=\"modal-title\"><i class=\"fas fa-sign-in-alt\"></i> Salir</h4>\r\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                            </button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-body\">\r\n");
      out.write("                            <p>¿Seguro que quieres salir?</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-footer\">\r\n");
      out.write("                            <a type=\"button\" class=\"btn btn-danger\" href=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/index.jsp\">Sí, Salir</a>\r\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Cancelar</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.modal-content -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.modal-dialog -->\r\n");
      out.write("            </div>            \r\n");
      out.write("            \r\n");
      out.write("            <!-- Main Sidebar Container -->\r\n");
      out.write("            <aside class=\"main-sidebar sidebar-dark-primary elevation-4\">\r\n");
      out.write("                <!-- Brand Logo -->\r\n");
      out.write("                <a href=\"index3.html\" class=\"brand-link\">\r\n");
      out.write("                    <img src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/dist/img/AdminLTELogo.png\" alt=\"AdminLTE Logo\" class=\"brand-image img-circle elevation-3\"\r\n");
      out.write("                         style=\"opacity: .8\">\r\n");
      out.write("                    <span class=\"brand-text font-weight-light\">Sistema Biblioteca</span>\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                <!-- Sidebar -->\r\n");
      out.write("                <div class=\"sidebar\">\r\n");
      out.write("                    <!-- Sidebar user panel (optional) -->\r\n");
      out.write("                    <div class=\"user-panel mt-3 pb-3 mb-3 d-flex\">\r\n");
      out.write("                        <div class=\"image\">\r\n");
      out.write("                            <img src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/dist/img/usuario.jpg\" class=\"img-circle elevation-2\" alt=\"User Image\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"info\">\r\n");
      out.write("                            <a href=\"#\" class=\"d-block\">Bienvenido, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.usunombresapellidos}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Sidebar Menu -->\r\n");
      out.write("                    <nav class=\"mt-2\">\r\n");
      out.write("                        <ul class=\"nav nav-pills nav-sidebar flex-column\" data-widget=\"treeview\" role=\"menu\" data-accordion=\"false\">\r\n");
      out.write("                            <!-- Add icons to the links using the .nav-icon class\r\n");
      out.write("                                 with font-awesome or any other icon font library -->\r\n");
      out.write("                            <li class=\"nav-item has-treeview menu-open\">\r\n");
      out.write("                                <a href=\"#\" class=\"nav-link active\">\r\n");
      out.write("                                    <i class=\"nav-icon fas fa-tachometer-alt\"></i>\r\n");
      out.write("                                    <p>\r\n");
      out.write("                                        Menu Principal\r\n");
      out.write("                                        <i class=\"right fas fa-angle-left\"></i>\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <ul class=\"nav nav-treeview\">\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/inicio.jsp\" class=\"nav-link\">\r\n");
      out.write("                                            <i class=\"fas fa-store-alt nav-icon\"></i>\r\n");
      out.write("                                            <p>Pagina Principal</p>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_2.setPageContext(_jspx_page_context);
      _jspx_th_c_if_2.setParent(null);
      _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.usutipo == 'A'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <li class=\"nav-item\">\r\n");
          out.write("                                        <a href=\"");
          out.print(request.getContextPath());
          out.write("/tbibliotecaController?action=mostrar\" class=\"nav-link\">\r\n");
          out.write("                                            <i class=\"fas fa-archway nav-icon\"></i>\r\n");
          out.write("                                            <p>Bibliotecas</p>\r\n");
          out.write("                                        </a>\r\n");
          out.write("                                    </li>\r\n");
          out.write("                                    <li class=\"nav-item\">\r\n");
          out.write("                                        <a href=\"");
          out.print(request.getContextPath());
          out.write("/idiomacontroller?action=mostrar\" class=\"nav-link active\">\r\n");
          out.write("                                            <i class=\"fas fa-bullhorn nav-icon\"></i>\r\n");
          out.write("                                            <p>Idiomas</p>\r\n");
          out.write("                                        </a>\r\n");
          out.write("                                    </li>\r\n");
          out.write("                                    <li class=\"nav-item\">\r\n");
          out.write("                                        <a href=\"");
          out.print(request.getContextPath());
          out.write("/materiacontroller?action=mostrar\" class=\"nav-link\">\r\n");
          out.write("                                            <i class=\"fas fa-window-restore nav-icon\"></i>\r\n");
          out.write("                                            <p>Materias</p>\r\n");
          out.write("                                        </a>\r\n");
          out.write("                                    </li>\r\n");
          out.write("                                    <li class=\"nav-item\">\r\n");
          out.write("                                        <a href=\"");
          out.print(request.getContextPath());
          out.write("/editorialcontroller?action=mostrar\" class=\"nav-link\">\r\n");
          out.write("                                            <i class=\"fas fa-scroll nav-icon\"></i>\r\n");
          out.write("                                            <p>Editoriales</p>\r\n");
          out.write("                                        </a>\r\n");
          out.write("                                    </li>\r\n");
          out.write("                                    <li class=\"nav-item\">\r\n");
          out.write("                                        <a href=\"");
          out.print(request.getContextPath());
          out.write("/autorcontroller?action=mostrar\" class=\"nav-link\">\r\n");
          out.write("                                            <i class=\"fas fa-user-circle nav-icon\"></i>\r\n");
          out.write("                                            <p>Autores</p>\r\n");
          out.write("                                        </a>\r\n");
          out.write("                                    </li>\r\n");
          out.write("                                    <li class=\"nav-item\">\r\n");
          out.write("                                        <a href=\"");
          out.print(request.getContextPath());
          out.write("/libroscontroller?action=mostrar\" class=\"nav-link\">\r\n");
          out.write("                                            <i class=\"fas fa-book nav-icon\"></i>\r\n");
          out.write("                                            <p>Libros</p>\r\n");
          out.write("                                        </a>\r\n");
          out.write("                                    </li>\r\n");
          out.write("                                    <li class=\"nav-item\">\r\n");
          out.write("                                        <a href=\"");
          out.print(request.getContextPath());
          out.write("/audiosyvideoscontroller?action=mostrar\" class=\"nav-link\">\r\n");
          out.write("                                            <i class=\"fas fa-video nav-icon\"></i>\r\n");
          out.write("                                            <p>Audios y videos</p>\r\n");
          out.write("                                        </a>\r\n");
          out.write("                                    </li>  \r\n");
          out.write("                                    ");
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
      out.write("\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/reservascontroller?action=index\" class=\"nav-link\">\r\n");
      out.write("                                            <i class=\"fas fa-clipboard-list nav-icon\"></i>\r\n");
      out.write("                                            <p>Reservas</p>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/prestamoscontroller?action=index\" class=\"nav-link\">\r\n");
      out.write("                                            <i class=\"fas fa-clipboard-check nav-icon\"></i>\r\n");
      out.write("                                            <p>Prestamos</p>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_3.setPageContext(_jspx_page_context);
      _jspx_th_c_if_3.setParent(null);
      _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.usutipo == 'A'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <li class=\"nav-item\">\r\n");
          out.write("                                        <a href=\"");
          out.print(request.getContextPath());
          out.write("/usuariocontroller?action=mostrar\" class=\"nav-link\">\r\n");
          out.write("                                            <i class=\"fas fa-address-book nav-icon\"></i>\r\n");
          out.write("                                            <p>Usuarios</p>\r\n");
          out.write("                                        </a>\r\n");
          out.write("                                    </li>\r\n");
          out.write("                                    ");
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
      out.write("\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                    <!-- /.sidebar-menu -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.sidebar -->\r\n");
      out.write("            </aside>\r\n");
      out.write("            \r\n");
      out.write("            <!-- Content Wrapper. Contains page content -->\r\n");
      out.write("            <div class=\"content-wrapper\">\r\n");
      out.write("                <!-- Content Header (Page header) -->\r\n");
      out.write("                <div class=\"content-header\">\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        <div class=\"row mb-2\">\r\n");
      out.write("                            <div class=\"col-sm-6\" style=\"padding-right: unset; padding-left: unset\">\r\n");
      out.write("                                <h1 class=\"m-0 text-dark\">Idiomas</h1>\r\n");
      out.write("                            </div><!-- /.col -->\r\n");
      out.write("                            <div class=\"col-sm-6\">\r\n");
      out.write("                                <ol class=\"breadcrumb float-sm-right\">\r\n");
      out.write("                                    <li class=\"breadcrumb-item\"><a href=\"#\">Menu Principal</a></li>\r\n");
      out.write("                                    <li class=\"breadcrumb-item active\">Idioma</li>\r\n");
      out.write("                                </ol>\r\n");
      out.write("                            </div><!-- /.col -->\r\n");
      out.write("                        </div><!-- /.row -->                       \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a href=\"idiomacontroller?action=nuevo\" class=\"btn btn-success\">Crear Idioma</a>&nbsp;                 \r\n");
      out.write("                </div>            \r\n");
      out.write("            \r\n");
      out.write("                <section class=\"content\">\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-12\">\r\n");
      out.write("                                <div class=\"card\">\r\n");
      out.write("                                    <div class=\"card-header\">\r\n");
      out.write("                                        <h3 class=\"card-title\">Listado de Idiomas</h3>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <!-- /.card-header -->\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <table class=\"table table-bordered table-hover\">\r\n");
      out.write("                                            <thead>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th>Código</th>\r\n");
      out.write("                                                    <th>Nombre</th>\r\n");
      out.write("                                                    <th class=\"text-center\" colspan=2>Acciones</th>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                            </thead>\r\n");
      out.write("                                            <tbody>\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            </tbody>\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                        <br />\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>  \r\n");
      out.write("                </section>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Main Footer -->\r\n");
      out.write("            <footer class=\"main-footer\">\r\n");
      out.write("                <!-- To the right -->\r\n");
      out.write("                <div class=\"float-right d-none d-sm-inline\">\r\n");
      out.write("                    IPCA - Instituto pedagógico de cultura y arte\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Default to the left -->\r\n");
      out.write("                <strong><a href=\"https://adminlte.io\">Sistema Bibliteca</a>.</strong>\r\n");
      out.write("            </footer>            \r\n");
      out.write("        </div>\r\n");
      out.write("                                            \r\n");
      out.write("        <!-- jQuery -->\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/plugins/jquery/jquery.min.js\"></script>\r\n");
      out.write("        <!-- Bootstrap 4 -->\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <!-- AdminLTE App -->\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/dist/js/adminlte.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/alertify.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    </body>\r\n");
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
        out.write("\r\n");
        out.write("                                            <b>Administrador</b>\r\n");
        out.write("                                        ");
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
        out.write("\r\n");
        out.write("                                            <b>Usuario</b>\r\n");
        out.write("                                        ");
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
    _jspx_th_c_forEach_0.setVar("idioma");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                <tr>\r\n");
          out.write("                                                    <td> ");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\r\n");
          out.write("                                                    <td> ");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\r\n");
          out.write("                                                    <td><a class=\"btn btn-warning\" href=\"idiomacontroller?action=showedit&codigo=");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\">Editar</a></td>\r\n");
          out.write("                                                    <td><a class=\"btn btn-danger\" href=\"idiomacontroller?action=eliminar&codigo=");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\">Eliminar</a> </td>\t                        \r\n");
          out.write("                                                </tr>\r\n");
          out.write("                                            ");
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

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${idioma.codigoidioma}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${idioma.idinombreidioma}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${idioma.codigoidioma}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${idioma.codigoidioma}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }
}
