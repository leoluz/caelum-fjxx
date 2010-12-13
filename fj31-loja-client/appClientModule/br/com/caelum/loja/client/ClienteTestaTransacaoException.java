package br.com.caelum.loja.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.session.GerenciadorLoja;

public class ClienteTestaTransacaoException {

	public static void main(String[] args) throws NamingException {
		InitialContext ic = new InitialContext();
		GerenciadorLoja gc = (GerenciadorLoja) ic.lookup("fj31-loja-ear/GerenciadorLojaBean/remote");

		Livro l = new Livro();
		l.setNome("Controle de transações!");
		gc.salva(l);
	}
}
