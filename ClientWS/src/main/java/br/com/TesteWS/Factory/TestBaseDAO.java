package br.com.TesteWS.Factory;

import java.sql.Connection;
import java.sql.SQLException;


public class TestBaseDAO {
	
	public static void main(String[] args) throws SQLException {
        Connection connection = new BaseDAO().getConnection();
        System.out.println("Conexão aberta!");
        connection.close();
    }

}
