package cargarArmas;

import armas_java.Alabardas;

import java.util.ArrayList;

public class CargarAlabardas extends CargarArmas{

    private ArrayList<Alabardas> listaAlabardas= new ArrayList<>();

    protected void leerLineas(String[] listaPropiedadesArmas){
        Alabardas alabarda = new Alabardas(Integer.parseInt(listaPropiedadesArmas[0]),Integer.parseInt(listaPropiedadesArmas[1]),listaPropiedadesArmas[2],listaPropiedadesArmas[3],listaPropiedadesArmas[4]);

        listaAlabardas.add(alabarda);
    }

    public ArrayList<Alabardas> cargar(){

        String rutaArchivo = "src/armas/Alabardas.txt";

        leerFicheros(rutaArchivo);

        return listaAlabardas;
    }

}
