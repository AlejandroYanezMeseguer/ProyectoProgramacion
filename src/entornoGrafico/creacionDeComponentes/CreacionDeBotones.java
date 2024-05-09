package entornoGrafico.creacionDeComponentes;

import jugador.Jugador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
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

    /**
     * metodo que crea las acciones que ejecuta el boton ataqueJugador1
     * @param e
     * @param luchador1
     * @param luchador2
     */
    public static void botonAtaqueJugador1ActionPerformed(ActionEvent e, Jugador luchador1, Jugador luchador2,int daño, int vigorFinal, JLabel vida1,JLabel vida2,JLabel ganador,JPanel panelGanador,JPanel entornoPelea){

        daño = luchador1.atacar(1);
        vigorFinal = luchador2.recibirGolpe(daño);
        vida1.setText("Vida Jugador 1: " +luchador1.getVigor());
        vida2.setText("Vida Jugador 2: " +luchador2.getVigor());

        if (vigorFinal<0){

            ganador.setText("EL JUGADOR 1 HA GANADO");
            panelGanador.setVisible(true);
            entornoPelea.setVisible(false);

        }

    }

}
