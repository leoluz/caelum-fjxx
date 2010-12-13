package br.com.caelum.fj26.domain.test;

import java.util.List;

import org.hibernate.Session;

import br.com.caelum.fj26.dao.Dao;
import br.com.caelum.fj26.domain.ContaPagar;
import br.com.caelum.fj26.domain.Fornecedor;
import br.com.caelum.fj26.util.HibernateUtil;

public class TestaBuscaFornecedor {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		Dao<Fornecedor> fornecDao = new Dao<Fornecedor>(session, Fornecedor.class);
		Fornecedor fornecedor = fornecDao.load(5L);
		List<ContaPagar> contas = fornecedor.getContas();
		for (ContaPagar cp : contas) {
			System.out.println(cp.getId() + ": " + cp.getDescricao());
		}
	}
}
