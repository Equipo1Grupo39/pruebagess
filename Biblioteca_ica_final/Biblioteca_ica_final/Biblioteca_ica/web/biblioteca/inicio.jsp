<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    if (request.getSession().getAttribute("usuario") != null) {

%>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="x-ua-compatible" content="ie=edge">

        <title>Inicio | Sistema Biblioteca</title>

        <!-- Font Awesome Icons -->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/biblioteca/plugins/fontawesome-free/css/all.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/biblioteca/dist/css/adminlte.min.css">

        <!-- Google Font: Source Sans Pro -->
        <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
    </head>
    <body class="hold-transition sidebar-mini">
        <div class="wrapper">

            <!-- Navbar -->
            <nav class="main-header navbar navbar-expand navbar-white navbar-light">
                <!-- Left navbar links -->
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" data-widget="pushmenu" href="#"><i class="fas fa-bars"></i></a>
                    </li>
                    <li class="nav-item d-none d-sm-inline-block">
                        <a href="<%=request.getContextPath()%>/biblioteca/inicio.jsp" class="nav-link">Home</a>
                    </li>
                    <li class="nav-item d-none d-sm-inline-block">
                        <a href="#" class="nav-link">Contact</a>
                    </li>
                </ul>
                <ul class="navbar-nav ml-auto">
                    <div class="navbar-custom-menu">
                        <ul class="nav navbar-nav">
                            <li class="dropdown user user-menu">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">                                   
                                    <span class="hidden-xs">Cerrar Sesión</span>
                                </a>
                                <ul class="dropdown-menu">
                                    <!-- User image -->
                                    <li class="user-header">
                                        <img src="<%=request.getContextPath()%>/biblioteca/dist/img/usuario.jpg" class="img-circle" alt="User Image">
                                        <p>${usuario.usunombresapellidos}<br>  
                                        <c:if test="${usuario.usutipo == 'A'}">
                                            <b>Administrador</b>
                                        </c:if>
                                        <c:if test="${usuario.usutipo != 'A'}">
                                            <b>Usuario</b>
                                        </c:if>
                                        </p>
                                    </li>
                                    <!-- Menu Footer-->
                                    <li class="user-footer">
                                        <div class="pull-left">
                                            <a data-toggle="modal" href="#logout" class="btn btn-danger btn-flat"><i class="fa fa-power-off"></i>  Salir</a>
                                        </div>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </ul>
            </nav>
            <!-- /.navbar -->
            <div class="modal fade" id="logout" aria-hidden="false">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 class="modal-title"><i class="fas fa-sign-in-alt"></i> Salir</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            </button>
                        </div>
                        <div class="modal-body">
                            <p>¿Seguro que quieres salir?</p>
                        </div>
                        <div class="modal-footer">
                            <a type="button" class="btn btn-danger" href="<%=request.getContextPath()%>/biblioteca/index.jsp">Sí, Salir</a>
                            <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
                        </div>
                    </div>
                    <!-- /.modal-content -->
                </div>
                <!-- /.modal-dialog -->
            </div>

            <!-- Main Sidebar Container -->
            <aside class="main-sidebar sidebar-dark-primary elevation-4">
                <!-- Brand Logo -->
                <a href="<%=request.getContextPath()%>/biblioteca/inicio.jsp" class="brand-link">
                    <img src="<%=request.getContextPath()%>/biblioteca/dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
                         style="opacity: .8">
                    <span class="brand-text font-weight-light">Sistema Biblioteca</span>
                </a>

                <!-- Sidebar -->
                <div class="sidebar">
                    <!-- Sidebar user panel (optional) -->
                    <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                        <div class="image">
                            <img src="<%=request.getContextPath()%>/biblioteca/dist/img/usuario.jpg" class="img-circle elevation-2" alt="User Image">
                        </div>
                        <div class="info">
                            <a href="#" class="d-block">Bienvenido, ${usuario.usunombresapellidos}</a>                          
                        </div>
                    </div>

                    <!-- Sidebar Menu -->
                    <nav class="mt-2">
                        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
                            <!-- Add icons to the links using the .nav-icon class
                                 with font-awesome or any other icon font library -->
                            <li class="nav-item has-treeview menu-open">
                                <a href="#" class="nav-link active">
                                    <i class="nav-icon fas fa-tachometer-alt"></i>
                                    <p>
                                        Menu Principal
                                        <i class="right fas fa-angle-left"></i>
                                    </p>
                                </a>
                                <ul class="nav nav-treeview">
                                    <li class="nav-item">
                                        <a href="<%=request.getContextPath()%>/biblioteca/inicio.jsp" class="nav-link active">
                                            <i class="fas fa-store-alt nav-icon"></i>
                                            <p>Pagina Principal</p>
                                        </a>
                                    </li>
                                    <c:if test="${usuario.usutipo == 'A'}">
                                    <li class="nav-item">
                                        <a href="<%=request.getContextPath()%>/tbibliotecaController?action=mostrar" class="nav-link">
                                            <i class="fas fa-archway nav-icon"></i>
                                            <p>Bibliotecas</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="<%=request.getContextPath()%>/idiomacontroller?action=mostrar" class="nav-link">
                                            <i class="fas fa-bullhorn nav-icon"></i>
                                            <p>Idiomas</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="<%=request.getContextPath()%>/materiacontroller?action=mostrar" class="nav-link">
                                            <i class="fas fa-window-restore nav-icon"></i>
                                            <p>Materias</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="<%=request.getContextPath()%>/editorialcontroller?action=mostrar" class="nav-link">
                                            <i class="fas fa-scroll nav-icon"></i>
                                            <p>Editoriales</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="<%=request.getContextPath()%>/autorcontroller?action=mostrar" class="nav-link">
                                            <i class="fas fa-user-circle nav-icon"></i>
                                            <p>Autor</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="<%=request.getContextPath()%>/libroscontroller?action=mostrar" class="nav-link">
                                            <i class="fas fa-book nav-icon"></i>
                                            <p>Libros</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="<%=request.getContextPath()%>/audiosyvideoscontroller?action=mostrar" class="nav-link">
                                            <i class="fas fa-video nav-icon"></i>
                                            <p>Audios y videos</p>
                                        </a>
                                    </li>    
                                    </c:if>
                                    <li class="nav-item">
                                        <a href="<%=request.getContextPath()%>/reservascontroller?action=index" class="nav-link">
                                            <i class="fas fa-clipboard-list nav-icon"></i>
                                            <p>Reservas</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="<%=request.getContextPath()%>/prestamoscontroller?action=index" class="nav-link">
                                            <i class="fas fa-clipboard-check nav-icon"></i>
                                            <p>Prestamos</p>
                                        </a>
                                    </li>
                                    <c:if test="${usuario.usutipo == 'A'}">
                                    <li class="nav-item">
                                        <a href="<%=request.getContextPath()%>/usuariocontroller?action=mostrar" class="nav-link">
                                            <i class="fas fa-address-book nav-icon"></i>
                                            <p>Usuarios</p>
                                        </a>
                                    </li>
                                    </c:if>
                                </ul>
                            </li>
                        </ul>
                    </nav>
                    <!-- /.sidebar-menu -->
                </div>
                <!-- /.sidebar -->
            </aside>

            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <div class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-2">
                            <div class="col-sm-6">
                                <h1 class="m-0 text-dark">Menu Principal</h1>
                            </div><!-- /.col -->
                            <div class="col-sm-6">
                                <ol class="breadcrumb float-sm-right">
                                    <li class="breadcrumb-item"><a href="#">Menu Principal</a></li>
                                    <li class="breadcrumb-item active">Pagina Principal</li>
                                </ol>
                            </div><!-- /.col -->
                        </div><!-- /.row -->
                    </div><!-- /.container-fluid -->
                </div>

                <section class="content">
                    <div class="container-fluid">
                        <!-- Info boxes -->
                        <div class="row">
                            <div class="col-12 col-sm-6 col-md-3">
                                <div class="info-box">
                                    <span class="info-box-icon bg-info elevation-1"><i class="fas fa-cog"></i></span>

                                    <div class="info-box-content">
                                        <span class="info-box-text">Nivel de Prestamos</span>
                                        <span class="info-box-number">
                                            10
                                            <small>%</small>
                                        </span>
                                    </div>
                                    <!-- /.info-box-content -->
                                </div>
                                <!-- /.info-box -->
                            </div>
                            <!-- /.col -->
                            <div class="col-12 col-sm-6 col-md-3">
                                <div class="info-box mb-3">
                                    <span class="info-box-icon bg-danger elevation-1"><i class="fas fa-clipboard-list"></i></span>

                                    <div class="info-box-content">
                                        <span class="info-box-text">Reservas</span>
                                        <span class="info-box-number">400</span>
                                    </div>
                                    <!-- /.info-box-content -->
                                </div>
                                <!-- /.info-box -->
                            </div>
                            <!-- /.col -->

                            <!-- fix for small devices only -->
                            <div class="clearfix hidden-md-up"></div>

                            <div class="col-12 col-sm-6 col-md-3">
                                <div class="info-box mb-3">
                                    <span class="info-box-icon bg-success elevation-1"><i class="fas fa-book-reader"></i></span>

                                    <div class="info-box-content">
                                        <span class="info-box-text">Prestamos</span>
                                        <span class="info-box-number">760</span>
                                    </div>
                                    <!-- /.info-box-content -->
                                </div>
                                <!-- /.info-box -->
                            </div>
                            <!-- /.col -->
                            <div class="col-12 col-sm-6 col-md-3">
                                <div class="info-box mb-3">
                                    <span class="info-box-icon bg-warning elevation-1"><i class="fas fa-users"></i></span>

                                    <div class="info-box-content">
                                        <span class="info-box-text">Nuevos Autores</span>
                                        <span class="info-box-number">2,000</span>
                                    </div>
                                    <!-- /.info-box-content -->
                                </div>
                                <!-- /.info-box -->
                            </div>
                            <!-- /.col -->
                        </div>
                        <!-- /.row -->
                        <div class="row">
                            <div class="col-12">
                                <div class="card">
                                    <div class="card-body">
                                        <img class="img-circle" src="<%=request.getContextPath()%>/biblioteca/dist/img/logoipca.jpg" alt="User Avatar">
                                    </div>
                                </div>      
                             </div>
                        </div>
                    </div>
                </section>
            </div>
            <!-- /.content-wrapper -->

            <!-- Main Footer -->
            <footer class="main-footer">
                <!-- To the right -->
                <div class="float-right d-none d-sm-inline">
                    IPCA - Instituto pedagógico de cultura y arte
                </div>
                <!-- Default to the left -->
                <strong><a href="https://adminlte.io">Sistema Bibliteca</a>.</strong>
            </footer>
        </div>
        <!-- ./wrapper -->

        <!-- REQUIRED SCRIPTS -->

        <!-- jQuery -->
        <script src="<%=request.getContextPath()%>/biblioteca/plugins/jquery/jquery.min.js"></script>
        <!-- Bootstrap 4 -->
        <script src="<%=request.getContextPath()%>/biblioteca/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
        <!-- AdminLTE App -->
        <script src="<%=request.getContextPath()%>/biblioteca/dist/js/adminlte.min.js"></script>
        <script src="<%=request.getContextPath()%>/biblioteca/alertify.js" type="text/javascript"></script>
        <!--SweetAlert -->
        <script src="<%=request.getContextPath()%>/biblioteca/sweetAlert/sweetalert.js" type="text/javascript"></script>
    </body>
</html>
<script>
    function ejecutarAccion() {
        window.location.href = "<%=request.getContextPath()%>/biblioteca/index.jsp";
    }
</script>
<%    } else {
        response.sendRedirect("index.jsp");
    }
%>
