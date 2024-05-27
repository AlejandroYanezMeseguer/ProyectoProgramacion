package entornoGrafico.creacionDeComponentes;

import javax.swing.*;
import java.awt.*;

/**
 * Clase que crea textareas y las añade a un panel
 */
public class CreacionDeTextArea {

    /**
     * Metodo que crea un textarea y lo añade a un panel
     * @param TextArea
     * @param PanelDondeAñadir
     * @param x
     * @param y
     * @param width
     * @param height
     * @param TamañoFuente
     */
    public static void crearTextArea (JTextArea TextArea, JPanel PanelDondeAñadir, int x, int y, int width, int height, int TamañoFuente){

        TextArea.setBounds(x,y,width,height);
        TextArea.setOpaque(false);
        TextArea.setFont(new Font(null,Font.PLAIN,TamañoFuente));
        TextArea.setForeground(Color.BLACK);
        PanelDondeAñadir.add(TextArea);

    }

}
