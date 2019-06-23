package br.com.TesteWS.Service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.Response;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.glassfish.jersey.client.ClientConfig;

import br.com.TesteWS.Entity.MotorRegra;

public class MotorRegraService {

	
	private Client client;
	 
	
	private WebTarget webTarget;
 

	private final String URL_SERVICE = "http://5d09201b034e500014010ef2.mockapi.io/motor-regras-processamento/resources/execute/";
 
	/**CONSTRUTOR DA NOSSA CLASSE*/
	public MotorRegraService(){
 
		this.client = ClientBuilder.newClient(new ClientConfig(JacksonJsonProvider.class));
	}
	
	public MotorRegra ConsultarGlosa(int cdFicha){
		 
		this.webTarget = this.client.target(URL_SERVICE).path("cdFicha/").path(String.valueOf(cdFicha));
 
		Invocation.Builder invocationBuilder =  this.webTarget.request(MediaType.APPLICATION_JSON);
 
		javax.ws.rs.core.Response response = invocationBuilder.get();
 
		return response.readEntity(MotorRegra.class);
 
	}
	
	
}
