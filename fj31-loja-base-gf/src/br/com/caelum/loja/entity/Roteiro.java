package br.com.caelum.loja.entity;

import java.io.Serializable;

public class Roteiro implements Serializable {
	
	private static final long serialVersionUID = -7882101898678768406L;

	private int id;
	private String descricao;
	private Long preco;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Long getPreco() {
		return preco;
	}
	public void setPreco(Long preco) {
		this.preco = preco;
	}

}
