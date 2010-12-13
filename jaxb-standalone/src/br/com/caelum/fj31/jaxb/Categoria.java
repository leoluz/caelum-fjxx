package br.com.caelum.fj31.jaxb;

import javax.xml.bind.annotation.XmlType;

@XmlType(name="CAT")
public class Categoria {

	private String nome;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
