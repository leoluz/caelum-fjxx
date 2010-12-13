<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="javax.servlet.jsp.tagext.TagLibraryInfo"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Livros</title>
</head>
<body>
	<c:forEach items="${livros}" var="livro">
		Nome:${livro.nome}<br />
		Preço:${livro.preco}<br />
		<br />
	</c:forEach>
</body>
</html>