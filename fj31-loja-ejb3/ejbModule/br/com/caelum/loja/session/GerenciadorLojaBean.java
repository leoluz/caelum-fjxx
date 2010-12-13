package br.com.caelum.loja.session;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.annotation.security.SecurityDomain;

import br.com.caelum.loja.entity.Autor;
import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.interceptors.AuditoriaInterceptor;

@Stateless
@Remote(GerenciadorLoja.class)
@Interceptors(AuditoriaInterceptor.class)
@SecurityDomain("livraria")
public class GerenciadorLojaBean implements GerenciadorLoja {
	
	@PersistenceContext
	private EntityManager em;

	private Map<String, Livro> repositorio;
	
	public GerenciadorLojaBean() {
		this.repositorio = new HashMap<String, Livro>();
		
		Livro l1 = new Livro();
		l1.setNome("Pais e Filhos");
		l1.setPreco(100.0);
		
		Livro l2 = new Livro();
		l2.setNome("Noites brancas");
		l2.setPreco(200.0);

		this.repositorio.put("1111", l1);
		this.repositorio.put("2222", l2);
	}

	@Override
	public Livro procura(String isbn) {
		return this.repositorio.get(isbn);
	}

	@Override
	public void salva(Livro livro) {
		System.out.println("Livro salvo! ID: " + livro.getId());
		this.em.merge(livro);
//		throw new SalvaLivroException();
		//		this.em.persist(livro);
	}
	
	public Livro busca(Long id) {
		System.out.println("buscando livro... ID: " + id);
		return this.em.find(Livro.class, id);
	}
	@Override
	public Autor salva(Autor autor) {
		
		this.em.persist(autor);
		System.out.println(autor.getId());
		return autor;
	}
	@Override
	public Livro procura(Long id) {
		return this.em.find(Livro.class, id);
	}

	@Override
	@RolesAllowed({"admin"})
	public List<Livro> listaLivros() {
		return em.createQuery("select livro from Livro as livro").getResultList();
	}
}
