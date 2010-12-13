package br.com.caelum.fj26.dao.test;

import java.util.List;

import org.hibernate.Session;

import br.com.caelum.fj26.dao.FuncionarioDao;
import br.com.caelum.fj26.domain.Funcionario;
import br.com.caelum.fj26.util.HibernateUtil;

public class TestaPesquisaFuncionario {
	private static Session session;
	private static FuncionarioDao funcionarioDao;

	public static void main(String[] args) {
		session = HibernateUtil.getSession();
		funcionarioDao = new FuncionarioDao(session);
		
		listaComCursorDinamicoTest();
	}

	private static void listaComCursorDinamicoTest() {
		Funcionario f = new Funcionario();
		f.setEmail("leo@");
		f.setNome("leo");
		f.setSenha("4");
		
		List<Funcionario> lista = funcionarioDao.listaComCursorDinamico(f);
		for (Funcionario funcionario : lista) {
			System.out.println("Id: " + funcionario.getId() + ": " + funcionario.getNome());
		}
	}
}
