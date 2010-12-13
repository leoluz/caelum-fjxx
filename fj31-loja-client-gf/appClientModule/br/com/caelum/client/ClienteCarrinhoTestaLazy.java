package br.com.caelum.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.session.Carrinho;

public class ClienteCarrinhoTestaLazy {

	public static void main(String[] args) throws NamingException {

		InitialContext ic = new InitialContext();
		Long time = System.currentTimeMillis();
		Carrinho c = (Carrinho) ic.lookup("br.com.caelum.loja.session.Carrinho");
		System.out.println("Lookup feito em: " + time);
//		System.out.println(c);

		Livro l = new Livro();
		l.setNome("Testando o lookup lazy");
		l.setPreco(10);

//		c.addLivro(l);
	}
}
