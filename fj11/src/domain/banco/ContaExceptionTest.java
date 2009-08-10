package domain.banco;

public class ContaExceptionTest {

	public static void main(String[] args) {
		Conta cp = new ContaPoupanca();
		Conta cc = new ContaCorrente();

		try {
			cp.deposita(-100);
			cc.deposita(-1);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}
}
