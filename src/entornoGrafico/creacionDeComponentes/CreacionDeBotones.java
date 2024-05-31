package entornoGrafico.creacionDeComponentes;


import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Clase que crea botones con texto o con imagen y los añade a un panel
 */
public class CreacionDeBotones {

    /**
     * Metodo que crea un boton con una imagen y lo añade a un panel
     * @param Boton
     * @param PanelDondeAñadir
     * @param x
     * @param y
     * @param width
     * @param height
     * @param imagen
     */
    public static void crearBotonImagen(JButton Boton, JPanel PanelDondeAñadir, int x, int y, int width, int height, BufferedImage imagen){

        Boton.setBounds(x,y,width,height);
        Boton.setIcon(new ImageIcon(imagen.getScaledInstance(Boton.getWidth(),Boton.getHeight(), Image.SCALE_SMOOTH)));
        Boton.setBorder(null);
        Boton.setContentAreaFilled(false);
        PanelDondeAñadir.add(Boton);

    }

}
