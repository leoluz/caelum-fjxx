package br.com.caelum.loja.session;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.caelum.loja.entity.Roteiro;

@Stateless
@WebService
@Remote(RoteiroPreco.class)
public class PrecoRoteiroBean implements RoteiroPreco {

	@WebMethod
	public long calcular(Roteiro roteiro) {
		roteiro.setPreco(roteiro.getPreco() + 13);
		return roteiro.getPreco();
	}
	
	@WebMethod
	public List<Roteiro> buscaRoteiros(String descricao) {
		List<Roteiro> roteiros = new ArrayList<Roteiro>();
		
		Roteiro r1 = new Roteiro();
		r1.setDescricao("Natal");
		r1.setPreco(999L);
		
		roteiros.add(r1);
		
		Roteiro r2 = new Roteiro();
		r2.setDescricao("Porto de Galinhas");
		r2.setPreco(850L);
		
		roteiros.add(r2);
		
		return roteiros;
	}

	@Override
	@WebMethod
	public String getNome(String nome) {
		return "Meu nome é: " + nome;
	}
	
	
}
