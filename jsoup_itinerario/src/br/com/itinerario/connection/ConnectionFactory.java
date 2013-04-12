package br.com.itinerario.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/itinerario","root","");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);  
		}  
		
	}

}
