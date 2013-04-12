package Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static final String JDBC_DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL_CONNECTION = "jdbc:oracle:thin:@10.100.0.20:1521:cmt";  
	private static final String DB_USER = "gsoares";  
	private static final String DB_PASS = "mesquitag";  
	
	public static java.sql.Connection createConnection()throws ClassNotFoundException, SQLException{
		Class.forName(JDBC_DRIVER);
		return DriverManager.getConnection(URL_CONNECTION, DB_USER, DB_PASS);
	}
}
