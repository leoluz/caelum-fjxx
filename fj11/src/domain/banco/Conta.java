package domain.banco;

abstract class Conta {
	
	private double saldo;
	
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return this.saldo;
	}
	void deposita(double valor) {
			this.saldo += valor;
	}
	void saca(double valor) {
		this.saldo -= valor;
	}
	void atualiza(double taxaSelic) {
		this.saldo += this.saldo * taxaSelic;
	}
}
