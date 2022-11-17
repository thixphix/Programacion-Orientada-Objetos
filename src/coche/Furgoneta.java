package coche;

import java.security.PublicKey;

public class Furgoneta {
    private String Color;
    public int Ruedas, PesoMotor, PesoTotal, Velocidad;
    public double Largo, Ancho;
    public boolean Climatizador, TraccionAutomatica, AsientosCuero;

    public Furgoneta()
    {
        Color = "verde";
    }

    public void EstablecerColor(String nuevoColor)
    {
        Color = nuevoColor;
    }

    public String Color()
    {
        return Color;
    }

    public String Traccion()
    {
        if (TraccionAutomatica) {
            return "La furgoneta tiene traccion automatioca.";
        } else {
            return "La furgoneta tiene traccion manual.";
        }

    }

    public String RuedasFurgoneta()
    {
        return "La furgoneta tiene " + Ruedas + " ruedas.";
    }

    public String LargoFurgoneta()
    {
        return "La furgoneta tiene un largo de " + Largo + " cm.";
    }

    public String Anchofurgoneta()
    {
        return "La furgoneta tiene un ancho de " + Ancho + " cm.";
    }
    public String Climatizador()
    {
        if (Climatizador){
            return "La furgoneta tiene climatizador.";
        } else {
            return "La furgoneta tiene solo aire acondicionado.";
        }
    }

    public String AsientosFurgoneta()
    {
        if (AsientosCuero) {
            return "La furgoneta tiene asientos de cuero.";
        } else {
            return "La furgoneta tiene los asientos de serie.";
        }
    }

    public String PesoTotalFurgoneta()
    {
        int PesoCarroceria = 1500;
        PesoTotal = PesoMotor + PesoCarroceria;
        if (AsientosCuero)
        {
            PesoTotal += 50;
        }else {
            PesoTotal += 20;
        }

        if (Climatizador)
        {
            PesoTotal += 20;
        }else {
            PesoTotal += 5;
        }

        if (TraccionAutomatica)
        {
            PesoTotal += 100;
        }else {
        PesoTotal += 40;
        }

        return "El peso total de la furgoneta es de " + PesoTotal + " Kg.";
    }

    public void ConfiguracionAsientos(int AsientosCuero)
    {
        this.AsientosCuero = AsientosCuero == 1;
    }

    public void ConfiguracionClimatizador(int Climatizador)
    {
        boolean valor = Climatizador == 1;
        this.Climatizador = valor;
    }

    public void ConfiguracionTraccion(int TraccionAutomatica)
    {
        this.TraccionAutomatica = TraccionAutomatica == 1;
    }

    public String PrecioTotalFurgoneta()
    {
        int PrecioFinal = 35000;
        if (AsientosCuero)
        {
            PrecioFinal += 4000;
        }else {
            PrecioFinal += 1000;
        }

        if (Climatizador)
        {
            PrecioFinal += 2000;
        }else {
            PrecioFinal += 1000;
        }

        if (TraccionAutomatica)
        {
            PrecioFinal += 3000;
        }else {
            PrecioFinal += 1500;
        }

        return "El Precio final de la furgoneta es de " + PrecioFinal + "$.";
    }
}
