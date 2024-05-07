package entornoGrafico;

import jugador.Jugador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelCambiarEscudos{

    private JPanel panel;
    private Jugador jugador;
    final int VALOR_INICIAL_X_J1 = -360;
    final int VALOR_INICIAL_X_J2 = -400;
    final int INCREMENTO_EJE_X = 240;
    final int VALOR_INICIAL_Y_BOTONES = 80;
    final int VALOR_INICIAL_Y_ETIQUETAS = 58;
    final int INCREMENTO_EJE_Y = 165;
    final int LADO_BOTON = 95;
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
     * Metodo que añade al panel de cambiar de escudo los botones para seleccionar el escudo de cada clase en 3 columnas para el jugador 1
     * @param e
     */
    public void añadirEscudosJ1(ActionListener e){

        int incrementoColumna = 0;
        boolean cambioColumna = true;
        var escudos = jugador.baul.listaArmas;

        for(int i = 2;i < 3; i++){

            for(int j = 0;j < 9; j++){

                JButton boton = new JButton(escudos[i][j].getName());
                boton.setName(i +"|" +j);
                boton.addActionListener(e);
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
                int x = VALOR_INICIAL_X_J1 +(i+incrementoColumna)*INCREMENTO_EJE_X;
                boton.setBounds(x,y,LADO_BOTON,LADO_BOTON);
                panel.add(boton);
            }
        }
    }

    /**
     * Metodo que añade al panel de cambiar de escudo los botones para seleccionar el escudo de cada clase en 3 columnas para el jugador 2
     * @param e
     */
    public void añadirEscudosJ2(ActionListener e){

        int incrementoColumna = 0;
        boolean cambioColumna = true;
        var escudos = jugador.baul.listaArmas;

        for(int i = 2;i < 3; i++){

            for(int j = 0;j < 9; j++){

                JButton boton = new JButton(escudos[i][j].getName());
                boton.setName(i +"|" +j);
                boton.addActionListener(e);
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
                int x = VALOR_INICIAL_X_J2 +(i+incrementoColumna)*INCREMENTO_EJE_X;
                boton.setBounds(x,y,LADO_BOTON,LADO_BOTON);
                panel.add(boton);
            }
        }
    }

    /**
     * Metodo que añade al panel de cambiar de arma las etiquetas con el nombre del escudo de cada clase en 3 columnas para el jugadro 1
     */
    public void añadirNombresEscudosJ1(){

        int incrementoColumna = 0;
        boolean cambioColumna = true;
        var escudos = jugador.baul.listaArmas;

        for(int i = 2;i < 3; i++){

            for(int j = 0;j < 9; j++){

                JLabel nombreEscudo = new JLabel(escudos[i][j].getName());
                nombreEscudo.setName(i +"|" +j);
                int y = VALOR_INICIAL_Y_ETIQUETAS +j*INCREMENTO_EJE_Y;
                if (j==6){
                    cambioColumna=true;
                    etiquetasPorColumna = 6;
                }
                if (j>2){

                    if(cambioColumna){

                        incrementoColumna++;
                        cambioColumna=false;

                    }
                    y = VALOR_INICIAL_Y_ETIQUETAS +(j- etiquetasPorColumna)*INCREMENTO_EJE_Y;

                }
                int x = VALOR_INICIAL_X_J1 +(i+incrementoColumna)*INCREMENTO_EJE_X;
                nombreEscudo.setBounds(x,y,150,21);
                nombreEscudo.setFont(new Font(null,Font.PLAIN,19));
                panel.add(nombreEscudo);
            }
        }
    }

    /**
     * Metodo que añade al panel de cambiar de arma las etiquetas con el nombre del escudo de cada clase en 3 columnas para el jugador 2
     */
    public void añadirNombresEscudosJ2(){

        int incrementoColumna = 0;
        boolean cambioColumna = true;
        var escudos = jugador.baul.listaArmas;

        for(int i = 2;i < 3; i++){

            for(int j = 0;j < 9; j++){

                JLabel nombreEscudo = new JLabel(escudos[i][j].getName());
                nombreEscudo.setName(i +"|" +j);
                int y = VALOR_INICIAL_Y_ETIQUETAS +j*INCREMENTO_EJE_Y;
                if (j==6){
                    cambioColumna=true;
                    etiquetasPorColumna = 6;
                }
                if (j>2){

                    if(cambioColumna){

                        incrementoColumna++;
                        cambioColumna=false;

                    }
                    y = VALOR_INICIAL_Y_ETIQUETAS +(j- etiquetasPorColumna)*INCREMENTO_EJE_Y;

                }
                int x = VALOR_INICIAL_X_J2 +(i+incrementoColumna)*INCREMENTO_EJE_X;
                nombreEscudo.setBounds(x,y,150,21);
                nombreEscudo.setFont(new Font(null,Font.PLAIN,19));
                panel.add(nombreEscudo);
            }
        }
    }

}