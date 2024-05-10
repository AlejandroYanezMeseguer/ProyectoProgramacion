package entornoGrafico.AccionesBotones;

import entornoGrafico.cambioDeEquipamiento.PanelCambiarArmas;
import entornoGrafico.cambioDeEquipamiento.PanelCambiarEscudos;
import jugador.Jugador;
import jugador.Posicion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionBotonesDeAccion {

    public static void botonAtaqueJ1(ActionEvent e, Jugador luchador1, Jugador luchador2, int daño, int vigorFinal, JLabel vida1, JLabel vida2, JPanel panelGanador, JPanel entornoPelea) {

        daño = luchador1.atacar(1);
        vigorFinal = luchador2.recibirGolpe(daño);
        vida1.setText("Vida Jugador 1: " + luchador1.getVigor());
        vida2.setText("Vida Jugador 2: " + luchador2.getVigor());

        if (vigorFinal < 0) {

            panelGanador.setVisible(true);
            entornoPelea.setVisible(false);

        }

    }

    public static void botonAtaqueJ2(ActionEvent e, Jugador luchador1, Jugador luchador2, int daño, int vigorFinal, JLabel vida1, JLabel vida2, JPanel panelGanador, JPanel entornoPelea) {

        daño = luchador2.atacar(1);
        vigorFinal = luchador1.recibirGolpe(daño);
        vida1.setText("Vida Jugador 1: " + luchador1.getVigor());
        vida2.setText("Vida Jugador 2: " + luchador2.getVigor());

        if (vigorFinal < 0) {

            panelGanador.setVisible(true);
            entornoPelea.setVisible(false);

        }

    }

    /**
     * metodo que crea las acciones que ejecuta el boton cambiarArmaJ1
     *
     * @param e
     */
    public static void cambiarArma(ActionEvent e, JPanel panelCambiarArma, Jugador jugador, JPanel skin, int condicion) {

        PanelCambiarArmas armas = new PanelCambiarArmas(panelCambiarArma, jugador);
        var listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                seleccionDeEquipo(e, jugador,1);

            }
        };
        switch (condicion) {
            case 1: {
                armas.añadirArmasJ1(listener);

                armas.añadirNombresArmasJ1();
                skin.setVisible(false);
                panelCambiarArma.setVisible(true);
            }
            break;
            case 2: {
                armas.añadirArmasJ2(listener);

                armas.añadirNombresArmasJ2();
                skin.setVisible(false);
                panelCambiarArma.setVisible(true);
            }
        }
    }

    /**
     * metodo que crea las acciones que ejecuta el boton cambiarEscudoJ1
     *
     * @param e
     */
    public static void cambiarEscudo(ActionEvent e, JPanel panelCambiarEscudo, Jugador jugador, JPanel skin, int condicion) {
        PanelCambiarEscudos escudos = new PanelCambiarEscudos(panelCambiarEscudo, jugador);
        var listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                seleccionDeEquipo(e, jugador,2);

            }
        };
        switch (condicion) {
            case 1: {
                escudos.añadirEscudosJ1(listener);

                escudos.añadirNombresEscudosJ1();
                skin.setVisible(false);
                panelCambiarEscudo.setVisible(true);
            }
            break;
            case 2: {
                escudos.añadirEscudosJ2(listener);

                escudos.añadirNombresEscudosJ2();
                skin.setVisible(false);
                panelCambiarEscudo.setVisible(true);
            }
        }
    }


    /**
     * metodo que crea las acciones que se le pasan al listener de seleccionDeArmaJ1 para el J1
     *
     * @param e
     */
    public static void seleccionDeEquipo(ActionEvent e, Jugador jugador1, int condicion) {

        var boton = (JButton) e.getSource();
        String[] posicionArma = boton.getName().split("\\|");

        int x = Integer.parseInt(posicionArma[0]);
        int y = Integer.parseInt(posicionArma[1]);

        Posicion posicion = new Posicion(x, y);

        switch (condicion) {
            case 1:
                jugador1.cambiarArma(posicion);
                break;
            case 2:
                jugador1.cambiarEscudo(posicion);
                break;
        }

    }

}