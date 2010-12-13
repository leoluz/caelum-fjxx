package br.com.caelum.fj26.util.test;

import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.fj26.domain.Funcionario;

public class TesteStatelessSession {

	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		StatelessSession s = sf.openStatelessSession();
		
		Funcionario f1 = (Funcionario) s.get(Funcionario.class, 2L);
		System.out.println("Funcionario recuperado");
		Funcionario f2 = (Funcionario) s.get(Funcionario.class, 2L);
	}
}
