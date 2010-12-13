package br.com.caelum.fj26.bb;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIParameter;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.validator.ValidatorException;

import org.hibernate.Session;

import br.com.caelum.fj26.dao.Dao;
import br.com.caelum.fj26.model.Fornecedor;

public class FornecedorHandler {

	private Fornecedor fornecedor = new Fornecedor();
	private Dao<Fornecedor> dao;
//	private List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

	public void setSessao(Session session) {
		this.dao = new Dao<Fornecedor>(session, Fornecedor.class);
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public List<Fornecedor> getFornecedores() {
		return this.dao.list();
	}
	public String salvar() {
		this.dao.merge(this.fornecedor);
		this.fornecedor = new Fornecedor();
		return "ok";
	}
	public void escolheFornecedor(ActionEvent event) {
		UIComponent link = event.getComponent();
		UIParameter param = (UIParameter) link.findComponent("editId");
		Long id = (Long) param.getValue();
		
		this.fornecedor = this.dao.load(id);
	}
	public void validaCase(FacesContext ctx, UIComponent component, Object value) {
		String valor = value.toString();
		if (!valor.matches("[A-Z].*")) {
			throw new ValidatorException(new FacesMessage("Valor inválido!"));
		}
	}
}
