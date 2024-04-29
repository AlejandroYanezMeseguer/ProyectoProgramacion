package cargarArmas;

import armas_java.Catalizadores;

import java.util.ArrayList;

public class CargarCatalizadores extends CargarArmas{

    private ArrayList<Catalizadores> listaCatalizadores= new ArrayList<>();

    protected void leerLineas(String[] listaPropiedadesArmas){
        Catalizadores catalizador = new Catalizadores(Integer.parseInt(listaPropiedadesArmas[0]),Integer.parseInt(listaPropiedadesArmas[1]),listaPropiedadesArmas[2],listaPropiedadesArmas[3],listaPropiedadesArmas[4]);

        listaCatalizadores.add(catalizador);
    }

    public ArrayList<Catalizadores> cargar(){

        String rutaArchivo = "src/armas/Catalizadores.txt";

        leerFicheros(rutaArchivo);

        return listaCatalizadores;
    }
}
