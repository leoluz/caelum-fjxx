package br.com.caelum.loja.jpa.test;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.loja.domain.Pessoa;
import br.com.caelum.loja.domain.PessoaFisica;
import br.com.caelum.loja.jpa.JPAUtil;

public class TestaCriacaoDeTabelas {

	public static void main(String[] args) {
		EntityManager manager = new JPAUtil().createEntityManager();

		PessoaFisica p = new PessoaFisica();
		
		p.setNome("Leonardo Luz");
		p.setCpf(123456789);
		
		List<PessoaFisica> pessoas = manager.createQuery("from Pessoa p where p.nome = :a")
							.setParameter("a", "Leonardo Luz")
							.getResultList();
		
		for (Pessoa pessoa : pessoas) {
			System.out.println("Pessoa: " + pessoa.getNome());
		}
//		manager.persist(p);
//		manager.getTransaction().begin();
//		manager.getTransaction().commit();
//		System.out.println(p.getId() + ": " + p.getNome());

	}
}
