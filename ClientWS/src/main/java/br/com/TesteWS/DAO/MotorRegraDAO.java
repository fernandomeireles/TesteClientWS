package br.com.TesteWS.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.TesteWS.Entity.MotorRegra;
import br.com.TesteWS.Factory.BaseDAO;



public class MotorRegraDAO {
	
	private Connection Connection;
	
	public MotorRegraDAO(){ 
        this.Connection = new BaseDAO().getConnection();
    } 
	
    public void adiciona(MotorRegra motorregra){ 
        String sql = "INSERT INTO MotorRegra(cdFicha,NroSeqInclusao,cdLocalizacao,cdEvento,cdGlosa) VALUES(?,?,?,?,?)";
        try { 
            PreparedStatement stmt = Connection.prepareStatement(sql);
            stmt.setInt(1, motorregra.getCdFicha());
            stmt.setInt(2, motorregra.getNroSeqInclusao());
            stmt.setString(3, motorregra.getCdLocalizao());
            stmt.setInt(4, motorregra.getCdEvento());
            stmt.setInt(5, motorregra.getCdGlosa());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 

}
