package br.com.TesteWS.ClientWS;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.xml.ws.Service;

import br.com.TesteWS.DAO.MotorRegraDAO;
import br.com.TesteWS.Entity.MotorGlosas;
import br.com.TesteWS.Entity.MotorRegra;
import br.com.TesteWS.Entity.MotorRegras;
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
		 
				
		     MotorGlosas motorglosas = client.GerarGlosas(Integer.parseInt(escolha));
		     
		     StringBuilder stringBuiderDetalhesMotor = new StringBuilder();
					
		     for (MotorRegra motorregra : motorglosas) {
		    	 
		    	stringBuiderDetalhesMotor.append("Ficha: ");
		    	stringBuiderDetalhesMotor.append(String.valueOf(((MotorRegra) motorglosas).getCdFicha()));
		    	stringBuiderDetalhesMotor.append(" NroSeqInclusao: ");
				stringBuiderDetalhesMotor.append(String.valueOf(((MotorRegra) motorglosas).getNroSeqInclusao()));
				stringBuiderDetalhesMotor.append(" Localizacao: ");
				stringBuiderDetalhesMotor.append(((MotorRegra) motorglosas).getCdLocalizao());
				stringBuiderDetalhesMotor.append(" Evento: ");
		    	stringBuiderDetalhesMotor.append(String.valueOf(((MotorRegra) motorglosas).getCdEvento()));
		    	stringBuiderDetalhesMotor.append(" Glosa: ");
				stringBuiderDetalhesMotor.append(String.valueOf(((MotorGlosas) motorglosas).getListcdGlosa()));
				stringBuiderDetalhesMotor.append("\n\n");
		 
				}		
					
		     System.out.println(stringBuiderDetalhesMotor.toString());
					
					System.out.println("\n Deseja executar novamente ? \n");
					controlador = ler.nextInt();
							
					
					
					
				}
		 
			}
    	
    	
    }

	

