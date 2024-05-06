package cargarArmas;
import armas_java.Espadas;

import java.util.ArrayList;

/**
 * Clase que crea las espadas
 */
public class CargarEspadas extends CargarArmas {

    //Array que guarda las espadas
    private ArrayList<Espadas> listaEspadas= new ArrayList<>();

    /**
     * Metodo extendido de CargarArmas que lee las lineas del archivo y guarda los datos en las respectivas posiciones del array
     * @param listaPropiedadesArmas
     */
    protected void leerLineas(String[] listaPropiedadesArmas){
        Espadas espada = new Espadas(Integer.parseInt(listaPropiedadesArmas[0]),Integer.parseInt(listaPropiedadesArmas[1]),listaPropiedadesArmas[2],listaPropiedadesArmas[3],listaPropiedadesArmas[4]);

        listaEspadas.add(espada);
    }

    /**
     * Metodo que carga el archivo donde se encuentran las espadas
     * @return listaEspadas es el array que guarda las espadas
     */
    public ArrayList<Espadas> cargar(){

        String rutaArchivo = "src/armas/Espadas.txt";

       leerFicheros(rutaArchivo);

        return listaEspadas;
    }

}
