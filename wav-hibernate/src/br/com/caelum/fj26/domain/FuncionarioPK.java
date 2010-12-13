package br.com.caelum.fj26.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class FuncionarioPK implements Serializable {
	private Long rg;
	public Long getRg() {
		return rg;
	}
	public void setRg(Long rg) {
		this.rg = rg;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	private Long cpf;
}
