package br.com.TesteWS.Entity;

public class CdGlosa
{
    private String cdFicha;

    private String cdGlosa;

    public String getCdFicha ()
    {
        return cdFicha;
    }

    public void setCdFicha (String cdFicha)
    {
        this.cdFicha = cdFicha;
    }

    public String getCdGlosa ()
    {
        return cdGlosa;
    }

    public void setCdGlosa (String cdGlosa)
    {
        this.cdGlosa = cdGlosa;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [cdFicha = "+cdFicha+", cdGlosa = "+cdGlosa+"]";
    }
}

