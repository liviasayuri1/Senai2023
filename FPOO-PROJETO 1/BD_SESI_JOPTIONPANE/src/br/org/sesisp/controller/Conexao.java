package br.org.sesisp.controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	//conectando com o BD
	private static final String USERNAME = "root";
	private static final String SENHA = "";
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/sesi";
	
	public static Connection criandoConexao() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexao = (Connection) DriverManager.getConnection(DATABASE_URL, USERNAME, SENHA);
		return conexao;
	}	
	public static void main (String[] args) throws Exception {
		Connection con = criandoConexao();
		if (con != null) {
			System.out.println("Conectado!");
		}
		con.close();
	}
}
