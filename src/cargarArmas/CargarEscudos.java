package cargarArmas;

import armas_java.Escudo;

import java.util.ArrayList;

/**
 * Clase que crea las escudos
 */
public class CargarEscudos extends CargarArmas{

    //Array que guarda las escudos
    private ArrayList<Escudo> listaEscudos = new ArrayList<>();

    /**
     * Metodo extendido de CargarArmas que lee las lineas del archivo y guarda los datos en las respectivas posiciones del array
     * @param listaPropiedadesArmas
     */
    protected void leerLineas(String[] listaPropiedadesArmas){
        Escudo escudo = new Escudo(Integer.parseInt(listaPropiedadesArmas[0]),Integer.parseInt(listaPropiedadesArmas[1]));

        listaEscudos.add(escudo);
    }

    /**
     * Metodo que carga el archivo donde se encuentran las escudos
     * @return listaEscudos es el array que guarda las escudos
     */
    public ArrayList<Escudo> cargar(){

        String rutaArchivo = "src/armas/Escudos.txt";

        leerFicheros(rutaArchivo);

        return listaEscudos;
    }
}
