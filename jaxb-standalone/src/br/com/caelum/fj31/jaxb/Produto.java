package br.com.caelum.fj31.jaxb;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Produto {

	private double preco;
	private String nome;
	private String descricao;
	private Categoria categoria;
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return preco;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	
}
