package entornoGrafico.AccionesBotones;

import jugador.Jugador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import static entornoGrafico.PanelesInformacion.PanelesInformacionClases.crearPanelesInformacionClases;

public class AccionBotonElegirClase {

    public static void seleccionarclase(ActionEvent e, JButton botonSeleccionado,JButton botondDeseleccionado1,JButton botondDeseleccionado2){
        botonSeleccionado.setEnabled(false);
        botondDeseleccionado1.setEnabled(true);
        botondDeseleccionado2.setEnabled(true);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton empezarALuchar
     * @param e
     */
    public static void empezarALuchar(ActionEvent e, Jugador luchador1, Jugador luchador2,JTextArea cometarios,JPanel seleccionPersonaje,JPanel entorno,JLabel mostrarnombre1,JLabel mostrarnombre2,JTextField nombre1,JTextField nombre2,JLabel vida1,JLabel vida2){

        ArrayList<String> validaciones = validarJugadores(luchador1,luchador2,nombre1,nombre2);

        String mensajes = "";

        for (String validar : validaciones) {
            mensajes+=validar+"\n";
        }
        cometarios.setText(mensajes);

        if (!validaciones.isEmpty()) {
            return;
        }

        seleccionPersonaje.setVisible(false);
        entorno.setVisible(true);
        mostrarnombre1.setText(nombre1.getText());
        mostrarnombre2.setText(nombre2.getText());
        vida1.setText("Vida Jugador 1: " +luchador1.getVigor());
        vida2.setText("Vida Jugador 2: " +luchador2.getVigor());

    }

    /**
     * metodo que añade a un arraylist mensajes de error al iniciar partida
     * @return mensajes con los mensajes añadidos
     */
    private static ArrayList<String> validarJugadores(Jugador luchador1, Jugador luchador2, JTextField nombre1, JTextField nombre2){

        ArrayList<String> mensajes = new ArrayList<String>();

        if (luchador1 == null){
            mensajes.add("Falta seleccionar clase del jugador 1 ☹\uFE0F");
        }
        if (luchador2 == null){
            mensajes.add("Falta seleccionar clase del jugador 2 ☹\uFE0F");
        }
        if (nombre1.getText().isEmpty()){
            mensajes.add("Falta nombre jugador 1 ☹\uFE0F");
        }
        if (nombre2.getText().isEmpty()){
            mensajes.add("Falta nombre jugador 2 ☹\uFE0F");
        }
        return mensajes;
    }
}
