package entornoGrafico.creacionDeComponentes;

import javax.swing.*;
import java.awt.*;
/**
 * Clase que crea textfields y los añade a un panel
 */
public class CreacionDeTextField {

    /**
     * Metodo que crea un textfield y lo añade a un panel
     * @param TexField
     * @param PanelDondeAñadir
     * @param x
     * @param y
     * @param width
     * @param height
     * @param TamañoFuente
     */
    public static void crearTextFieldStandard(JTextField TexField, JPanel PanelDondeAñadir, int x, int y, int width, int height, int TamañoFuente){

        TexField.setBounds(x,y,width,height);
        TexField.setFont(new Font(null,Font.PLAIN,TamañoFuente));
        TexField.setOpaque(false);
        TexField.setForeground(Color.BLACK);
        TexField.setBorder(null);
        PanelDondeAñadir.add(TexField);

    }

}
