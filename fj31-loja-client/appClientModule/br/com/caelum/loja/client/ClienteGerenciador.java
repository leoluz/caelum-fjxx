package br.com.caelum.loja.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.session.GerenciadorLoja;

public class ClienteGerenciador {

	public static void main(String[] args) throws NamingException {
		InitialContext ic = new InitialContext();
		
		GerenciadorLoja gerenciador = (GerenciadorLoja) ic.lookup("fj31-loja-ear/GerenciadorLojaBean/remote");
		
		Livro l = gerenciador.busca(12L);
		
		l.setNome(l.getNome().toLowerCase());
//		l.setPreco(120);
		gerenciador.salva(l);
	}
}
