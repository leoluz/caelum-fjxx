package br.com.caelum.loja.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.session.Carrinho;

public class ClienteFinalizaCompra {

	public static void main(String[] args) throws NamingException {
		InitialContext ic = new InitialContext();
		
		Carrinho carrinho = (Carrinho) ic.lookup("fj31-loja-ear/CarrinhoBean/remote");
		
		Livro l1 = new Livro();
		l1.setNome("Livro 1");
		l1.setPreco(100);
		
		Livro l2 = new Livro();
		l2.setNome("Livro 2");
		l2.setPreco(200);
		
		carrinho.addLivro(l1);
		carrinho.addLivro(l2);
		
		carrinho.finalizaCompra();
	}
}
