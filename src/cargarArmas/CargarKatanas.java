package cargarArmas;

import armas_java.Katanas;

import java.util.ArrayList;

/**
 * Clase que crea las katanas
 */
public class CargarKatanas extends CargarArmas{

    //Array que guarda las katanas
    private ArrayList<Katanas> listaKatanas= new ArrayList<>();

    /**
     * Metodo extendido de CargarArmas que lee las lineas del archivo y guarda los datos en las respectivas posiciones del array
     * @param listaPropiedadesArmas
     */
    protected void leerLineas(String[] listaPropiedadesArmas){
        Katanas katana = new Katanas(Integer.parseInt(listaPropiedadesArmas[0]),Integer.parseInt(listaPropiedadesArmas[1]),listaPropiedadesArmas[2],listaPropiedadesArmas[3],listaPropiedadesArmas[4]);

        listaKatanas.add(katana);
    }

    /**
     * Metodo que carga el archivo donde se encuentran las katanas
     * @return listaKatanas es el array que guarda las katanas
     */
    public ArrayList<Katanas> cargar(){

        String rutaArchivo = "src/armas/Katanas.txt";

        leerFicheros(rutaArchivo);

        return listaKatanas;
    }
}
