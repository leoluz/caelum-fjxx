package br.com.caelum.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.session.Carrinho;

public class ClienteCarrinho {

	public static void main(String[] args) throws NamingException {
		InitialContext ic = new InitialContext();
		Carrinho carrinho = (Carrinho) ic.lookup("br.com.caelum.loja.session.Carrinho");
		
		Livro l1 = new Livro();
		l1.setNome("Um livro");
		l1.setPreco(100.0);
		carrinho.addLivro(l1);
		
		Livro l2 = new Livro();
		l2.setNome("Outro Livro");
		l2.setPreco(150);
		carrinho.addLivro(l2);
		
		System.out.println("Total: " + carrinho.getTotal());
		carrinho.finalizaCompra();

	}
}
