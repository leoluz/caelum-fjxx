package br.com.caelum.fj26.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CNPJ implements Serializable {

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
