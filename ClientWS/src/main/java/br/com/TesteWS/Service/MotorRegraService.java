package br.com.TesteWS.Service;

import java.util.Iterator;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.Response;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.json.JSONArray;
import org.json.JSONObject;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import br.com.TesteWS.Entity.MotorRegraEvento;
import br.com.TesteWS.Entity.MotorRegraFicha;

public class MotorRegraService {

	
	private Client client;
	 
	
	private WebTarget webTarget;
 

	private final String URL_SERVICE = "http://5d09201b034e500014010ef2.mockapi.io/motor-regras-processamento/resources/execute/";
 
	/**CONSTRUTOR DA NOSSA CLASSE*/
	public MotorRegraService(){
 
		this.client = ClientBuilder.newClient(new ClientConfig(JacksonJsonProvider.class));
	}
		
		
	public void novoConsumo(int codigoFicha) {
		try {
			HttpResponse<JsonNode> response = Unirest.get("http://5d09201b034e500014010ef2.mockapi.io/motor-regras-processamento/resources/execute/Ficha/"+(String.valueOf(codigoFicha)))
					  .header("cache-control", "no-cache")
					  .header("Postman-Token", "ebda2744-9c1d-4711-a97d-afb0da4c1505")
					  .asJson();
			
			JSONObject json = response.getBody().getObject();
			MotorRegraFicha motorficha = new MotorRegraFicha();
			MotorRegraEvento motorevento = new MotorRegraEvento();
			
			motorficha.setFicha(json.getString("Ficha"));
			
			JSONArray eventosJson = json.getJSONArray("Evento");
			
			for(int i=0; i<eventosJson.length(); i++) {
				
				JSONObject evento = eventosJson.getJSONObject(i);
								
				JSONArray glosas = evento.getJSONArray("Glosa");
				
				//StringBuilder glosasStringBuilder = new StringBuilder();
				//glosasStringBuilder.append("Motor: ");
				
				
				
				for(int j=0; j<glosas.length(); j++) {
					
					motorevento.setCdEvento(evento.getString("cdEvento"));
					motorevento.setCdLocalizacao(evento.getString("cdLocalizacao"));
					motorevento.setNroSeqInclusao(String.valueOf(evento.getInt("nroSeqInclusao")));
					//motorevento.Glosa[j]  = String.valueOf((glosas.get(j)));
					
					System.out.println(motorficha.getFicha()+" - "+motorevento.getCdEvento()+" - "+motorevento.getCdLocalizacao()+" - "+motorevento.getNroSeqInclusao()+" - "+glosas.get(j));
					
					//System.out.println(motorficha.getFicha()+" - "+evento.getString("cdEvento")+" - "+evento.getInt("nroSeqInclusao")+" - "+evento.getString("cdLocalizacao")+" - "+glosas.get(j));
															
					//glosasStringBuilder.append(evento.getString("cdEvento")+" - "+glosas.get(j) + ", ");
				}
				
			}
			
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}