
package jugador;
import armas_java.ContenedorArmas;

import java.lang.*;

/**
 * Clase que crea la clase de jugador guerrero
 */
public class Guerrero extends Jugador{

    private static final int FUERZA = 18;
    private static final int DESTREZA = 21;
    private static final int VIGOR = 2600;
    private static final int AGUANTE = 21;
    private static final int FE = 10;
    private static final int MENTE = 12;

    private static String estadisticas = " - Fuerza: " +FUERZA +"<br>"+"- Destreza: " +DESTREZA +"<br>"+"- Vigor: " +VIGOR +"<br>"+"- Aguante: " +AGUANTE +"<br>"+"- Fe: " +FE +"<br>"+"- Mente: " +MENTE;

    /**
     * Constructor de la clase Guerrero
     * @param nombre
     */
    public Guerrero(String nombre){
        super(FUERZA, DESTREZA, VIGOR, AGUANTE, FE, MENTE, nombre);

        baul =new ContenedorArmas(TipoGuerrero.Guerrero);

    }

    public static String getStats(){
        return "<html><p>" +estadisticas +"</html></p>";
    }
}


