package br.com.caelum.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.entity.Roteiro;
import br.com.caelum.loja.session.RoteiroPreco;

public class ClienteRoteiroPreco {

	public static void main(String[] args) throws NamingException {
		InitialContext ic = new InitialContext();
		RoteiroPreco roteiroPreco = (RoteiroPreco) ic.lookup("br.com.caelum.loja.session.RoteiroPreco");

		Roteiro roteiro = new Roteiro();
		roteiro.setDescricao("Natal");
		roteiro.setPreco(10L);

		System.out.println("Preco roteiro: " + roteiroPreco.calcular(roteiro));
	}
}
