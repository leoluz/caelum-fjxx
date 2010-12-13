package br.com.caelum.fj26.domain.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.fj26.domain.FuncionarioChaveComposta;
import br.com.caelum.fj26.domain.FuncionarioPK;
import br.com.caelum.fj26.util.HibernateUtil;

public class TesteChaveComposta {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSession();

		FuncionarioPK pk = new FuncionarioPK();
		pk.setCpf(1L);
		pk.setRg(3L);

		FuncionarioChaveComposta f = new FuncionarioChaveComposta();
		f.setId(pk);
		f.setEmail("leo@yahoo.com");
		f.setNome("lele");
		f.setSenha("12345");
		
		Transaction tx = session.beginTransaction();
		session.save(f);
		tx.commit();
	}
}
