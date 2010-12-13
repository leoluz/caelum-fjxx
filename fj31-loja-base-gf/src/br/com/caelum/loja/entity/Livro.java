package br.com.caelum.loja.entity;

import java.io.Serializable;

public class Livro implements Serializable{

	private static final long serialVersionUID = 1L;

	private String nome;
	private double preco;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return preco;
	}
	public String toString() {
		return this.nome;
	}
}
