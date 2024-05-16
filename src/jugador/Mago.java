package jugador;
import armas_java.ContenedorArmas;

import java.lang.*;

/**
 * Clase que crea la clase de jugador mago
 */
public class Mago extends Jugador{

    private static final int FUERZA = 10;
    private static final int DESTREZA = 12;
    private static final int VIGOR = 500;
    private static final int AGUANTE = 16;
    private static final int FE = 10;
    private static final int MENTE = 12;

    private static String estadisticas = " - Fuerza: " +FUERZA +"<br>"+"- Destreza: " +DESTREZA +"<br>"+"- Vigor: " +VIGOR +"<br>"+"- Aguante: " +AGUANTE +"<br>"+"- Fe: " +FE +"<br>"+"- Mente: " +MENTE;

    /**
     * Constructor de la clase mago
     * @param nombre
     */
    public Mago(String nombre){
        super(FUERZA, DESTREZA, VIGOR, AGUANTE, FE, MENTE, nombre);

        baul =new ContenedorArmas(TipoGuerrero.Mago);

    }

    public static String getStats(){
        return "<html><p>" +estadisticas +"</html></p>";
    }
}
