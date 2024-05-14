package entornoGrafico.creacionDeComponentes;

import javax.swing.*;
import java.awt.*;

public class CreacionDeEtiquetas {

    public static void CrearEtiquetaStandard(JLabel Etiqueta, JPanel PanelDondeAñadir, int x, int y, int width, int height, int TamañoFuente){

        Etiqueta.setBounds(x,y,width,height);
        Etiqueta.setFont(new Font(null,Font.PLAIN,TamañoFuente));
        PanelDondeAñadir.add(Etiqueta);

    }

}
