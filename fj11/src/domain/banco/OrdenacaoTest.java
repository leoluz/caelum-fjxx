package domain.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoTest {

	public static void main(String[] args) {
		
		ContaPoupanca c1 = new ContaPoupanca();
		ContaPoupanca c2 = new ContaPoupanca();
		ContaPoupanca c3 = new ContaPoupanca();
		
		c1.setNumero(1);
		c2.setNumero(2);
		c3.setNumero(3);
		
		try {
			c1.deposita(1000);
			c2.deposita(10000);
			c3.deposita(1);

		} catch (ValorInvalidoException e) {
			e.printStackTrace();
		}
		
		List<ContaPoupanca> cps = new ArrayList<ContaPoupanca>();
		
		cps.add(c1);
		cps.add(c2);
		cps.add(c3);
		
		Collections.sort(cps);
		
		for (ContaPoupanca cp : cps) {
			System.out.println("Conta: " + cp);
		}

	}
}
