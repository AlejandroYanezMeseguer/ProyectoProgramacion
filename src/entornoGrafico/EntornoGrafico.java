package entornoGrafico;

import entornoGrafico.cambioDeEquipamiento.PanelCambiarArmas;
import entornoGrafico.cambioDeEquipamiento.PanelCambiarEscudos;
import entornoGrafico.creacionDeComponentes.*;
import jugador.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static entornoGrafico.creacionDeComponentes.CreacionDeBotones.crearBotonImagen;
import static entornoGrafico.creacionDeComponentes.CreacionDeBotones.crearBotonTexto;
import static entornoGrafico.creacionDeComponentes.CreacionDeEtiquetas.CrearEtiquetaStandard;
import static entornoGrafico.AccionesBotones.CreacionDeListeners.addListener;
import static entornoGrafico.creacionDeComponentes.CreacionDePaneles.*;
import static entornoGrafico.creacionDeComponentes.CreacionDeTextArea.crearTextArea;
import static entornoGrafico.creacionDeComponentes.CreacionDeTextField.crearTextFieldStandard;

/**
 * Clase que crea la parte grafica del programa
 */
public class EntornoGrafico extends JFrame{

    private Jugador jugador1;
    private Jugador jugador2;

    public int dañoJ1;
    public int vigorFinalJ1;
    public int dañoJ2;
    public int vigorFinalJ2;

    public JPanel entornoPelea;
    public JPanel panelNombreJ1;
    public JPanel panelNombreJ2;
    public JPanel panelVidaJ1;
    public JPanel panelVidaJ2;
    public JPanel skinJ1;
    public JPanel skinJ2;
    public JPanel accionesJ1;
    public JPanel accionesJ2;
    public JPanel jugadorGanador;
    public JPanel seleccionPersonajes;
    public JPanel comenzarPelea;
    public JPanel seleccionPersonajeJ1;
    public JPanel panelIntroducirNombreJ1;
    public JPanel seleccionClaseJ1;
    public JPanel seleccionPersonajeJ2;
    public JPanel panelIntroducirNombreJ2;
    public JPanel seleccionClaseJ2;
    public JPanel panelComentariosSeleccion;
    public JPanel panelCambiarArmaJ1;
    public JPanel panelCambiarArmaJ2;
    public JPanel panelCambiarEscudoJ1;
    public JPanel panelCambiarEscudoJ2;
    public JPanel equipamientoJ1;
    public JPanel equipamientoJ2;
    public JPanel armaEquipadaJ1;
    public JPanel armaEquipadaJ2;
    public JPanel escudoEquipadoJ1;
    public JPanel escudoEquipadoJ2;

    public JButton AtaqueJ1;
    public JButton cambiarArmaJ1;
    public JButton AtaqueJ2;
    public JButton cambiarArmaJ2;
    public JButton seleccionarMagoJ1;
    public JButton seleccionarGuerreroJ1;
    public JButton seleccionarSamuraiJ1;
    public JButton seleccionarMagoJ2;
    public JButton seleccionarGuerreroJ2;
    public JButton seleccionarSamuraiJ2;
    public JButton empezarPelea;
    public JButton seleccionarArmaJ1;
    public JButton seleccionarArmaJ2;
    public JButton cambiarEscudoJ1;
    public JButton cambiarEscudoJ2;
    public JButton seleccionarEscudoJ1;
    public JButton seleccionarEscudoJ2;

    public JLabel vidaJ1;
    public JLabel vidaJ2;
    public JLabel ganador;
    public JLabel introducirNombreJ1;
    public JLabel seleccionarClaseJ1;
    public JLabel magoJ1;
    public JLabel guerreroJ1;
    public JLabel samuraiJ1;
    public JLabel introducirNombreJ2;
    public JLabel seleccionarClaseJ2;
    public JLabel magoJ2;
    public JLabel guerreroJ2;
    public JLabel samuraiJ2;
    public JLabel mostrarNombreJ1;
    public JLabel mostrarNombreJ2;
    public JTextArea comentariosSeleccion;

    public JTextField nombreJ1;
    public JTextField nombreJ2;


