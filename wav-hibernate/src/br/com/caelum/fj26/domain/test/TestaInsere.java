package br.com.caelum.fj26.domain.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.fj26.domain.Funcionario;

public class TestaInsere {

	private static AnnotationConfiguration config;
	
	public static void main(String[] args) {
		config = new AnnotationConfiguration();
		config.configure();
		
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		insereFuncionario(session);
		session.close();
		sf.close();
	}
	public static void insereFuncionario(Session session) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("zezinho da silva");
		funcionario.setEmail("lele@yahoo.com" );
		funcionario.setUsuario("lessa");
		funcionario.setSenha("abcd");
		
		Transaction tx = session.beginTransaction();
		session.save(funcionario);
		tx.commit();
	}
}
