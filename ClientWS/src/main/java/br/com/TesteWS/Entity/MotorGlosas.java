package br.com.TesteWS.Entity;

import java.util.ArrayList;

public class MotorGlosas extends ArrayList<MotorRegra> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected int ListcdGlosa;
	protected int ListcdFicha;
	
	public int getListcdGlosa() {
		return ListcdGlosa;
	}
	public void setListcdGlosa(int listcdGlosa) {
		ListcdGlosa = listcdGlosa;
	}
	public int getListcdFicha() {
		return ListcdFicha;
	}
	public void setListcdFicha(int listcdFicha) {
		ListcdFicha = listcdFicha;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
