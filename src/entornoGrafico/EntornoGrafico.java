package entornoGrafico;

import entornoGrafico.cambioDeEquipamiento.PanelCambiarArmas;
import entornoGrafico.cambioDeEquipamiento.PanelCambiarEscudos;
import entornoGrafico.creacionDeComponentes.CreacionDeEtiquetas;
import entornoGrafico.creacionDeComponentes.CreacionDePaneles;
import entornoGrafico.introducirNombresDeJugadores.Provisional;
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
    public JPanel panelVidaJ2;
    public JPanel panelVidaJ1;
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
        CreacionDePaneles.crearPanelLayoutNullVisibleFalse(entornoPelea,(JPanel) this.getContentPane(),0,0,1880,900,null);

        jugadorGanador = new JPanel();
        CreacionDePaneles.crearPanelLayoutNullVisibleFalse(jugadorGanador, (JPanel) this.getContentPane(),0,0,1880,985,Color.pink);

        panelNombreJ1 = new JPanel();
        CreacionDePaneles.crearPanelStandard(panelNombreJ1,entornoPelea,0,0,940,50,Color.magenta);

        panelNombreJ2 = new JPanel();
        CreacionDePaneles.crearPanelStandard(panelNombreJ2,entornoPelea,940,0,940,50,Color.cyan);

        panelVidaJ2 = new JPanel();
        CreacionDePaneles.crearPanelStandard(panelVidaJ2,entornoPelea,0,50,940,50,Color.red);

        panelVidaJ1 = new JPanel();
        CreacionDePaneles.crearPanelStandard(panelVidaJ1,entornoPelea,940,50,940,50,Color.green);

        skinJ1 = new JPanel();
        CreacionDePaneles.crearPanelStandard(skinJ1,entornoPelea,160,100,780,650,Color.blue);

        skinJ2 = new JPanel();
        CreacionDePaneles.crearPanelStandard(skinJ2,entornoPelea,940,100,780,650,Color.yellow);

        accionesJ1 = new JPanel();
        CreacionDePaneles.crearPanelLayoutNull(accionesJ1,entornoPelea,0,750,940,90,Color.darkGray);

        accionesJ2 = new JPanel();
        CreacionDePaneles.crearPanelLayoutNull(accionesJ2,entornoPelea,940,750,940,90,Color.black);

        seleccionPersonajes = new JPanel();
        CreacionDePaneles.crearPanelLayoutNull(seleccionPersonajes, (JPanel) this.getContentPane(),0,0,1880,1000,null);

        comenzarPelea = new JPanel();
        CreacionDePaneles.crearPanelLayoutNull(comenzarPelea,seleccionPersonajes,0,750,1880,70,Color.black);

        seleccionPersonajeJ1 = new JPanel();
        CreacionDePaneles.crearPanelLayoutNull(seleccionPersonajeJ1,seleccionPersonajes,0,0,940,750,null);

        panelIntroducirNombreJ1 = new JPanel();
        CreacionDePaneles.crearPanelLayoutNull(panelIntroducirNombreJ1,seleccionPersonajeJ1,0,0,940,115,Color.cyan);

        seleccionClaseJ1 = new JPanel();
        CreacionDePaneles.crearPanelLayoutNull(seleccionClaseJ1,seleccionPersonajeJ1,0,115,940,635,Color.red);

        panelCambiarArmaJ1 = new JPanel();
        CreacionDePaneles.crearPanelLayoutNullVisibleFalse(panelCambiarArmaJ1,entornoPelea,160,100,780,650,Color.yellow);

        panelCambiarEscudoJ1 = new JPanel();
        CreacionDePaneles.crearPanelLayoutNullVisibleFalse(panelCambiarEscudoJ1,entornoPelea,160,100,780,650,Color.green);

        seleccionPersonajeJ2 = new JPanel();
        CreacionDePaneles.crearPanelLayoutNull(seleccionPersonajeJ2,seleccionPersonajes,940,0,940,750,null);

        panelIntroducirNombreJ2 = new JPanel();
        CreacionDePaneles.crearPanelLayoutNull(panelIntroducirNombreJ2,seleccionPersonajeJ2,0,0,940,115,Color.yellow);

        seleccionClaseJ2 = new JPanel();
        CreacionDePaneles.crearPanelLayoutNull(seleccionClaseJ2,seleccionPersonajeJ2,0,115,940,635,Color.green);

        panelCambiarArmaJ2 = new JPanel();
        CreacionDePaneles.crearPanelLayoutNullVisibleFalse(panelCambiarArmaJ2,entornoPelea,940,100,780,650,Color.cyan);

        panelCambiarEscudoJ2 = new JPanel();
        CreacionDePaneles.crearPanelLayoutNullVisibleFalse(panelCambiarEscudoJ2,entornoPelea,940,100,780,650,Color.red);

        panelComentariosSeleccion = new JPanel();
        CreacionDePaneles.crearPanelLayoutNull(panelComentariosSeleccion,seleccionPersonajes,0,820,1880,140,Color.blue);

        equipamientoJ1 = new JPanel();
        CreacionDePaneles.crearPanelLayoutNull(equipamientoJ1,entornoPelea,0,100,160,650,Color.pink);

        armaEquipadaJ1 = new JPanel();
        CreacionDePaneles.crearPanelLayoutNull(armaEquipadaJ1,equipamientoJ1,45,40,70,70,Color.green);

        escudoEquipadoJ1 = new JPanel();
        CreacionDePaneles.crearPanelLayoutNull(escudoEquipadoJ1,equipamientoJ1,45,160,70,70,Color.green);

        equipamientoJ2 = new JPanel();
        CreacionDePaneles.crearPanelLayoutNull(equipamientoJ2,entornoPelea,1720,100,160,650,Color.magenta);

        armaEquipadaJ2 = new JPanel();
        CreacionDePaneles.crearPanelLayoutNull(armaEquipadaJ2,equipamientoJ2,45,40,70,70,Color.green);

        escudoEquipadoJ2 = new JPanel();
        CreacionDePaneles.crearPanelLayoutNull(escudoEquipadoJ2,equipamientoJ2,45,160,70,70,Color.green);

    }

    /**
     * Metodo que crea los JButton
     * @throws IOException
     */
    private void crearBotones() throws IOException {

        cambiarArmaJ1 = new JButton("Cambiar de arma");
        cambiarArmaJ1.setBounds(545,20,230,38);
        cambiarArmaJ1.setFont(new Font(null,Font.PLAIN,23));
        accionesJ1.add(cambiarArmaJ1);

        cambiarEscudoJ1 = new JButton("Cambiar de escudo");
        cambiarEscudoJ1.setBounds(70,20,260,38);
        cambiarEscudoJ1.setFont(new Font(null,Font.PLAIN,23));
        accionesJ1.add(cambiarEscudoJ1);

        AtaqueJ1 = new JButton("Atacar");
        AtaqueJ1.setBounds(383,20,110,40);
        AtaqueJ1.setFont(new Font(null,Font.PLAIN,23));
        accionesJ1.add(AtaqueJ1);

        cambiarArmaJ2 = new JButton("Cambiar de arma");
        cambiarArmaJ2.setBounds(545,20,230,38);
        cambiarArmaJ2.setFont(new Font(null,Font.PLAIN,23));
        accionesJ2.add(cambiarArmaJ2);

        cambiarEscudoJ2 = new JButton("Cambiar de escudo");
        cambiarEscudoJ2.setBounds(70,20,260,38);
        cambiarEscudoJ2.setFont(new Font(null,Font.PLAIN,23));
        accionesJ2.add(cambiarEscudoJ2);

        AtaqueJ2 = new JButton("Atacar");
        AtaqueJ2.setBounds(383,20,110,38);
        AtaqueJ2.setFont(new Font(null,Font.PLAIN,23));
        accionesJ2.add(AtaqueJ2);

        BufferedImage iconoMago = ImageIO.read(new File("src/imagenes/mago.png"));
        seleccionarMagoJ1 = new JButton();
        seleccionarMagoJ1.setBounds(62,90,200,270);
        seleccionarMagoJ1.setIcon(new ImageIcon(iconoMago.getScaledInstance(seleccionarMagoJ1.getWidth(),seleccionarMagoJ1.getHeight(), Image.SCALE_SMOOTH)));
        seleccionClaseJ1.add(seleccionarMagoJ1);

        BufferedImage iconoGuerrero = ImageIO.read(new File("src/imagenes/guerrero.png"));
        seleccionarGuerreroJ1 = new JButton();
        seleccionarGuerreroJ1.setBounds(323,90,200,270);
        seleccionarGuerreroJ1.setIcon(new ImageIcon(iconoGuerrero.getScaledInstance(seleccionarGuerreroJ1.getWidth(),seleccionarGuerreroJ1.getHeight(), Image.SCALE_SMOOTH)));
        seleccionClaseJ1.add(seleccionarGuerreroJ1);

        BufferedImage iconoSamurai = ImageIO.read(new File("src/imagenes/samurai.jpg"));
        seleccionarSamuraiJ1 = new JButton();
        seleccionarSamuraiJ1.setBounds(584,90,200,270);
        seleccionarSamuraiJ1.setIcon(new ImageIcon(iconoSamurai.getScaledInstance(seleccionarSamuraiJ1.getWidth(), seleccionarSamuraiJ1.getHeight(), Image.SCALE_SMOOTH)));
        seleccionClaseJ1.add(seleccionarSamuraiJ1);

        seleccionarMagoJ2 = new JButton();
        seleccionarMagoJ2.setBounds(62,90,200,270);
        seleccionarMagoJ2.setIcon(new ImageIcon(iconoMago.getScaledInstance(seleccionarMagoJ2.getWidth(),seleccionarMagoJ2.getHeight(), Image.SCALE_SMOOTH)));
        seleccionClaseJ2.add(seleccionarMagoJ2);

        seleccionarGuerreroJ2 = new JButton();
        seleccionarGuerreroJ2.setBounds(323,90,200,270);
        seleccionarGuerreroJ2.setIcon(new ImageIcon(iconoGuerrero.getScaledInstance(seleccionarGuerreroJ2.getWidth(),seleccionarGuerreroJ2.getHeight(), Image.SCALE_SMOOTH)));
        seleccionClaseJ2.add(seleccionarGuerreroJ2);

        seleccionarSamuraiJ2 = new JButton(new ImageIcon(iconoSamurai));
        seleccionarSamuraiJ2.setBounds(584,90,200,270);
        seleccionarSamuraiJ2.setIcon(new ImageIcon(iconoSamurai.getScaledInstance(seleccionarSamuraiJ2.getWidth(), seleccionarSamuraiJ2.getHeight(), Image.SCALE_SMOOTH)));
        seleccionClaseJ2.add(seleccionarSamuraiJ2);

        empezarPelea = new JButton("Empezar la pelea");
        empezarPelea.setBounds(710,10,280,50);
        empezarPelea.setFont(new Font(null,Font.PLAIN,28));
        comenzarPelea.add(empezarPelea);

        seleccionarArmaJ1 = new JButton("Utilizar arma seleccionada");
        seleccionarArmaJ1.setBounds(90,575,335,38);
        seleccionarArmaJ1.setFont(new Font(null,Font.PLAIN,24));
        panelCambiarArmaJ1.add(seleccionarArmaJ1);

        seleccionarArmaJ2 = new JButton("Utilizar arma seleccionada");
        seleccionarArmaJ2.setBounds(350,575,335,38);
        seleccionarArmaJ2.setFont(new Font(null,Font.PLAIN,24));
        panelCambiarArmaJ2.add(seleccionarArmaJ2);

        seleccionarEscudoJ1 = new JButton("Utilizar escudo seleccionado");
        seleccionarEscudoJ1.setBounds(120,575,355,38);
        seleccionarEscudoJ1.setFont(new Font(null,Font.PLAIN,24));
        panelCambiarEscudoJ1.add(seleccionarEscudoJ1);

        seleccionarEscudoJ2 = new JButton("Utilizar escudo seleccionado");
        seleccionarEscudoJ2.setBounds(300,575,355,38);
        seleccionarEscudoJ2.setFont(new Font(null,Font.PLAIN,24));
        panelCambiarEscudoJ2.add(seleccionarEscudoJ2);
    }

    /**
     * Metodo que crea los listeners de todos los JButton
     */
    private void listenersBotones(){

        AtaqueJ1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                botonAtaqueJugador1ActionPerformed(e,jugador1,jugador2);

            }
        });

        AtaqueJ2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                botonAtaqueJugador2ActionPerformed(e,jugador1,jugador2);

            }
        });

        empezarPelea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                empezarALucharActionPerformed(e,jugador1,jugador2);

            }
        });

        seleccionarMagoJ1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                seleccionarMagoJ1ActionPerformed(e);

            }
        });

        seleccionarGuerreroJ1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                seleccionarGuerreroJ1ActionPerformed(e);

            }
        });

        seleccionarSamuraiJ1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                seleccionarSamuraiJ1ActionPerformed(e);

            }
        });

        seleccionarMagoJ2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                seleccionarMagoJ2ActionPerformed(e);

            }
        });

        seleccionarGuerreroJ2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                seleccionarGuerreroJ2ActionPerformed(e);

            }
        });

        seleccionarSamuraiJ2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                seleccionarSamuraiJ2ActionPerformed(e);

            }
        });

        cambiarArmaJ1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cambiarArmaJ1ActionPerformed(e);

            }
        });

        cambiarArmaJ2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cambiarArmaJ2ActionPerformed(e);

            }
        });

        seleccionarArmaJ1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                seleccionarArmaJ1ActionPerformed(e);

            }
        });

        seleccionarArmaJ2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                seleccionarArmaJ2ActionPerformed(e);

            }
        });

        cambiarEscudoJ1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cambiarEscudoJ1ActionPerformed(e);

            }
        });

        cambiarEscudoJ2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cambiarEscudoJ2ActionPerformed(e);

            }
        });

        seleccionarEscudoJ1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                seleccionarEscudoJ1ActionPerformed(e);

            }
        });

        seleccionarEscudoJ2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                seleccionarEscudoJ2ActionPerformed(e);

            }
        });
    }

    /**
     * metodo que crea las acciones que ejecuta el boton ataqueJugador1
     * @param e
     * @param luchador1
     * @param luchador2
     */
    private void botonAtaqueJugador1ActionPerformed(ActionEvent e, Jugador luchador1, Jugador luchador2){

        dañoJ1 = luchador1.atacar(1);
        vigorFinalJ1 = luchador2.recibirGolpe(dañoJ1);
        vidaJ1.setText("Vida Jugador 1: " +jugador1.getVigor());
        vidaJ2.setText("Vida Jugador 2: " +jugador2.getVigor());

        if (vigorFinalJ1<0){

            ganador.setText("EL JUGADOR 1 HA GANADO");
            jugadorGanador.setVisible(true);
            entornoPelea.setVisible(false);

        }

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
        vidaJ1.setFont(new Font(null,Font.PLAIN,24));
        panelVidaJ2.add(vidaJ1);

        vidaJ2 = new JLabel("Vida Jugador 2: " +luchador2);
        vidaJ2.setFont(new Font(null,Font.PLAIN,24));
        panelVidaJ1.add(vidaJ2);
    }

    /**
     * Metodo que crea las JLabel
     */
    private void crearEtiquetas(){

        String[] textoEtiqueta = {"Nombre del jugador 1:","Nombre del Jugador 2:","Selecciona la clase con la que quieres combatir","Mago","Guerrero","Samurai"};

        ganador = new JLabel();
        jugadorGanador.add(ganador);

        introducirNombreJ1 = new JLabel(textoEtiqueta[0]);
        CreacionDeEtiquetas.CrearEtiquetaStandard(introducirNombreJ1,panelIntroducirNombreJ1,290,8,300,36,26);

        introducirNombreJ2 = new JLabel(textoEtiqueta[1]);
        CreacionDeEtiquetas.CrearEtiquetaStandard(introducirNombreJ2,panelIntroducirNombreJ2,290,8,300,36,26);

        seleccionarClaseJ1 = new JLabel(textoEtiqueta[2]);
        CreacionDeEtiquetas.CrearEtiquetaStandard(seleccionarClaseJ1,seleccionClaseJ1,140,0,600,30,26);

        seleccionarClaseJ2 = new JLabel(textoEtiqueta[2]);
        CreacionDeEtiquetas.CrearEtiquetaStandard(seleccionarClaseJ2,seleccionClaseJ2,140,0,600,30,26);

        magoJ1 = new JLabel(textoEtiqueta[3]);
        CreacionDeEtiquetas.CrearEtiquetaStandard(magoJ1,seleccionClaseJ1,135,58,60,30,20);

        guerreroJ1 = new JLabel(textoEtiqueta[4]);
        CreacionDeEtiquetas.CrearEtiquetaStandard(guerreroJ1,seleccionClaseJ1,380,58,90,30,20);

        samuraiJ1 = new JLabel(textoEtiqueta[5]);
        CreacionDeEtiquetas.CrearEtiquetaStandard(samuraiJ1,seleccionClaseJ1,650,58,82,30,20);

        magoJ2 = new JLabel(textoEtiqueta[3]);
        CreacionDeEtiquetas.CrearEtiquetaStandard(magoJ2,seleccionClaseJ2,135,58,60,30,20);

        guerreroJ2 = new JLabel(textoEtiqueta[4]);
        CreacionDeEtiquetas.CrearEtiquetaStandard(guerreroJ2,seleccionClaseJ2,380,58,60,30,20);

        samuraiJ2 = new JLabel(textoEtiqueta[5]);
        CreacionDeEtiquetas.CrearEtiquetaStandard(samuraiJ2,seleccionClaseJ2,650,58,82,30,20);

        mostrarNombreJ1 = new JLabel();
        CreacionDeEtiquetas.CrearEtiquetaStandard(mostrarNombreJ1,panelNombreJ1,200,0,500,30,30);

        mostrarNombreJ2 = new JLabel();
        CreacionDeEtiquetas.CrearEtiquetaStandard(mostrarNombreJ2,panelNombreJ2,200,0,500,30,30);

    }

    /**
     * Metodo que crea los JTextArea
     */
    private void crearTextArea(){

        comentariosSeleccion = new JTextArea();
        comentariosSeleccion.setBounds(0,0,1700,150);
        comentariosSeleccion.setOpaque(false);
        comentariosSeleccion.setFont(new Font(null,Font.PLAIN,24));
        panelComentariosSeleccion.add(comentariosSeleccion);

    }

    /**
     * Metodo que crea los JTextField
     */
    private void crearTextField(){

        nombreJ1 = new JTextField();
        Provisional.crearTextFieldNombre(nombreJ1,panelIntroducirNombreJ1);

        nombreJ2 = new JTextField();
        Provisional.crearTextFieldNombre(nombreJ2,panelIntroducirNombreJ2);

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
        crearTextArea();

    }
}