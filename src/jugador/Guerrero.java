
package jugador;
import armas_java.ContenedorArmas;

import java.lang.*;

/**
 * Clase que crea la clase de jugador guerrero
 */
public class Guerrero extends Jugador{

    private static final int fuerza = 10;
    private static final int destreza = 12;
    private static final int vigor = 400;
    private static final int aguante = 16;
    private static final int fe = 10;
    private static final int mente = 12;

    /**
     * Constructor de la clase Guerrero
     * @param nombre
     */
    public Guerrero(String nombre) {
        super(fuerza, destreza, vigor, aguante, fe, mente, nombre);

        baul =new ContenedorArmas(TipoGuerrero.Guerrero);

    }

    /**
     * toString
     * @return vigor con la vida del jugador
     */
    @Override
    public String toString() {
        return "" + vigor;
    }
}


