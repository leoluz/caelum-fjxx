package br.com.caelum.loja.session;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;

@Stateless
@Remote(CotadorDeMoeda.class)
public class CotadorDeMoedaBean implements CotadorDeMoeda {

	private double fatorDeCotacao = 1.63;

	@Resource
	private TimerService timerService;

	@PostConstruct
	public void inicializa() {
		timerService.createTimer(3000L, "timeout");
	}

	@Override
	public double fazCotacao(String moedaOrigem, String moedaDestino,
			double quantia) {
		
		if ("dollar".equals(moedaOrigem) && "real".equals(moedaDestino)) {
			return this.fatorDeCotacao * quantia;
		}
		return 0;
	}

	@Timeout
	public void atualizaFatorDeConversao(Timer timer) {
		this.fatorDeCotacao += (new Random().nextDouble() - 0.5)/100;
		System.out.printf("Atualizando o fator de cotação para: %.3f", this.fatorDeCotacao);
	}
}
