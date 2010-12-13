package br.com.caelum.jdbc.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class ContatoDaoTest {

	private static ContatoDao dao;
	
	public static void main(String[] args) throws SQLException {
		
		dao = new ContatoDao();
		listaTest();
		dao.fechaConexao();
	}

	public static void listaTest() throws SQLException {
		List<Contato> contatos = new ArrayList<Contato>();
		contatos = dao.getLista();
		for (Contato contato : contatos) {
			System.out.println("Id: "+contato.getId()+" - "+contato.getDescricao());
		}
	}
	public static void adicionaTest() throws SQLException {

		Contato contato = new Contato();
		
		contato.setId(2);
		contato.setDescricao("Leonardo");
		contato.setEmail("leo@leo.com.br");
		contato.setEndereco("Rua japuarana");
			
		dao.grava(contato);
	}
}
