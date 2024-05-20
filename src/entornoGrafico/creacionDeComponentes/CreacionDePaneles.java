package entornoGrafico.creacionDeComponentes;

import javax.swing.*;
import java.awt.*;

public class CreacionDePaneles {
    public static void crearPanelStandard(JPanel Panel, JPanel PanelAlQueAñadir, int x, int y, int width, int height){

        Panel.setBounds(x,y,width,height);
        Panel.setOpaque(false);
        PanelAlQueAñadir.add(Panel);

    }

    public static void crearPanelLayoutNull(JPanel Panel, JPanel PanelAlQueAñadir, int x, int y, int width, int height){

        Panel.setBounds(x,y,width,height);
        Panel.setLayout(null);
        Panel.setOpaque(false);
        PanelAlQueAñadir.add(Panel);

    }

    public static void crearPanelLayoutNullVisibleFalse(JPanel Panel, JPanel PanelAlQueAñadir, int x, int y, int width, int height){

        Panel.setBounds(x,y,width,height);
        Panel.setLayout(null);
        Panel.setOpaque(false);
        PanelAlQueAñadir.add(Panel);
        Panel.setVisible(false);

    }

}
