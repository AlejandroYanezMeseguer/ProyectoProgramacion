package cargarArmas;

import Configuracion.CargarConfiguration;
import armas_java.Espadas;
import armas_java.Hachas;
import interfaces.IAcciones;
import jugador.TipoGuerrero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CargarArmasGuerrero {

    public static ArrayList<IAcciones> cargar(TipoGuerrero tipoGuerrero)  {

        ArrayList<IAcciones> armas = new ArrayList<IAcciones>();

        try(Connection connection = DriverManager.getConnection(CargarConfiguration.CadenaDeConexion);
             Statement statement = connection.createStatement();
             )
        {

            String consulta = "select * from Armas where TipoGuerrero = \'" +tipoGuerrero.Guerrero.toString() + "\'";

            ResultSet rs = statement.executeQuery(consulta);
            while(rs.next())
            {
                armas.add(crearArma(rs.getInt("Dano"),
                        rs.getInt("Durabilidad"),
                        rs.getString("Escalabilidad"),
                        rs.getString("VelocidadAtaque"),
                        rs.getString("Nombre"),
                        rs.getInt("TipoDeArma"))
                );
            }

            }catch(SQLException e)
            {
                e.printStackTrace(System.err);
            }

        return armas;
    }
    public static IAcciones crearArma(int daño, int durabilidad, String escalabilidad, String velocidadAtaque,String nombre,int tipoArma){

        switch (tipoArma){
            case 0 -> {return new Hachas(daño,durabilidad,escalabilidad,velocidadAtaque,nombre);}
            case 1 -> {return new Espadas(daño,durabilidad,escalabilidad,velocidadAtaque,nombre);}
        }

        return null;
    }


}
