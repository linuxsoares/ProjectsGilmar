package Controller;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connection.ConnectionFactory;
import SQL.ScriptsSQL;

public class DadosBD{
	
	private ConnectionFactory conn;
	private java.sql.Statement stat;
	private ResultSet rs;
	private Connection conexao;
	private String[] lm;
	private int count = 0;
	
	private ScriptsSQL sql;
	
	public String[] executaConsulta() throws ClassNotFoundException, SQLException{
		sql = new ScriptsSQL();
		conn = new ConnectionFactory();
		conexao = ConnectionFactory.createConnection(); 
		lm = new String[1000];
		//sql.getScript()+i+sql.getScriptp2()+i+sql.getScriptp3()
		stat = conexao.createStatement();
		rs = stat.executeQuery(sql.getScript()+1+sql.getScriptp2()+1+sql.getScriptp3());
		while(rs.next()){
			lm[count] = rs.getString("lm_descshort");
			count += 1;
		}
		conexao.close();
		return lm;
	}
}
