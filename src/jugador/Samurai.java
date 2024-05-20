package jugador;
import armas_java.ContenedorArmas;

import java.lang.*;

/**
 * Clase que crea la clase de jugador samurai
 */
public class Samurai extends Jugador{

    private static final int FUERZA = 10;
    private static final int DESTREZA = 12;
    private static final int VIGOR = 600;
    private static final int AGUANTE = 16;
    private static final int FE = 10;
    private static final int MENTE = 12;

    private static String estadisticas = " - Fuerza: " +FUERZA +"<br>"+"- Destreza: " +DESTREZA +"<br>"+"- Vigor: " +VIGOR +"<br>"+"- Aguante: " +AGUANTE +"<br>"+"- Fe: " +FE +"<br>"+"- Mente: " +MENTE;

    /**
     * Constructor de la clase samurai
     * @param nombre
     */
    public Samurai(String nombre){
        super(FUERZA, DESTREZA, VIGOR, AGUANTE, FE, MENTE, nombre);

        baul =new ContenedorArmas(TipoGuerrero.Samurai);

    }
    public static String getStats(){
        return "<html><p>" +estadisticas +"</html></p>";
    }
}