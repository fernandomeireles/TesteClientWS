package br.com.TesteWS.Entity;

import java.util.ArrayList;
import java.util.List;

public class MotorRegra {
	
	protected int cdFicha;
	protected int NroSeqInclusao;
	protected String cdLocalizao;
	protected int cdEvento;	
	protected int cdGlosa;
	protected String MotivoGlosa;
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
	
	public String getMotivoGlosa() {
		return MotivoGlosa;
	}
	public void setMotivoGlosa(String motivoGlosa) {
		MotivoGlosa = motivoGlosa;
	}
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
	public int getCdGlosa() {
		return cdGlosa;
	}
	public void setCdGlosa(int cdGlosa) {
		this.cdGlosa = cdGlosa;
	}
	
	
	
	
	

}
