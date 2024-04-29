package cargarArmas;

import armas_java.Alabardas;

import java.util.ArrayList;

/**
 * Clase que crea las alabardas
 */
public class CargarAlabardas extends CargarArmas{

    //Array que guarda las alabardas
    private ArrayList<Alabardas> listaAlabardas= new ArrayList<>();

    /**
     * Metodo extendido de CargarArmas que lee las lineas del archivo y guarda los datos en las respectivas posiciones del array
     * @param listaPropiedadesArmas
     */
    protected void leerLineas(String[] listaPropiedadesArmas){
        Alabardas alabarda = new Alabardas(Integer.parseInt(listaPropiedadesArmas[0]),Integer.parseInt(listaPropiedadesArmas[1]),listaPropiedadesArmas[2],listaPropiedadesArmas[3],listaPropiedadesArmas[4]);

        listaAlabardas.add(alabarda);
    }

    /**
     * Metodo que carga el archivo donde se encuentran las alabardas
     * @return listaAlabardas es el array que guarda las alabardas
     */
    public ArrayList<Alabardas> cargar(){

        String rutaArchivo = "src/armas/Alabardas.txt";

        leerFicheros(rutaArchivo);

        return listaAlabardas;
    }
}
