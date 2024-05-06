package cargarArmas;

import armas_java.Hachas;

import java.util.ArrayList;

/**
 * Clase que crea las hachas
 */
public class CargarHachas extends CargarArmas{

    //Array que guarda las hachas
    private ArrayList<Hachas> listaHachas= new ArrayList<>();

    /**
     * Metodo extendido de CargarArmas que lee las lineas del archivo y guarda los datos en las respectivas posiciones del array
     * @param listaPropiedadesArmas
     */
    protected void leerLineas(String[] listaPropiedadesArmas) {
        Hachas hacha = new Hachas(Integer.parseInt(listaPropiedadesArmas[0]),Integer.parseInt(listaPropiedadesArmas[1]),listaPropiedadesArmas[2],listaPropiedadesArmas[3],listaPropiedadesArmas[4]);

        listaHachas.add(hacha);
    }

    /**
     * Metodo que carga el archivo donde se encuentran las hachas
     * @return listaHachas es el array que guarda las hachas
     */
    public ArrayList<Hachas> cargar(){

        String rutaArchivo = "src/armas/Hachas.txt";

        leerFicheros(rutaArchivo);

        return listaHachas;
    }



}
