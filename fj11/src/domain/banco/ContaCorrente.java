package domain.banco;

public class ContaCorrente extends Conta implements Tributavel, Comparable<ContaCorrente>{
	
	@Override
	void atualiza(double taxa) {
		super.atualiza(taxa * 2);
	}
	@Override
	void deposita(double valor) throws ValorInvalidoException{
		super.deposita(this.getSaldo() + valor - .10);
	}
	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01; 
	}
	@Override
	public int compareTo(ContaCorrente cc) {

		if (this.getSaldo() < cc.getSaldo()) {
			return -1;
		}
		else if (this.getSaldo() > cc.getSaldo()) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
