<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Biblioteca ICA</title>
    </head>
    <body>
        <h1>Modulo Libros</h1>
        <a href="">Nuevo Libro</a>
        <a href="">modificar Libro</a>
        <a href="">buscar Libro</a>
        <a href="">eliminar Libro</a>

        <br /> <br />

        <table border ="1" width="80%">
            <thead>
                <tr>
                    <th>codigo libro isbn</th>
                    <th>titulo del libro</th>
                    <th>numero de paginas</th>
                    <th>codigo autor</th>
                    <th>codigo materia</th>
                    <th>codigo editorial</th>
                    <th>codigo idioma</th>
                    <th>codigo signaturatopografica</th>
                    <th>fecha de creacion</th>
                    <th>fecha deretiro</th>

                </tr>
            </thead>
            <tbody>
                <c:forEach var="libros" items="${lista}">
                    <tr>
                        <td> <c:out value="${libros.codigolibroisbn}"/></td>
                        <td> <c:out value="${libros.Libtitulo}"/></td>
                        <td> <c:out value="${libros.Libnumerodepaginas}"/></td> 
                        <td> <c:out value="${libros.Lib_codigoautor}"/></td>
                        <td> <c:out value="${libros.Lib_codigomateria}"/></td>
                        <td> <c:out value="${libros.Lib_codigoeditorial}"/></td>
                        <td> <c:out value="${libros.Lib_codigoidioma}"/></td>
                        <td> <c:out value="${libros.Lib_codigosignaturatopografica}"/></td>
                        <td> <c:out value="${libros.Libfechacreacion}"/></td>
                        <td> <c:out value="${libros.Libfecharetiro}"/></td>


                    </tr>
                </c:forEach>


            </tbody>
        </table>
    </body>
</html>