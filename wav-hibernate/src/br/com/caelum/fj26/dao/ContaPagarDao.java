package br.com.caelum.fj26.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.ResultTransformer;
import org.hibernate.transform.Transformers;

import br.com.caelum.fj26.domain.ContaPagar;

public class ContaPagarDao {

	private Session session;

	public ContaPagarDao(Session session) {
		this.session = session;
	}
	public int countContaPagar() {
		Criteria criteria = this.session.createCriteria(ContaPagar.class);
		criteria.add(Restrictions.gt("valor", 1.0));
		criteria.setProjection(Projections.rowCount());
		return (Integer) criteria.uniqueResult();
	}
	public double avgValor() {
		Criteria criteria = this.session.createCriteria(ContaPagar.class);
		criteria.setProjection(Projections.avg("valor"));
		return (Double) criteria.uniqueResult();
	}
	public double sumValor() {
		Criteria criteria = this.session.createCriteria(ContaPagar.class);
		criteria.setProjection(Projections.sum("valor"));
		return (Double) criteria.uniqueResult();
	}
	@SuppressWarnings("unchecked")
	public List<ContaPagar> buscaPeloNomeFornecedor(String nome) {
		return this.session.createCriteria(ContaPagar.class)
			.createCriteria("fornecedor")
				.add(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE))
				.addOrder(Order.desc("nome"))
			.list();
	}
	@SuppressWarnings("unchecked")
	public List<ContaPagar> buscaPeloNomeDoFornecedorComAlias(String nome) {
		return this.session.createCriteria(ContaPagar.class)
			.createAlias("fornecedor", "f")
			.add(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE))
			.addOrder(Order.desc("f.nome"))
			.list();
	}
	@SuppressWarnings("unchecked")
	public List<ContaPagar> buscaPeloNomeDoFornecedorComHQL(String nome) {
		String hql = "from ContaPagar cp where cp.fornecedor.nome like :busca";
		Query q = this.session.createQuery(hql);
		q.setParameter("busca", "%" + nome + "%");
		return q.list();
	}
	public Long countCp() {
		String hql = "select count(*) from ContaPagar cp";
		Query q = this.session.createQuery(hql);
		return (Long) q.uniqueResult();
	}
	public List<Object[]> listaValorPorFornecedorComHQLTosco() {
		String hql = "select cp.fornecedor, cp.pago, sum(cp.valor) as soma " +
						  "from ContaPagar cp " +
						  "group by cp.fornecedor, cp.pago";
		Query q = this.session.createQuery(hql	);
		return q.list();
	}
	public List<ValorPorFornecedor> listaValorPorFornecedorComHQLShow() {
		String hql = "select new br.com.caelum.fj26.dao.ValorPorFornecedor("+
						  "cp.fornecedor, cp.pago, sum(cp.valor)) " +
						  "from ContaPagar cp " +
						  "group by cp.fornecedor, cp.pago";
		Query q = this.session.createQuery(hql);
		return q.list();
	}
	public List<ContaPagar> listaContasPagarComSqlNativo() {
		String sql = "select * from fin_contapagar";
		SQLQuery q = this.session.createSQLQuery(sql);
		q.addEntity(ContaPagar.class);
//		q.setMaxResults(3);
		return q.list();
	}
}
