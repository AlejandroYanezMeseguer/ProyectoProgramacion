package cargarArmas;
import armas_java.Espadas;

import java.util.ArrayList;

public class CargarEspadas extends CargarArmas {

    private ArrayList<Espadas> listaEspadas= new ArrayList<>();

    protected void leerLineas(String[] listaPropiedadesArmas){
        Espadas espada = new Espadas(Integer.parseInt(listaPropiedadesArmas[0]),Integer.parseInt(listaPropiedadesArmas[1]),listaPropiedadesArmas[2],listaPropiedadesArmas[3],listaPropiedadesArmas[4]);

        listaEspadas.add(espada);
    }

    public ArrayList<Espadas> cargar(){

        String rutaArchivo = "src/armas/Espadas.txt";

       leerFicheros(rutaArchivo);

        return listaEspadas;
    }

}
