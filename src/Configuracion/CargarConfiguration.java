package Configuracion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public  class CargarConfiguration {

    public static String CadenaDeConexion;

  public static void leerFicheros() {
      try {
          // Abrir el archivo para leerlo
          FileReader fr = new FileReader("src/Configuracion/Config.txt");
          BufferedReader br = new BufferedReader(fr);

          String linea;

          // Leer el archivo línea por línea
          while ((linea = br.readLine()) != null) {
              String[] configurationItem = linea.split("\\|");
                if(configurationItem[0].equals("CadenaDeConexion")){
                    CadenaDeConexion = configurationItem[1];
                }


          }

          // Cerrar el archivo
          br.close();
      } catch (
              IOException e) {
          // Si ocurre un error, imprimir el mensaje de error
          System.out.println("Error leyendo el archivo: " + e.getMessage());
      }
  }



}
