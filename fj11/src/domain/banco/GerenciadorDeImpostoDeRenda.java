package domain.banco;

public class GerenciadorDeImpostoDeRenda {

	private double total;

	public double getTotal() {
		return total;
	}
	public void adiciona(Tributavel t) {
		total += t.calculaTributos();
	}
}
