package domain.banco;

public class GerenciadorDeImpostoDeRendaTest {

	public static void main(String[] args) throws ValorInvalidoException{
		
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		gerenciador.adiciona(cc);
		
		System.out.printf("Total de imposto de renda: %.2f", gerenciador.getTotal());
	}
}
