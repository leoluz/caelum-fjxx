<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j" %>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
	<meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
	<title>Manutencao de Fornecedor</title>
</head>
<body>

<f:view>

	<h:outputText value="#{msgs['bemvindo']}" />
	<h:outputText value="#{autenticador.login}" /><br/>

	<rich:tabPanel width="400">
		<rich:tab label="Fornecedores" >
			<h:form id="cadastro">
				<h:messages style="color: darkred; font-family: bold;" /><br/>
	
				<h:outputText value="#{msgs['fornecedor-nome']}" />:<br/>
				<h:inputText id="nome" label="Nome" required="true" validator="#{fornecBean.validaCase}" value="#{fornecBean.fornecedor.nome}">
					<f:validateLength minimum="5" />
				</h:inputText>
				<h:message for="nome" style="color: darkred;" /><br/>
	
				<h:outputText value="CNPJ" />:<br/>
				<h:inputText id="cnpj" value="#{fornecBean.fornecedor.cnpj}" /><br/>
	
				<h:outputText value="#{msgs['fornecedor-descricao']}" />:<br/>
				<h:inputTextarea id="descricao" label="Descricao" required="true" value="#{fornecBean.fornecedor.descricao}" /><br/>
				<h:commandButton value="Salvar Fornecedor" action="#{fornecBean.salvar}"/>
			</h:form>
			
			<rich:spacer height="10"/>
			<rich:separator height="1" lineType="dotted"/>
			<rich:spacer height="10"/>
	
			<jsp:include page="/listafornecedor.jsp" />
		</rich:tab>

		<rich:tab label="Contas a Pagar">
			<jsp:include page="/contas.jsp" />
		</rich:tab>

	</rich:tabPanel>

</f:view>
</body>
</html>