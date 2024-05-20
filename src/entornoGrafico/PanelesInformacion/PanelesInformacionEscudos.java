package entornoGrafico.PanelesInformacion;

import jugador.Jugador;
import jugador.TipoGuerrero;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;

public class PanelesInformacionEscudos {

    private JPanel panel;
    private Jugador jugador;
    final int VALOR_INICIAL_X = -310;
    final int INCREMENTO_EJE_X = 240;
    final int VALOR_INICIAL_Y = 80;
    final int INCREMENTO_EJE_Y = 165;
    final int LADO_BOTON = 95;
    private int etiquetasPorColumna = 3;

public PanelesInformacionEscudos(JPanel panel, Jugador jugador) {
        this.panel = panel;
        this.jugador = jugador;
    }
public static ArrayList<String> cargarStatsEscudos()  {

        ArrayList<String> escudos = new ArrayList<String>();

        try(Connection connection = DriverManager.getConnection("jdbc:sqlite:DB/coia_ring.db");
            Statement statement = connection.createStatement();
        )
        {

            String consulta = "select * from Escudos";

            ResultSet rs = statement.executeQuery(consulta);
            while(rs.next())
            {
                escudos.add(stats(rs.getInt("Defensa"),
                        rs.getInt("Peso"))
                );
            }

        }catch(SQLException e)
        {
            e.printStackTrace(System.err);
        }

        return escudos;
    }
    private static String stats(int defensa, int Peso) {
        String stats = "DEF: " +defensa +"<br>"+"PESO: " +Peso;

        return "<html><p>" +stats +"</html></p>";
    }

    public void statsEscudos() {

        int incrementoColumna = 0;
        boolean cambioColumna = true;

        for(int i = 2;i < 3; i++){

            for(int j = 0;j < 9; j++){

                JLabel estadisticasEscudos = new JLabel(cargarStatsEscudos().get(j));
                estadisticasEscudos.setName(i +"|" +j);
                int y = VALOR_INICIAL_Y +j*INCREMENTO_EJE_Y;
                if (j==6){
                    cambioColumna=true;
                    etiquetasPorColumna = 6;
                }
                if (j>2){

                    if(cambioColumna){

                        incrementoColumna++;
                        cambioColumna=false;

                    }
                    y = VALOR_INICIAL_Y +(j- etiquetasPorColumna)*INCREMENTO_EJE_Y;

                }
                int x = VALOR_INICIAL_X +(i+incrementoColumna)*INCREMENTO_EJE_X;
                estadisticasEscudos.setBounds(x,y,LADO_BOTON,LADO_BOTON);
                estadisticasEscudos.setFont(new Font(null, Font.PLAIN, 15));
                estadisticasEscudos.setForeground(new Color(255,228,152,200));
                panel.add(estadisticasEscudos);
            }
        }

    }


}
