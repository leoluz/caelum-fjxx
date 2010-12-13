package br.com.caelum.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.session.Carrinho;

public class ClienteCarrinhoTestaPassivacao {

	public static void main(String[] args) throws NamingException {
		InitialContext ic = new InitialContext();
		Carrinho primeiroCarrinho = (Carrinho) ic.lookup("br.com.caelum.loja.session.Carrinho");
		
		Livro livro = new Livro();
		livro.setNome("Python - Como programar");
		livro.setPreco(100);

		for (int i = 0; i < 50; i++) {
			Carrinho carrinho = (Carrinho) ic.lookup("br.com.caelum.loja.session.Carrinho");
			carrinho.addLivro(livro);
		}

		primeiroCarrinho.addLivro(livro);
	}
}
