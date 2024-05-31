package entornoGrafico.cambioDeEquipamiento;

import jugador.Jugador;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Clase que añade al panel de cambiar de escudo los botones para seleccionar el escudo de cada clase en 3 columnas
 */
public class PanelCambiarEscudos{

    private JPanel panel;
    private Jugador jugador;
    final int VALOR_INICIAL_X = -400;
    final int VALOR_INICIAL_X_FONDO = -420;
    final int INCREMENTO_EJE_X = 240;
    final int VALOR_INICIAL_Y_BOTONES = 80;
    final int VALOR_INICIAL_Y_ETIQUETAS = 55;
    final int VALOR_INICIAL_Y_FONDO = 65;
    final int INCREMENTO_EJE_Y = 165;
    final int LADO_BOTON = 95;
    final int LADO_BOTON_FONDO = 130;
    private int BotonesPorColumna = 3;
    private int etiquetasPorColumna = 3;

    /**
     * Constructior de la clase PanelCambiarEscudos
     * @param panel
     * @param jugador
     */
    public PanelCambiarEscudos(JPanel panel, Jugador jugador) {
        this.panel = panel;
        this.jugador = jugador;
    }

    /**
     * Metodo que añade al panel de cambiar de escudo los botones para seleccionar el escudo de cada clase en 3 columnas
     * @param e
     */
    public void añadirEscudos(ActionListener e){

        int incrementoColumna = 0;
        boolean cambioColumna = true;
        var escudos = jugador.baul.listaArmas;

        for(int i = 2;i < 3; i++){

            for(int j = 0;j < 9; j++){

                BufferedImage imagenEscudo = null;
                try {
                    imagenEscudo = ImageIO.read(new File(escudos[i][j].getImage()));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                JButton boton = new JButton(escudos[i][j].getNombre());
                boton.setIcon(new ImageIcon(imagenEscudo.getScaledInstance(LADO_BOTON,LADO_BOTON, Image.SCALE_SMOOTH)));
                boton.setOpaque(false);
                boton.setName(i +"|" +j);
                boton.addActionListener(e);
                boton.setBorder(null);
                boton.setContentAreaFilled(false);
                boton.setBorder(null);
                int y = VALOR_INICIAL_Y_BOTONES +j*INCREMENTO_EJE_Y;
                if (j==6){
                    cambioColumna=true;
                    BotonesPorColumna = 6;
                }
                if (j>2){

                    if(cambioColumna){

                        incrementoColumna++;
                        cambioColumna=false;

                    }
                    y = VALOR_INICIAL_Y_BOTONES +(j- BotonesPorColumna)*INCREMENTO_EJE_Y;

                }
                int x = VALOR_INICIAL_X +(i+incrementoColumna)*INCREMENTO_EJE_X;
                boton.setBounds(x,y,LADO_BOTON,LADO_BOTON);
                panel.add(boton);
            }
        }
    }

    /**
     * Metodo que añade al panel de cambiar de arma las etiquetas con el nombre del escudo de cada clase en 3 columnas
     */
    public void añadirNombresEscudos(){

        int incrementoColumna = 0;
        boolean cambioColumna = true;
        var escudos = jugador.baul.listaArmas;

        for(int i = 2;i < 3; i++){

            for(int j = 0;j < 9; j++){

                JLabel nombreEscudo = new JLabel(escudos[i][j].getNombre());
                nombreEscudo.setName(i +"|" +j);
                int y = VALOR_INICIAL_Y_ETIQUETAS-15 +j*INCREMENTO_EJE_Y;
                if (j==6){
                    cambioColumna=true;
                    etiquetasPorColumna = 6;
                }
                if (j>2){

                    if(cambioColumna){

                        incrementoColumna++;
                        cambioColumna=false;

                    }
                    y = VALOR_INICIAL_Y_ETIQUETAS-5 +(j- etiquetasPorColumna)*INCREMENTO_EJE_Y;

                }
                int x = VALOR_INICIAL_X-20 +(i+incrementoColumna)*INCREMENTO_EJE_X;
                nombreEscudo.setBounds(x,y,250,21);
                nombreEscudo.setForeground(new Color(255,211,97,200));
                nombreEscudo.setFont(new Font(null,Font.PLAIN,20));
                panel.add(nombreEscudo);
            }
        }
    }

    public void fondoEscudo(){

        int incrementoColumna = 0;
        boolean cambioColumna = true;
        var escudos = jugador.baul.listaArmas;

        for(int i = 2;i < 3; i++){

            for(int j = 0;j < 9; j++){
                BufferedImage fondo = null;
                try {
                    fondo = ImageIO.read(new File("src/imagenes/equipo.png"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                JButton boton = new JButton();
                boton.setOpaque(false);
                boton.setBorder(null);
                boton.setContentAreaFilled(false);
                boton.setBorder(null);
                int y = VALOR_INICIAL_Y_FONDO +j*INCREMENTO_EJE_Y;
                if (j==6){
                    cambioColumna=true;
                    BotonesPorColumna = 6;
                }
                if (j>2){

                    if(cambioColumna){

                        incrementoColumna++;
                        cambioColumna=false;

                    }
                    if (j==3)BotonesPorColumna=3;
                    y = VALOR_INICIAL_Y_FONDO +(j- BotonesPorColumna)*INCREMENTO_EJE_Y;

                }
                int x = VALOR_INICIAL_X_FONDO +(i+incrementoColumna)*INCREMENTO_EJE_X;
                boton.setBounds(x,y,LADO_BOTON_FONDO,LADO_BOTON_FONDO);
                boton.setIcon(new ImageIcon(fondo.getScaledInstance(LADO_BOTON_FONDO,LADO_BOTON_FONDO, Image.SCALE_SMOOTH)));
                panel.add(boton);
            }
        }
    }
}