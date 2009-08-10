package domain.banco;

public class TributavelTest {

	public static void main(String[] args) throws ValorInvalidoException {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(-1000);
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
	}
}
