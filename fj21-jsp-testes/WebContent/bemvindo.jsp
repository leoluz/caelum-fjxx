<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Bem vindo</title>
    <jsp:useBean id="dao" class="br.com.caelum.jdbc.dao.ContatoDao"/>
</head>
<body>

	<ul>
	<c:forEach var="contato" items="${dao.lista}">
	    <li>
        nome: ${contato.descricao},
        email: ${contato.email},
        endereco: ${contato.endereco}
 	    </li>
	</c:forEach>
	</ul>
</body>
</html>