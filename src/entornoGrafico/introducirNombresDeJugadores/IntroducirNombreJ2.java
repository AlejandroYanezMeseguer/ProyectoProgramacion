package entornoGrafico.introducirNombresDeJugadores;

import javax.swing.*;
import java.awt.*;

public class IntroducirNombreJ2 {
    public static void crearPanelIntroducirNombreJ2(JPanel panelIntroducirNombreJ2, JPanel seleccionPersonajeJ2){

        panelIntroducirNombreJ2.setBounds(0,0,940,115);
        panelIntroducirNombreJ2.setBackground(Color.yellow);
        panelIntroducirNombreJ2.setLayout(null);
        seleccionPersonajeJ2.add(panelIntroducirNombreJ2);
    }

    public static void crearEtiquetaIntroducirNombreJ2(JLabel introducirNombreJ2, JPanel panelIntroducirNombreJ2){

        introducirNombreJ2.setText("Nombre del jugador 2:");
        introducirNombreJ2.setBounds(290,8,300,36);
        introducirNombreJ2.setFont(new Font(null,Font.PLAIN,26));
        panelIntroducirNombreJ2.add(introducirNombreJ2);

    }

    public static void crearTextFieldNombreJ2(JTextField nombreJ2, JPanel panelIntroducirNombreJ2){

        nombreJ2.setBounds(280,55,300,32);
        nombreJ2.setFont(new Font(null,Font.PLAIN,24));
        panelIntroducirNombreJ2.add(nombreJ2);

    }

}
