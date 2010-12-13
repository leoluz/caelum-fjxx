package br.com.caelum.cliente.testeisrael;

public class RunW {

	public static void main(String[] args) {
		CalculadorDeParcela calculadorDeParcela = new CalculadorDeParcelaService().getCalculadorDeParcelaPort();
		System.out.println(calculadorDeParcela.calculaParcela(200, 2));
	}
}