    /**
     * Constructor de la clase donde se crea la ventana
     * @throws IOException
     */
    public EntornoGrafico() throws IOException {

        setEntorno();
        iniciarComponentes();

    }

    /**
     * Metodo con las propiedades basicas del entorno grafico
     */
    private void setEntorno(){

        setSize(1880,985);
        setTitle("Coia_Ring");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);


    }

    /**
     * Metodo que crea los Jpanel
     */
    private void crearPaneles(){

        entornoPelea = new JPanel();
        crearPanelLayoutNullVisibleFalse(entornoPelea,(JPanel) this.getContentPane(),0,0,1880,900,null);

        jugadorGanador = new JPanel();
        crearPanelLayoutNullVisibleFalse(jugadorGanador, (JPanel) this.getContentPane(),0,0,1880,985,Color.pink);

        panelNombreJ1 = new JPanel();
        crearPanelStandard(panelNombreJ1,entornoPelea,0,0,940,50,Color.magenta);

        panelNombreJ2 = new JPanel();
        crearPanelStandard(panelNombreJ2,entornoPelea,940,0,940,50,Color.cyan);

        panelVidaJ1 = new JPanel();
        crearPanelStandard(panelVidaJ1,entornoPelea,0,50,940,50,Color.red);

        panelVidaJ2 = new JPanel();
        crearPanelStandard(panelVidaJ2,entornoPelea,940,50,940,50,Color.green);

        skinJ1 = new JPanel();
        crearPanelStandard(skinJ1,entornoPelea,160,100,780,650,Color.blue);

        skinJ2 = new JPanel();
        crearPanelStandard(skinJ2,entornoPelea,940,100,780,650,Color.yellow);

        accionesJ1 = new JPanel();
        crearPanelLayoutNull(accionesJ1,entornoPelea,0,750,940,90,Color.darkGray);

        accionesJ2 = new JPanel();
        crearPanelLayoutNull(accionesJ2,entornoPelea,940,750,940,90,Color.black);

        seleccionPersonajes = new JPanel();
        crearPanelLayoutNull(seleccionPersonajes, (JPanel) this.getContentPane(),0,0,1880,1000,null);

        comenzarPelea = new JPanel();
        crearPanelLayoutNull(comenzarPelea,seleccionPersonajes,0,750,1880,70,Color.black);

        seleccionPersonajeJ1 = new JPanel();
        crearPanelLayoutNull(seleccionPersonajeJ1,seleccionPersonajes,0,0,940,750,null);

        panelIntroducirNombreJ1 = new JPanel();
        crearPanelLayoutNull(panelIntroducirNombreJ1,seleccionPersonajeJ1,0,0,940,115,Color.cyan);

        seleccionClaseJ1 = new JPanel();
        crearPanelLayoutNull(seleccionClaseJ1,seleccionPersonajeJ1,0,115,940,635,Color.red);

        panelCambiarArmaJ1 = new JPanel();
        crearPanelLayoutNullVisibleFalse(panelCambiarArmaJ1,entornoPelea,160,100,780,650,Color.yellow);

        panelCambiarEscudoJ1 = new JPanel();
        crearPanelLayoutNullVisibleFalse(panelCambiarEscudoJ1,entornoPelea,160,100,780,650,Color.green);

        seleccionPersonajeJ2 = new JPanel();
        crearPanelLayoutNull(seleccionPersonajeJ2,seleccionPersonajes,940,0,940,750,null);

        panelIntroducirNombreJ2 = new JPanel();
        crearPanelLayoutNull(panelIntroducirNombreJ2,seleccionPersonajeJ2,0,0,940,115,Color.yellow);

        seleccionClaseJ2 = new JPanel();
        crearPanelLayoutNull(seleccionClaseJ2,seleccionPersonajeJ2,0,115,940,635,Color.green);

        panelCambiarArmaJ2 = new JPanel();
        crearPanelLayoutNullVisibleFalse(panelCambiarArmaJ2,entornoPelea,940,100,780,650,Color.cyan);

        panelCambiarEscudoJ2 = new JPanel();
        crearPanelLayoutNullVisibleFalse(panelCambiarEscudoJ2,entornoPelea,940,100,780,650,Color.red);

        panelComentariosSeleccion = new JPanel();
        crearPanelLayoutNull(panelComentariosSeleccion,seleccionPersonajes,0,820,1880,140,Color.blue);

        equipamientoJ1 = new JPanel();
        crearPanelLayoutNull(equipamientoJ1,entornoPelea,0,100,160,650,Color.pink);

        armaEquipadaJ1 = new JPanel();
        crearPanelLayoutNull(armaEquipadaJ1,equipamientoJ1,45,40,70,70,Color.green);

        escudoEquipadoJ1 = new JPanel();
        crearPanelLayoutNull(escudoEquipadoJ1,equipamientoJ1,45,160,70,70,Color.green);

        equipamientoJ2 = new JPanel();
        crearPanelLayoutNull(equipamientoJ2,entornoPelea,1720,100,160,650,Color.magenta);

        armaEquipadaJ2 = new JPanel();
        crearPanelLayoutNull(armaEquipadaJ2,equipamientoJ2,45,40,70,70,Color.green);

        escudoEquipadoJ2 = new JPanel();
        crearPanelLayoutNull(escudoEquipadoJ2,equipamientoJ2,45,160,70,70,Color.green);

    }

    /**
     * Metodo que crea los JButton
     * @throws IOException
     */
    private void crearBotones() throws IOException {

        String[] textoBoton = {"Cambiar de arma","Cambiar de escudo","Atacar","Empezar la pelea","Utilizar arma seleccionada","Utilizar escudo seleccionado"};
        BufferedImage iconoMago = ImageIO.read(new File("src/imagenes/mago.png"));
        BufferedImage iconoGuerrero = ImageIO.read(new File("src/imagenes/guerrero.png"));
        BufferedImage iconoSamurai = ImageIO.read(new File("src/imagenes/samurai.jpg"));

        cambiarArmaJ1 = new JButton(textoBoton[0]);
        crearBotonTexto(cambiarArmaJ1,accionesJ1,545,20,230,38,23);

        cambiarEscudoJ1 = new JButton(textoBoton[1]);
        crearBotonTexto(cambiarEscudoJ1,accionesJ1,70,20,260,38,23);

        AtaqueJ1 = new JButton(textoBoton[2]);
        crearBotonTexto(AtaqueJ1,accionesJ1,383,20,110,40,23);

        cambiarArmaJ2 = new JButton(textoBoton[0]);
        crearBotonTexto(cambiarArmaJ2,accionesJ2,545,20,230,38,23);

        cambiarEscudoJ2 = new JButton(textoBoton[1]);
        crearBotonTexto(cambiarEscudoJ2,accionesJ2,70,20,260,38,23);

        AtaqueJ2 = new JButton(textoBoton[2]);
        crearBotonTexto(AtaqueJ2,accionesJ2,383,20,110,38,23);

        seleccionarMagoJ1 = new JButton();
        crearBotonImagen(seleccionarMagoJ1,seleccionClaseJ1,62,90,200,270,iconoMago);

        seleccionarGuerreroJ1 = new JButton();
        crearBotonImagen(seleccionarGuerreroJ1,seleccionClaseJ1,323,90,200,270,iconoGuerrero);

        seleccionarSamuraiJ1 = new JButton();
        crearBotonImagen(seleccionarSamuraiJ1,seleccionClaseJ1,584,90,200,270,iconoSamurai);

        seleccionarMagoJ2 = new JButton();
        crearBotonImagen(seleccionarMagoJ2,seleccionClaseJ2,62,90,200,270,iconoMago);

        seleccionarGuerreroJ2 = new JButton();
        crearBotonImagen(seleccionarGuerreroJ2,seleccionClaseJ2,323,90,200,270,iconoGuerrero);

        seleccionarSamuraiJ2 = new JButton();
        crearBotonImagen(seleccionarSamuraiJ2,seleccionClaseJ2,584,90,200,270,iconoSamurai);

        empezarPelea = new JButton(textoBoton[3]);
        crearBotonTexto(empezarPelea,comenzarPelea,710,10,280,50,28);

        seleccionarArmaJ1 = new JButton(textoBoton[4]);
        crearBotonTexto(seleccionarArmaJ1,panelCambiarArmaJ1,90,575,335,38,24);

        seleccionarArmaJ2 = new JButton(textoBoton[4]);
        crearBotonTexto(seleccionarArmaJ2,panelCambiarArmaJ2,350,575,335,38,24);

        seleccionarEscudoJ1 = new JButton(textoBoton[5]);
        crearBotonTexto(seleccionarEscudoJ1,panelCambiarEscudoJ1,120,575,355,38,24);

        seleccionarEscudoJ2 = new JButton(textoBoton[5]);
        crearBotonTexto(seleccionarEscudoJ2,panelCambiarEscudoJ2,300,575,355,38,24);
    }

    /**
     * Metodo que crea los listeners de todos los JButton
     */
    private void listenersBotones(){

        addListener(AtaqueJ1, e -> botonAtaqueJugador1ActionPerformed(e, jugador1, jugador2));
        addListener(AtaqueJ2, e -> botonAtaqueJugador2ActionPerformed(e, jugador1, jugador2));
        addListener(empezarPelea, e -> empezarALucharActionPerformed(e, jugador1, jugador2));
        addListener(seleccionarMagoJ1, this::seleccionarMagoJ1ActionPerformed);
        addListener(seleccionarGuerreroJ1, this::seleccionarGuerreroJ1ActionPerformed);
        addListener(seleccionarSamuraiJ1, this::seleccionarSamuraiJ1ActionPerformed);
        addListener(seleccionarMagoJ2, this::seleccionarMagoJ2ActionPerformed);
        addListener(seleccionarGuerreroJ2, this::seleccionarGuerreroJ2ActionPerformed);
        addListener(seleccionarSamuraiJ2, this::seleccionarSamuraiJ2ActionPerformed);
        addListener(cambiarArmaJ1, this::cambiarArmaJ1ActionPerformed);
        addListener(cambiarArmaJ2, this::cambiarArmaJ2ActionPerformed);
        addListener(seleccionarArmaJ1, this::seleccionarArmaJ1ActionPerformed);
        addListener(seleccionarArmaJ2, this::seleccionarArmaJ2ActionPerformed);
        addListener(cambiarEscudoJ1, this::cambiarEscudoJ1ActionPerformed);
        addListener(cambiarEscudoJ2, this::cambiarEscudoJ2ActionPerformed);
        addListener(seleccionarEscudoJ1, this::seleccionarEscudoJ1ActionPerformed);
        addListener(seleccionarEscudoJ2, this::seleccionarEscudoJ2ActionPerformed);

    }

    /**
     * metodo que crea las acciones que ejecuta el boton ataqueJugador1
     * @param e
     * @param luchador1
     * @param luchador2
     */
    private void botonAtaqueJugador1ActionPerformed(ActionEvent e, Jugador luchador1, Jugador luchador2){
        CreacionDeBotones.botonAtaqueJugador1ActionPerformed(e,luchador1,luchador2,dañoJ1,vigorFinalJ1,vidaJ1,vidaJ2,ganador,jugadorGanador,entornoPelea);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton ataqueJugador2
     * @param e
     * @param luchador1
     * @param luchador2
     */
    private void botonAtaqueJugador2ActionPerformed(ActionEvent e, Jugador luchador1, Jugador luchador2){

        dañoJ2 = luchador2.atacar(1);
        vigorFinalJ2 = luchador1.recibirGolpe(dañoJ2);
        vidaJ1.setText("Vida Jugador 1: " +jugador1.getVigor());
        vidaJ2.setText("Vida Jugador 2: " +jugador2.getVigor());

        if (vigorFinalJ2<0){

            ganador.setText("EL JUGADOR 2 HA GANADO");
            jugadorGanador.setVisible(true);
            entornoPelea.setVisible(false);
        }

    }

    /**
     * metodo que crea las acciones que ejecuta el boton empezarALuchar
     * @param e
     */
    private void empezarALucharActionPerformed(ActionEvent e,Jugador luchador1, Jugador luchador2){

        ArrayList<String> validaciones = validarJugadores();

        String mensajes = "";

        for (String validar : validaciones) {
            mensajes+=validar+"\n";
        }
        comentariosSeleccion.setText(mensajes);

        if (!validaciones.isEmpty()) {
            return;
        }
        
        seleccionPersonajes.setVisible(false);
        entornoPelea.setVisible(true);
        mostrarNombreJ1.setText(nombreJ1.getText());
        mostrarNombreJ2.setText(nombreJ2.getText());
        vidaJ1.setText("Vida Jugador 1: " +luchador1);
        vidaJ2.setText("Vida Jugador 2: " +luchador2);

    }

    /**
     * metodo que añade a un arraylist mensajes de error al iniciar partida
     * @return mensajes con los mensajes añadidos
     */
    private ArrayList<String> validarJugadores(){

        ArrayList<String> mensajes = new ArrayList<String>();

        if (jugador1 == null){
            mensajes.add("Falta seleccionar clase del jugador 1 ");
        }
        if (jugador2 == null){
            mensajes.add("Falta seleccionar clase del jugador 2");
        }
        if (nombreJ1.getText().isEmpty()){
            mensajes.add("Falta nombre jugador 1");
        }
        if (nombreJ2.getText().isEmpty()){
            mensajes.add("Falta nombre jugador 2");
        }
        return mensajes;
    }

    /**
     * metodo que crea las acciones que ejecuta el boton seleccionarMagoJ1
     * @param e
     */
    private void seleccionarMagoJ1ActionPerformed(ActionEvent e){

        jugador1 = new Mago(nombreJ1.getText());
        seleccionarMagoJ1.setEnabled(false);
        seleccionarGuerreroJ1.setEnabled(true);
        seleccionarSamuraiJ1.setEnabled(true);

    }

    /**
     * metodo que crea las acciones que ejecuta el boton seleccionarGuerreroJ1
     * @param e
     */
    private void seleccionarGuerreroJ1ActionPerformed(ActionEvent e){

        jugador1 = new Guerrero(nombreJ1.getText());
        seleccionarGuerreroJ1.setEnabled(false);
        seleccionarMagoJ1.setEnabled(true);
        seleccionarSamuraiJ1.setEnabled(true);

    }

    /**
     * metodo que crea las acciones que ejecuta el boton seleccionarSamuraiJ1
     * @param e
     */
    private void seleccionarSamuraiJ1ActionPerformed(ActionEvent e){

        jugador1 = new Samurai(nombreJ1.getText());
        seleccionarSamuraiJ1.setEnabled(false);
        seleccionarGuerreroJ1.setEnabled(true);
        seleccionarMagoJ1.setEnabled(true);

    }

    /**
     * metodo que crea las acciones que ejecuta el boton seleccionarMagoJ2
     * @param e
     */
    private void seleccionarMagoJ2ActionPerformed(ActionEvent e){

        jugador2 = new Mago(nombreJ2.getText());
        seleccionarMagoJ2.setEnabled(false);
        seleccionarGuerreroJ2.setEnabled(true);
        seleccionarSamuraiJ2.setEnabled(true);

    }

    /**
     * metodo que crea las acciones que ejecuta el boton seleccionarGuerreroJ2
     * @param e
     */
    private void seleccionarGuerreroJ2ActionPerformed(ActionEvent e){

        jugador2 = new Guerrero(nombreJ2.getText());
        seleccionarGuerreroJ2.setEnabled(false);
        seleccionarMagoJ2.setEnabled(true);
        seleccionarSamuraiJ2.setEnabled(true);

    }

    /**
     * metodo que crea las acciones que ejecuta el boton seleccionarSamuraiJ2
     * @param e
     */
    private void seleccionarSamuraiJ2ActionPerformed(ActionEvent e){

        jugador2 = new Samurai(nombreJ2.getText());
        seleccionarSamuraiJ2.setEnabled(false);
        seleccionarGuerreroJ2.setEnabled(true);
        seleccionarMagoJ2.setEnabled(true);

    }

    /**
     * metodo que crea las acciones que ejecuta el boton cambiarArmaJ1
     * @param e
     */
    private void cambiarArmaJ1ActionPerformed(ActionEvent e){

       PanelCambiarArmas armas = new PanelCambiarArmas(panelCambiarArmaJ1,jugador1);
        var listener = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {

                seleccionDeArmaJ1ActionPerformed(e);

             }};
       armas.añadirArmasJ1(listener);

       armas.añadirNombresArmasJ1();
       skinJ1.setVisible(false);
       panelCambiarArmaJ1.setVisible(true);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton seleccionarArmaJ1
     * @param e
     */
    private void seleccionarArmaJ1ActionPerformed(ActionEvent e){
        skinJ1.setVisible(true);
        panelCambiarArmaJ1.setVisible(false);
    }


    /**
     * metodo que crea las acciones que ejecuta el boton cambiarArmaJ1
     * @param e
     */
    private void cambiarArmaJ2ActionPerformed(ActionEvent e){

        PanelCambiarArmas armas = new PanelCambiarArmas(panelCambiarArmaJ2,jugador2);
        var listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                seleccionDeArmaJ2ActionPerformed(e);

            }};
        armas.añadirArmasJ2(listener);

        armas.añadirNombresArmasJ2();
        skinJ2.setVisible(false);
        panelCambiarArmaJ2.setVisible(true);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton seleccionarArmaJ2
     * @param e
     */
    private void seleccionarArmaJ2ActionPerformed(ActionEvent e){
        skinJ2.setVisible(true);
        panelCambiarArmaJ2.setVisible(false);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton cambiarEscudoJ1
     * @param e
     */
    private void cambiarEscudoJ1ActionPerformed(ActionEvent e){
        PanelCambiarEscudos escudos = new PanelCambiarEscudos(panelCambiarEscudoJ1,jugador1);
        var listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                seleccionDeEscudoJ1ActionPerformed(e);

            }};
        escudos.añadirEscudosJ1(listener);

        escudos.añadirNombresEscudosJ1();
        skinJ1.setVisible(false);
        panelCambiarEscudoJ1.setVisible(true);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton seleccionarEscudoJ1
     * @param e
     */
    private void seleccionarEscudoJ1ActionPerformed(ActionEvent e){
        skinJ1.setVisible(true);
        panelCambiarEscudoJ1.setVisible(false);
    }


    /**
     * metodo que crea las acciones que ejecuta el boton cambiarEscudoJ2
     * @param e
     */
    private void cambiarEscudoJ2ActionPerformed(ActionEvent e){
        PanelCambiarEscudos escudos = new PanelCambiarEscudos(panelCambiarEscudoJ2,jugador2);
        var listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                seleccionDeEscudoJ2ActionPerformed(e);

            }};
        escudos.añadirEscudosJ2(listener);

        escudos.añadirNombresEscudosJ2();
        skinJ2.setVisible(false);
        panelCambiarEscudoJ2.setVisible(true);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton seleccionarEscudoJ2
     * @param e
     */
    private void seleccionarEscudoJ2ActionPerformed(ActionEvent e){
        skinJ2.setVisible(true);
        panelCambiarEscudoJ2.setVisible(false);
    }

    /**
     * metodo que crea las acciones que se le pasan al listener de seleccionDeArmaJ1 para el J1
     * @param e
     */
    private void seleccionDeArmaJ1ActionPerformed(ActionEvent e){

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
    private void seleccionDeArmaJ2ActionPerformed(ActionEvent e){

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
    private void seleccionDeEscudoJ1ActionPerformed(ActionEvent e){

        var boton = (JButton)e.getSource();
        String[] posicionEscudo = boton.getName().split("\\|");

        int x = Integer.parseInt(posicionEscudo[0]);
        int y = Integer.parseInt(posicionEscudo[1]);

        Posicion posicion = new Posicion(x,y);

        jugador1.cambiarEscudo(posicion);
    }

    /**
     * metodo que crea las acciones que se le pasan al listener de seleccionDeEscudoJ2 para el J2
     * @param e
     */
    private void seleccionDeEscudoJ2ActionPerformed(ActionEvent e){

        var boton = (JButton)e.getSource();
        String[] posicionEscudo = boton.getName().split("\\|");

        int x = Integer.parseInt(posicionEscudo[0]);
        int y = Integer.parseInt(posicionEscudo[1]);

        Posicion posicion = new Posicion(x,y);

        jugador2.cambiarEscudo(posicion);
    }

    /**
     * Metodo que crea las JLabel con las vidas de los jugadores
     * @param luchador1
     * @param luchador2
     */
    private void crearVidasJugadores(Jugador luchador1, Jugador luchador2){

        vidaJ1 = new JLabel("Vida Jugador 1: " +luchador1);
        CrearEtiquetaStandard(vidaJ1, panelVidaJ1,0,0,0,0,24);

        vidaJ2 = new JLabel("Vida Jugador 2: " +luchador2);
        CrearEtiquetaStandard(vidaJ2, panelVidaJ2,0,0,0,0,24);
    }

    /**
     * Metodo que crea las JLabel
     */
    private void crearEtiquetas(){

        String[] textoEtiqueta = {"Nombre del jugador 1:","Nombre del Jugador 2:","Selecciona la clase con la que quieres combatir","Mago","Guerrero","Samurai"};

        ganador = new JLabel();
        jugadorGanador.add(ganador);

        introducirNombreJ1 = new JLabel(textoEtiqueta[0]);
        CrearEtiquetaStandard(introducirNombreJ1,panelIntroducirNombreJ1,290,8,300,36,26);

        introducirNombreJ2 = new JLabel(textoEtiqueta[1]);
        CrearEtiquetaStandard(introducirNombreJ2,panelIntroducirNombreJ2,290,8,300,36,26);

        seleccionarClaseJ1 = new JLabel(textoEtiqueta[2]);
        CrearEtiquetaStandard(seleccionarClaseJ1,seleccionClaseJ1,140,0,600,30,26);

        seleccionarClaseJ2 = new JLabel(textoEtiqueta[2]);
        CrearEtiquetaStandard(seleccionarClaseJ2,seleccionClaseJ2,140,0,600,30,26);

        magoJ1 = new JLabel(textoEtiqueta[3]);
        CrearEtiquetaStandard(magoJ1,seleccionClaseJ1,135,58,60,30,20);

        guerreroJ1 = new JLabel(textoEtiqueta[4]);
        CrearEtiquetaStandard(guerreroJ1,seleccionClaseJ1,380,58,90,30,20);

        samuraiJ1 = new JLabel(textoEtiqueta[5]);
        CrearEtiquetaStandard(samuraiJ1,seleccionClaseJ1,650,58,82,30,20);

        magoJ2 = new JLabel(textoEtiqueta[3]);
        CrearEtiquetaStandard(magoJ2,seleccionClaseJ2,135,58,60,30,20);

        guerreroJ2 = new JLabel(textoEtiqueta[4]);
        CrearEtiquetaStandard(guerreroJ2,seleccionClaseJ2,380,58,90,30,20);

        samuraiJ2 = new JLabel(textoEtiqueta[5]);
        CrearEtiquetaStandard(samuraiJ2,seleccionClaseJ2,650,58,82,30,20);

        mostrarNombreJ1 = new JLabel();
        CrearEtiquetaStandard(mostrarNombreJ1,panelNombreJ1,200,0,500,30,30);

        mostrarNombreJ2 = new JLabel();
        CrearEtiquetaStandard(mostrarNombreJ2,panelNombreJ2,200,0,500,30,30);

    }

    /**
     * Metodo que crea los JTextArea
     */
    private void crearTextAreas(){

        comentariosSeleccion = new JTextArea();
        crearTextArea(comentariosSeleccion,panelComentariosSeleccion,0,0,1700,150,24);

    }

    /**
     * Metodo que crea los JTextField
     */
    private void crearTextField(){

        nombreJ1 = new JTextField();
        crearTextFieldStandard(nombreJ1,panelIntroducirNombreJ1,280,55,300,32,24);

        nombreJ2 = new JTextField();
        crearTextFieldStandard(nombreJ2,panelIntroducirNombreJ2,280,55,300,32,24);

    }

    /**
     * Metodo que carga todos los componentes del progrrama para que en el constructor solo se cargue este
     * metodo y el que crea las propiedades basicas de la interfaz
     * @throws IOException
     */
    private void iniciarComponentes() throws IOException {

        crearPaneles();
        crearBotones();
        listenersBotones();
        crearVidasJugadores(jugador1,jugador2);
        crearEtiquetas();
        crearTextField();
        crearTextAreas();

    }
}