package br.com.itinerario.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.itinerario.connection.ConnectionFactory;
import br.com.itinerario.sql.Sql;

public class OnibusDAO {
	
	private Connection connection;
	private Statement statement;
	
	public void insertOnibus() {
		Sql sql = new Sql();
		
		connection = new ConnectionFactory().getConnection(); 
		
		try {
			statement = connection.createStatement();
			statement.executeUpdate(sql.insereOnibus);
		    System.out.println("Conex‹o aberta!"); 
		    connection.close();  
		    System.out.println("Conex‹o fechada e Item Inserido!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
