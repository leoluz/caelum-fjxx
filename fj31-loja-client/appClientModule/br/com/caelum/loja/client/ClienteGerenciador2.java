package br.com.caelum.loja.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.entity.Autor;
import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.session.GerenciadorLoja;

public class ClienteGerenciador2 {

	public static void main(String[] args) throws NamingException {
		InitialContext ic = new InitialContext();
		GerenciadorLoja gerenciador = (GerenciadorLoja) ic.lookup("fj31-loja-ear/GerenciadorLojaBean/remote");

		Autor autor = new Autor();
		autor.setNome("Leonardo");
		Livro livro = new Livro();
		livro.setNome("Teste com ManyToMany");

		autor = gerenciador.salva(autor);
		System.out.println("Id do autor: " + autor.getId());

		livro.getAutores().add(autor);
		gerenciador.salva(livro);
	}
}
