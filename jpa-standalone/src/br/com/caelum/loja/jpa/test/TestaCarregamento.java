package br.com.caelum.loja.jpa.test;

import javax.persistence.EntityManager;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.jpa.JPAUtil;

public class TestaCarregamento {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().createEntityManager();
		Livro l = em.getReference(Livro.class, 1L);
		System.out.println("Select feito!");
		
		System.out.println(l.getNome());
		System.out.println(l.getPreco());
		
	}
}
