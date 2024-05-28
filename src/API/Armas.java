package API;

/**
 * Clase Armas que se utilizara para guardar los datos de las armas en la API
 */
public class Armas {

    public int id;
    public String EldenRingReferencia;
    public String UrlLink;

    /**
     * Constructor de la clase Armas
     */
    public Armas( int id, String eldenRingReferencia, String urlLink) {
        this.id = id;
        EldenRingReferencia = eldenRingReferencia;
        UrlLink = urlLink;
    }
}
