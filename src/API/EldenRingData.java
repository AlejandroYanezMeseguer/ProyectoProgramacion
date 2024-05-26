package API;

public class EldenRingData {

    public boolean success;
    public int count;
    public int total;
    public Data[] data;


    public String getEldenRingReferencia(String id) {
        for (Data escudo : data) {
            if (escudo.id.equals(id)) {
                return escudo.image;
            }
        }
        return null;
    }
}


