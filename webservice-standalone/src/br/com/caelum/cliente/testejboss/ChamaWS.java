package br.com.caelum.cliente.testejboss;

import java.util.List;

public class ChamaWS {

	public static void main(String[] args) {
		ConsultaDeLivrosBean consulta = new ConsultaDeLivrosBeanService().getConsultaDeLivrosBeanPort();
		List<Livro> livros = consulta.buscaLivro("com");
		
		for (Livro l : livros) {
			System.out.println(l.getId() + ": " + l.getNome());
			for (Autor a : l.getAutores()) {
				System.out.println("---Autor: " + a.getNome());
			}
		}
	}
}
