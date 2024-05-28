package entornoGrafico.creacionDeComponentes;

import javax.swing.*;
import java.awt.*;

/**
 * Clase que crea etiquetas y las añade a un panel
 */
public class CreacionDeEtiquetas {

    /**
     * Metodo que crea una etiqueta con un texto y la añade a un panel
     * @param Etiqueta
     * @param PanelDondeAñadir
     * @param x
     * @param y
     * @param width
     * @param height
     * @param TamañoFuente
     */
    public static void CrearEtiquetaStandard(JLabel Etiqueta, JPanel PanelDondeAñadir, int x, int y, int width, int height, int TamañoFuente){

        Etiqueta.setBounds(x,y,width,height);
        Etiqueta.setFont(new Font(null,Font.PLAIN,TamañoFuente));
        Etiqueta.setForeground(Color.BLACK);
        PanelDondeAñadir.add(Etiqueta);

    }

}
