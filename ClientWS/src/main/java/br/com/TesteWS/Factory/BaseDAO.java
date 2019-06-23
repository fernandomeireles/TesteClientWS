package br.com.TesteWS.Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
	
	public Connection getConnection() {
		 try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/Experimentos","root","haha");
		 }         
		 catch(SQLException excecao) {
			throw new RuntimeException(excecao);
		 }
    }


}
