package br.com.caelum.loja.session;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Remote;
import javax.ejb.Remove;
import javax.ejb.Stateful;

import org.jboss.annotation.ejb.cache.simple.CacheConfig;

import br.com.caelum.loja.entity.Livro;

@Stateful
@Remote(Carrinho.class)
@CacheConfig(maxSize=50, idleTimeoutSeconds=120, removalTimeoutSeconds=360)
public class CarrinhoBean implements Carrinho {

	@EJB
	private Mensageiro mensageiro; 

	private List<Livro> livros = new ArrayList<Livro>();
	private double total = 0.0;
	
	public void addLivro(Livro livro) {
		this.livros.add(livro);
		this.total += livro.getPreco();

		// apenas para ver alguma saída no "JBoss"
		System.out
				.printf("Livro %s adicionado com sucesso!%n", livro.getNome());
	}
	
	@PostActivate
	public void ativando() {
		System.out.println("Ativando " + this);
	}
	@PrePassivate
	public void passivando() {
		System.out.println("Passivando " + this);
	}

	public List<Livro> getLivros() {
		return this.livros;
	}

	public double getTotal() {
		return this.total;
	}

	@Remove
	public void finalizaCompra() {
		for (Livro livro : this.livros) {
			System.out.println("Comprando livro: " + livro);
		}
		this.mensageiro.enviaMensagem("MSG: " + this.livros.toString());
	}

	@PreDestroy
	public void destroy(){
		System.out.println("Remove uma instancia da classe CarrinhoBean do Container");
	}
}