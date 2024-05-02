package entornoDeJuego;

import jugador.Jugador;
import jugador.Mago;
import jugador.Guerrero;
import jugador.Samurai;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class EntornoDeJuego extends JFrame{

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


    public EntornoDeJuego() throws IOException {

        setEntorno();
        iniciarComponentes();

    }

    private void setEntorno(){

        setSize(1700,1000);
        setTitle("Coia_Ring");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);


    }

    private void crearTextField(){

        nombreJ1 = new JTextField();
        nombreJ1.setBounds(280,70,300,32);
        nombreJ1.setFont(new Font(null,Font.PLAIN,24));
        panelIntroducirNombreJ1.add(nombreJ1);


        nombreJ2 = new JTextField();
        nombreJ2.setBounds(280,70,300,32);
        nombreJ2.setFont(new Font(null,Font.PLAIN,24));
        panelIntroducirNombreJ2.add(nombreJ2);

    }

    private void crearPaneles(){

        entornoPelea = new JPanel();
        entornoPelea.setBounds(0,0,1700,900);
        this.getContentPane().add(entornoPelea);
        entornoPelea.setLayout(null);
        entornoPelea.setVisible(false);

        jugadorGanador = new JPanel();
        jugadorGanador.setBounds(0,0,1700,1050);
        jugadorGanador.setBackground(Color.pink);
        this.getContentPane().add(jugadorGanador);

        panelNombreJ1 = new JPanel();
        panelNombreJ1.setBounds(0,0,850,60);
        panelNombreJ1.setBackground(Color.magenta);
        entornoPelea.add(panelNombreJ1);

        panelNombreJ2 = new JPanel();
        panelNombreJ2.setBounds(850,0,850,60);
        panelNombreJ2.setBackground(Color.cyan);
        entornoPelea.add(panelNombreJ2);

        panelVidaJ2 = new JPanel();
        panelVidaJ2.setBounds(0,60,850,90);
        panelVidaJ2.setBackground(Color.RED);
        entornoPelea.add(panelVidaJ2);

        panelVidaJ1 = new JPanel();
        panelVidaJ1.setBounds(850,60,850,90);
        panelVidaJ1.setBackground(Color.GREEN);
        entornoPelea.add(panelVidaJ1);

        skinJ1 = new JPanel();
        skinJ1.setBounds(0,150,850,600);
        skinJ1.setBackground(Color.BLUE);
        entornoPelea.add(skinJ1);

        skinJ2 = new JPanel();
        skinJ2.setBounds(850,150,850,600);
        skinJ2.setBackground(Color.yellow);
        entornoPelea.add(skinJ2);

        accionesJ1 = new JPanel();
        accionesJ1.setBounds(0,750,850,90);
        accionesJ1.setBackground(Color.darkGray);
        entornoPelea.add(accionesJ1);
        accionesJ1.setLayout(null);

        accionesJ2 = new JPanel();
        accionesJ2.setBounds(850,750,850,90);
        accionesJ2.setBackground(Color.black);
        entornoPelea.add(accionesJ2);
        accionesJ2.setLayout(null);

        seleccionPersonajes = new JPanel();
        seleccionPersonajes.setBounds(0,0,1700,1000);
        this.getContentPane().add(seleccionPersonajes);
        seleccionPersonajes.setLayout(null);

        comenzarPelea = new JPanel();
        comenzarPelea.setBounds(0,765,1700,70);
        comenzarPelea.setBackground(Color.black);
        seleccionPersonajes.add(comenzarPelea);
        comenzarPelea.setLayout(null);

        seleccionPersonajeJ1 = new JPanel();
        seleccionPersonajeJ1.setBounds(0,0,850,765);
        seleccionPersonajes.add(seleccionPersonajeJ1);
        seleccionPersonajeJ1.setLayout(null);

        panelIntroducirNombreJ1 = new JPanel();
        panelIntroducirNombreJ1.setBounds(0,0,850,150);
        panelIntroducirNombreJ1.setBackground(Color.cyan);
        panelIntroducirNombreJ1.setLayout(null);
        seleccionPersonajeJ1.add(panelIntroducirNombreJ1);

        seleccionClaseJ1 = new JPanel();
        seleccionClaseJ1.setBounds(0,150,850,615);
        seleccionClaseJ1.setBackground(Color.red);
        seleccionClaseJ1.setLayout(null);
        seleccionPersonajeJ1.add(seleccionClaseJ1);
        seleccionClaseJ1.setVisible(false);

        panelCambiarArmaJ1 = new JPanel();
        panelCambiarArmaJ1.setBounds(0,150,850,615);
        panelCambiarArmaJ1.setBackground(Color.yellow);
        panelCambiarArmaJ1.setLayout(null);
        seleccionPersonajeJ1.add(panelCambiarArmaJ1);

        seleccionPersonajeJ2 = new JPanel();
        seleccionPersonajeJ2.setBounds(850,0,850,765);
        seleccionPersonajes.add(seleccionPersonajeJ2);
        seleccionPersonajeJ2.setLayout(null);

        panelIntroducirNombreJ2 = new JPanel();
        panelIntroducirNombreJ2.setBounds(0,0,850,150);
        panelIntroducirNombreJ2.setBackground(Color.yellow);
        panelIntroducirNombreJ2.setLayout(null);
        seleccionPersonajeJ2.add(panelIntroducirNombreJ2);

        seleccionClaseJ2 = new JPanel();
        seleccionClaseJ2.setBounds(0,150,850,615);
        seleccionClaseJ2.setBackground(Color.green);
        seleccionClaseJ2.setLayout(null);
        seleccionPersonajeJ2.add(seleccionClaseJ2);

        panelCambiarArmaJ2 = new JPanel();
        panelCambiarArmaJ2.setBounds(0,150,850,615);
        panelCambiarArmaJ2.setBackground(Color.cyan);
        panelCambiarArmaJ2.setLayout(null);
        seleccionPersonajeJ2.add(panelCambiarArmaJ2);

        panelComentariosSeleccion = new JPanel();
        panelComentariosSeleccion.setBounds(0,835,1700,140);
        panelComentariosSeleccion.setBackground(Color.BLUE);
        panelComentariosSeleccion.setLayout(null);
        seleccionPersonajes.add(panelComentariosSeleccion);

    }

    private void crearBotones() throws IOException {

        cambiarArmaJ1 = new JButton("Cambiar de arma");
        cambiarArmaJ1.setBounds(230,20,240,40);
        cambiarArmaJ1.setFont(new Font(null,Font.PLAIN,24));
        accionesJ1.add(cambiarArmaJ1);

        AtaqueJ1 = new JButton("Atacar");
        AtaqueJ1.setBounds(530,20,120,40);
        AtaqueJ1.setFont(new Font(null,Font.PLAIN,24));
        accionesJ1.add(AtaqueJ1);

        cambiarArmaJ2 = new JButton("Cambiar de arma");
        cambiarArmaJ2.setBounds(230,20,240,40);
        cambiarArmaJ2.setFont(new Font(null,Font.PLAIN,24));
        accionesJ2.add(cambiarArmaJ2);

        AtaqueJ2 = new JButton("Atacar");
        AtaqueJ2.setBounds(530,20,120,40);
        AtaqueJ2.setFont(new Font(null,Font.PLAIN,24));
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
    }

    private void accionesBotones(){

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

                empezarALucharActionPerformed(e);

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
    }

    private void botonAtaqueJugador1ActionPerformed(ActionEvent e, Jugador luchador1, Jugador luchador2){

        dañoJ1 = luchador1.atacar(1);
        vigorFinalJ1 = luchador2.recibirGolpe(dañoJ1);
        vidaJ1.setText("Vida Jugador 1: " +luchador1);
        vidaJ2.setText("Vida Jugador 2: " +luchador2);

        if (vigorFinalJ1<0){

            ganador.setText("EL JUGADOR 1 HA GANADO");
            jugadorGanador.setVisible(true);
            entornoPelea.setVisible(false);

        }

    }

    private void botonAtaqueJugador2ActionPerformed(ActionEvent e, Jugador luchador1, Jugador luchador2){

        dañoJ2 = luchador2.atacar(1);
        vigorFinalJ2 = luchador1.recibirGolpe(dañoJ2);
        vidaJ1.setText("Vida Jugador 1: " +luchador1);
        vidaJ2.setText("Vida Jugador 2: " +luchador2);

        if (vigorFinalJ2<0){

            ganador.setText("EL JUGADOR 2 HA GANADO");
            jugadorGanador.setVisible(true);
            entornoPelea.setVisible(false);
        }

    }

    private void empezarALucharActionPerformed(ActionEvent e){

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

    }

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

    private void seleccionarMagoJ1ActionPerformed(ActionEvent e){

        jugador1 = new Mago(nombreJ1.getText());
        seleccionarMagoJ1.setEnabled(false);
        seleccionarGuerreroJ1.setEnabled(true);
        seleccionarSamuraiJ1.setEnabled(true);

    }

    private void seleccionarGuerreroJ1ActionPerformed(ActionEvent e){

        jugador1 = new Guerrero(nombreJ1.getText());
        seleccionarGuerreroJ1.setEnabled(false);
        seleccionarMagoJ1.setEnabled(true);
        seleccionarSamuraiJ1.setEnabled(true);

    }

    private void seleccionarSamuraiJ1ActionPerformed(ActionEvent e){

        jugador1 = new Samurai(nombreJ1.getText());
        seleccionarSamuraiJ1.setEnabled(false);
        seleccionarGuerreroJ1.setEnabled(true);
        seleccionarMagoJ1.setEnabled(true);

    }

    private void seleccionarMagoJ2ActionPerformed(ActionEvent e){

        jugador2 = new Mago(nombreJ2.getText());
        seleccionarMagoJ2.setEnabled(false);
        seleccionarGuerreroJ2.setEnabled(true);
        seleccionarSamuraiJ2.setEnabled(true);

    }

    private void seleccionarGuerreroJ2ActionPerformed(ActionEvent e){

        jugador2 = new Guerrero(nombreJ2.getText());
        seleccionarGuerreroJ2.setEnabled(false);
        seleccionarMagoJ2.setEnabled(true);
        seleccionarSamuraiJ2.setEnabled(true);

    }

    private void seleccionarSamuraiJ2ActionPerformed(ActionEvent e){

        jugador2 = new Samurai(nombreJ2.getText());
        seleccionarSamuraiJ2.setEnabled(false);
        seleccionarGuerreroJ2.setEnabled(true);
        seleccionarMagoJ2.setEnabled(true);

    }

    private void crearVidasJugadores(Jugador luchador1, Jugador luchador2){

        vidaJ1 = new JLabel("Vida Jugador 1: " +luchador1);
        vidaJ1.setFont(new Font(null,Font.PLAIN,24));
        panelVidaJ2.add(vidaJ1);

        vidaJ2 = new JLabel("Vida Jugador 2: " +luchador2);
        vidaJ2.setFont(new Font(null,Font.PLAIN,24));
        panelVidaJ1.add(vidaJ2);
    }

    private void crearEtiquetas(){

        ganador = new JLabel();
        jugadorGanador.add(ganador);
        jugadorGanador.setVisible(false);

        introducirNombreJ1 = new JLabel("Nombre del jugador 1:");
        introducirNombreJ1.setBounds(290,15,300,36);
        introducirNombreJ1.setFont(new Font(null,Font.PLAIN,27));
        panelIntroducirNombreJ1.add(introducirNombreJ1);

        introducirNombreJ2 = new JLabel("Nombre del jugador 2:");
        introducirNombreJ2.setBounds(287,15,300,36);
        introducirNombreJ2.setFont(new Font(null,Font.PLAIN,27));
        panelIntroducirNombreJ2.add(introducirNombreJ2);

        seleccionarClaseJ1 = new JLabel("Selecciona la clase con la que quieres combatir");
        seleccionarClaseJ1.setBounds(140,0,600,30);
        seleccionarClaseJ1.setFont(new Font(null,Font.PLAIN,26));
        seleccionClaseJ1.add(seleccionarClaseJ1);

        seleccionarClaseJ2 = new JLabel("Selecciona la clase con la que quieres combatir");
        seleccionarClaseJ2.setBounds(140,0,600,30);
        seleccionarClaseJ2.setFont(new Font(null,Font.PLAIN,26));
        seleccionClaseJ2.add(seleccionarClaseJ2);

        magoJ1 = new JLabel("Mago");
        magoJ1.setBounds(135,58,60,30);
        magoJ1.setFont(new Font(null,Font.PLAIN,20));
        seleccionClaseJ1.add(magoJ1);

        guerreroJ1 = new JLabel("Guerrero");
        guerreroJ1.setBounds(380,58,90,30);
        guerreroJ1.setFont(new Font(null,Font.PLAIN,20));
        seleccionClaseJ1.add(guerreroJ1);

        samuraiJ1 = new JLabel("Samurai");
        samuraiJ1.setBounds(650,58,82,30);
        samuraiJ1.setFont(new Font(null,Font.PLAIN,20));
        seleccionClaseJ1.add(samuraiJ1);

        magoJ2 = new JLabel("Mago");
        magoJ2.setBounds(135,58,60,30);
        magoJ2.setFont(new Font(null,Font.PLAIN,20));
        seleccionClaseJ2.add(magoJ2);

        guerreroJ2 = new JLabel("Guerrero");
        guerreroJ2.setBounds(380,58,90,30);
        guerreroJ2.setFont(new Font(null,Font.PLAIN,20));
        seleccionClaseJ2.add(guerreroJ2);

        samuraiJ2 = new JLabel("Samurai");
        samuraiJ2.setBounds(650,58,82,30);
        samuraiJ2.setFont(new Font(null,Font.PLAIN,20));
        seleccionClaseJ2.add(samuraiJ2);

        mostrarNombreJ1 = new JLabel();
        mostrarNombreJ1.setBounds(200,30,500,30);
        mostrarNombreJ1.setFont(new Font(null,Font.PLAIN,32));
        panelNombreJ1.add(mostrarNombreJ1);

        mostrarNombreJ2 = new JLabel();
        mostrarNombreJ2.setBounds(200,30,500,30);
        mostrarNombreJ2.setFont(new Font(null,Font.PLAIN,32));
        panelNombreJ2.add(mostrarNombreJ2);

    }

    private void crearTextArea(){

        comentariosSeleccion = new JTextArea();
        comentariosSeleccion.setBounds(0,0,1700,150);
        comentariosSeleccion.setOpaque(false);
        comentariosSeleccion.setFont(new Font(null,Font.PLAIN,24));
        panelComentariosSeleccion.add(comentariosSeleccion);

    }

    private void iniciarComponentes() throws IOException {

        crearPaneles();
        crearBotones();
        accionesBotones();
        crearVidasJugadores(jugador1,jugador2);
        crearEtiquetas();
        crearTextField();
        crearTextArea();

    }

}