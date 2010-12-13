package br.com.caelum.fj26.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;

public class Dao<T> {
	
	private static Logger logger = Logger.getLogger(Dao.class);
	private Class<T> persistentClass;
	private Session session;
	
	public Dao(Session session, Class<T> persistentClass) {
		this.session = session;
		this.persistentClass = persistentClass;
	}
	
	public T load(Long id) {
		logger.info("Lendo " + persistentClass + " com id " + id);
		return (T) session.load(persistentClass, id);
	}
	public void save(T t) {
		logger.info("Salvando " + t);
		session.save(t);
	}
	public void update(T t) {
		logger.info("Atualizando " + t);
		session.update(t);
	}
	public void delete(T t) {
		logger.info("Deletando " + t);
		session.delete(t);
	}
}
