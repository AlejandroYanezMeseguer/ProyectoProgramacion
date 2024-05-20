package entornoGrafico.creacionDeComponentes;

import jugador.Jugador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;

public class CreacionDeBotones {

    /**
     * Metodo que crea un boton con un texto y lo añade a un panel
     * @param Boton
     * @param PanelDondeAñadir
     * @param x
     * @param y
     * @param width
     * @param height
     * @param TamañoFuente
     */
    public static void crearBotonTexto(JButton Boton, JPanel PanelDondeAñadir, int x, int y, int width, int height, int TamañoFuente){

        Boton.setBounds(x,y,width,height);
        Boton.setFont(new Font(null,Font.PLAIN,TamañoFuente));
        PanelDondeAñadir.add(Boton);

    }

    public static void crearBotonImagen(JButton Boton, JPanel PanelDondeAñadir, int x, int y, int width, int height, BufferedImage imagen){

        Boton.setBounds(x,y,width,height);
        Boton.setIcon(new ImageIcon(imagen.getScaledInstance(Boton.getWidth(),Boton.getHeight(), Image.SCALE_SMOOTH)));
        Boton.setBorder(null);
        Boton.setContentAreaFilled(false);
        PanelDondeAñadir.add(Boton);

    }

}
