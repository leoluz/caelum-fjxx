package br.com.caelum.fj26.domain.test;

import org.hibernate.Session;

import br.com.caelum.fj26.domain.ContaPagar;
import br.com.caelum.fj26.domain.Fornecedor;
import br.com.caelum.fj26.util.HibernateUtil;

public class TesteBusca {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
//		ContaPagar cp = (ContaPagar) session.get(ContaPagar.class, 5L);
//		System.out.println(cp.getValor());
//		System.out.println(cp.getFornecedor().getNome());
		
		Fornecedor f = (Fornecedor) session.get(Fornecedor.class, 5L);
		System.out.println(f.getNome());
		System.out.println(f.getContas().size());
	}
}
