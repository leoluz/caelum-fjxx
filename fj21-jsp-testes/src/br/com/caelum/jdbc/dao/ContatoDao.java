package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.modelo.Contato;

public class ContatoDao {

	private Connection connection;
	
	public void grava(Contato contato) throws SQLException {
		this.connection = ConnectionFactory.getConnection();
		String dml = "insert into contatos (id_contato, ds_contato, email, endereco) values (?, ?, ?, ?)";
		PreparedStatement statement = this.connection.prepareStatement(dml);
		statement.setInt(1, contato.getId());
		statement.setString(2, contato.getDescricao());
		statement.setString(3, contato.getEmail());
		statement.setString(4, contato.getEndereco());
		statement.execute();
		statement.close();
		connection.close();
	}
	public List<Contato> getLista() throws SQLException {
		this.connection = ConnectionFactory.getConnection();
		String sql = "select * from contatos";
		PreparedStatement statement = this.connection.prepareStatement(sql);
		ResultSet resultSet = statement.executeQuery();
		
		List<Contato> contatos = new ArrayList<Contato>();
		while (resultSet.next()) {
			Contato contato = new Contato();
			contato.setId(resultSet.getInt("id_contato"));
			contato.setDescricao(resultSet.getString("ds_contato"));
			contato.setEmail(resultSet.getString("email"));
			contato.setEndereco(resultSet.getString("endereco"));
			
			contatos.add(contato);
		}
		resultSet.close();
		statement.close();
		connection.close();
		return contatos;
	}
	public void fechaConexao() throws SQLException {
		this.connection.close();
	}
}
