package br.com.caelum.fj26.bb;

import java.util.ArrayList;
import java.util.List;

import javax.el.ELContext;
import javax.el.ELResolver;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.caelum.fj26.model.ContaPagar;
import br.com.caelum.fj26.model.Fornecedor;

public class ContaPagarHandler {

	private HtmlSelectOneMenu fornecedorSelecionado;
	private ContaPagar contaPagar = new ContaPagar();
	private List<ContaPagar> contas = new ArrayList<ContaPagar>();
	private FornecedorHandler fornecedorHandlerInjetado;

	public void setFornecedorHandlerInjetado(
			FornecedorHandler fornecedorHandlerInjetado) {
		this.fornecedorHandlerInjetado = fornecedorHandlerInjetado;
	}

	public void salva(ActionEvent event) {
		
		int id = Integer.parseInt(fornecedorSelecionado.getValue().toString());
		Fornecedor f = getFornecedorHandler().getFornecedores().get(id-1);
		contaPagar.setFornecedor(f);
		
		System.out.println("gravando conta: " + contaPagar.getDescricao());
		System.out.println("pago: " + contaPagar.isPago());
		System.out.println("fornecedor: " + contaPagar.getFornecedor().getNome());
		
		this.contas.add(contaPagar);
		contaPagar = new ContaPagar();
	}
	public HtmlSelectOneMenu getFornecedorSelecionado() {
		return fornecedorSelecionado;
	}
	public void setFornecedorSelecionado(HtmlSelectOneMenu fornecedorSelecionado) {
		this.fornecedorSelecionado = fornecedorSelecionado;
	}
	public ContaPagar getContaPagar() {
		return contaPagar;
	}
	public List<ContaPagar> getContas() {
		return contas;
	}
	public List<SelectItem> getFornecedoresParaComboBox() {
		List<SelectItem> lista = new ArrayList<SelectItem>();
		
		//sem injecao de dependencia precisa chamar um Handler 
//		FornecedorHandler handler = getFornecedorHandler();

		FornecedorHandler handler = this.fornecedorHandlerInjetado;
		
		for (Fornecedor f : handler.getFornecedores()) {
			lista.add(new SelectItem(f.getId(), f.getNome()));
		}
		return lista;
	}

	//Formato sem injecao de dependencia via faces-config.xml (tosqueira)
	private FornecedorHandler getFornecedorHandler() {
		FacesContext ctx = FacesContext.getCurrentInstance();
		ELContext elCtx = ctx.getELContext();
		ELResolver resolver = ctx.getApplication().getELResolver();
		Object fh = resolver.getValue(elCtx, null, "fornecBean");
		
		return (FornecedorHandler) fh;
	}
}
