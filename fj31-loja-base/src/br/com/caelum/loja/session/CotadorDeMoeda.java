package br.com.caelum.loja.session;

public interface CotadorDeMoeda {

	double fazCotacao(String moedaOrigem, String moedaDestino, double quantia);
}
