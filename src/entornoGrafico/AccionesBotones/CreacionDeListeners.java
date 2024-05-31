package entornoGrafico.AccionesBotones;

import jugador.Jugador;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.function.Supplier;

/**
 * Clase que crea los listeners de los botones
 */
public class CreacionDeListeners{

    /**
     * Metodo que añade un listener a un boton
     * @param button
     * @param listener
     */
    public static void addListener(JButton button, ActionListener listener) {
        button.addActionListener(listener);
    }

    public static void addListenerJugador(Jugador jugador, ActionListener listener) {
        jugador.addActionListener(listener);
    }

    /**
     * Metodo que añade un mouseistener a un boton
     * @param button
     * @param panel
     * @param etiqueta
     * @param statsSupplier
     */
    public static void addMouseListenerToButton(JButton button, JPanel panel,JLabel etiqueta, Supplier<String> statsSupplier) {
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            //Muestra las estadisticas del arma al pasar el raton por encima
            public void mouseEntered(MouseEvent evt) {
                etiqueta.setText(statsSupplier.get());
                panel.setVisible(true);
            }
            //Oculta las estadisticas del arma al salir el raton
            public void mouseExited(java.awt.event.MouseEvent evt) {
                etiqueta.setText("");
                panel.setVisible(false);
            }
        });
    }
}
