package cargarArmas;

import armas_java.Bastones;

import java.util.ArrayList;

public class CargarBastones extends CargarArmas{

    private ArrayList<Bastones> listaBastones= new ArrayList<>();

    protected void leerLineas(String[] listaPropiedadesArmas){
        Bastones baston = new Bastones(Integer.parseInt(listaPropiedadesArmas[0]),Integer.parseInt(listaPropiedadesArmas[1]),listaPropiedadesArmas[2],listaPropiedadesArmas[3],listaPropiedadesArmas[4]);

        listaBastones.add(baston);
    }

    public ArrayList<Bastones> cargar(){

        String rutaArchivo = "src/armas/Bastones.txt";

        leerFicheros(rutaArchivo);

        return listaBastones;
    }
}
