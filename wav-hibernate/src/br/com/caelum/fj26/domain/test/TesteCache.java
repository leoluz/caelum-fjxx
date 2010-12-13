package br.com.caelum.fj26.domain.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.fj26.domain.Funcionario;

public class TesteCache {

	public static void main(String[] args) {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		
		Funcionario f = (Funcionario) session.load(Funcionario.class, 2L);
		System.out.println(f.getNome());
		session.refresh(f);
		f = (Funcionario) session.load(Funcionario.class, 2L);
		System.out.println(f.getNome());
	}
}
