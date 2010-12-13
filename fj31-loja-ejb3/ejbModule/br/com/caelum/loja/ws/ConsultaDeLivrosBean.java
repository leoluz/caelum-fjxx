package br.com.caelum.loja.ws;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.caelum.loja.entity.Livro;

@Stateless
@WebService
@Remote(ConsultaDeLivros.class)
public class ConsultaDeLivrosBean implements ConsultaDeLivros {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@WebMethod
	public List<Livro> buscaLivro(@WebParam(name="nome")String nome) {

		Query query = em.createQuery("from Livro as l where l.nome like :nome");
		query.setParameter("nome", "%"+nome+"%");
		return query.getResultList();
	}
}
