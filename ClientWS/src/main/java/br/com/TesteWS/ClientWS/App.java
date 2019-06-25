package br.com.TesteWS.ClientWS;

import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.xml.ws.Service;

import br.com.TesteWS.DAO.MotorRegraDAO;
import br.com.TesteWS.Entity.CdGlosa;
import br.com.TesteWS.Entity.Glosa;
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

				// DECLARANDO O OBJETO DA NOSSA CLASSE QUE ACESSA O SERVIÇO REST

			 MotorRegraService client = new  MotorRegraService();

				// CAPTURA O CÓDIGO A SER CONSULTADO
			 System.out.println( "Digite um numero de um evento" );

			 

		     escolha = ler.next();
		     
		     MotorRegraDAO motorregraDAO = new MotorRegraDAO();
		     StringBuilder motor = new StringBuilder();
		    	     
		     List <MotorRegra> lista = motorregraDAO.ListaGlosa(Integer.parseInt(escolha));
		        for (MotorRegra motorregra : lista) {
		        	
		        	motor.append("Evento : " + motorregra.getCdEvento() + " - " + "Glosa : " + motorregra.getCdGlosa() + " - " + "Motivo : " + motorregra.getMotivoGlosa() + "\n");
		        	
		        	
		        }
		        System.out.println(motor.toString());  
		        
			
		       System.out.println( "\n Digite um numero de ficha para ser procurado na API e gravada no banco:  \n" );
		       escolha = ler.next();
		       
			  Glosa glosa = client.GerarGlosas(Integer.parseInt(escolha));
			  
			  
			  if (glosa == null) {
			  
			  JOptionPane.showMessageDialog(null, "Sem Ficha !");
			  System.out.println("Sem Ficha !");
			  
			  CdGlosa cdglosa = new CdGlosa();
			  
			  for(int i=0; i<glosa.getCdGlosa().length; i++){
					System.out.println("posicao " + (i+1) + " = " + glosa.cdGlosa[i] );
				}
			  
			  main(null); } else {
			  
			  String resultado = null;
			  
			  int tamanho = glosa.getCdGlosa().length;
			  resultado = "Ficha: " + String.valueOf(glosa.getCdFicha()) + "\n";
			  resultado += "NroSeqInclusao:   " + String.valueOf(glosa.getNroSeqInclusao()) + "\n";
			  resultado += "cdLozalicao:   " + glosa.getCdLocalizao() + "\n"; 
			  resultado += "Evento:   " + String.valueOf(glosa.getCdEvento()) + "\n";
			  resultado += "Glosa:   " + "\n";
			  		  
			  for(int i=0; i<glosa.getCdGlosa().length; i++){
				  resultado += (glosa.cdGlosa[i] + "\n");
				}		 
			  
			  System.out.println(resultado);
			  
			 
			  
			  
			  main(null); System.out.println("\n Deseja executar novamente ? \n");
			  controlador = ler.nextInt();
			  
			  
			  
			  
			  }
			 

			}

    	System.exit(0);
    }
    }

	

