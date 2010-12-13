package br.com.caelum.loja.domain;

import javax.persistence.Entity;

@Entity
public class PessoaFisica extends Pessoa {

	private int cpf;

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getCpf() {
		return cpf;
	}
	
	
}
