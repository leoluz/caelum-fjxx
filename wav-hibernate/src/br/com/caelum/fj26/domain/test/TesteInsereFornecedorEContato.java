package br.com.caelum.fj26.domain.test;

import org.hibernate.Session;

import br.com.caelum.fj26.dao.Dao;
import br.com.caelum.fj26.domain.Fornecedor;
import br.com.caelum.fj26.domain.Funcionario;
import br.com.caelum.fj26.util.HibernateUtil;

public class TesteInsereFornecedorEContato {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		Dao<Funcionario> funcionarioDao = new Dao<Funcionario>(session, Funcionario.class);
		Dao<Fornecedor> fornecDao = new Dao<Fornecedor>(session, Fornecedor.class);
		
		Funcionario f = new Funcionario();
		f.setNome("Zezinho Lanches");
		
		Fornecedor fornec = new Fornecedor();
		fornec.setNome("Subway");
		
		f.getFornecedores().add(fornec);
		fornec.getContatos().add(f);
		
		session.beginTransaction();
		funcionarioDao.save(f);
		fornecDao.save(fornec);
		session.getTransaction().commit();
		
		System.out.println("Id do zezinho: " + f.getId());
		System.out.println("Id do Subway: " + fornec.getId());
	}
}
