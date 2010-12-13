package br.com.caelum.fj26.domain.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.fj26.domain.ContaPagar;

public class TestaBuscaContaPagar {

	public static void main(String[] args) {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();

		ContaPagar cp = (ContaPagar) session.load(ContaPagar.class, 2L);
		System.out.println(cp.getFornecedor().getDescricao());
	}
}
