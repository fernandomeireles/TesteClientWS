package br.com.TesteWS.Entity;

import java.util.ArrayList;

public class MotorRegras extends ArrayList<MotorRegra>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected int cdGlosa;
	protected int cdFicha;
	
	
	public int getCdGlosa() {
		return cdGlosa;
	}
	public void setCdGlosa(int cdGlosa) {
		this.cdGlosa = cdGlosa;
	}
	public int getCdFicha() {
		return cdFicha;
	}
	public void setCdFicha(int cdFicha) {
		this.cdFicha = cdFicha;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
