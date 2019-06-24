package br.com.TesteWS.Entity;

import java.util.ArrayList;
import java.util.List;

public class MotorRegra {
	
	protected int cdFicha;
	protected int NroSeqInclusao;
	protected String cdLocalizao;
	protected int cdEvento;	
	protected ArrayList cdGlosa;
	/*
	 * protected List<MotorGlosas> cdGlosa;
	 * 
	 * 
	 * public MotorRegra() {
	 * 
	 * cdGlosa = new ArrayList<MotorGlosas>();
	 * 
	 * }
	 * 
	 * 
	 * public List<MotorGlosas> getCdGlosa() { return cdGlosa; }
	 * 
	 * public void setCdGlosa(List<MotorGlosas> cdGlosa) { this.cdGlosa = cdGlosa; }
	 */
	
	public int getCdFicha() {
		return cdFicha;
	}
	public void setCdFicha(int cdFicha) {
		this.cdFicha = cdFicha;
	}
	public int getNroSeqInclusao() {
		return NroSeqInclusao;
	}
	public void setNroSeqInclusao(int nroSeqInclusao) {
		NroSeqInclusao = nroSeqInclusao;
	}
	public String getCdLocalizao() {
		return cdLocalizao;
	}
	public void setCdLocalizao(String cdLocalizao) {
		this.cdLocalizao = cdLocalizao;
	}
	public int getCdEvento() {
		return cdEvento;
	}
	public void setCdEvento(int cdEvento) {
		this.cdEvento = cdEvento;
	}
	public ArrayList getCdGlosa() {
		return cdGlosa;
	}
	public void setCdGlosa(ArrayList cdGlosa) {
		this.cdGlosa = cdGlosa;
	}
	
	
	

}
