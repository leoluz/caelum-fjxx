package br.com.caelum.fj26.domain.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.fj26.domain.Funcionario;

public class TestaBusca {

	public static void main(String[] args) {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();
		
		SessionFactory sf = configuration.buildSessionFactory();
		Session s = sf.openSession();
		
		Funcionario f = (Funcionario) s.load(Funcionario.class, 1L);
		
		System.out.println("Nome: "+ f.getNome());
		System.out.println("Senha: "+ f.getSenha());
		System.out.println(f.getClass().getName());
	}
}
