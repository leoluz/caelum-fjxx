package br.com.caelum.fj26.domain.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.fj26.domain.Funcionario;

public class TesteDelete {

	public static void main(String[] args) {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Funcionario f = (Funcionario) session.load(Funcionario.class, 3L);
		
		Transaction tx = session.beginTransaction();
		session.delete(f);
		tx.commit();
	}
}
