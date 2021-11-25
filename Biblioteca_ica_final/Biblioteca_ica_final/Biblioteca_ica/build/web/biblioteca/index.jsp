<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv=”Content-Type” content=”text/html; charset=UTF-8″>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Iniciar Sesion | Sistema Biblioteca</title>
        <!-- Tell the browser to be responsive to screen width -->

        <!-- Font Awesome -->
        <link href="<%=request.getContextPath()%>/biblioteca/css/alertify.css" rel="stylesheet" type="text/css"/>
        <link href="<%=request.getContextPath()%>/biblioteca/plugins/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css"/>
        <!-- Ionicons -->
        <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
        <!-- icheck bootstrap -->
        <link href="<%=request.getContextPath()%>/biblioteca/plugins/icheck-bootstrap/icheck-bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <!-- Theme style -->
        <link href="<%=request.getContextPath()%>/biblioteca/dist/css/adminlte.min.css" rel="stylesheet" type="text/css"/>
        <!-- Google Font: Source Sans Pro -->
        <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
    </head>
    <body class="hold-transition login-page">
        <div class="login-box">
            <div class="login-logo">
                <a href="#"><b>Sistema Biblioteca</b></a>
            </div>
            <!-- /.login-logo -->
            <div class="card">
                <div class="card-body login-card-body">
                    <p class="login-box-msg">Iniciar Sesion</p>

                    <form id="frmLogin" method="post" action="<%=request.getContextPath()%>/logincontroller">
                        <div class="input-group mb-3">
                            <input type="txtUsuario" id="txtNombre" class="form-control" name="usuario" value="" required>
                            <div class="input-group-append">
                                <div class="input-group-text">
                                    <span class="fas fa-envelope"></span>
                                </div>
                            </div>
                        </div>
                        <div class="input-group mb-3">
                            <input type="password" id="txtClave" class="form-control" name="contrasena" required>
                            <div class="input-group-append">
                                <div class="input-group-text">
                                    <span class="fas fa-lock"></span>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-8">
                                <div class="icheck-primary">
                                    <input type="checkbox" checked="" id="remember">
                                    <label for="remember">
                                        Recuérdame
                                    </label>
                                </div>
                            </div>
                            <!-- /.col -->
                            <div class="col-4">
                                <button type="submit" class="btn btn-primary btn-block">Ingresar</button>
                            </div>
                            <!-- /.col -->
                        </div>
                    </form>
                    <div class="social-auth-links text-center mb-3">
                        <p>- Alerta del Sistema -</p>
                        <div id="contenedor" class="alert alert-success" role="alert">
                            Verificación de las credenciales!
                        </div>
                    </div>
                    <p class="mb-1">
                        <a href="#">Olvidé mi contraseña</a>
                    </p>
                    <p class="mb-0">
                        <a href="#" class="text-center">Registrarme</a>
                    </p>
                </div>
                <!-- /.login-card-body -->
            </div>
        </div>
        <!-- /.login-box -->
        <script src="<%=request.getContextPath()%>/biblioteca/alertify.js" type="text/javascript"></script>
        <!-- jQuery -->
        <script src="<%=request.getContextPath()%>/biblioteca/plugins/jquery/jquery.min.js" type="text/javascript"></script>
        <!-- Bootstrap 4 -->
        <script src="<%=request.getContextPath()%>/biblioteca/plugins/bootstrap/js/bootstrap.bundle.min.js" type="text/javascript"></script>
        <!-- AdminLTE App -->
        <script src="<%=request.getContextPath()%>/biblioteca/dist/js/adminlte.min.js" type="text/javascript"></script>
        <script src="<%=request.getContextPath()%>/biblioteca/js/login.js" type="text/javascript"></script>
    </body>
</html>
