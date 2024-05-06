package cargarArmas;

import armas_java.Bastones;

import java.util.ArrayList;

/**
 * Clase que crea las bastones
 */
public class CargarBastones extends CargarArmas{

    //Array que guarda las bastones
    private ArrayList<Bastones> listaBastones= new ArrayList<>();

    /**
     * Metodo extendido de CargarArmas que lee las lineas del archivo y guarda los datos en las respectivas posiciones del array
     * @param listaPropiedadesArmas
     */
    protected void leerLineas(String[] listaPropiedadesArmas){
        Bastones baston = new Bastones(Integer.parseInt(listaPropiedadesArmas[0]),Integer.parseInt(listaPropiedadesArmas[1]),listaPropiedadesArmas[2],listaPropiedadesArmas[3],listaPropiedadesArmas[4]);

        listaBastones.add(baston);
    }

    /**
     * Metodo que carga el archivo donde se encuentran las bastones
     * @return listaBastones es el array que guarda las bastones
     */
    public ArrayList<Bastones> cargar(){

        String rutaArchivo = "src/armas/Bastones.txt";

        leerFicheros(rutaArchivo);

        return listaBastones;
    }
}
