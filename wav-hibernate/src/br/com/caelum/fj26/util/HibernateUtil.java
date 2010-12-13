package br.com.caelum.fj26.util;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.stat.Statistics;

public class HibernateUtil {

	private static SessionFactory factory;
	private static Logger logger = Logger.getLogger(HibernateUtil.class);
	
	static {
		Configuration cfg = new AnnotationConfiguration().configure();
		factory = cfg.buildSessionFactory();
	}
	
	public static Session getSession() {
		logger.info("Abrindo uma nova sessao!");
		return factory.openSession();
	}
	
	public static Statistics getStats() {
		return factory.getStatistics();
	}
}
