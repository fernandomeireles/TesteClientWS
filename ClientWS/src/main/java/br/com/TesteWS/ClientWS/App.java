package br.com.TesteWS.ClientWS;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.xml.ws.Service;

import br.com.TesteWS.DAO.MotorRegraDAO;
import br.com.TesteWS.Entity.MotorRegra;
import br.com.TesteWS.Service.MotorRegraService;


public class App 
{
    public static void main( String[] args )
    {
    	int controlador =0;
    	
    	while(controlador==0) {
    		
    		
        
    	 Scanner ler = new Scanner(System.in);
		 
		 String escolha;
		 		 
				
			 MotorRegraService client = new  MotorRegraService();
		 
				
			 System.out.println( "\n Digite um numero de ficha para ser procurado na API e gravada no banco:  \n" );
		    
		     escolha = ler.next();
		 
				
				MotorRegra motorRegra = client.ConsultarGlosa(Integer.parseInt(escolha));
		 
				if (motorRegra == null) {
		 
					System.out.println("Sem Ficha !");
		 
					
					main(null);
				} else {
		 
					String resultado = null;
		 
					
					resultado = "Ficha: " + String.valueOf(motorRegra.getCdFicha()) + "\n";
					resultado += "NroSeqInclusao:   " + String.valueOf(motorRegra.getNroSeqInclusao()) + "\n";
					resultado += "cdLozalicao:   "  + motorRegra.getCdLocalizao() + "\n";
					resultado += "Evento:   "  + String.valueOf(motorRegra.getCdEvento()) + "\n";
					resultado += "Glosa:   " + String.valueOf(motorRegra.getCdGlosa()) + "\n";
					
					System.out.println(resultado);
					
					MotorRegraDAO motorregraDAO = new MotorRegraDAO();
					motorregraDAO.adiciona (motorRegra);
					
					System.out.println("\n Deseja executar novamente ? \n");
					controlador = ler.nextInt();
							
					
					
					
				}
		 
			}
    	
    	System.exit(0);
    }

	
}
