package domain.banco;

public class ContaCorrente extends Conta {
	
	@Override
	void atualiza(double taxa) {
		super.atualiza(taxa * 2);
	}
	@Override
	void deposita(double valor) {
		this.setSaldo(this.getSaldo() + valor - .10);
	}

}
