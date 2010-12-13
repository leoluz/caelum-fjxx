package br.com.caelum.fj26.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Version;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Cache(usage=CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Funcionario {

	@Id
	@GeneratedValue
	private Long id;

	@Version
	private Long versao;

	private String nome;
	private String sobrenome;
	private String usuario;
	private String senha;
	private String email;
	
	@OneToOne
	private Endereco endereco;
	
	@LazyCollection(LazyCollectionOption.EXTRA) //no case de dar um f.getFornecedores().size() executaria apenas um count(*)
	@ManyToMany(mappedBy="contatos")
	private List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
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
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
