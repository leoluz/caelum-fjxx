package br.com.caelum.fj26.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OrderBy;

@Entity
@Table(name="gen_fornecedor")
public class Fornecedor {

	@Id
	@GeneratedValue
	@Column(name="cd_fornecedor")
	private Long id;
	
	@Column(name="nm_fornecedor")
	private String nome; 
	
	private String descricao;

	@OrderBy(clause="valor")
	@OneToMany(mappedBy="fornecedor")
	private List<ContaPagar> contas = new ArrayList<ContaPagar>();
	
	@ManyToMany
	private List<Funcionario> contatos = new ArrayList<Funcionario>();
	
	public List<ContaPagar> getContas() {
		return contas;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setContatos(List<Funcionario> contatos) {
		this.contatos = contatos;
	}
	public List<Funcionario> getContatos() {
		return contatos;
	}
}
