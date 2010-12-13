<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j" %>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Testando Componentes</title>
</head>
<body>
	<f:view>
		<rich:tabPanel>
			<rich:tab label="GoogleMaps" >
				<rich:gmap lat="-23.575231" lng="-46.615187" />
			</rich:tab>
			<rich:tab label="VirtualEarth" >
				<rich:virtualEarth lat="-23.575231" lng="-46.615187" />
			</rich:tab>
			<rich:tab label="Calendario" >
				<rich:calendar />
			</rich:tab>
		</rich:tabPanel>
	</f:view>
</body>
</html>