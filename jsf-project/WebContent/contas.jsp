<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j" %>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<f:subview id="contas">
	<h:form>
		<h:panelGrid columns="2">
		
			<h:outputText value="Fornecedor" />
			<h:selectOneMenu binding="#{contaPagarBean.fornecedorSelecionado}">
				<f:selectItems value="#{contaPagarBean.fornecedoresParaComboBox}" />
			</h:selectOneMenu>
			
			<h:outputText value="Descricao" />
			<h:inputText value="#{contaPagarBean.contaPagar.descricao}" required="true" />
			
			<h:outputText value="Data de pagamento" />
			<rich:calendar value="#{contaPagarBean.contaPagar.data.time}" datePattern="dd/MM/yyyy" />
			
			<h:outputText value="Valor" />
			<h:inputText value="#{contaPagarBean.contaPagar.valor}" />
			
			<h:selectBooleanCheckbox value="#{contaPagarBean.contaPagar.pago}">
				<h:outputText value="Pago?" />
			</h:selectBooleanCheckbox>

			<h:messages />
			
			<h:commandButton actionListener="#{contaPagarBean.salva}" value="Gravar" />

			<rich:dataList value="#{contaPagarBean.contas}" var="conta">
				<h:outputText value="#{conta.descricao}" />
			</rich:dataList>
		</h:panelGrid>
	</h:form>
</f:subview>