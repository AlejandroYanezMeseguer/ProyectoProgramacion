package entornoGrafico.AccionesBotones;

import entornoGrafico.cambioDeEquipamiento.PanelCambiarArmas;
import entornoGrafico.cambioDeEquipamiento.PanelCambiarEscudos;
import jugador.Jugador;
import jugador.Posicion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionBotonesDeAccion {

    public static void botonAtaqueJ1(ActionEvent e, Jugador luchador1, Jugador luchador2, int daño, int vigorFinal, JLabel vida1, JLabel vida2, JPanel panelGanador, JPanel entornoPelea){

        daño = luchador1.atacar(1);
        vigorFinal = luchador2.recibirGolpe(daño);
        vida1.setText("Vida Jugador 1: " +luchador1.getVigor());
        vida2.setText("Vida Jugador 2: " +luchador2.getVigor());

        if (vigorFinal<0){

            panelGanador.setVisible(true);
            entornoPelea.setVisible(false);

        }

    }

    public static void botonAtaqueJ2(ActionEvent e, Jugador luchador1, Jugador luchador2, int daño, int vigorFinal, JLabel vida1, JLabel vida2, JPanel panelGanador, JPanel entornoPelea){

        daño = luchador2.atacar(1);
        vigorFinal = luchador1.recibirGolpe(daño);
        vida1.setText("Vida Jugador 1: " +luchador1.getVigor());
        vida2.setText("Vida Jugador 2: " +luchador2.getVigor());

        if (vigorFinal<0){

            panelGanador.setVisible(true);
            entornoPelea.setVisible(false);

        }

    }

    /**
     * metodo que crea las acciones que ejecuta el boton cambiarArmaJ1
     * @param e
     */
    public static void cambiarArmaJ1ActionPerformed(ActionEvent e,JPanel panelCambiarArmaJ1,Jugador jugador1,JPanel skinJ1){

        PanelCambiarArmas armas = new PanelCambiarArmas(panelCambiarArmaJ1,jugador1);
        var listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                seleccionDeArmaJ1ActionPerformed(e,jugador1);

            }};
        armas.añadirArmasJ1(listener);

        armas.añadirNombresArmasJ1();
        skinJ1.setVisible(false);
        panelCambiarArmaJ1.setVisible(true);
    }


    /**
     * metodo que crea las acciones que ejecuta el boton cambiarArmaJ1
     * @param e
     */
    public static void cambiarArmaJ2ActionPerformed(ActionEvent e, JPanel panelCambiarArmaJ2, Jugador jugador2, JPanel skinJ2){

       PanelCambiarArmas armas = new PanelCambiarArmas(panelCambiarArmaJ2,jugador2);
        var listener = new ActionListener() {
            @Override
           public void actionPerformed(ActionEvent e) {

                seleccionDeArmaJ2ActionPerformed(e,jugador2);

            }};
        armas.añadirArmasJ2(listener);

        armas.añadirNombresArmasJ2();
        skinJ2.setVisible(false);
        panelCambiarArmaJ2.setVisible(true);
    }


    /**
     * metodo que crea las acciones que ejecuta el boton cambiarEscudoJ1
     * @param e
     */
    //private void cambiarEscudoJ1ActionPerformed(ActionEvent e){
       // PanelCambiarEscudos escudos = new PanelCambiarEscudos(panelCambiarEscudoJ1,jugador1);
        //var listener = new ActionListener() {
         //   @Override
           // public void actionPerformed(ActionEvent e) {

              //  seleccionDeEscudoJ1ActionPerformed(e);

           //}};
       // escudos.añadirEscudosJ1(listener);

       // escudos.añadirNombresEscudosJ1();
       // skinJ1.setVisible(false);
      //  panelCambiarEscudoJ1.setVisible(true);
   // }


    /**
     * metodo que crea las acciones que ejecuta el boton cambiarEscudoJ2
     * @param e
     */
  //  private void cambiarEscudoJ2ActionPerformed(ActionEvent e){
       // PanelCambiarEscudos escudos = new PanelCambiarEscudos(panelCambiarEscudoJ2,jugador2);
       // var listener = new ActionListener() {
          ///  @Override
//public void actionPerformed(ActionEvent e) {

              //  seleccionDeEscudoJ2ActionPerformed(e);

          //  }};
       // escudos.añadirEscudosJ2(listener);

       // escudos.añadirNombresEscudosJ2();
      //  skinJ2.setVisible(false);
       // panelCambiarEscudoJ2.setVisible(true);
 //   }

    /**
     * metodo que crea las acciones que se le pasan al listener de seleccionDeArmaJ1 para el J1
     * @param e
     */
    public static void seleccionDeArmaJ1ActionPerformed(ActionEvent e, Jugador jugador1){

        var boton = (JButton)e.getSource();
        String[] posicionArma = boton.getName().split("\\|");

        int x = Integer.parseInt(posicionArma[0]);
        int y = Integer.parseInt(posicionArma[1]);

        Posicion posicion = new Posicion(x,y);

        jugador1.cambiarArma(posicion);
    }

    /**
     * metodo que crea las acciones que se le pasan al listener de seleccionDeArmaJ2 para el J2
     * @param e
     */
    private static void seleccionDeArmaJ2ActionPerformed(ActionEvent e, Jugador jugador2){

        var boton = (JButton)e.getSource();
       String[] posicionArma = boton.getName().split("\\|");

       int x = Integer.parseInt(posicionArma[0]);
       int y = Integer.parseInt(posicionArma[1]);

       Posicion posicion = new Posicion(x,y);

       jugador2.cambiarArma(posicion);
   }

    /**
     * metodo que crea las acciones que se le pasan al listener de seleccionDeEscudoJ1 para el J1
     * @param e
     */
    //private void seleccionDeEscudoJ1ActionPerformed(ActionEvent e){

     //  var boton = (JButton)e.getSource();
     //   String[] posicionEscudo = boton.getName().split("\\|");

     //   int x = Integer.parseInt(posicionEscudo[0]);
      //  int y = Integer.parseInt(posicionEscudo[1]);

       // Posicion posicion = new Posicion(x,y);

       // jugador1.cambiarEscudo(posicion);
    //}

    /**
     * metodo que crea las acciones que se le pasan al listener de seleccionDeEscudoJ2 para el J2
     * @param e
     */
   // private void seleccionDeEscudoJ2ActionPerformed(ActionEvent e){

        //var boton = (JButton)e.getSource();
        //String[] posicionEscudo = boton.getName().split("\\|");

       // int x = Integer.parseInt(posicionEscudo[0]);
       // int y = Integer.parseInt(posicionEscudo[1]);

      //  Posicion posicion = new Posicion(x,y);

      //  jugador2.cambiarEscudo(posicion);
    ///}

}
