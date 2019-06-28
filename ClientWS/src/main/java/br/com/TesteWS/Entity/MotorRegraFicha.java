package br.com.TesteWS.Entity;



public class MotorRegraFicha
{
	
    public String Ficha;

    public MotorRegraEvento[] Evento;

    public String getFicha ()
    {
        return Ficha;
    }

    public void setFicha (String Ficha)
    {
        this.Ficha = Ficha;
    }

    public MotorRegraEvento[] getEvento ()
    {
        return Evento;
    }

    public void setEvento (MotorRegraEvento[] Evento)
    {
        this.Evento = Evento;
    }

    @Override
    public String toString()
    {
        return "[Ficha = "+Ficha+", Evento = "+Evento+"]";
    }
}
		
