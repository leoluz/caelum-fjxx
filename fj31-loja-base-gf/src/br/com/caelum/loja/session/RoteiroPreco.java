package br.com.caelum.loja.session;

import java.util.List;

import br.com.caelum.loja.entity.Roteiro;

public interface RoteiroPreco {

	public long calcular(Roteiro roteiro);
	public List<Roteiro> buscaRoteiros(String descricao);
	public String getNome(String nome);
}
