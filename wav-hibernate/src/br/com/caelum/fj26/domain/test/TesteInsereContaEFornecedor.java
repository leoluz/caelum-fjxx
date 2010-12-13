package br.com.caelum.fj26.domain.test;

import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.fj26.domain.ContaPagar;
import br.com.caelum.fj26.domain.Fornecedor;

public class TesteInsereContaEFornecedor {

	public static void main(String[] args) {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setDescricao("Parque da Consteira");
		fornecedor.setNome("Hotel SA");
		
		ContaPagar cp = new ContaPagar();
		cp.setData(new GregorianCalendar());
		cp.setFornecedor(fornecedor);
		cp.setDescricao("Apartamento Standard");
		cp.setPago(false);
		cp.setValor(800.0);
		
		Transaction tx = session.beginTransaction();
		session.save(fornecedor);
		session.save(cp);
		tx.commit();
	}
}
