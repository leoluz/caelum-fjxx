package br.com.caelum.loja.client;

import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.entity.Autor;
import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.session.GerenciadorLoja;

public class ClienteGerenciador3 {

	public static void main(String[] args) throws NamingException {
		InitialContext ic = new InitialContext();
		GerenciadorLoja gerenciador = (GerenciadorLoja) ic.lookup("fj31-loja-ear/GerenciadorLojaBean/remote");

		Livro livro = gerenciador.procura(16L);
		
		List<Autor> autores = livro.getAutores();
		for (Autor a : autores) {
			System.out.println(a.getNome());
		}
	}
}
