package cargarArmas;

import armas_java.Katanas;

import java.util.ArrayList;

public class CargarKatanas extends CargarArmas{

    private ArrayList<Katanas> listaKatanas= new ArrayList<>();

    protected void leerLineas(String[] listaPropiedadesArmas){
        Katanas katana = new Katanas(Integer.parseInt(listaPropiedadesArmas[0]),Integer.parseInt(listaPropiedadesArmas[1]),listaPropiedadesArmas[2],listaPropiedadesArmas[3],listaPropiedadesArmas[4]);

        listaKatanas.add(katana);
    }

    public ArrayList<Katanas> cargar(){

        String rutaArchivo = "src/armas/Katanas.txt";

        leerFicheros(rutaArchivo);

        return listaKatanas;
    }
}
