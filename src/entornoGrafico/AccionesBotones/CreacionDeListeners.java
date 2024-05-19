package entornoGrafico.AccionesBotones;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.function.Supplier;


public class CreacionDeListeners{

    public static void addListener(JButton button, ActionListener listener) {
        button.addActionListener(listener);
    }

    public static void addMouseListenerToButton(JButton button, JPanel panel,JLabel etiqueta, Supplier<String> statsSupplier) {
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                etiqueta.setText(statsSupplier.get());
                panel.setVisible(true);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                etiqueta.setText("");
                panel.setVisible(false);
            }
        });
    }
}
