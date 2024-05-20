package entornoGrafico.creacionDeComponentes;

import javax.swing.*;
import java.awt.*;

public class CreacionDeTextArea {

    public static void crearTextArea (JTextArea TextArea, JPanel PanelDondeAñadir, int x, int y, int width, int height, int TamañoFuente){

        TextArea.setBounds(x,y,width,height);
        TextArea.setOpaque(false);
        TextArea.setFont(new Font(null,Font.PLAIN,TamañoFuente));
        TextArea.setForeground(Color.BLACK);
        PanelDondeAñadir.add(TextArea);

    }

}
