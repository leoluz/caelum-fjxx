package br.com.caelum.fj26.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;

public class Dao<T> {
	
	private static Logger logger = Logger.getLogger(Dao.class);
	private Class<T> persistentClass;
	private Session session;
	
	public Dao(Session session, Class<T> persistenClass) {
		this.session = session;
		this.persistentClass = persistenClass;
	}
	@SuppressWarnings("unchecked")
	public T load(Long id) {
		logger.info("lendo " + persistentClass + " com id " + id);
		return (T) session.load(persistentClass, id);
	}
	public void save(T t) {
		logger.info("Deletando " + t);
		session.save(t);
	}
	public void delete(T t) {
		logger.info("Listando todos");
		session.delete(t);
	}
	@SuppressWarnings("unchecked")
	public List<T> list() {
		logger.info("Listando todos");
		return session.createCriteria(persistentClass).list();
	}
	public void merge(T t) {
		logger.info("Salvando ou atualizando " + t);
		session.merge(t);
	}
}
