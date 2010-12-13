package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class AdicionaContato extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ContatoDao dao = new ContatoDao();
		Contato contato = new Contato();
		String descricao = request.getParameter("descricao");
		String endereco = request.getParameter("endereco");
		String email = request.getParameter("email");
		
		contato.setDescricao(descricao);
		contato.setEndereco(endereco);
		contato.setEmail(email);
		
		try {
			dao.grava(contato);
		} catch (SQLException e) {
			throw new ServletException(e);
		}
		
		PrintWriter writer = response.getWriter();
		writer.print("<html>");
		writer.print("<h1>Contatos adicionado com sucesso!");
		writer.print("</html>");
	}

}
