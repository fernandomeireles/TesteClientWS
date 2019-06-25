package br.com.TesteWS.Entity;

public class Glosa {
    private String cdFicha;

    private String nroSeqInclusao;

    private String cdEvento;

    private String cdLocalizao;

    public CdGlosa[] cdGlosa;

    public String getCdFicha ()
    {
        return cdFicha;
    }

    public void setCdFicha (String cdFicha)
    {
        this.cdFicha = cdFicha;
    }

    public String getNroSeqInclusao ()
    {
        return nroSeqInclusao;
    }

    public void setNroSeqInclusao (String nroSeqInclusao)
    {
        this.nroSeqInclusao = nroSeqInclusao;
    }

    public String getCdEvento ()
    {
        return cdEvento;
    }

    public void setCdEvento (String cdEvento)
    {
        this.cdEvento = cdEvento;
    }

    public String getCdLocalizao ()
    {
        return cdLocalizao;
    }

    public void setCdLocalizao (String cdLocalizao)
    {
        this.cdLocalizao = cdLocalizao;
    }

    public CdGlosa[] getCdGlosa ()
    {
        return cdGlosa;
    }

    public void setCdGlosa (CdGlosa[] cdGlosa)
    {
        this.cdGlosa = cdGlosa;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [cdFicha = "+cdFicha+", nroSeqInclusao = "+nroSeqInclusao+", cdEvento = "+cdEvento+", cdLocalizao = "+cdLocalizao+", cdGlosa = "+cdGlosa+"]";
    }
}
