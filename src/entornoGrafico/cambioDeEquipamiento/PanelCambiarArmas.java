package entornoGrafico.cambioDeEquipamiento;

import jugador.Jugador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelCambiarArmas {

    private JPanel panel;
    private Jugador jugador;
    final int VALOR_INICIAL_X = 13;
    final int INCREMENTO_EJE_X = 200;
    final int VALOR_INICIAL_Y_BOTONES = 70;
    final int VALOR_INICIAL_Y_ETIQUETAS = 48;
    final int INCREMENTO_EJE_Y = 132;
    final int LADO_BOTON = 85;

    /**
     * Constructior de la clase PanelCambiarArmas
     * @param panel
     * @param jugador
     */
    public PanelCambiarArmas(JPanel panel, Jugador jugador) {
        this.panel = panel;
        this.jugador = jugador;
    }

    /**
     * Metodo que añade al panel de cambiar de arma los botones para seleccionar el arma de cada clase en 4 columnas para el jugador 1
     * @param e
     */
    public void añadirArmas(ActionListener e){

        int incrementoColumna = 0;
        boolean cambioColumna;
        var armas = jugador.baul.listaArmas;

        for(int i = 0;i < 2; i++){

            cambioColumna = true;

            for(int j = 0;j < 8; j++){

                JButton boton = new JButton(armas[i][j].getNombre());
                boton.setName(i +"|" +j);
                boton.addActionListener(e);
                int y = VALOR_INICIAL_Y_BOTONES +j*INCREMENTO_EJE_Y;
                if (j>3){

                    if(cambioColumna){

                        incrementoColumna++;
                        cambioColumna=false;

                    }
                    y = VALOR_INICIAL_Y_BOTONES +(j-4)*INCREMENTO_EJE_Y;

                }
                int x = VALOR_INICIAL_X +(i+incrementoColumna)*INCREMENTO_EJE_X;
                boton.setBounds(x,y,LADO_BOTON,LADO_BOTON);
                panel.add(boton);
            }
        }
    }

    /**
     * Metodo que añade al panel de cambiar de arma las etiquetas con el nombre del arma de cada clase en 4 columnas para el jugador 1
     */
    public void añadirNombresArmas(){

        int incrementoColumna = 0;
        boolean cambioColumna;
        var armas = jugador.baul.listaArmas;

        for(int i = 0;i < 2; i++){

            cambioColumna = true;

            for(int j = 0;j < 8; j++){

                JLabel nombreArma = new JLabel(armas[i][j].getNombre());
                nombreArma.setName(i +"|" +j);
                int y = VALOR_INICIAL_Y_ETIQUETAS +j*INCREMENTO_EJE_Y;
                if (j>3){

                    if(cambioColumna){

                        incrementoColumna++;
                        cambioColumna=false;

                    }
                    y = VALOR_INICIAL_Y_ETIQUETAS +(j-4)*INCREMENTO_EJE_Y;

                }
                int x = VALOR_INICIAL_X +(i+incrementoColumna)*INCREMENTO_EJE_X;
                nombreArma.setBounds(x,y,250,21);
                nombreArma.setFont(new Font(null,Font.PLAIN,16));
                nombreArma.setForeground(new Color(255,211,97,230));
                panel.add(nombreArma);
            }
        }
    }
}
