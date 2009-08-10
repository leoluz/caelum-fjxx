package domain.banco;

abstract class Conta {
	
	private double saldo;
	private int numero;
	
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}

	void deposita(double valor) throws ValorInvalidoException {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		}
		else {
			this.saldo += valor;
		}
	}
	void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		}
		else {
			throw new SaldoInsuficienteException("teste");
		}
	}
	void atualiza(double taxaSelic) {
		this.saldo += this.saldo * taxaSelic;
	}
	
	public String toString() {
		return Integer.toString(this.getNumero());
	}
}
