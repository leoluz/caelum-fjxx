package br.com.caelum.loja.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.session.Carrinho;

public class ClienteFuzilandoServidor {

	public static void main(String[] args) throws NamingException {
		InitialContext ic = new InitialContext();
		
		Carrinho carrinhoRemoto = (Carrinho) ic.lookup("fj31-loja-ear/CarrinhoBean/remote");
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			carrinhoRemoto.getTotal();
		}
		
		long fim = System.currentTimeMillis();
		System.out.println(fim - inicio);

	}
}
