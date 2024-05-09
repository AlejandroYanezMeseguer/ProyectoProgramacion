package entornoGrafico.AccionesBotones;

import javax.swing.*;

import java.awt.event.ActionListener;


public class CreacionDeListeners{

    public static void addListener(JButton button, ActionListener listener) {
        button.addActionListener(listener);
    }
}
