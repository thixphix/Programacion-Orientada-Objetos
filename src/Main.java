import java.util.Scanner;
import coche.Furgoneta;

public class Main {
    public static void main(String[] args) {
        Furgoneta f = new Furgoneta();

        String ColorActual = f.Color();
        System.out.println(ColorActual);

        f.EstablecerColor("marron");

        System.out.println(f.Color());

        f.Ruedas = 4;
        f.PesoMotor = 1500;
        f.Velocidad = 120; // 120 como la cancion de Bad Bunny
        f.Largo = 5.525;
        f.Ancho = 1.815;
        f.Climatizador = false;
        f.TraccionAutomatica = false;
        f.AsientosCuero = false;

        System.out.println(f.Traccion());
        System.out.println(f.AsientosFurgoneta());
        System.out.println(f.Climatizador());
        System.out.println(f.PesoTotalFurgoneta());
        System.out.println(f.PrecioTotalFurgoneta());
    }

}