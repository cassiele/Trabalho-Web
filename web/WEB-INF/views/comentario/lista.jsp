<%-- 
    Document   : lista
    Created on : 26/05/2017, 22:19:21
    Author     : ufpr
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Principal</title>
        <script src="https://code.jquery.com/jquery-2.2.3.js" integrity="sha256-laXWtGydpwqJ8JA+X9x2miwmaiKhn8tVmOVEigRNtP4=" crossorigin="anonymous"></script>

    </head>
    <body>
        <table>
  <tr>
    <th>Id</th>
    <th>Descrição</th>

  </tr>
  <c:forEach var="comentario" items="${comentario}">
      <tr id="comentarios_${comentario.id}">
          <td>${comentario.id}</td>
          <td>${comentario.descricao}</td>
          
          <td><a href="removeTarefa?id=${comentario.id}">Remover</a></td>
          <td><a href="mostraTarefa?id=${comentario.id}">Editar</a></td>
        
         
      </tr>
  </c:forEach>
      <br>
   </table>

      
        <td><a href="listaTopicos"> Ir para lista de Topicos </a></td>
    </body>
</html>
