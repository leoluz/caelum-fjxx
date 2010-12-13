package br.com.caelum.loja.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.session.Carrinho;

public class ClienteCarrinho {
	public static void main(String[] args) throws NamingException {
		InitialContext ic = new InitialContext();

		Carrinho carrinho = (Carrinho) ic
				.lookup("fj31-loja-ear/CarrinhoBean/remote");

		Livro livro1 = new Livro();
		livro1.setNome("Fausto");
		livro1.setPreco(45);

		carrinho.addLivro(livro1);

		Livro livro2 = new Livro();
		livro2.setNome("Pais e Filhos");
		livro2.setPreco(25);
		carrinho.addLivro(livro2);

		System.out.println("total: " + carrinho.getTotal());
		carrinho.finalizaCompra();
		System.out.println("Compra finalizada!");
		
	}
}