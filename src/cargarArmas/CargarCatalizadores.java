package cargarArmas;

import armas_java.Catalizadores;

import java.util.ArrayList;

/**
 * Clase que crea las catalizadores
 */
public class CargarCatalizadores extends CargarArmas{

    //Array que guarda las catalizadores
    private ArrayList<Catalizadores> listaCatalizadores= new ArrayList<>();

    /**
     * Metodo extendido de CargarArmas que lee las lineas del archivo y guarda los datos en las respectivas posiciones del array
     * @param listaPropiedadesArmas
     */
    protected void leerLineas(String[] listaPropiedadesArmas){
        Catalizadores catalizador = new Catalizadores(Integer.parseInt(listaPropiedadesArmas[0]),Integer.parseInt(listaPropiedadesArmas[1]),listaPropiedadesArmas[2],listaPropiedadesArmas[3],listaPropiedadesArmas[4]);

        listaCatalizadores.add(catalizador);
    }

    /**
     * Metodo que carga el archivo donde se encuentran las catalizadores
     * @return listaCatalizadores es el array que guarda las catalizadores
     */
    public ArrayList<Catalizadores> cargar(){

        String rutaArchivo = "src/armas/Catalizadores.txt";

        leerFicheros(rutaArchivo);

        return listaCatalizadores;
    }
}
