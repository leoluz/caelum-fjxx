package br.com.caelum.fj26.dao.test;

import java.util.List;

import org.hibernate.Session;

import br.com.caelum.fj26.dao.ContaPagarDao;
import br.com.caelum.fj26.dao.FornecedorDao;
import br.com.caelum.fj26.dao.ValorPorFornecedor;
import br.com.caelum.fj26.domain.ContaPagar;
import br.com.caelum.fj26.domain.Fornecedor;
import br.com.caelum.fj26.util.HibernateUtil;

public class TestaPesquisaCriteria {

	private static Session session;
	private static FornecedorDao fornecedorDao;
	private static ContaPagarDao contaPagarDao;

	public static void main(String[] args) {
		session = HibernateUtil.getSession();
		contaPagarDao = new ContaPagarDao(session);
		fornecedorDao = new FornecedorDao(session);
		
		buscaPeloNomeTest();
		buscaIdsGrandesPorNomeTest();
		countContaPagarTest();
		countContaPagarHQLTest();
		sumContaPagarTest();
		buscaCpPeloNomeDoFornecedor();
		buscaCpPeloNomeDoFornecedorHQL();
		listaValorPorFornecedorComHQL();
		listaContasPagarComSqlNativoTest();
		
		session.close();
	}
	private static void listaContasPagarComSqlNativoTest() {
		List<ContaPagar> lista = contaPagarDao.listaContasPagarComSqlNativo();
		for (ContaPagar cp : lista) {
			System.out.println("Id: " + cp.getId() + " - descricao: " + cp.getDescricao());
		}
	}
	private static void listaValorPorFornecedorComHQL() {
		List<ValorPorFornecedor> lista = contaPagarDao.listaValorPorFornecedorComHQLShow();
		for (ValorPorFornecedor vpf : lista) {
			System.out.println("Nome fornecedor: " + vpf.getFornecedor().getNome());
		}
		
	}
	private static void countContaPagarHQLTest() {
		contaPagarDao = new ContaPagarDao(session);
		Long qtd = contaPagarDao.countCp();
		System.out.println("Total: " + qtd);
	}
	private static void buscaCpPeloNomeDoFornecedorHQL() {
		contaPagarDao = new ContaPagarDao(session);
		List<ContaPagar> lista = contaPagarDao.buscaPeloNomeDoFornecedorComHQL("marina");
		for (ContaPagar cp : lista) {
			System.out.println(cp.getId() + ": " + cp.getDescricao());
		}
	}
	private static void buscaCpPeloNomeDoFornecedor() {
		contaPagarDao = new ContaPagarDao(session);
		List<ContaPagar> lista = contaPagarDao.buscaPeloNomeFornecedor("marina");
		for (ContaPagar cp : lista) {
			System.out.println(cp.getId() + ": " + cp.getDescricao());
		}
	}
	private static void sumContaPagarTest() {
		contaPagarDao = new ContaPagarDao(session);
		System.out.println(contaPagarDao.sumValor());
	}
	private static void countContaPagarTest() {
		contaPagarDao = new ContaPagarDao(session);
		System.out.println(contaPagarDao.avgValor());
	}
	private static void buscaPeloNomeTest() {
		fornecedorDao = new FornecedorDao(session);
		List<Fornecedor> lista = fornecedorDao.buscaPeloNome("sa");
		for (Fornecedor f : lista) {
			System.out.println("fornecedor.nome: " + f.getNome());
		}
	}
	private static void buscaIdsGrandesPorNomeTest() {
		fornecedorDao = new FornecedorDao(session);
		List<Fornecedor> lista = fornecedorDao.buscaIdsGrandesPorNome(2L, "sa");
		for (Fornecedor f : lista) {
			System.out.println(f.getNome());
		}
	}
	
	
}
