package entornoGrafico;

import entornoGrafico.AccionesBotones.AccionBotonElegirClase;
import entornoGrafico.AccionesBotones.AccionBotonesDeAccion;
import jugador.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import static entornoGrafico.AccionesBotones.CreacionDeListeners.addMouseListenerToButton;
import static entornoGrafico.PanelesInformacion.PanelesInformacionClases.crearPanelesInformacionClases;
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
    public JPanel panelinformacionMagoJ1;
    public JPanel panelinformacionGuerreroJ1;
    public JPanel panelinformacionSamuraiJ1;
    public JPanel panelinformacionMagoJ2;
    public JPanel panelinformacionGuerreroJ2;
    public JPanel panelinformacionSamuraiJ2;

    public JButton ataqueJ1;
    public JButton cambiarArmaJ1;
    public JButton ataqueJ2;
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
    public JLabel informacionMagoJ1;
    public JLabel informacionGuerreroJ1;
    public JLabel informacionSamuraiJ1;
    public JLabel informacionMagoJ2;
    public JLabel informacionGuerreroJ2;
    public JLabel informacionSamuraiJ2;

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
    private void crearPaneles() throws IOException {
        BufferedImage fondoSeleccion = ImageIO.read(new File("src/imagenes/fondo.png"));
        BufferedImage fondoInfoClases = ImageIO.read(new File("src/imagenes/infoClases.png"));

        entornoPelea = new JPanel(){protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(fondoSeleccion, 0, 0, this.getWidth(), this.getHeight(), this);
        }};
        crearPanelLayoutNullVisibleFalse(entornoPelea,(JPanel) this.getContentPane(),0,0,1880,1000,null);

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
        crearPanelStandard(skinJ1,entornoPelea,130,100,810,650,Color.blue);

        skinJ2 = new JPanel();
        crearPanelStandard(skinJ2,entornoPelea,940,100,810,650,Color.yellow);

        accionesJ1 = new JPanel();
        crearPanelLayoutNull(accionesJ1,entornoPelea,0,750,940,130,Color.darkGray);

        accionesJ2 = new JPanel();
        crearPanelLayoutNull(accionesJ2,entornoPelea,940,750,940,130,Color.black);

        seleccionPersonajes = new JPanel(){protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(fondoSeleccion, 0, 0, this.getWidth(), this.getHeight(), this);
        }};
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
        crearPanelLayoutNullVisibleFalse(panelCambiarArmaJ1,entornoPelea,130,100,810,650,Color.yellow);

        panelCambiarEscudoJ1 = new JPanel();
        crearPanelLayoutNullVisibleFalse(panelCambiarEscudoJ1,entornoPelea,130,100,810,650,Color.green);

        seleccionPersonajeJ2 = new JPanel();
        crearPanelLayoutNull(seleccionPersonajeJ2,seleccionPersonajes,940,0,940,750,null);

        panelIntroducirNombreJ2 = new JPanel();
        crearPanelLayoutNull(panelIntroducirNombreJ2,seleccionPersonajeJ2,0,0,940,115,Color.yellow);

        seleccionClaseJ2 = new JPanel();
        crearPanelLayoutNull(seleccionClaseJ2,seleccionPersonajeJ2,0,115,940,635,Color.green);

        panelCambiarArmaJ2 = new JPanel();
        crearPanelLayoutNullVisibleFalse(panelCambiarArmaJ2,entornoPelea,940,100,810,650,Color.cyan);

        panelCambiarEscudoJ2 = new JPanel();
        crearPanelLayoutNullVisibleFalse(panelCambiarEscudoJ2,entornoPelea,940,100,810,650,Color.red);

        panelComentariosSeleccion = new JPanel();
        crearPanelLayoutNull(panelComentariosSeleccion,seleccionPersonajes,0,820,1880,140,Color.blue);

        equipamientoJ1 = new JPanel();
        crearPanelLayoutNull(equipamientoJ1,entornoPelea,0,100,130,650,Color.pink);

        armaEquipadaJ1 = new JPanel();
        crearPanelLayoutNull(armaEquipadaJ1,equipamientoJ1,35,40,60,60,Color.green);

        escudoEquipadoJ1 = new JPanel();
        crearPanelLayoutNull(escudoEquipadoJ1,equipamientoJ1,35,160,60,60,Color.green);

        equipamientoJ2 = new JPanel();
        crearPanelLayoutNull(equipamientoJ2,entornoPelea,1750,100,130,650,Color.magenta);

        armaEquipadaJ2 = new JPanel();
        crearPanelLayoutNull(armaEquipadaJ2,equipamientoJ2,35,40,60,60,Color.green);

        escudoEquipadoJ2 = new JPanel();
        crearPanelLayoutNull(escudoEquipadoJ2,equipamientoJ2,35,160,60,60,Color.green);

        panelinformacionMagoJ1 = new JPanel(){protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(fondoInfoClases, 0, 0, this.getWidth(), this.getHeight(), this);
        }};
        crearPanelLayoutNullVisibleFalse(panelinformacionMagoJ1,seleccionClaseJ1,124,405,200,230,Color.green);

        panelinformacionGuerreroJ1 = new JPanel(){protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(fondoInfoClases, 0, 0, this.getWidth(), this.getHeight(), this);
        }};
        crearPanelLayoutNullVisibleFalse(panelinformacionGuerreroJ1,seleccionClaseJ1,646,405,200,230,Color.green);

        panelinformacionSamuraiJ1 = new JPanel(){protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(fondoInfoClases, 0, 0, this.getWidth(), this.getHeight(), this);
        }};
        crearPanelLayoutNullVisibleFalse(panelinformacionSamuraiJ1,seleccionClaseJ1,385,405,200,230,Color.green);

        panelinformacionMagoJ2 = new JPanel(){protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(fondoInfoClases, 0, 0, this.getWidth(), this.getHeight(), this);
        }};
        crearPanelLayoutNullVisibleFalse(panelinformacionMagoJ2,seleccionClaseJ2,124,405,200,230,Color.green);

        panelinformacionGuerreroJ2 = new JPanel(){protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(fondoInfoClases, 0, 0, this.getWidth(), this.getHeight(), this);
        }};
        crearPanelLayoutNullVisibleFalse(panelinformacionGuerreroJ2,seleccionClaseJ2,646,405,200,230,Color.green);

        panelinformacionSamuraiJ2= new JPanel(){protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(fondoInfoClases, 0, 0, this.getWidth(), this.getHeight(), this);
        }};
        crearPanelLayoutNullVisibleFalse(panelinformacionSamuraiJ2,seleccionClaseJ2,385,405,200,230,Color.green);
    }

    /**
     * Metodo que crea los JButton
     * @throws IOException
     */
    private void crearBotones() throws IOException {

        String[] textoBoton = {"Cambiar de arma","Cambiar de escudo","Atacar","Empezar la pelea","Utilizar arma seleccionada","Utilizar escudo seleccionado"};
        BufferedImage iconoMago = ImageIO.read(new File("src/imagenes/confesor.png"));
        BufferedImage iconoGuerrero = ImageIO.read(new File("src/imagenes/guerrero.png"));
        BufferedImage iconoSamurai = ImageIO.read(new File("src/imagenes/samurai.png"));
        BufferedImage iconoEmpezarPelea = ImageIO.read(new File("src/imagenes/Empezar Pelea.png"));
        BufferedImage atacar = ImageIO.read(new File("src/imagenes/Atacar.png"));
        BufferedImage cambiarArma = ImageIO.read(new File("src/imagenes/Cambiar Arma.png"));
        BufferedImage cambiarEscudo = ImageIO.read(new File("src/imagenes/Cambiar Escudo.png"));

        cambiarArmaJ1 = new JButton(textoBoton[0]);
        crearBotonImagen(cambiarArmaJ1,accionesJ1,616,59,250,60,cambiarArma);

        cambiarEscudoJ1 = new JButton(textoBoton[1]);
        crearBotonImagen(cambiarEscudoJ1,accionesJ1,0,48,360,85,cambiarEscudo);

        ataqueJ1 = new JButton(textoBoton[2]);
        crearBotonImagen(ataqueJ1,accionesJ1,385,65,170,52,atacar);

        cambiarArmaJ2 = new JButton(textoBoton[0]);
        crearBotonImagen(cambiarArmaJ2,accionesJ2,616,59,250,60,cambiarArma);

        cambiarEscudoJ2 = new JButton(textoBoton[1]);
        crearBotonImagen(cambiarEscudoJ2,accionesJ2,0,48,360,85,cambiarEscudo);

        ataqueJ2 = new JButton(textoBoton[2]);
        crearBotonImagen(ataqueJ2,accionesJ2,385,65,170,52,atacar);

        seleccionarMagoJ1 = new JButton();
        crearBotonImagen(seleccionarMagoJ1,seleccionClaseJ1,109,130,200,270,iconoMago);

        seleccionarGuerreroJ1 = new JButton();
        crearBotonImagen(seleccionarGuerreroJ1,seleccionClaseJ1,631,130,200,270,iconoGuerrero);

        seleccionarSamuraiJ1 = new JButton();
        crearBotonImagen(seleccionarSamuraiJ1,seleccionClaseJ1,370,130,200,270,iconoSamurai);

        seleccionarMagoJ2 = new JButton();
        crearBotonImagen(seleccionarMagoJ2,seleccionClaseJ2,109,130,200,270,iconoMago);

        seleccionarGuerreroJ2 = new JButton();
        crearBotonImagen(seleccionarGuerreroJ2,seleccionClaseJ2,631,130,200,270,iconoGuerrero);

        seleccionarSamuraiJ2 = new JButton();
        crearBotonImagen(seleccionarSamuraiJ2,seleccionClaseJ2,370,130,200,270,iconoSamurai);

        empezarPelea = new JButton();
        crearBotonImagen(empezarPelea,comenzarPelea,800,0,270,70,iconoEmpezarPelea);

        seleccionarArmaJ1 = new JButton(textoBoton[4]);
        crearBotonTexto(seleccionarArmaJ1,panelCambiarArmaJ1,185,615,335,38,24);

        seleccionarArmaJ2 = new JButton(textoBoton[4]);
        crearBotonTexto(seleccionarArmaJ2,panelCambiarArmaJ2,185,615,335,38,24);

        seleccionarEscudoJ1 = new JButton(textoBoton[5]);
        crearBotonTexto(seleccionarEscudoJ1,panelCambiarEscudoJ1,178,590,360,38,24);

        seleccionarEscudoJ2 = new JButton(textoBoton[5]);
        crearBotonTexto(seleccionarEscudoJ2,panelCambiarEscudoJ2,178,590,360,38,24);
    }

    /**
     * Metodo que crea los listeners de todos los JButton
     */
    private void actionListenersBotones(){

        addListener(ataqueJ1, e -> botonAtaqueJugador1ActionPerformed(e, jugador1, jugador2));
        addListener(ataqueJ2, e -> botonAtaqueJugador2ActionPerformed(e, jugador1, jugador2));
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

    private void mouseListenersBotones() {
        addMouseListenerToButton(seleccionarMagoJ1, panelinformacionMagoJ1,informacionMagoJ1 ,Mago::getStats);
        addMouseListenerToButton(seleccionarGuerreroJ1, panelinformacionGuerreroJ1, informacionGuerreroJ1,Guerrero::getStats);
        addMouseListenerToButton(seleccionarSamuraiJ1, panelinformacionSamuraiJ1, informacionSamuraiJ1,Samurai::getStats);
        addMouseListenerToButton(seleccionarMagoJ2, panelinformacionMagoJ2, informacionMagoJ2,Mago::getStats);
        addMouseListenerToButton(seleccionarGuerreroJ2, panelinformacionGuerreroJ2, informacionGuerreroJ2,Guerrero::getStats);
        addMouseListenerToButton(seleccionarSamuraiJ2, panelinformacionSamuraiJ2, informacionSamuraiJ2,Samurai::getStats);
    }


    /**
     * metodo que crea las acciones que ejecuta el boton ataqueJugador1
     * @param e
     * @param luchador1
     * @param luchador2
     */
    private void botonAtaqueJugador1ActionPerformed(ActionEvent e, Jugador luchador1, Jugador luchador2){
        AccionBotonesDeAccion.botonAtaque(e,luchador1,luchador2,dañoJ1,vigorFinalJ1,vidaJ1,vidaJ2,jugadorGanador,entornoPelea,1);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton ataqueJugador2
     * @param e
     * @param luchador1
     * @param luchador2
     */
    private void botonAtaqueJugador2ActionPerformed(ActionEvent e, Jugador luchador1, Jugador luchador2){
       AccionBotonesDeAccion.botonAtaque(e,luchador1,luchador2,dañoJ2,vigorFinalJ2,vidaJ1,vidaJ2,jugadorGanador,entornoPelea,2);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton empezarALuchar
     * @param e
     */
    private void empezarALucharActionPerformed(ActionEvent e,Jugador luchador1, Jugador luchador2){
        AccionBotonElegirClase.empezarALuchar(e,jugador1,jugador2,comentariosSeleccion,seleccionPersonajes,entornoPelea,mostrarNombreJ1,mostrarNombreJ2,nombreJ1,nombreJ2,vidaJ1,vidaJ2);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton seleccionarMagoJ1
     * @param e
     */
    private void seleccionarMagoJ1ActionPerformed(ActionEvent e){
        jugador1 = new Mago(nombreJ1.getText());
        AccionBotonElegirClase.seleccionarclase(e,seleccionarMagoJ1,seleccionarGuerreroJ1,seleccionarSamuraiJ1);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton seleccionarGuerreroJ1
     * @param e
     */
    private void seleccionarGuerreroJ1ActionPerformed(ActionEvent e){
        jugador1 = new Guerrero(nombreJ1.getText());
        AccionBotonElegirClase.seleccionarclase(e,seleccionarGuerreroJ1,seleccionarMagoJ1,seleccionarSamuraiJ1);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton seleccionarSamuraiJ1
     * @param e
     */
    private void seleccionarSamuraiJ1ActionPerformed(ActionEvent e){
        jugador1 = new Samurai(nombreJ1.getText());
        AccionBotonElegirClase.seleccionarclase(e,seleccionarSamuraiJ1,seleccionarGuerreroJ1,seleccionarMagoJ1);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton seleccionarMagoJ2
     * @param e
     */
    private void seleccionarMagoJ2ActionPerformed(ActionEvent e){
        jugador2 = new Mago(nombreJ2.getText());
        AccionBotonElegirClase.seleccionarclase(e,seleccionarMagoJ2,seleccionarGuerreroJ2,seleccionarSamuraiJ2);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton seleccionarGuerreroJ2
     * @param e
     */
    private void seleccionarGuerreroJ2ActionPerformed(ActionEvent e){
        jugador2 = new Guerrero(nombreJ2.getText());
        AccionBotonElegirClase.seleccionarclase(e,seleccionarGuerreroJ2,seleccionarMagoJ2,seleccionarSamuraiJ2);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton seleccionarSamuraiJ2
     * @param e
     */
    private void seleccionarSamuraiJ2ActionPerformed(ActionEvent e){
        jugador2 = new Samurai(nombreJ2.getText());
        AccionBotonElegirClase.seleccionarclase(e,seleccionarSamuraiJ2,seleccionarGuerreroJ2,seleccionarMagoJ2);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton seleccionarArmaJ1
     * @param e
     */
    private void seleccionarArmaJ1ActionPerformed(ActionEvent e){
        AccionBotonesDeAccion.seleccionarEquipo(e,skinJ1,panelCambiarArmaJ1, ataqueJ1,cambiarArmaJ1,cambiarEscudoJ1);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton seleccionarArmaJ2
     * @param e
     */
    private void seleccionarArmaJ2ActionPerformed(ActionEvent e){
        AccionBotonesDeAccion.seleccionarEquipo(e,skinJ2,panelCambiarArmaJ2, ataqueJ2,cambiarArmaJ2,cambiarEscudoJ2);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton seleccionarEscudoJ1
     * @param e
     */
    private void seleccionarEscudoJ1ActionPerformed(ActionEvent e){
        AccionBotonesDeAccion.seleccionarEquipo(e,skinJ1,panelCambiarEscudoJ1, ataqueJ1,cambiarArmaJ1,cambiarEscudoJ1);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton seleccionarEscudoJ2
     * @param e
     */
    private void seleccionarEscudoJ2ActionPerformed(ActionEvent e){
        AccionBotonesDeAccion.seleccionarEquipo(e,skinJ2,panelCambiarEscudoJ2, ataqueJ2,cambiarArmaJ2,cambiarEscudoJ2);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton cambiarArmaJ1
     * @param e
     */
    private void cambiarArmaJ1ActionPerformed(ActionEvent e){
       AccionBotonesDeAccion.cambiarArma(e,panelCambiarArmaJ1,jugador1,skinJ1,1,cambiarArmaJ1,cambiarEscudoJ1, ataqueJ1);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton cambiarArmaJ1
     * @param e
     */
    private void cambiarArmaJ2ActionPerformed(ActionEvent e){
        AccionBotonesDeAccion.cambiarArma(e,panelCambiarArmaJ2,jugador2,skinJ2,2,cambiarArmaJ2,cambiarEscudoJ2, ataqueJ2);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton cambiarEscudoJ1
     * @param e
     */
    private void cambiarEscudoJ1ActionPerformed(ActionEvent e){
        AccionBotonesDeAccion.cambiarEscudo(e,panelCambiarEscudoJ1,jugador1,skinJ1,1,cambiarArmaJ1,cambiarEscudoJ1, ataqueJ1);
    }

    /**
     * metodo que crea las acciones que ejecuta el boton cambiarEscudoJ2
     * @param e
     */
    private void cambiarEscudoJ2ActionPerformed(ActionEvent e){
        AccionBotonesDeAccion.cambiarEscudo(e,panelCambiarEscudoJ2,jugador2,skinJ2,2,cambiarArmaJ2,cambiarEscudoJ2, ataqueJ2);
    }

    /**
     * Metodo que crea las JLabel con las vidas de los jugadores
     * @param luchador1
     * @param luchador2
     */
    private void crearVidasJugadores(Jugador luchador1, Jugador luchador2){

        vidaJ1 = new JLabel(""+luchador1);
        CrearEtiquetaStandard(vidaJ1, panelVidaJ1,0,0,0,0,28);

        vidaJ2 = new JLabel(""+luchador2);
        CrearEtiquetaStandard(vidaJ2, panelVidaJ2,0,0,0,0,28);
    }

    /**
     * Metodo que crea las JLabel
     */
    private void crearEtiquetas(){

        String[] textoEtiqueta = {"Nombre del jugador 1:","Nombre del Jugador 2:","Selecciona la clase con la que quieres combatir","Confesor","Guerrero","Samurai"};

        ganador = new JLabel();
        jugadorGanador.add(ganador);

        introducirNombreJ1 = new JLabel(textoEtiqueta[0]);
        CrearEtiquetaStandard(introducirNombreJ1,panelIntroducirNombreJ1,340,8,300,36,26);

        introducirNombreJ2 = new JLabel(textoEtiqueta[1]);
        CrearEtiquetaStandard(introducirNombreJ2,panelIntroducirNombreJ2,340,8,300,36,26);

        seleccionarClaseJ1 = new JLabel(textoEtiqueta[2]);
        CrearEtiquetaStandard(seleccionarClaseJ1,seleccionClaseJ1,195,45,600,30,26);

        seleccionarClaseJ2 = new JLabel(textoEtiqueta[2]);
        CrearEtiquetaStandard(seleccionarClaseJ2,seleccionClaseJ2,195,45,600,30,26);

        magoJ1 = new JLabel(textoEtiqueta[3]);
        CrearEtiquetaStandard(magoJ1,seleccionClaseJ1,165,98,90,30,20);

        guerreroJ1 = new JLabel(textoEtiqueta[4]);
        CrearEtiquetaStandard(guerreroJ1,seleccionClaseJ1,692,98,90,30,20);

        samuraiJ1 = new JLabel(textoEtiqueta[5]);
        CrearEtiquetaStandard(samuraiJ1,seleccionClaseJ1,429,98,82,30,20);

        magoJ2 = new JLabel(textoEtiqueta[3]);
        CrearEtiquetaStandard(magoJ2,seleccionClaseJ2,165,98,90,30,20);

        guerreroJ2 = new JLabel(textoEtiqueta[4]);
        CrearEtiquetaStandard(guerreroJ2,seleccionClaseJ2,692,98,90,30,20);

        samuraiJ2 = new JLabel(textoEtiqueta[5]);
        CrearEtiquetaStandard(samuraiJ2,seleccionClaseJ2,429,98,82,30,20);

        mostrarNombreJ1 = new JLabel();
        CrearEtiquetaStandard(mostrarNombreJ1,panelNombreJ1,200,0,500,20,28);

        mostrarNombreJ2 = new JLabel();
        CrearEtiquetaStandard(mostrarNombreJ2,panelNombreJ2,200,0,500,20,28);

        informacionMagoJ1 = new JLabel();
        crearPanelesInformacionClases(informacionMagoJ1,panelinformacionMagoJ1,25,0,200,230,Color.pink,20);

        informacionGuerreroJ1 = new JLabel();
        crearPanelesInformacionClases(informacionGuerreroJ1,panelinformacionGuerreroJ1,25,0,200,230,Color.pink,20);

        informacionSamuraiJ1 = new JLabel();
        crearPanelesInformacionClases(informacionSamuraiJ1,panelinformacionSamuraiJ1,25,0,200,230,Color.pink,20);

        informacionMagoJ2 = new JLabel();
        crearPanelesInformacionClases(informacionMagoJ2,panelinformacionMagoJ2,25,0,200,230,Color.pink,20);

        informacionGuerreroJ2 = new JLabel();
        crearPanelesInformacionClases(informacionGuerreroJ2,panelinformacionGuerreroJ2,25,0,200,230,Color.pink,20);

        informacionSamuraiJ2 = new JLabel();
        crearPanelesInformacionClases(informacionSamuraiJ2,panelinformacionSamuraiJ2,15,0,200,230,Color.pink,20);

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
        crearTextFieldStandard(nombreJ1,panelIntroducirNombreJ1,320,55,300,32,24);

        nombreJ2 = new JTextField();
        crearTextFieldStandard(nombreJ2,panelIntroducirNombreJ2,320,55,300,32,24);

    }

    /**
     * Metodo que carga todos los componentes del progrrama para que en el constructor solo se cargue este
     * metodo y el que crea las propiedades basicas de la interfaz
     * @throws IOException
     */
    private void iniciarComponentes() throws IOException {

        crearPaneles();
        crearBotones();
        actionListenersBotones();
        crearVidasJugadores(jugador1,jugador2);
        crearEtiquetas();
        crearTextField();
        crearTextAreas();
        mouseListenersBotones();
    }
}