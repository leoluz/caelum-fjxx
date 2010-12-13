package br.com.caelum.fj26.util;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

	private static Logger logger = Logger.getLogger(HibernateUtil.class);
	private static SessionFactory sessionFactory;
	
	static {
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	}
	
	public static Session openSession() {
		return sessionFactory.openSession();
	}
}
