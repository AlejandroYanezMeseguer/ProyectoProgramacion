package API;

import API.data.Data;

/**
 * Clase EldenRingData que se utilizara para guardar los datos de los escudos en la API
 */
public class EldenRingData {

    public boolean success;
    public int count;
    public int total;
    public Data[] data;

    /**
     * Getter de la referencia de EldenRing (id de los escudos en la API)
     * @param id
     * @return String
     */
    public String getEldenRingReferenciaEscudo(String id) {
        for (Data escudo : data) {
            if (escudo.id.equals(id)) {
                return escudo.image;
            }
        }
        return null;
    }

    public String getEldenRingReferenciaArmas(String id) {
        for (Data arma : data) {
            if (arma.id.equals(id)) {
                return arma.image;
            }
        }
        return null;
    }
}


