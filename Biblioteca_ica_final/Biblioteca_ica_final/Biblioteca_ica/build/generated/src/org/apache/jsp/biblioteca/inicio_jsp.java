package org.apache.jsp.biblioteca;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    if (request.getSession().getAttribute("usuario") != null) {


      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("\n");
      out.write("        <title>Inicio | Sistema Biblioteca</title>\n");
      out.write("\n");
      out.write("        <!-- Font Awesome Icons -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/plugins/fontawesome-free/css/all.min.css\">\n");
      out.write("        <!-- Theme style -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/dist/css/adminlte.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Google Font: Source Sans Pro -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"hold-transition sidebar-mini\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!-- Navbar -->\n");
      out.write("            <nav class=\"main-header navbar navbar-expand navbar-white navbar-light\">\n");
      out.write("                <!-- Left navbar links -->\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" data-widget=\"pushmenu\" href=\"#\"><i class=\"fas fa-bars\"></i></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item d-none d-sm-inline-block\">\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/inicio.jsp\" class=\"nav-link\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item d-none d-sm-inline-block\">\n");
      out.write("                        <a href=\"#\" class=\"nav-link\">Contact</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                    <div class=\"navbar-custom-menu\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <li class=\"dropdown user user-menu\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">                                   \n");
      out.write("                                    <span class=\"hidden-xs\">Cerrar Sesión</span>\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <!-- User image -->\n");
      out.write("                                    <li class=\"user-header\">\n");
      out.write("                                        <img src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/dist/img/usuario.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("                                        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.usunombresapellidos}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>  \n");
      out.write("                                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </p>\n");
      out.write("                                    </li>\n");
      out.write("                                    <!-- Menu Footer-->\n");
      out.write("                                    <li class=\"user-footer\">\n");
      out.write("                                        <div class=\"pull-left\">\n");
      out.write("                                            <a data-toggle=\"modal\" href=\"#logout\" class=\"btn btn-danger btn-flat\"><i class=\"fa fa-power-off\"></i>  Salir</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
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
      out.write("\n");
      out.write("            <!-- Main Sidebar Container -->\n");
      out.write("            <aside class=\"main-sidebar sidebar-dark-primary elevation-4\">\n");
      out.write("                <!-- Brand Logo -->\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/inicio.jsp\" class=\"brand-link\">\n");
      out.write("                    <img src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/dist/img/AdminLTELogo.png\" alt=\"AdminLTE Logo\" class=\"brand-image img-circle elevation-3\"\n");
      out.write("                         style=\"opacity: .8\">\n");
      out.write("                    <span class=\"brand-text font-weight-light\">Sistema Biblioteca</span>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <!-- Sidebar -->\n");
      out.write("                <div class=\"sidebar\">\n");
      out.write("                    <!-- Sidebar user panel (optional) -->\n");
      out.write("                    <div class=\"user-panel mt-3 pb-3 mb-3 d-flex\">\n");
      out.write("                        <div class=\"image\">\n");
      out.write("                            <img src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/dist/img/usuario.jpg\" class=\"img-circle elevation-2\" alt=\"User Image\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"info\">\n");
      out.write("                            <a href=\"#\" class=\"d-block\">Bienvenido, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.usunombresapellidos}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>                          \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Sidebar Menu -->\n");
      out.write("                    <nav class=\"mt-2\">\n");
      out.write("                        <ul class=\"nav nav-pills nav-sidebar flex-column\" data-widget=\"treeview\" role=\"menu\" data-accordion=\"false\">\n");
      out.write("                            <!-- Add icons to the links using the .nav-icon class\n");
      out.write("                                 with font-awesome or any other icon font library -->\n");
      out.write("                            <li class=\"nav-item has-treeview menu-open\">\n");
      out.write("                                <a href=\"#\" class=\"nav-link active\">\n");
      out.write("                                    <i class=\"nav-icon fas fa-tachometer-alt\"></i>\n");
      out.write("                                    <p>\n");
      out.write("                                        Menu Principal\n");
      out.write("                                        <i class=\"right fas fa-angle-left\"></i>\n");
      out.write("                                    </p>\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"nav nav-treeview\">\n");
      out.write("                                    <li class=\"nav-item\">\n");
      out.write("                                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/inicio.jsp\" class=\"nav-link active\">\n");
      out.write("                                            <i class=\"fas fa-store-alt nav-icon\"></i>\n");
      out.write("                                            <p>Pagina Principal</p>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_2.setPageContext(_jspx_page_context);
      _jspx_th_c_if_2.setParent(null);
      _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.usutipo == 'A'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <li class=\"nav-item\">\n");
          out.write("                                        <a href=\"");
          out.print(request.getContextPath());
          out.write("/tbibliotecaController?action=mostrar\" class=\"nav-link\">\n");
          out.write("                                            <i class=\"fas fa-archway nav-icon\"></i>\n");
          out.write("                                            <p>Bibliotecas</p>\n");
          out.write("                                        </a>\n");
          out.write("                                    </li>\n");
          out.write("                                    <li class=\"nav-item\">\n");
          out.write("                                        <a href=\"");
          out.print(request.getContextPath());
          out.write("/idiomacontroller?action=mostrar\" class=\"nav-link\">\n");
          out.write("                                            <i class=\"fas fa-bullhorn nav-icon\"></i>\n");
          out.write("                                            <p>Idiomas</p>\n");
          out.write("                                        </a>\n");
          out.write("                                    </li>\n");
          out.write("                                    <li class=\"nav-item\">\n");
          out.write("                                        <a href=\"");
          out.print(request.getContextPath());
          out.write("/materiacontroller?action=mostrar\" class=\"nav-link\">\n");
          out.write("                                            <i class=\"fas fa-window-restore nav-icon\"></i>\n");
          out.write("                                            <p>Materias</p>\n");
          out.write("                                        </a>\n");
          out.write("                                    </li>\n");
          out.write("                                    <li class=\"nav-item\">\n");
          out.write("                                        <a href=\"");
          out.print(request.getContextPath());
          out.write("/editorialcontroller?action=mostrar\" class=\"nav-link\">\n");
          out.write("                                            <i class=\"fas fa-scroll nav-icon\"></i>\n");
          out.write("                                            <p>Editoriales</p>\n");
          out.write("                                        </a>\n");
          out.write("                                    </li>\n");
          out.write("                                    <li class=\"nav-item\">\n");
          out.write("                                        <a href=\"");
          out.print(request.getContextPath());
          out.write("/autorcontroller?action=mostrar\" class=\"nav-link\">\n");
          out.write("                                            <i class=\"fas fa-user-circle nav-icon\"></i>\n");
          out.write("                                            <p>Autor</p>\n");
          out.write("                                        </a>\n");
          out.write("                                    </li>\n");
          out.write("                                    <li class=\"nav-item\">\n");
          out.write("                                        <a href=\"");
          out.print(request.getContextPath());
          out.write("/libroscontroller?action=mostrar\" class=\"nav-link\">\n");
          out.write("                                            <i class=\"fas fa-book nav-icon\"></i>\n");
          out.write("                                            <p>Libros</p>\n");
          out.write("                                        </a>\n");
          out.write("                                    </li>\n");
          out.write("                                    <li class=\"nav-item\">\n");
          out.write("                                        <a href=\"");
          out.print(request.getContextPath());
          out.write("/audiosyvideoscontroller?action=mostrar\" class=\"nav-link\">\n");
          out.write("                                            <i class=\"fas fa-video nav-icon\"></i>\n");
          out.write("                                            <p>Audios y videos</p>\n");
          out.write("                                        </a>\n");
          out.write("                                    </li>    \n");
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
      out.write("\n");
      out.write("                                    <li class=\"nav-item\">\n");
      out.write("                                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/reservascontroller?action=index\" class=\"nav-link\">\n");
      out.write("                                            <i class=\"fas fa-clipboard-list nav-icon\"></i>\n");
      out.write("                                            <p>Reservas</p>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"nav-item\">\n");
      out.write("                                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/prestamoscontroller?action=index\" class=\"nav-link\">\n");
      out.write("                                            <i class=\"fas fa-clipboard-check nav-icon\"></i>\n");
      out.write("                                            <p>Prestamos</p>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_3.setPageContext(_jspx_page_context);
      _jspx_th_c_if_3.setParent(null);
      _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.usutipo == 'A'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <li class=\"nav-item\">\n");
          out.write("                                        <a href=\"");
          out.print(request.getContextPath());
          out.write("/usuariocontroller?action=mostrar\" class=\"nav-link\">\n");
          out.write("                                            <i class=\"fas fa-address-book nav-icon\"></i>\n");
          out.write("                                            <p>Usuarios</p>\n");
          out.write("                                        </a>\n");
          out.write("                                    </li>\n");
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
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                    <!-- /.sidebar-menu -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.sidebar -->\n");
      out.write("            </aside>\n");
      out.write("\n");
      out.write("            <!-- Content Wrapper. Contains page content -->\n");
      out.write("            <div class=\"content-wrapper\">\n");
      out.write("                <!-- Content Header (Page header) -->\n");
      out.write("                <div class=\"content-header\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row mb-2\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <h1 class=\"m-0 text-dark\">Menu Principal</h1>\n");
      out.write("                            </div><!-- /.col -->\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <ol class=\"breadcrumb float-sm-right\">\n");
      out.write("                                    <li class=\"breadcrumb-item\"><a href=\"#\">Menu Principal</a></li>\n");
      out.write("                                    <li class=\"breadcrumb-item active\">Pagina Principal</li>\n");
      out.write("                                </ol>\n");
      out.write("                            </div><!-- /.col -->\n");
      out.write("                        </div><!-- /.row -->\n");
      out.write("                    </div><!-- /.container-fluid -->\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <section class=\"content\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <!-- Info boxes -->\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-12 col-sm-6 col-md-3\">\n");
      out.write("                                <div class=\"info-box\">\n");
      out.write("                                    <span class=\"info-box-icon bg-info elevation-1\"><i class=\"fas fa-cog\"></i></span>\n");
      out.write("\n");
      out.write("                                    <div class=\"info-box-content\">\n");
      out.write("                                        <span class=\"info-box-text\">Nivel de Prestamos</span>\n");
      out.write("                                        <span class=\"info-box-number\">\n");
      out.write("                                            10\n");
      out.write("                                            <small>%</small>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- /.info-box-content -->\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.info-box -->\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.col -->\n");
      out.write("                            <div class=\"col-12 col-sm-6 col-md-3\">\n");
      out.write("                                <div class=\"info-box mb-3\">\n");
      out.write("                                    <span class=\"info-box-icon bg-danger elevation-1\"><i class=\"fas fa-clipboard-list\"></i></span>\n");
      out.write("\n");
      out.write("                                    <div class=\"info-box-content\">\n");
      out.write("                                        <span class=\"info-box-text\">Reservas</span>\n");
      out.write("                                        <span class=\"info-box-number\">400</span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- /.info-box-content -->\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.info-box -->\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.col -->\n");
      out.write("\n");
      out.write("                            <!-- fix for small devices only -->\n");
      out.write("                            <div class=\"clearfix hidden-md-up\"></div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-12 col-sm-6 col-md-3\">\n");
      out.write("                                <div class=\"info-box mb-3\">\n");
      out.write("                                    <span class=\"info-box-icon bg-success elevation-1\"><i class=\"fas fa-book-reader\"></i></span>\n");
      out.write("\n");
      out.write("                                    <div class=\"info-box-content\">\n");
      out.write("                                        <span class=\"info-box-text\">Prestamos</span>\n");
      out.write("                                        <span class=\"info-box-number\">760</span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- /.info-box-content -->\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.info-box -->\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.col -->\n");
      out.write("                            <div class=\"col-12 col-sm-6 col-md-3\">\n");
      out.write("                                <div class=\"info-box mb-3\">\n");
      out.write("                                    <span class=\"info-box-icon bg-warning elevation-1\"><i class=\"fas fa-users\"></i></span>\n");
      out.write("\n");
      out.write("                                    <div class=\"info-box-content\">\n");
      out.write("                                        <span class=\"info-box-text\">Nuevos Autores</span>\n");
      out.write("                                        <span class=\"info-box-number\">2,000</span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- /.info-box-content -->\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.info-box -->\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.col -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.row -->\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <img class=\"img-circle\" src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/dist/img/logoipca.jpg\" alt=\"User Avatar\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>      \n");
      out.write("                             </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.content-wrapper -->\n");
      out.write("\n");
      out.write("            <!-- Main Footer -->\n");
      out.write("            <footer class=\"main-footer\">\n");
      out.write("                <!-- To the right -->\n");
      out.write("                <div class=\"float-right d-none d-sm-inline\">\n");
      out.write("                    IPCA - Instituto pedagógico de cultura y arte\n");
      out.write("                </div>\n");
      out.write("                <!-- Default to the left -->\n");
      out.write("                <strong><a href=\"https://adminlte.io\">Sistema Bibliteca</a>.</strong>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("        <!-- ./wrapper -->\n");
      out.write("\n");
      out.write("        <!-- REQUIRED SCRIPTS -->\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/plugins/jquery/jquery.min.js\"></script>\n");
      out.write("        <!-- Bootstrap 4 -->\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- AdminLTE App -->\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/dist/js/adminlte.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/alertify.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!--SweetAlert -->\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/biblioteca/sweetAlert/sweetalert.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<script>\n");
      out.write("    function ejecutarAccion() {\n");
      out.write("        window.location.href = \"");
      out.print(request.getContextPath());
      out.write("/biblioteca/index.jsp\";\n");
      out.write("    }\n");
      out.write("</script>\n");
    } else {
        response.sendRedirect("index.jsp");
    }

      out.write('\n');
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
        out.write("                                            <b>Administrador</b>\n");
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
        out.write("\n");
        out.write("                                            <b>Usuario</b>\n");
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
}
