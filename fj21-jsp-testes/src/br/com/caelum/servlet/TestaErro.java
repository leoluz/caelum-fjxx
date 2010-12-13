package br.com.caelum.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestaErro extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			java.sql.DriverManager.getConnection("jdbc:teste:erro:ip", "user", "pass");
		} catch (SQLException e) {
			throw new ServletException(e);
		}
	}

}
