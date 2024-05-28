package API;

/**
 * Clase Escudos que se utilizara para guardar los datos de los escudos en la API
 */
public class Escudos {

    public int id;
    public String EldenRingReferencia;
    public String UrlLink;

    /**
     * Constructor de la clase Escudos
     */
    public Escudos( int id, String eldenRingReferencia, String urlLink) {
        this.id = id;
        EldenRingReferencia = eldenRingReferencia;
        UrlLink = urlLink;
    }
}
