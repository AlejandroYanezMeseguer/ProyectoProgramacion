
package jugador;
import armas_java.ContenedorArmas;

import java.lang.*;


public class Guerrero extends Jugador{

    private static final int fuerza = 10;
    private static final int destreza = 12;
    private static final int vigor = 400;
    private static final int aguante = 16;
    private static final int fe = 10;
    private static final int mente = 12;

    public Guerrero(String nombre) {
        super(fuerza, destreza, vigor, aguante, fe, mente, nombre);

        baul =new ContenedorArmas(TipoGuerrero.Guerrero);

    }


    @Override
    public String toString() {
        return "" + vigor;
    }
}

