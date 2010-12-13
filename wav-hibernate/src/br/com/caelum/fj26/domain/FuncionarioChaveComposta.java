package br.com.caelum.fj26.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;


@Entity
@Table(name="gen_funcionario")
public class FuncionarioChaveComposta {

	@EmbeddedId
	private FuncionarioPK id;
	
	@Version
	private Long versao;

	private String nome;
	private String sobrenome;
	private String usuario;
	private String senha;
	private String email;

	public FuncionarioPK getId() {
		return id;
	}
	public void setId(FuncionarioPK id) {
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
