package API;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;

public class SincronizacionEscudos {

    public static void sincronizar()  {

        ConexionAPIEscudos APIEscudos = new ConexionAPIEscudos();

        ArrayList<Escudos> escudos = new ArrayList<Escudos>();

        try(Connection connection = DriverManager.getConnection("jdbc:sqlite:DB/coia_ring.db");
            Statement statement = connection.createStatement();
        )
        {
            String consulta = "select * from Escudos where UrlLink is null";
            ResultSet rs = statement.executeQuery(consulta);
            while(rs.next())
            {
                escudos.add(new Escudos
                        (rs.getInt("Id"),
                        rs.getString("EldenRingReferencia"),
                        rs.getString("UrlLink"))
                );
            }
            if(escudos.size() > 0){
                EldenRingData eldenRingData = APIEscudos.APIEscudos();
                for (Escudos escudo : escudos) {
                    String urlLink = eldenRingData.getEldenRingReferencia(escudo.EldenRingReferencia);
                    BufferedImage imagenEscudo = null;
                    String ruta = "src/imagenes/Escudos/" + escudo.EldenRingReferencia + ".png";
                    try {
                        imagenEscudo = ImageIO.read(new URL(urlLink));
                        File outputFile = new File(ruta);
                        ImageIO.write(imagenEscudo, "png", outputFile);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    statement.executeUpdate("update Escudos set UrlLink = \'" + ruta + "\' where Id = " + escudo.id);
                }
            }
        }catch(SQLException e)
        {
            e.printStackTrace(System.err);
        }
    }
}
