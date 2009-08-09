package domain.banco;

public class ContaPoupanca extends Conta {

	@Override
	void atualiza(double taxa) {
		super.atualiza(taxa * 3);
	}
}
