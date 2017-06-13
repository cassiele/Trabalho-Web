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
  <c:forEach var="topicos" items="${topicos}">
      <tr id="topicos_${topicos.id}">
          <td>${topicos.id}</td>
          <td>${topicos.descricao}</td>
          
          <td><a href="removeTarefa?id=${topico.id}">Remover</a></td>
          <td><a href="mostraTarefa?id=${topico.id}">Editar</a></td>
          <td><a href="novoComentario?id=${topico.id}">Comentar</a></td>
         
      </tr>
  </c:forEach>
      <br>
   </table>

      
        <td><a href="adicionaTopico">Adicionar Novo tópico </a></td>
    </body>
</html>
