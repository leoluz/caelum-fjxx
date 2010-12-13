package br.com.caelum.fj26.util.test;

import org.hibernate.stat.Statistics;

import br.com.caelum.fj26.dao.test.TestaPesquisaCriteria;
import br.com.caelum.fj26.util.HibernateUtil;

public class TestaEstatisticas {

	public static void main(String[] args) {
		Statistics stat = HibernateUtil.getStats();
		stat.setStatisticsEnabled(true);
		
		String[] args1 = null;
		TestaPesquisaCriteria.main(args1);

		stat.logSummary();
		
		System.out.println("getQueryCacheHitCount: " +	 stat.getQueryCacheHitCount());
		
	}
}
