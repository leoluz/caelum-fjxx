package br.com.caelum.fj26.domain.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.fj26.domain.Funcionario;

public class TesteUpdate {

	public static void main(String[] args) {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Funcionario f = (Funcionario) session.load(Funcionario.class, 1L);
		f.setSenha("arquitetura");
		Transaction tx = session.beginTransaction();
		session.update(f);
		tx.commit();
	}
}
