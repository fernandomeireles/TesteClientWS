package br.com.TesteWS.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.TesteWS.Entity.MotorRegra;
import br.com.TesteWS.Entity.MotorRegras;
import br.com.TesteWS.Factory.BaseDAO;




public class MotorRegraDAO {
	
	private Connection Connection;
	
	public MotorRegraDAO(){ 
        this.Connection = new BaseDAO().getConnection();
    } 
	
    public void adiciona(MotorRegra motorregra){ 
        String sql = "INSERT INTO MotorRegra(cdFicha,NroSeqInclusao,cdLocalizacao,cdEvento,cdGlosa) VALUES(?,?,?,?,1)";
        try { 
            PreparedStatement stmt = Connection.prepareStatement(sql);
            stmt.setInt(1, motorregra.getCdFicha());
            stmt.setInt(2, motorregra.getNroSeqInclusao());
            stmt.setString(3, motorregra.getCdLocalizao());
            stmt.setInt(4, motorregra.getCdEvento());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    }
    
    
    public List<MotorRegra> ListaGlosa(int cdEvento){
    	List <MotorRegra> lista = new ArrayList();
    	
    	MotorRegra obj;
    	try { 
    		ResultSet rs =null;
            String sql = "SELECT MotorRegra.cdEvento, MotorRegra.cdGlosa, GlosaMotivo.MotivoGlosa FROM MotorRegra, GlosaMotivo WHERE MotorRegra.cdGlosa = GlosaMotivo.cdGlosa and MotorRegra.cdEvento = ? ";
                
            PreparedStatement stmt = Connection.prepareStatement(sql);
            stmt.setInt(1, cdEvento);
               
                rs = stmt.executeQuery();
                                             
                 while (rs.next()) {
                    obj = new MotorRegra();
                    obj.setCdEvento(rs.getInt("cdEvento"));
                    obj.setCdGlosa(rs.getInt("cdGlosa"));
                    obj.setMotivoGlosa(rs.getString("MotivoGlosa"));
                    lista.add(obj);
                } 
     
            } 
            catch (SQLException u) { 
                throw new RuntimeException(u);
            }
        	return lista;	
    	
    	
    	
    }
    
    
    	
    	
    	
    	
        
        
    
    
    

}
