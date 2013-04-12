package br.com.itinerario.main;

import java.sql.SQLException;

import br.com.itinerario.dao.OnibusDAO;

public class Main {
	
	public static void main(String args[]) throws SQLException {
		OnibusDAO onibusDao = new OnibusDAO();
		onibusDao.insertOnibus();
	}

}
