<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="x-ua-compatible" content="ie=edge">

        <title>Libros | Sistema Biblioteca</title>

        <!-- Font Awesome Icons -->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/biblioteca/plugins/fontawesome-free/css/all.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/biblioteca/plugins/datatables-bs4/css/dataTables.bootstrap4.css"/>
        <link rel="stylesheet" href="<%=request.getContextPath()%>/biblioteca/dist/css/adminlte.min.css">
        <!--SweetAlert -->
        <link href="<%=request.getContextPath()%>/biblioteca/sweetAlert/sweetalert.css" rel="stylesheet" type="text/css"/>
        <!-- Google Font: Source Sans Pro -->
        <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
    </head>

<script>
    function enviarForma(enviar)
        {
            var codigo = document.forms["editar"]["codigo"];
            var titulo = document.forms["editar"]["titulo"];
            var paginas = document.forms["editar"]["paginas"];
            var signatura = document.forms["editar"]["signatura"];
            var cantidad = document.forms["editar"]["cantidad"];
            
            if (codigo.value == "") {
                codigo.focus();
                return false;
            }            

            if (titulo.value == "") {
                titulo.focus();
                return false;
            }            

            if (paginas.value == "") {
                paginas.focus();
                return false;
            }            

            if (signatura.value == "") {
                signatura.focus();
                return false;
            }            

            if (cantidad.value == "") {
                cantidad.focus();
                return false;
            }            
            
            document.editar.action.value = enviar;
            document.editar.submit();
            
        }
 </script>  

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
                                <span class="hidden-xs">Cerrar Sesi�n</span>
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
                                        <!--<a href="Empleado?accion=ce" class="btn btn-danger btn-flat"><i class="fa fa-power-off"></i> Salir</a>-->
                                    </div>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </ul>
        </nav>
        <!-- /.navbar -->            
        
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
                            <p>�Seguro que quieres salir?</p>
                        </div>
                        <div class="modal-footer">
                            <a type="button" class="btn btn-danger" href="<%=request.getContextPath()%>/biblioteca/index.jsp">S�, Salir</a>
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
            <a href="index3.html" class="brand-link">
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
                                        <a href="<%=request.getContextPath()%>/biblioteca/inicio.jsp" class="nav-link">
                                            <i class="fas fa-store-alt nav-icon"></i>
                                            <p>Pagina Principal</p>
                                        </a>
                                    </li>
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
                                            <p>Autores</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="<%=request.getContextPath()%>/libroscontroller?action=mostrar" class="nav-link active">
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
                                    <li class="nav-item">
                                        <a href="<%=request.getContextPath()%>/usuariocontroller?action=mostrar" class="nav-link">
                                            <i class="fas fa-address-book nav-icon"></i>
                                            <p>Usuarios</p>
                                        </a>
                                    </li>
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
                        <div class="col-sm-6" style="padding-right: unset; padding-left: unset">
                            <h1 class="m-0 text-dark">Libros</h1>
                        </div><!-- /.col -->
                        <div class="col-sm-6">
                            <ol class="breadcrumb float-sm-right">
                                <li class="breadcrumb-item"><a href="#">Menu Principal</a></li>
                                <li class="breadcrumb-item active">Libros</li>
                            </ol>
                        </div><!-- /.col -->
                    </div><!-- /.row -->                       
                </div>
            </div>    
            
            <section class="content">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <div class="card-header">
                                    <h3 class="card-title">Editar Libro</h3>
                                </div>            
                                <div class="card-body">
                                    <form name="editar" class="form-signin" method="post" action="<%=request.getContextPath()%>/libroscontroller">  
                                        <input type="hidden" name="action" value="editar">
                                        <input type="hidden" name="codigoAntLib" value="${libro.codigolibroisbn}">
                                        <input type="hidden" name="codigoAntSig" value="${signatura.codigosignaturatopografica}">
                                            <table class="table table-bordered table-hover">
                                                <tr>
                                                    <td>C�digo: </td>
                                                    <td><input type="text" name="codigo" value="${libro.codigolibroisbn}"  size="100" required></td>
                                                </tr> 
                                                <tr>
                                                    <td>T�tulo: </td>
                                                    <td><input type="text" name="titulo" value="${libro.libtitulo}" size="100" required></td>
                                                </tr> 
                                                <tr>
                                                    <td>N�mero de p�ginas: </td>
                                                    <td><input type="number" name="paginas" value="${libro.libnumerodepaginas}" size="50" required></td>     
                                                </tr>  
                                                <tr>
                                                    <td>Autor: </td>
                                                    <td>
                                                        <select name="autor">
                                                            <c:forEach var="autor" items="${listaAutor}">
                                                                <option value="${autor.codigoautor}" ${autor.codigoautor == libro.libcodigoautor?"selected":""}>${autor.autnombresapellidos}</option>
                                                            </c:forEach>
                                                        </select> 
                                                    </td>                          
                                                </tr>
                                                <tr>
                                                    <td>Materia:</td>
                                                    <td>
                                                        <select name="materia">
                                                            <c:forEach var="materia" items="${listaMateria}">
                                                                <option value="${materia.codigomateria}" ${materia.codigomateria == libro.libcodigomateria?"selected":""}>${materia.matnombremateria}</option>
                                                            </c:forEach>
                                                        </select> 
                                                    </td>                          
                                                </tr>
                                                <tr>
                                                    <td>Editorial:</td>
                                                    <td>
                                                        <select name="editorial">
                                                            <c:forEach var="editorial" items="${listaEditorial}">
                                                                <option value="${editorial.codigoeditorial}" ${editorial.codigoeditorial == libro.libcodigoeditorial?"selected":""}>${editorial.edinombreeditorial}</option>
                                                            </c:forEach>
                                                        </select> 
                                                    </td>                          
                                                </tr>
                                                <tr>
                                                    <td>Idioma:</td>
                                                    <td>
                                                        <select name="idioma">
                                                            <c:forEach var="idioma" items="${listaIdioma}">
                                                                <option value="${idioma.codigoidioma}" ${idioma.codigoidioma == libro.libcodigoidioma?"selected":""}>${idioma.idinombreidioma}</option>
                                                            </c:forEach>
                                                        </select> 
                                                    </td>                          
                                                </tr>
                                            </table>
                                            <br />
                                            <h2  class="form-signin-heading" align="center">Asignar Signatura Topogr�fica</h2>
                                            <table class="table table-bordered table-hover">
                                                <tr>
                                                    <td>C�digo: </td>
                                                    <td><input type="text" name="signatura" size="100" value="${signatura.codigosignaturatopografica}" required></td>
                                                </tr> 
                                                <tr>
                                                    <td>Biblioteca: </td>
                                                    <td>
                                                        <select name="biblioteca">
                                                            <c:forEach var="biblioteca" items="${listaBiblioteca}">
                                                                <option value="${biblioteca.idtbiblioteca}" ${biblioteca.idtbiblioteca == signatura.stoidtbiblioteca?"selected":""}>${biblioteca.tbinombre}</option>
                                                            </c:forEach>
                                                        </select> 
                                                    </td>                          
                                                </tr> 
                                            </table>
                                            <br />   
                                            <h2  class="form-signin-heading" align="center">Inventario</h2>
                                            <table class="table table-bordered table-hover">
                                                <tr>
                                                    <td>N�mero total de ejemplares: </td>
                                                    <td><input type="number" name="cantidad" size="10" value="${libro.invcantidad}" required></td>
                                                </tr> 
                                            </table>
                                            <br />                
                                            <div class="modal-footer justify-content-between">
                                                <input type= "submit" onclick="javascript:enviarForma('editar')" class="btn btn-primary " value="Guardar">&nbsp;
                                            </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </div>
    </div>
    <!-- jQuery -->
    <script src="<%=request.getContextPath()%>/biblioteca/plugins/jquery/jquery.min.js"></script>
    <!-- Bootstrap 4 -->
    <script src="<%=request.getContextPath()%>/biblioteca/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
    <!-- AdminLTE App -->
    <script src="<%=request.getContextPath()%>/biblioteca/dist/js/adminlte.min.js"></script>
    <script src="<%=request.getContextPath()%>/biblioteca/alertify.js" type="text/javascript"></script>                                      
</body>
</html>