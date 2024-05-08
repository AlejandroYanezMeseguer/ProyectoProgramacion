package entornoGrafico.introducirNombresDeJugadores;

import javax.swing.*;
import java.awt.*;
public class Provisional {

    /**
     * metodo que crea la etiqueta que indica que se debe introducir el nombre del jugador
     * @param introducirNombreJ1
     * @param panelIntroducirNombreJ1
     * @param textoEtiqueta
     */
    public static void crearEtiquetaIntroducirNombre(JLabel introducirNombreJ1, JPanel panelIntroducirNombreJ1, String textoEtiqueta){

        introducirNombreJ1.setText(textoEtiqueta);
        introducirNombreJ1.setBounds(290,8,300,36);
        introducirNombreJ1.setFont(new Font(null,Font.PLAIN,26));
        panelIntroducirNombreJ1.add(introducirNombreJ1);

    }

    /**
     * metodo que crea el JtextField donde se introducira el nombre del jugador
     * @param nombreJ1
     * @param panelIntroducirNombreJ1
     */
    public static void crearTextFieldNombre(JTextField nombreJ1, JPanel panelIntroducirNombreJ1){

        nombreJ1.setBounds(280,55,300,32);
        nombreJ1.setFont(new Font(null,Font.PLAIN,24));
        panelIntroducirNombreJ1.add(nombreJ1);

    }

}
