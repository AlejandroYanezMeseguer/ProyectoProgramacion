package entornoGrafico.AccionesBotones;

import entornoGrafico.PanelesInformacion.PanelesInformacionArmas;
import entornoGrafico.PanelesInformacion.PanelesInformacionEscudos;
import entornoGrafico.cambioDeEquipamiento.PanelCambiarArmas;
import entornoGrafico.cambioDeEquipamiento.PanelCambiarEscudos;
import jugador.Jugador;
import jugador.Posicion;

import javax.swing.*;
import javax.swing.text.Position;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Clase que crea las acciones que ejecutan los botones de accion
 */
public class AccionBotonesDeAccion {
    Random rand = new Random();

    public static Posicion PosicionEscudoJ1;

    /**
     * metodo que crea las acciones que ejecuta el boton de ataque
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
    public static void botonAtaque(ActionEvent e, Jugador luchador1, Jugador luchador2, int daño, int vigorFinal, JLabel vida1, JLabel vida2, JPanel panelGanador, JPanel entornoPelea, int condicion, JProgressBar vidaBar1,JProgressBar vidaBar2) {

        Random rand = new Random();

        switch (condicion){
            //ataque jugador 1
            case 1:{
                int condicionAleatoria = rand.nextInt(15) + 1;
                if (condicionAleatoria == 1) {
                    daño = luchador1.atacar(10);
                    vigorFinal = luchador2.recibirGolpe(daño);
                } else {
                    daño = luchador1.atacar(1);
                    vigorFinal = luchador2.recibirGolpe(daño);
                }
                if (vigorFinal < 0) {

                    panelGanador.setVisible(true);
                    entornoPelea.setVisible(false);

                }
            }break;
            //ataque jugador 2
            case 2:{
                int condicionAleatoria = rand.nextInt(15) + 1;
                if (condicionAleatoria == 1) {
                    daño = luchador2.atacar(10);
                    vigorFinal = luchador1.recibirGolpe(daño);
                } else {
                    daño = luchador2.atacar(1);
                    vigorFinal = luchador1.recibirGolpe(daño);
                }
                if (vigorFinal < 0) {

                    panelGanador.setVisible(true);
                    entornoPelea.setVisible(false);

                }
            }break;
        }
        vidaBar1.setValue(luchador1.getVigor());
        vidaBar2.setValue(luchador2.getVigor());
        vidaBar1.setString(""+luchador1.getVigor());
        vidaBar2.setString(""+luchador2.getVigor());
    }

    /**
     * metodo que crea las acciones que ejecutan los botones de cambiarArma
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
            //cambiar arma jugador 1
            case 1: {
                armas.añadirArmas(listener);
                armas.fondoArmas();
                armas.añadirNombresArmas();
                stats.statsArmas(jugador.getTipoGuerrero());
                skin.setVisible(false);
                panelCambiarArma.setVisible(true);
            }
            break;
            //cambiar arma jugador 2
            case 2: {
                armas.añadirArmas(listener);
                armas.fondoArmas();
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
     * metodo que crea las acciones que ejecutan los botones cambiarEscudo
     * @param e
     */
    public static void cambiarEscudo(ActionEvent e, JPanel panelCambiarEscudo, Jugador jugador, JPanel skin, int condicion, JButton botonDesactivar1, JButton botonDesactivar2, JButton botonDesactivar3) {
        PanelCambiarEscudos escudos = new PanelCambiarEscudos(panelCambiarEscudo, jugador);
        PanelesInformacionEscudos stats = new PanelesInformacionEscudos(panelCambiarEscudo, jugador);
        Posicion posicion = null;
        var listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                seleccionDeEquipo(e, jugador,2);

            }
        };
        switch (condicion) {
            //cambiar escudo jugador 1
            case 1: {
                escudos.añadirEscudos(listener);
                escudos.fondoEscudo();
                stats.statsEscudos();
                escudos.añadirNombresEscudos();
                skin.setVisible(false);
                panelCambiarEscudo.setVisible(true);
            }
            break;
            //cambiar escudo jugador 2
            case 2: {
                escudos.añadirEscudos(listener);
                escudos.fondoEscudo();
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
     * metodo que crea las acciones que se le pasan al listener de seleccionDeArma
     * @param e
     */
    public static void seleccionDeEquipo(ActionEvent e, Jugador jugador, int condicion) {

        var boton = (JButton) e.getSource();
        String[] posicionArma = boton.getName().split("\\|");

        int x = Integer.parseInt(posicionArma[0]);
        int y = Integer.parseInt(posicionArma[1]);

        var posicion = new Posicion(x, y);
        PosicionEscudoJ1 = posicion;

        switch (condicion) {
            //cambiar arma
            case 1:
                jugador.cambiarArma(posicion,e);
                break;
            //cambiar escudo
            case 2:
                jugador.cambiarEscudo(posicion,e);
                break;
        }
    }

  /**
     * metodo que crea las acciones que ejecutan el boton de seleccionarEquipo
     * @param e
     * @param Skin
     * @param panel
     * @param botonactivar1
     * @param botonactivar2
     * @param botonactivar3
     */
    public static void seleccionarEquipo(ActionEvent e,JPanel Skin, JPanel panel,JButton botonactivar1,JButton botonactivar2,JButton botonactivar3){
        Skin.setVisible(true);
        panel.setVisible(false);

        botonactivar1.setEnabled(true);
        botonactivar2.setEnabled(true);
        botonactivar3.setEnabled(true);

    }

}