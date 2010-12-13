package br.com.caelum.fj26.dao;

import br.com.caelum.fj26.domain.Fornecedor;

public class ValorPorFornecedor {

	private Fornecedor fornecedor;
	private Boolean pago;
	private Double soma;

	public ValorPorFornecedor(Fornecedor fornecedor, Boolean pago, Double soma) {

		this.fornecedor = fornecedor;
		this.pago = pago;
		this.soma = soma;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public Boolean getPago() {
		return pago;
	}
	public Double getSoma() {
		return soma;
	}
}
