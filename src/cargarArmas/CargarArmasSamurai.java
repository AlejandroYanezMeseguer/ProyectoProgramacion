package cargarArmas;

import Configuracion.CargarConfiguration;
import armas_java.Alabardas;
import armas_java.Katanas;
import interfaces.IAcciones;
import jugador.TipoGuerrero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Clase que carga las armas de los samurais
 */
public class CargarArmasSamurai {

    /**
     * Metodo que carga las armas de los samurais llamanado a la base de datos para obtener los datos
     * @param tipoGuerrero
     * @return armas
     */
    public static ArrayList<IAcciones> cargar(TipoGuerrero tipoGuerrero)  {

        ArrayList<IAcciones> armas = new ArrayList<IAcciones>();

        try(Connection connection = DriverManager.getConnection(CargarConfiguration.CadenaDeConexion);
            Statement statement = connection.createStatement();
             )
        {

            String consulta = "select * from Armas where TipoGuerrero = \'" +tipoGuerrero.Samurai.toString() + "\'";

            ResultSet rs = statement.executeQuery(consulta);
            while(rs.next())
            {
                armas.add(crearArma(rs.getInt("Dano"),
                        rs.getInt("Durabilidad"),
                        rs.getString("Escalabilidad"),
                        rs.getString("VelocidadAtaque"),
                        rs.getString("Nombre"),
                        rs.getInt("TipoDeArma")));
            }

            }catch(SQLException e)
            {
                e.printStackTrace(System.err);
            }

        return armas;
    }
    /**
     * Metodo que crea las armas en base a los datos obtenidos de la base de datos
     * @param daño
     * @param durabilidad
     * @param escalabilidad
     * @param velocidadAtaque
     * @param nombre
     * @param tipoArma
     * @return arma
     */
    public static IAcciones crearArma(int daño, int durabilidad, String escalabilidad, String velocidadAtaque,String nombre,int tipoArma){

        switch (tipoArma){
            case 0 -> {return new Alabardas(daño,durabilidad,escalabilidad,velocidadAtaque,nombre);}
            case 1 -> {return new Katanas(daño,durabilidad,escalabilidad,velocidadAtaque,nombre);}
        }

        return null;
    }


}
