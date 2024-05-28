package entornoGrafico.creacionDeComponentes;

import javax.swing.*;
import java.awt.*;

/**
 * Clase que crea paneles y los añade a un panel
 */
public class CreacionDePaneles {

    /**
     * Metodo que crea un panel con un layout standard y lo añade a un panel
     * @param Panel
     * @param PanelAlQueAñadir
     * @param x
     * @param y
     * @param width
     * @param height
     */
    public static void crearPanelStandard(JPanel Panel, JPanel PanelAlQueAñadir, int x, int y, int width, int height){

        Panel.setBounds(x,y,width,height);
        Panel.setOpaque(false);
        PanelAlQueAñadir.add(Panel);

    }

    /**
     * Metodo que crea un panel con un layout null y lo añade a un panel
     * @param Panel
     * @param PanelAlQueAñadir
     * @param x
     * @param y
     * @param width
     * @param height
     */
    public static void crearPanelLayoutNull(JPanel Panel, JPanel PanelAlQueAñadir, int x, int y, int width, int height){

        Panel.setBounds(x,y,width,height);
        Panel.setLayout(null);
        Panel.setOpaque(false);
        PanelAlQueAñadir.add(Panel);

    }

    /**
     * Metodo que crea un panel invisible con un layout null y lo añade a un panel
     * @param Panel
     * @param PanelAlQueAñadir
     * @param x
     * @param y
     * @param width
     * @param height
     */
    public static void crearPanelLayoutNullVisibleFalse(JPanel Panel, JPanel PanelAlQueAñadir, int x, int y, int width, int height){

        Panel.setBounds(x,y,width,height);
        Panel.setLayout(null);
        Panel.setOpaque(false);
        PanelAlQueAñadir.add(Panel);
        Panel.setVisible(false);

    }

}
