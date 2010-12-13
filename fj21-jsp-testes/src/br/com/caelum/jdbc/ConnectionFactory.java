package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Conectando ao banco de dados!");
			return DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.115:1521:XE", "caelum", "caelum");
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getMessage());
		}
	}
}
