package br.com.caelum.fj26.dao.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.fj26.dao.Dao;
import br.com.caelum.fj26.domain.Funcionario;
import br.com.caelum.fj26.util.HibernateUtil;

public class TestaDao {
	
	private static Session session;
	private static Dao<Funcionario> dao;

	public static void main(String[] args) {
		session = HibernateUtil.getSession();
		dao = new Dao<Funcionario>(session, Funcionario.class);
		insereTest();
	}
	public static void insereTest() {
		Funcionario f = new Funcionario();
		f.setEmail("lele@uol.com.br");
		f.setNome("lele");
		f.setSenha("12345");
		f.setUsuario("lla01");
		
		Transaction tx = session.beginTransaction();
		dao.save(f);
		tx.commit();
	}
}
