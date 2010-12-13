<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pagina inicial</title>
<h2>Indice do projeto</h2>
</head>
<body>
<hr>
<h3>JSP Tests</h3>
<ul>
    <li>
        <a href="<c:url value="/jstl-import.jsp"/>">Teste de import de JSPs</a>
    </li>
    <li>
        <a href="<c:url value="/testaparametro.jsp"/>">Teste de EL</a>
    </li>
    <li>
        <a href="<c:url value="/bemvindo.jsp"/>">Teste foreach no dao</a>
    </li>
</ul>

<hr>
<h3>Servlet Tests</h3>
<ul>
    <li>
        <a href="<c:url value="/oi"/>">Hello world!</a>
    </li>
    <li>
        <a href="<c:url value="/erroservlet"/>">Teste de tratamento de erro</a>
    </li>
    <li>
        <a href="<c:url value="/add-contato.jsp"/>">Teste para adicionar contato</a>
    </li>
</ul>
</body>
</html>