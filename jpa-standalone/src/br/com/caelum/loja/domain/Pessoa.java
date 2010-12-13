package br.com.caelum.loja.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Entity
public class Pessoa {

	@Id
	@GeneratedValue
	private int id;
	private String nome;

	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
}
