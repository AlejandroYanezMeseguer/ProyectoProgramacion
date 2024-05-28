package entornoGrafico.PanelesInformacion;

import Configuracion.CargarConfiguration;
import jugador.Jugador;
import jugador.TipoGuerrero;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;

public class PanelesInformacionArmas {

    private JPanel panel;
    private Jugador jugador;
    final int VALOR_INICIAL_X = 100;
    final int INCREMENTO_EJE_X = 200;
    final int VALOR_INICIAL_Y = 72;
    final int INCREMENTO_EJE_Y = 132;

    public static ArrayList<String> cargarStats(TipoGuerrero tipoGuerrero)  {

        ArrayList<String> armas = new ArrayList<String>();

        try(Connection connection = DriverManager.getConnection(CargarConfiguration.CadenaDeConexion);
            Statement statement = connection.createStatement();
        )
        {

            String consulta = "select * from Armas where TipoGuerrero = \'" +tipoGuerrero.toString() + "\'";

            ResultSet rs = statement.executeQuery(consulta);
            while(rs.next())
            {
                armas.add(stats(rs.getInt("Dano"),
                        rs.getInt("Durabilidad"),
                        rs.getString("Escalabilidad"),
                        rs.getString("VelocidadAtaque"))
                );
            }

        }catch(SQLException e)
        {
            e.printStackTrace(System.err);
        }

        return armas;
    }


    private static String stats(int dano, int durabilidad, String escalabilidad, String velocidadAtaque) {
        String stats = "ATK: " +dano +"<br>"+"DRBL: " +durabilidad +"<br>"+"ESCL: " +escalabilidad +"<br>"+"VEL: " +velocidadAtaque;

        return "<html><p>" +stats +"</html></p>";
    }

    /**
     * Constructor de la clase panelesInformacionArmas
     * @param panel
     * @param jugador
     */
    public PanelesInformacionArmas(JPanel panel, Jugador jugador) {
        this.panel = panel;
        this.jugador = jugador;
    }

    public void statsArmas(TipoGuerrero tipoGuerrero) {

        int incrementoColumna = 0;
        boolean cambioColumna;

        for (int i = 0; i < 2; i++) {

            cambioColumna = true;

            for (int j = 0; j < 8; j++) {

                switch (i) {
                    case 0 -> {
                        JLabel estadisticasArmas = new JLabel(cargarStats(tipoGuerrero).get(j));
                        estadisticasArmas.setName(i + "|" + j);
                        int y = VALOR_INICIAL_Y + j * INCREMENTO_EJE_Y;
                        if (j > 3) {

                            if (cambioColumna) {

                                incrementoColumna++;
                                cambioColumna = false;

                            }
                            y = VALOR_INICIAL_Y + (j - 4) * INCREMENTO_EJE_Y;

                        }
                        int x = VALOR_INICIAL_X + (i + incrementoColumna) * INCREMENTO_EJE_X;
                        estadisticasArmas.setBounds(x, y, 85, 80);
                        estadisticasArmas.setFont(new Font(null, Font.PLAIN, 12));
                        estadisticasArmas.setForeground(new Color(255,228,152,100));
                        panel.add(estadisticasArmas);
                    }
                    case 1 -> {
                        JLabel estadisticasArmas = new JLabel(cargarStats(tipoGuerrero).get(j + 8));
                        estadisticasArmas.setName(i + "|" + j);
                        int y = VALOR_INICIAL_Y + j * INCREMENTO_EJE_Y;
                        if (j > 3) {

                            if (cambioColumna) {

                                incrementoColumna++;
                                cambioColumna = false;

                            }
                            y = VALOR_INICIAL_Y + (j - 4) * INCREMENTO_EJE_Y;

                        }
                        int x = VALOR_INICIAL_X + (i + incrementoColumna) * INCREMENTO_EJE_X;
                        estadisticasArmas.setBounds(x, y, 100, 80);
                        estadisticasArmas.setFont(new Font(null, Font.PLAIN, 12));
                        estadisticasArmas.setForeground(new Color(255,228,152,100));
                        panel.add(estadisticasArmas);
                    }
                }
            }
        }
    }
}
