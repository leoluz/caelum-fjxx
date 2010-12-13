<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
	<meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
	<title>Fazendo o Login</title>
</head>
<body>
<f:view>
	<h:form>
		login: <h:inputText value="#{autenticador.login}" /><br/>
		senha: <h:inputSecret value="#{autenticador.senha}" /><br/>
		<h:commandButton value="Entrar" action="#{autenticador.logar}"/>
	</h:form>
</f:view>
</body>
</html>