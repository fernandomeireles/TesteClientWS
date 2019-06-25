package br.com.TesteWS.ClientWS;

import java.util.List;
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

				// DECLARANDO O OBJETO DA NOSSA CLASSE QUE ACESSA O SERVIÇO REST

			 MotorRegraService client = new  MotorRegraService();

				// CAPTURA O CÓDIGO A SER CONSULTADO
			 System.out.println( "Digite um numero de um evento" );

			 System.out.println( "\n Digite um numero de ficha para ser procurado na API e gravada no banco:  \n" );

		     escolha = ler.next();
		     
		     MotorRegraDAO motorregraDAO = new MotorRegraDAO();
		     StringBuilder motor = new StringBuilder();
		    	     
		     List <MotorRegra> lista = motorregraDAO.ListaGlosa(Integer.parseInt(escolha));
		        for (MotorRegra motorregra : lista) {
		        	
		        	motor.append("Evento : " + motorregra.getCdEvento() + " - " + "Glosa : " + motorregra.getCdGlosa() + " - " + "Motivo : " + motorregra.getMotivoGlosa() + "\n");
		        	
		        	
		        }
		        System.out.println(motor.toString());  
		        
			/*
			 * // CONSULTA UMA PESSOA PELO CÓDIGO
			 * 
			 * MotorRegra motorRegra = client.ConsultarGlosa(Integer.parseInt(escolha));
			 * 
			 * if (motorRegra == null) {
			 * 
			 * JOptionPane.showMessageDialog(null, "Sem Ficha !");
			 * System.out.println("Sem Ficha !");
			 * 
			 * // CHAMANDO A FUNÇÃO PRINCIPAL DO NOSSO SISTEMA
			 * 
			 * main(null); } else {
			 * 
			 * String resultado = null;
			 * 
			 * // MONTA O RESULTADO PARA MOSTRARMOS NA MENSAGEM DE SAIDA
			 * 
			 * resultado = "Ficha: " + String.valueOf(motorRegra.getCdFicha()) + "\n";
			 * resultado += "NroSeqInclusao:   " +
			 * String.valueOf(motorRegra.getNroSeqInclusao()) + "\n"; resultado +=
			 * "cdLozalicao:   " + motorRegra.getCdLocalizao() + "\n"; resultado +=
			 * "Evento:   " + String.valueOf(motorRegra.getCdEvento()) + "\n"; resultado +=
			 * "Glosa:   " + String.valueOf(motorRegra.getCdGlosa()) + "\n";
			 * 
			 * System.out.println(resultado);
			 * 
			 * MotorRegraDAO motorregraDAO = new MotorRegraDAO(); motorregraDAO.adiciona
			 * (motorRegra);
			 * 
			 * 
			 * main(null); System.out.println("\n Deseja executar novamente ? \n");
			 * controlador = ler.nextInt();
			 * 
			 * 
			 * 
			 * 
			 * }
			 */

			}

    	System.exit(0);
    }
    }

	

