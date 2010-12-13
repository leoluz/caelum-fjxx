package br.com.caelum.jdbc.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;

public class ConnectionTest {
	
	private static Connection connection;

	public static void main(String[] args) throws SQLException {
		connection = ConnectionFactory.getConnection();
		insereContatoTest();
		connection.close();
	}
	
	private static void insereContatoTest() throws SQLException {
		String dml = "insert into contatos (id_contato, ds_contato, email, endereco) values (?, ?, ?, ?)";
		PreparedStatement statement = connection.prepareStatement(dml);
		statement.setInt(1, 1);
		statement.setString(2, "Caelum");
		statement.setString(3, "caelum@caelum.com.br");
		statement.setString(4, "rua vergueiro");
		statement.execute();
		statement.close();
	}
}
