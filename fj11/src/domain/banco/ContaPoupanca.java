package domain.banco;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{

	@Override
	void atualiza(double taxa) {
		super.atualiza(taxa * 3);
	}

	@Override
	public int compareTo(ContaPoupanca cp) {
		
		if (this.getSaldo() < cp.getSaldo()) {
			return -1;
		}
		else if (this.getSaldo() > cp.getSaldo()) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
