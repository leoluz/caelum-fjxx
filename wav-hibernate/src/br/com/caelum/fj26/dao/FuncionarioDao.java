package br.com.caelum.fj26.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;

import br.com.caelum.fj26.domain.Funcionario;

public class FuncionarioDao {

	private Dao<Funcionario> dao;
	private Session session;

	public FuncionarioDao(Session session) {
		this.session = session;
		this.dao = new Dao<Funcionario>(session, Funcionario.class);
	}
	
	public List<Funcionario> listaComCursorDinamico(Funcionario f) {
		Example e = Example.create(f).ignoreCase().enableLike(MatchMode.ANYWHERE);
		return session.createCriteria(Funcionario.class).add(e).list();
	}
}
