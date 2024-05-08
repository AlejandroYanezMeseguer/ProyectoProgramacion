package entornoGrafico.creacionDeComponentes;

import javax.swing.*;
import java.awt.*;

public class CreacionDePaneles {
    public static void crearPanelStandard(JPanel Panel, JPanel PanelAlQueAñadir, int x, int y, int width, int height, Color color){

        Panel.setBounds(x,y,width,height);
        Panel.setBackground(color);
        PanelAlQueAñadir.add(Panel);

    }

    public static void crearPanelLayoutNull(JPanel Panel, JPanel PanelAlQueAñadir, int x, int y, int width, int height, Color color){

        Panel.setBounds(x,y,width,height);
        Panel.setBackground(color);
        Panel.setLayout(null);
        PanelAlQueAñadir.add(Panel);

    }

    public static void crearPanelLayoutNullVisibleFalse(JPanel Panel, JPanel PanelAlQueAñadir, int x, int y, int width, int height, Color color){

        Panel.setBounds(x,y,width,height);
        Panel.setBackground(color);
        Panel.setLayout(null);
        PanelAlQueAñadir.add(Panel);
        Panel.setVisible(false);

    }

}
