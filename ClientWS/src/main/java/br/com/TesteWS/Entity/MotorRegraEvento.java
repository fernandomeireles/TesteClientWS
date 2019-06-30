package br.com.TesteWS.Entity;

import java.util.ArrayList;
import java.util.List;

import br.com.TesteWS.Entity.MotorRegra;

public class MotorRegraEvento
{
	private String cdEvento;
	private String FichaId;

	private String nroSeqInclusao;

	private String cdLocalizacao;

	private String[] Glosa;
  

    public String getFichaId ()
    {
        return FichaId;
    }

    public void setFichaId (String FichaId)
    {
        this.FichaId = FichaId;
    }

    public String getNroSeqInclusao ()
    {
        return nroSeqInclusao;
    }

    public void setNroSeqInclusao (String nroSeqInclusao)
    {
        this.nroSeqInclusao = nroSeqInclusao;
    }

    public String getCdLocalizacao ()
    {
        return cdLocalizacao;
    }

    public void setCdLocalizacao (String cdLocalizacao)
    {
        this.cdLocalizacao = cdLocalizacao;
    }

    public String[] getGlosa ()
    {
        return Glosa;
    }

    public void setGlosa (String[] Glosa)
    {
        this.Glosa = Glosa;
    }

    public String getCdEvento ()
    {
        return cdEvento;
    }

    public void setCdEvento (String cdEvento)
    {
        this.cdEvento = cdEvento;
    }

    @Override
    public String toString()
    {
		 
    	
     
        
       
    	
        return  "[nroSeqInclusao = "+nroSeqInclusao+", cdLocalizacao = "+cdLocalizacao+", Glosa = "+Glosa+", cdEvento = "+cdEvento+"]";
    }
}