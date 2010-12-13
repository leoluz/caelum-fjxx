package br.com.caelum.cliente.programa;

import br.com.caelum.cliente.CalculadorDeParcela;
import br.com.caelum.cliente.CalculadorDeParcelaService;

public class Programa {

	public static void main(String[] args) {
		CalculadorDeParcela calculadorDeParcela = new CalculadorDeParcelaService().getCalculadorDeParcelaPort();
		System.out.println(calculadorDeParcela.calculaParcela(100, 2));
	}
}
