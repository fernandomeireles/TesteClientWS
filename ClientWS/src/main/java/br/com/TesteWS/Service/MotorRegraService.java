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

import br.com.TesteWS.Entity.MotorRegraFicha;

public class MotorRegraService {

	
	private Client client;
	 
	
	private WebTarget webTarget;
 

	private final String URL_SERVICE = "http://5d09201b034e500014010ef2.mockapi.io/motor-regras-processamento/resources/execute/";
 
	/**CONSTRUTOR DA NOSSA CLASSE*/
	public MotorRegraService(){
 
		this.client = ClientBuilder.newClient(new ClientConfig(JacksonJsonProvider.class));
	}
		
		
	public void novoConsumo() {
		try {
			HttpResponse<JsonNode> response = Unirest.get("http://5d09201b034e500014010ef2.mockapi.io/motor-regras-processamento/resources/execute/Ficha/1")
					  .header("cache-control", "no-cache")
					  .header("Postman-Token", "ebda2744-9c1d-4711-a97d-afb0da4c1505")
					  .asJson();
			
			JSONObject json = response.getBody().getObject();
			MotorRegraFicha ficha = new MotorRegraFicha();
			
			ficha.setFicha(json.getString("Ficha"));
			JSONArray eventosJson = json.getJSONArray("Evento");
			
			for(int i=0; i<eventosJson.length(); i++) {
				JSONObject evento = eventosJson.getJSONObject(i);
				System.out.println("Evento: " + evento.getString("cdEvento"));
				
				JSONArray glosas = evento.getJSONArray("Glosa");
				StringBuilder glosasStringBuilder = new StringBuilder();
				glosasStringBuilder.append("Glosas: ");
				for(int j=0; j<glosas.length(); j++) {
					glosasStringBuilder.append(glosas.get(j) + ", ");
				}
				System.out.println(glosasStringBuilder.toString());
			}
			
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}