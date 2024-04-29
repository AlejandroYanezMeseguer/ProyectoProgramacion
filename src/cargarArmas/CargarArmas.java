package cargarArmas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class CargarArmas {

    protected void leerFicheros(String rutaArchivo){

        try {
            // Abrir el archivo para leerlo
            FileReader fr = new FileReader(rutaArchivo);
            BufferedReader br = new BufferedReader(fr);

            String linea;

            // Leer el archivo línea por línea
            while ((linea = br.readLine()) != null) {
                String[] listaPropiedadesArmas =linea.split("\\|") ;

                leerLineas(listaPropiedadesArmas);

            }

            // Cerrar el archivo
            br.close();
        } catch (IOException e) {
            // Si ocurre un error, imprimir el mensaje de error
            System.out.println("Error leyendo el archivo: " + e.getMessage());
        }
    }

    protected abstract void leerLineas(String[] listaPropiedadesArmas);


}
