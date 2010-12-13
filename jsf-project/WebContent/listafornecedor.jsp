<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j" %>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<f:subview id="listaFornecedor">
	<h:form>
		<rich:dataTable value="#{fornecBean.fornecedores}" 
					    var="f" 
					    rendered="#{not empty fornecBean.fornecedores}"
					    rows="2">
			<h:column>
				<f:facet name="header">
					<h:outputText value="Id" />
				</f:facet>
				<h:outputText value="#{f.id}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputText value="Nome" />
				</f:facet>
				<h:outputText value="#{f.nome}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputText value="Cnpj" />
				</f:facet>
				<h:outputText value="#{f.cnpj}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputText value="Descricao" />
				</f:facet>
				<h:outputText value="#{f.descricao}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputText value="Alterar" />
				</f:facet>
				<h:commandLink actionListener="#{fornecBean.escolheFornecedor}">
					<h:outputText value="(alterar)" />
					<f:param id="editId" name="id" value="#{f.id}" />
				</h:commandLink>
			</h:column>
			<f:facet name="footer">
				<rich:datascroller />
			</f:facet>
		</rich:dataTable>
	</h:form>
</f:subview>
