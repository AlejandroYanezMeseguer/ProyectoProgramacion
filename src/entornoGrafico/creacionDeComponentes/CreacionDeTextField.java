package entornoGrafico.creacionDeComponentes;

import javax.swing.*;
import java.awt.*;
public class CreacionDeTextField {

    public static void crearTextFieldStandard(JTextField TexField, JPanel PanelDondeAñadir, int x, int y, int width, int height, int TamañoFuente){

        TexField.setBounds(x,y,width,height);
        TexField.setFont(new Font(null,Font.PLAIN,TamañoFuente));
        PanelDondeAñadir.add(TexField);

    }

}
