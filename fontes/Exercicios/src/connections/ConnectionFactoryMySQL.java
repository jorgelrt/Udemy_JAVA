package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactoryMySQL {
	private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/dbmercadinho";
	private final String USER = "root";
	private final String PASS = "";
	
	//obter as conexões
	public Connection getConnection() {
		
		try {
			Class.forName(DRIVER); //carrega a classe do DRIVER
			return DriverManager.getConnection(URL, USER, PASS);
		} catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException("Erro de conexão");
		}
	}
	
	//metodos fechar conexão - sobrecarga
	public static void closeConnection(Connection con) {
		
			try {
				if(con != null) {
					con.close();
				}
			} catch (SQLException e) {
				Logger.getLogger(ConnectionFactoryMySQL.class.getName()).log(Level.SEVERE, null, e);
			}
		}
	
	public static void closeConnection(Connection con, PreparedStatement stmt) {
		
		closeConnection(con);
		
		try {
			
			if(stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			Logger.getLogger(ConnectionFactoryMySQL.class.getName()).log(Level.SEVERE, null, e);
		}
	}
	
public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
		
		closeConnection(con,  stmt);
		
		try {
			
			if(rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			Logger.getLogger(ConnectionFactoryMySQL.class.getName()).log(Level.SEVERE, null, e);
		}
	}
	
	
	
	
}
