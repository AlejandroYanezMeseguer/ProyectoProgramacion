package jugador;
import armas_java.ContenedorArmas;

import java.lang.*;

/**
 * Clase que crea la clase de jugador samurai
 */
public class Samurai extends Jugador{

    private static final int FUERZA = 18;
    private static final int DESTREZA = 22;
    private static final int VIGOR = 1400;
    private static final int AGUANTE = 19;
    private static final int FE = 11;
    private static final int MENTE = 12;

    //Estadisticas del samurai
    private static String estadisticas = " - Fuerza: " +FUERZA +"<br>"+"- Destreza: " +DESTREZA +"<br>"+"- Vigor: " +VIGOR +"<br>"+"- Aguante: " +AGUANTE +"<br>"+"- Fe: " +FE +"<br>"+"- Mente: " +MENTE;

    /**
     * Constructor de la clase samurai
     * @param nombre
     */
    public Samurai(String nombre){
        super(FUERZA, DESTREZA, VIGOR, AGUANTE, FE, MENTE, nombre);

        baul =new ContenedorArmas(TipoGuerrero.Samurai);

    }

    /**
     * Metodo que devuelve las estadisticas del samurai
     * @return
     */
    public static String getStats(){
        return "<html><p>" +estadisticas +"</html></p>";
    }
}