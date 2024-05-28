package API;

import Configuracion.CargarConfiguration;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;

/**
 * Clase SincronizacionArmas que se utilizara para sincronizar las armas con la API
 */
public class SincronizacionArmas {

    /**
     * Metodo que se utilizara para sincronizar las armas con la API
     */
    public static void sincronizar()  {

        ConexionAPIArmas APIArmas = new ConexionAPIArmas();

        ArrayList<Armas> armas = new ArrayList<Armas>();

        try(Connection connection = DriverManager.getConnection(CargarConfiguration.CadenaDeConexion);
            Statement statement = connection.createStatement();
        )
        {
            String consulta = "select * from Armas where UrlLink is null";
            ResultSet rs = statement.executeQuery(consulta);
            while(rs.next())
            {
                armas.add(new Armas
                        (rs.getInt("Id"),
                         rs.getString("EldenRingReferencia"),
                         rs.getString("UrlLink"))
                );
            }
            // Si hay armas sin imagen, se descargan las imagenes de la API
            if(armas.size() > 0){
                EldenRingData eldenRingData = APIArmas.APIArmas();
                for (Armas arma : armas) {
                    String urlLink = eldenRingData.getEldenRingReferenciaArmas(arma.EldenRingReferencia);
                    BufferedImage imagenArma = null;
                    String ruta = "src/imagenes/Armas/" + arma.EldenRingReferencia + ".png";
                    try {
                        imagenArma = ImageIO.read(new URL(urlLink));
                        File outputFile = new File(ruta);
                        ImageIO.write(imagenArma, "png", outputFile);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    statement.executeUpdate("update Armas set UrlLink = \'" + ruta + "\' where Id = " + arma.id);
                }
            }
        }catch(SQLException e)
        {
            e.printStackTrace(System.err);
        }
    }

}
