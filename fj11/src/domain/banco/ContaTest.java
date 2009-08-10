package domain.banco;

public class ContaTest {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		try {
			cc.deposita(1000);
			cp.deposita(1000);
			cc.saca(1500);
		}
		catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
		AtualizadorDeContas adc = new AtualizadorDeContas(.1);
		adc.roda(cc);
		adc.roda(cp);
		System.out.println("Saldo total: " + adc.getSaldoTotal());
	}
}
