package domain.banco;

public class AtualizadorDeContas {
	private double saldoTotal;
	private double selic;
	
	AtualizadorDeContas(double selic) {
		this.selic = selic;
	}
	
	void roda (Conta c) {
		System.out.println("Saldo anterior: " + c.getSaldo());
		c.atualiza(this.selic);
		saldoTotal += c.getSaldo();
		System.out.println("Saldo final: " + c.getSaldo());
	}
	public double getSaldoTotal() {
		return saldoTotal;
	}
}
