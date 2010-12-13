package br.com.caelum.loja.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.session.Carrinho;

public class ClienteCarrinhoTestaPassivacao {

	public static void main(String[] args) throws NamingException {
		InitialContext ic = new InitialContext();
		
		Carrinho primeiroCarrinho = (Carrinho) ic.lookup("fj31-loja-ear/CarrinhoBean/remote");
		
		Livro livro = new Livro();
		livro.setNome("Leonardo");
		livro.setPreco(45.0);
		
		primeiroCarrinho.addLivro(livro);
		
		for (int i = 0; i < 50;i++ ) {
			Carrinho outroCarrinho = (Carrinho) ic.lookup("fj31-loja-ear/CarrinhoBean/remote");
			outroCarrinho.addLivro(livro);
		}
		
		primeiroCarrinho.addLivro(livro);
	}
}
