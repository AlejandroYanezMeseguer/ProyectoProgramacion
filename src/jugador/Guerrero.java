
package jugador;
import armas_java.ContenedorArmas;

import java.lang.*;

/**
 * Clase que crea la clase de jugador guerrero
 */
public class Guerrero extends Jugador{

    private static final int FUERZA = 18;
    private static final int DESTREZA = 21;
    private static final int VIGOR = 1100;
    private static final int AGUANTE = 21;
    private static final int FE = 10;
    private static final int MENTE = 12;

    //Estadisticas del guerrero
    private static String estadisticas = " - Fuerza: " +FUERZA +"<br>"+"- Destreza: " +DESTREZA +"<br>"+"- Vigor: " +VIGOR +"<br>"+"- Aguante: " +AGUANTE +"<br>"+"- Fe: " +FE +"<br>"+"- Mente: " +MENTE;

    /**
     * Constructor de la clase Guerrero
     * @param nombre
     */
    public Guerrero(String nombre){
        super(FUERZA, DESTREZA, VIGOR, AGUANTE, FE, MENTE, nombre);

        baul =new ContenedorArmas(TipoGuerrero.Guerrero);

    }

    /**
     * Metodo que devuelve las estadisticas del guerrero
     * @return
     */
    public static String getStats(){
        return "<html><p>" +estadisticas +"</html></p>";
    }
}


