package br.com.caelum.fj26.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jsf_fornecedor")
public class Fornecedor {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String descricao;

	@Embedded
	private CNPJ cnpj;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public CNPJ getCnpj() {
		return cnpj;
	}
	public void setCnpj(CNPJ cnpj) {
		this.cnpj = cnpj;
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
}
