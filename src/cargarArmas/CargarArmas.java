package cargarArmas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase abstracta  con los metodos que cargan las armas
 */
public abstract class CargarArmas {

    /**
     * Metodo que carga el fichero donde estan las estadisticas de las armas
     * @param rutaArchivo
     */
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

    /**
     * Metodo que lee las lineas de los archivos
     * @param listaPropiedadesArmas
     */
    protected abstract void leerLineas(String[] listaPropiedadesArmas);


}
