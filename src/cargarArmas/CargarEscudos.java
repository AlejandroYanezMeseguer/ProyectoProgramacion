package cargarArmas;

import Configuracion.CargarConfiguration;
import armas_java.Escudos;
import interfaces.IAcciones;
import jugador.TipoGuerrero;

import java.sql.*;
import java.util.ArrayList;

public class CargarEscudos {

    public static ArrayList<IAcciones> cargar()  {

        ArrayList<IAcciones> escudos = new ArrayList<IAcciones>();

        try(Connection connection = DriverManager.getConnection(CargarConfiguration.CadenaDeConexion);
            Statement statement = connection.createStatement();
             )
        {

            String consulta = "select * from Escudos";

            ResultSet rs = statement.executeQuery(consulta);
            while(rs.next())
            {
                escudos.add(crearEscudo(rs.getInt("Defensa"),
                        rs.getInt("Peso"),
                        rs.getString("Nombre"),
                        rs.getString("UrlLink"))
                );
            }

            }catch(SQLException e)
            {
                e.printStackTrace(System.err);
            }

        return escudos;
    }
    public static IAcciones crearEscudo(int defensa, int peso, String nombre, String image){
           return new Escudos(defensa,peso,nombre,image);
    }
}



