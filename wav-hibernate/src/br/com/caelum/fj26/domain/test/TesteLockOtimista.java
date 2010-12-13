package br.com.caelum.fj26.domain.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.fj26.domain.Funcionario;

public class TesteLockOtimista {

	public static void main(String[] args) {

		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session s1 = sf.openSession();
		Session s2 = sf.openSession();
		
		Funcionario f1 = (Funcionario) s1.get(Funcionario.class, 1L);
		Funcionario f2 = (Funcionario) s2.get(Funcionario.class, 1L);
		
		Transaction tx = s1.beginTransaction();
		f1.setSenha("leo1");
		s1.saveOrUpdate(f1);
		tx.commit();
		
		tx = s2.beginTransaction();
		f2.setUsuario("lla2");
		s2.saveOrUpdate(f2);
		tx.commit();
	}
}
