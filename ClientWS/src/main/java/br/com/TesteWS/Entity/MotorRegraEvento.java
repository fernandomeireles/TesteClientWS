package br.com.TesteWS.Entity;

import java.util.ArrayList;
import java.util.List;

import br.com.TesteWS.Entity.MotorRegra;

public class MotorRegraEvento
{
	public String cdEvento;
    public String FichaId;

    public String nroSeqInclusao;

    public String cdLocalizacao;

    public String[] Glosa;
  

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
		/*
		 * List <String> lista = new ArrayList();
		 * 
		 * lista.add(cdEvento); lista.add(String.valueOf(nroSeqInclusao));
		 * lista.add(cdLocalizacao);
		 * 
		 * String[] strings = (String[]) lista.toArray (new String[lista.size()]);
		 */
    	MotorRegraFicha motorregra = new MotorRegraFicha();
    	
    	 String teste[] = new String [4];
    	 for(int i=0; i<(Glosa.length); i++){
    	 teste[0] = cdEvento;
         teste[1] = nroSeqInclusao;
         teste[2] = cdLocalizacao;
    	 teste[3] = Glosa[i];	 
    	System.out.println(teste[0]+"-"+teste[1]+"-"+teste[2]+"-"+teste[3]);
    	
    	}
    	 
    	
     
        
       
    	
        return  "[nroSeqInclusao = "+nroSeqInclusao+", cdLocalizacao = "+cdLocalizacao+", Glosa = "+Glosa+", cdEvento = "+cdEvento+"]";
    }
}