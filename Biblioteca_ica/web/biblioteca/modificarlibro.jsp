
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Biblioteca ICA</title>
    </head>
    <body>
        <h2>Editar registro de libros</h2>
        
        <form action="" method="POST" autocomplete="OFF">
            
            <input id="id" name="id" type="hidden"/>
            <p>
                codigo libro isbn:
                <input id="codigolibroisbn" name="codigolibroisbn" type="text"/>
            </p>
            
            <p>
                Titulo:
                <input id="Libtitulo" name="Libtitulo" type="text"/>
            </p>
            
            <p>
                Numero de paginas:
                <input id="Libnumerodepaginas" name="Libnumerodepaginas" type="text"/>
            </p>
            
            <p>
                Codigo de Autor:
                <input id="Lib_codigoautor" name="Lib_codigoautor" type="text"/>
            </p>
            
            <p>
                Codigo de Materia:
                <input id="Lib_codigomateria" name="Lib_codigomateria" type="text"/>
            </p>
            
            <p>
                Codigo de Editorial:
                <input id="Lib_codigoeditorial" name="Lib_codigoeditorial" type="text"/>
            </p>
            
            <p>
                Codigo de Idioma:
                <input id="Lib_codigoidioma" name="Lib_codigoidioma" type="text"/>
            </p>
            
              <p>
                Codigo signatura topografica:
                <input id="Lib_codigosignaturatopografica" name="Lib_codigosignaturatopografica" type="text"/>
            </p>
            
            <p>
                Fecha de creacion:
                <input id="Libfechacreacion" name="Libfechacreaciona" type="text"/>
            </p>
            
             <p>
                Fecha de Retiro:
                <input id="Libfecharetiro" name="Libfecharetiro" type="text"/>
            </p>
            <button id="Guardar" name="Guardar" type="Submit">Guardar</button>
        </form>
    </body>
</html>
