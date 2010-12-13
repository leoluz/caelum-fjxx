package br.com.caelum.fj26.domain.test;

import org.hibernate.Session;

import br.com.caelum.fj26.domain.Funcionario;
import br.com.caelum.fj26.util.HibernateUtil;

public class TesteCacheSegundoNivel {

	public static void main(String[] args) {
		
		Session s1 = HibernateUtil.getSession();
		Session s2 = HibernateUtil.getSession();
		
		Funcionario f1 = (Funcionario) s1.load(Funcionario.class, 2L);
		System.out.println("Primeiro funcionario lido: " + f1.getNome());
		s1.close();
		
		Funcionario f2 = (Funcionario) s2.load(Funcionario.class, 2L);
		System.out.println("Lendo denovo: " + f2.getNome());
		s2.close();
		
	}
}
