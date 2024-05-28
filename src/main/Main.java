
package main;

import API.ConexionAPIArmas;
import API.ConexionAPIEscudos;
import API.SincronizacionArmas;
import API.SincronizacionEscudos;
import Configuracion.CargarConfiguration;
import entornoGrafico.EntornoGrafico;

import java.io.IOException;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws IOException, SQLException {
        CargarConfiguration.leerFicheros();

        ConexionAPIEscudos escudos = new ConexionAPIEscudos();
        SincronizacionEscudos sincronizacionEscudos = new SincronizacionEscudos();
        sincronizacionEscudos.sincronizar();

        EntornoGrafico xss = new EntornoGrafico();

        xss.setVisible(true);


    }
    
}
