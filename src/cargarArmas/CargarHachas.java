package cargarArmas;

import armas_java.Hachas;

import java.util.ArrayList;

public class CargarHachas extends CargarArmas{

    private ArrayList<Hachas> listaHachas= new ArrayList<>();

    protected void leerLineas(String[] listaPropiedadesArmas) {
        Hachas hacha = new Hachas(Integer.parseInt(listaPropiedadesArmas[0]),Integer.parseInt(listaPropiedadesArmas[1]),listaPropiedadesArmas[2],listaPropiedadesArmas[3],listaPropiedadesArmas[4]);

        listaHachas.add(hacha);
    }

    public ArrayList<Hachas> cargar(){

        String rutaArchivo = "src/armas/Hachas.txt";

        leerFicheros(rutaArchivo);

        return listaHachas;
    }



}
