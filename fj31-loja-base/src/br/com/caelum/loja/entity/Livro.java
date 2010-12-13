package br.com.caelum.loja.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.BatchSize;

@Entity
public class Livro implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataAlteracao;
	
	@BatchSize(size=2)
	@ManyToMany(fetch=FetchType.EAGER)
	private List<Autor> autores = new ArrayList<Autor>();
	private String nome;
	private double preco;

	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	public Date getDataAlteracao() {
		return dataAlteracao;
	}
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	
	@PrePersist
	@PreUpdate
	void preAltera() {
		System.out.println("CALLBACK preAltera(): atualizando a data automaticamente");
		this.dataAlteracao = new Date();
	}
}