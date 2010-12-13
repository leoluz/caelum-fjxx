package br.com.caelum.loja.session;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Remote;
import javax.ejb.Remove;
import javax.ejb.Stateful;

import br.com.caelum.loja.entity.Livro;

@Stateful(name="Carrinho")
@Remote(Carrinho.class)
public class CarrinhoBean implements Carrinho {

	private List<Livro> livros = new ArrayList<Livro>();
	private double total = 0.0;

	public void addLivro(Livro livro) {
		System.out.println("Adicionando o livro " + livro.getNome());
		this.livros.add(livro);
		this.total += livro.getPreco();
	}

	@Remove
	public void finalizaCompra() {
		System.out.println("Finalizando a compra!");
		for(Livro livro : livros) {
			System.out.println("Livro comprado: " + livro);
		}
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Removendo uma instancia da classe CarrinhoBean do Container");
	}

	public List<Livro> getLivros() {
		return this.livros;
	}
	public double getTotal() {
		return this.total;
	}
	@PostActivate
	public void ativando() {
		System.out.println("Ativando " + this);
	}
	@PrePassivate
	public void passivando() {
		System.out.println("Passivando " + this);
	}
	@PostConstruct
	public void construindo() {
		Long time = System.currentTimeMillis();
		System.out.println("Construindo o EJB " + this);
		System.out.println("EJB construido em: " + time);
	}
}
