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
        
    	 Scanner ler = new Scanner(System.in);
		 
		 String escolha;
		 		 
				// DECLARANDO O OBJETO DA NOSSA CLASSE QUE ACESSA O SERVIÇO REST
			 MotorRegraService client = new  MotorRegraService();
		 
				// CAPTURA O CÓDIGO A SER CONSULTADO
			 System.out.println( "Digite um numero de ficha" );
		    
		     escolha = ler.next();
		 
				// CONSULTA UMA PESSOA PELO CÓDIGO
				MotorRegra motorRegra = client.ConsultarGlosa(Integer.parseInt(escolha));
		 
				if (motorRegra == null) {
		 
					JOptionPane.showMessageDialog(null, "Sem Ficha !");
		 
					// CHAMANDO A FUNÇÃO PRINCIPAL DO NOSSO SISTEMA
					main(null);
				} else {
		 
					String resultado = null;
		 
					// MONTA O RESULTADO PARA MOSTRARMOS NA MENSAGEM DE SAIDA
					resultado = "Ficha: " + String.valueOf(motorRegra.getCdFicha()) + "\n";
					resultado += "NroSeqInclusao:   " + String.valueOf(motorRegra.getNroSeqInclusao()) + "\n";
					resultado += "cdLozalicao:   "  + motorRegra.getCdLocalizao() + "\n";
					resultado += "Evento:   "  + String.valueOf(motorRegra.getCdEvento()) + "\n";
					resultado += "Glosa:   " + String.valueOf(motorRegra.getCdGlosa()) + "\n";
					
					MotorRegraDAO motorregraDAO = new MotorRegraDAO();
					motorregraDAO.adiciona (motorRegra);
					
					// MENSAGEM COM O RESULTADO
					JOptionPane.showMessageDialog(null, resultado);
		 
					// CHAMANDO A FUNÇÃO PRINCIPAL DO NOSSO SISTEMA
					main(null);
				}
		 
			}

	
}
