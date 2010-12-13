package br.com.caelum.fj26.dao.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.fj26.dao.Dao;
import br.com.caelum.fj26.domain.ContaPagar;
import br.com.caelum.fj26.domain.Fornecedor;
import br.com.caelum.fj26.util.HibernateUtil;

public class TestaInsere {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		
		Dao<Fornecedor> fornecDao = new Dao<Fornecedor>(session, Fornecedor.class);
		Dao<ContaPagar> contaPagarDao = new Dao<ContaPagar>(session, ContaPagar.class);
		
		Fornecedor f = new Fornecedor();
		f.setId(5L);
		f.setNome("Kalunga");
		
		ContaPagar cp = new ContaPagar();
		cp.setValor(100.0);
		cp.setDescricao("produtos do limpeza");
		
		cp.setFornecedor(f);
		f.getContas().add(cp);
		
		Transaction t = session.beginTransaction();
		fornecDao.update(f);
		contaPagarDao.save(cp);
		t.commit();
	}
}
