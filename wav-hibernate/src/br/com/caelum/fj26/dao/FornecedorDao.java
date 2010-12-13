package br.com.caelum.fj26.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.fj26.domain.Fornecedor;

public class FornecedorDao {

	private Session session;
	private Dao<Fornecedor> dao;

	public FornecedorDao(Session session) {
		this.session = session;
		this.dao = new Dao<Fornecedor>(session, Fornecedor.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<Fornecedor> buscaPeloNome(String nome) {
		Criteria criteria = this.session.createCriteria(Fornecedor.class);
		criteria.add(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE));
		criteria.addOrder(Order.asc("nome"));
		return criteria.list();
	}
	@SuppressWarnings("unchecked")
	public List<Fornecedor> buscaIdsGrandesPorNome(Long idGrande, String nome) {
		Criteria criteria = this.session.createCriteria(Fornecedor.class);
		criteria.add(Restrictions.gt("id", idGrande));
		criteria.add(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE));
		return criteria.list();
	}
	@SuppressWarnings("unchecked")
	public List<Fornecedor> buscaIdsPequenosOuNome(String nome, Long idGrande) {
		
		Criteria criteria = this.session.createCriteria(Fornecedor.class);
		Criterion c1 = Restrictions.lt("id", idGrande);
		Criterion c2 = Restrictions.ilike("nome", nome, MatchMode.ANYWHERE);
		Criterion c3 = Restrictions.or(c1, c2);
		criteria.add(c3);
		return criteria.list();
	}
}
