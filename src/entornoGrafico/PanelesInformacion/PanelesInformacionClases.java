package entornoGrafico.PanelesInformacion;

import jugador.Jugador;

import javax.swing.*;
import java.awt.*;

public class PanelesInformacionClases {

    public static void crearPanelesInformacionClases(JLabel etiqueta, JPanel PanelAlQueAñadir, int x, int y, int width, int height, Color color, int tamañoFuente){

        etiqueta.setBounds(x,y,width,height);
        etiqueta.setBackground(color);
        etiqueta.setOpaque(false);
        etiqueta.setFont(new Font(null,Font.PLAIN,tamañoFuente));
        etiqueta.setForeground(Color.BLACK);
        PanelAlQueAñadir.add(etiqueta);

    }

}
