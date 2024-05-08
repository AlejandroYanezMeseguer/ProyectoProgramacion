package entornoGrafico.introducirNombresDeJugadores;

import javax.swing.*;
import java.awt.*;
public class PanelIntroducirNombre {
    public static void crearPanelIntroducirNombreJ1(JPanel panelIntroducirNombreJ1, JPanel seleccionPersonajeJ1){

        panelIntroducirNombreJ1.setBounds(0,0,940,115);
        panelIntroducirNombreJ1.setBackground(Color.cyan);
        panelIntroducirNombreJ1.setLayout(null);
        seleccionPersonajeJ1.add(panelIntroducirNombreJ1);
    }

    public static void crearPanelIntroducirNombreJ2(JPanel panelIntroducirNombreJ2, JPanel seleccionPersonajeJ2){

        panelIntroducirNombreJ2.setBounds(0,0,940,115);
        panelIntroducirNombreJ2.setBackground(Color.yellow);
        panelIntroducirNombreJ2.setLayout(null);
        seleccionPersonajeJ2.add(panelIntroducirNombreJ2);
    }

    public static void crearEtiquetaIntroducirNombre(JLabel introducirNombreJ1, JPanel panelIntroducirNombreJ1, String textoEtiqueta){

        introducirNombreJ1.setText(textoEtiqueta);
        introducirNombreJ1.setBounds(290,8,300,36);
        introducirNombreJ1.setFont(new Font(null,Font.PLAIN,26));
        panelIntroducirNombreJ1.add(introducirNombreJ1);

    }

    public static void crearTextFieldNombre(JTextField nombreJ1, JPanel panelIntroducirNombreJ1){

        nombreJ1.setBounds(280,55,300,32);
        nombreJ1.setFont(new Font(null,Font.PLAIN,24));
        panelIntroducirNombreJ1.add(nombreJ1);

    }

}
