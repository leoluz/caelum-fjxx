package domain.banco;

public class ValorInvalidoException extends Exception{

	private static final long serialVersionUID = -1198855724296027846L;

	public ValorInvalidoException(double valor) {
		super("O valor " + valor + " não é permitido!");
	}

}
