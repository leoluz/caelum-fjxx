package domain.banco;

public class ContaTest {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc.deposita(1000);
		cp.deposita(1000);
		
//		cc.atualiza(.1);
//		cp.atualiza(.1);
//		System.out.println(cc.getSaldo());
//		System.out.println(cp.getSaldo());
		
		AtualizadorDeContas adc = new AtualizadorDeContas(.1);
		adc.roda(cc);
		adc.roda(cp);
		System.out.println("Saldo total: " + adc.getSaldoTotal());
	}
}
