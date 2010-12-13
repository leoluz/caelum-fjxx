package br.com.caelum.fj26.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;

public class HibernateSessionFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain fc) throws IOException, ServletException {
		
		Session session = HibernateUtil.openSession();
		try {
			session.beginTransaction();
			((HttpServletRequest)req).setAttribute("sessao", session);
			fc.doFilter(req, res);
			session.getTransaction().commit();
		} catch (Exception e) {
			throw new ServletException(e);
		} finally {
			session.close();
		}
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	

}
