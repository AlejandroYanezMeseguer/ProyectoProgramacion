package entornoGrafico.AccionesBotones;

import entornoGrafico.PanelesInformacion.PanelesInformacionArmas;
import entornoGrafico.PanelesInformacion.PanelesInformacionEscudos;
import entornoGrafico.cambioDeEquipamiento.PanelCambiarArmas;
import entornoGrafico.cambioDeEquipamiento.PanelCambiarEscudos;
import jugador.Jugador;
import jugador.Posicion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AccionBotonesDeAccion {
    Random rand = new Random();

    /**
     * metodo que crea las acciones que ejecuta el boton ataqueJ1
     * @param e
     * @param luchador1
     * @param luchador2
     * @param daño
     * @param vigorFinal
     * @param vida1
     * @param vida2
     * @param panelGanador
     * @param entornoPelea
     * @param condicion
     */
    public static void botonAtaque(ActionEvent e, Jugador luchador1, Jugador luchador2, int daño, int vigorFinal, JLabel vida1, JLabel vida2, JPanel panelGanador, JPanel entornoPelea, int condicion) {

        Random rand = new Random();

        switch (condicion){
            case 1:{
                int condicionAleatoria = rand.nextInt(15) + 1;
                if (condicionAleatoria == 1) {
                    daño = luchador1.atacar(10);
                    vigorFinal = luchador2.recibirGolpe(daño);
                } else {
                    daño = luchador1.atacar(1);
                    vigorFinal = luchador2.recibirGolpe(daño);
                }
            }break;
            case 2:{
                int condicionAleatoria = rand.nextInt(15) + 1;
                if (condicionAleatoria == 1) {
                    daño = luchador2.atacar(10);
                    vigorFinal = luchador1.recibirGolpe(daño);
                } else {
                    daño = luchador2.atacar(1);
                    vigorFinal = luchador1.recibirGolpe(daño);
                }
            }break;
        }

        vida1.setText(""+luchador1.getVigor());
        vida2.setText(""+luchador2.getVigor());

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
    public static void cambiarArma(ActionEvent e, JPanel panelCambiarArma, Jugador jugador, JPanel skin, int condicion,JButton botonDesactivar1,JButton botonDesactivar2,JButton botonDesactivar3) {

        PanelCambiarArmas armas = new PanelCambiarArmas(panelCambiarArma, jugador);
        PanelesInformacionArmas stats = new PanelesInformacionArmas(panelCambiarArma, jugador);
        var listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                seleccionDeEquipo(e, jugador,1);

            }
        };
        switch (condicion) {
            case 1: {
                armas.añadirArmas(listener);

                armas.añadirNombresArmas();
                stats.statsArmas(jugador.getTipoGuerrero());
                skin.setVisible(false);
                panelCambiarArma.setVisible(true);
            }
            break;
            case 2: {
                armas.añadirArmas(listener);

                stats.statsArmas(jugador.getTipoGuerrero());
                armas.añadirNombresArmas();
                skin.setVisible(false);
                panelCambiarArma.setVisible(true);
            }
        }
        botonDesactivar1.setEnabled(false);
        botonDesactivar2.setEnabled(false);
        botonDesactivar3.setEnabled(false);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton cambiarEscudoJ1
     *
     * @param e
     */
    public static void cambiarEscudo(ActionEvent e, JPanel panelCambiarEscudo, Jugador jugador, JPanel skin, int condicion,JButton botonDesactivar1,JButton botonDesactivar2,JButton botonDesactivar3) {
        PanelCambiarEscudos escudos = new PanelCambiarEscudos(panelCambiarEscudo, jugador);
        PanelesInformacionEscudos stats = new PanelesInformacionEscudos(panelCambiarEscudo, jugador);
        var listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                seleccionDeEquipo(e, jugador,2);

            }
        };
        switch (condicion) {
            case 1: {
                escudos.añadirEscudos(listener);
                stats.statsEscudos();
                escudos.añadirNombresEscudos();
                skin.setVisible(false);
                panelCambiarEscudo.setVisible(true);
            }
            break;
            case 2: {
                escudos.añadirEscudos(listener);
                stats.statsEscudos();
                escudos.añadirNombresEscudos();
                skin.setVisible(false);
                panelCambiarEscudo.setVisible(true);
            }
        }
        botonDesactivar1.setEnabled(false);
        botonDesactivar2.setEnabled(false);
        botonDesactivar3.setEnabled(false);
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

    public static void seleccionarEquipo(ActionEvent e,JPanel Skin, JPanel panel,JButton botonactivar1,JButton botonactivar2,JButton botonactivar3){
        Skin.setVisible(true);
        panel.setVisible(false);

        botonactivar1.setEnabled(true);
        botonactivar2.setEnabled(true);
        botonactivar3.setEnabled(true);

    }

}