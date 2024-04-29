package cargarArmas;

import armas_java.Escudo;

import java.util.ArrayList;

public class CargarEscudos extends CargarArmas{

    private ArrayList<Escudo> listaEscudos = new ArrayList<>();

    protected void leerLineas(String[] listaPropiedadesArmas){
        Escudo escudo = new Escudo(Integer.parseInt(listaPropiedadesArmas[0]),Integer.parseInt(listaPropiedadesArmas[1]));

        listaEscudos.add(escudo);
    }

    public ArrayList<Escudo> cargar(){

        String rutaArchivo = "src/armas/Escudos.txt";

        leerFicheros(rutaArchivo);

        return listaEscudos;
    }
}
