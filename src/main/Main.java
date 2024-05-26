
package main;

import API.ConexionAPIEscudos;
import API.SincronizacionEscudos;
import Configuracion.CargarConfiguration;
import entornoGrafico.EntornoGrafico;

import java.io.IOException;
import java.sql.SQLException;
//import Guerrero.Guerrero;
//import Guerrero.TipoGuerrero;

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
