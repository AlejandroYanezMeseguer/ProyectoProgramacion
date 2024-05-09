package entornoGrafico.creacionDeComponentes;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class CreacionDeBotones {

    public static void crearBotonTexto(JButton Boton, JPanel PanelDondeAñadir, int x, int y, int width, int height, int TamañoFuente){

        Boton.setBounds(x,y,width,height);
        Boton.setFont(new Font(null,Font.PLAIN,TamañoFuente));
        PanelDondeAñadir.add(Boton);

    }

    public static void crearBotonImagen(JButton Boton, JPanel PanelDondeAñadir, int x, int y, int width, int height, BufferedImage imagen){

        Boton.setBounds(x,y,width,height);
        Boton.setIcon(new ImageIcon(imagen.getScaledInstance(Boton.getWidth(),Boton.getHeight(), Image.SCALE_SMOOTH)));
        PanelDondeAñadir.add(Boton);

    }


}
