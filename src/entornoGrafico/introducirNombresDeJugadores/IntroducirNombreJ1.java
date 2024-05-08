package entornoGrafico.introducirNombresDeJugadores;

import javax.swing.*;
import java.awt.*;
public class IntroducirNombreJ1 {
    public static void crearPanelIntroducirNombreJ1(JPanel panelIntroducirNombreJ1, JPanel seleccionPersonajeJ1){

        panelIntroducirNombreJ1.setBounds(0,0,940,115);
        panelIntroducirNombreJ1.setBackground(Color.cyan);
        panelIntroducirNombreJ1.setLayout(null);
        seleccionPersonajeJ1.add(panelIntroducirNombreJ1);
    }

    public static void crearEtiquetaIntroducirNombreJ1(JLabel introducirNombreJ1, JPanel panelIntroducirNombreJ1){

        introducirNombreJ1.setText("Nombre del jugador 1:");
        introducirNombreJ1.setBounds(290,8,300,36);
        introducirNombreJ1.setFont(new Font(null,Font.PLAIN,26));
        panelIntroducirNombreJ1.add(introducirNombreJ1);

    }

    public static void crearTextFieldNombreJ1(JTextField nombreJ1, JPanel panelIntroducirNombreJ1){

        nombreJ1.setBounds(280,55,300,32);
        nombreJ1.setFont(new Font(null,Font.PLAIN,24));
        panelIntroducirNombreJ1.add(nombreJ1);

    }

}
