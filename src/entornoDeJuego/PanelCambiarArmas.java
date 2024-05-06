package entornoDeJuego;

import jugador.Jugador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelCambiarArmas {

    private JPanel panel;
    private Jugador jugador;
    final int VALOR_INICIAL_X = 80;
    final int INCREMENTO_EJE_X = 200;
    final int VALOR_INICIAL_Y_BOTONES = 44;
    final int VALOR_INICIAL_Y_ETIQUETAS = 22;
    final int INCREMENTO_EJE_Y = 132;
    final int LADO_BOTON = 86;

    /**
     * Constructior de la clase PanelArmas
     * @param panel
     * @param jugador
     */
    public PanelCambiarArmas(JPanel panel, Jugador jugador) {
        this.panel = panel;
        this.jugador = jugador;
    }

    /**
     * Metodo que añade al panel de cambiar de arma los botones para seleccionar el arma de cada clase en 4 columnas
     * @param e
     */
    public void añadirArmas(ActionListener e){

        int incrementoColumna = 0;
        boolean cambioColumna;
        var armas = jugador.baul.listaArmas;

        for(int i = 0;i < 2; i++){

            cambioColumna = true;

            for(int j = 0;j < 8; j++){

                JButton boton = new JButton(armas[i][j].getName());
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
                int x = VALOR_INICIAL_X+(i+incrementoColumna)*INCREMENTO_EJE_X;
                boton.setBounds(x,y,LADO_BOTON,LADO_BOTON);
                panel.add(boton);
            }

            JButton aceptarArmaSeleccionada = new JButton("Utilizar arma seleccionada");
            aceptarArmaSeleccionada.setBounds(262,575,315,38);
            aceptarArmaSeleccionada.setFont(new Font(null,Font.PLAIN,24));
            panel.add(aceptarArmaSeleccionada);
        }
    }

    /**
     * Metodo que añade al panel de cambiar de arma las etiquetas con el noimbre del arma de cada clase en 4 columnas
     */
    public void añadirNombresArmas(){

        int incrementoColumna = 0;
        boolean cambioColumna;
        var armas = jugador.baul.listaArmas;

        for(int i = 0;i < 2; i++){

            cambioColumna = true;

            for(int j = 0;j < 8; j++){

                JLabel nombreArma = new JLabel(armas[i][j].getName());
                nombreArma.setName(i +"|" +j);
                int y = VALOR_INICIAL_Y_ETIQUETAS +j*INCREMENTO_EJE_Y;
                if (j>3){

                    if(cambioColumna){

                        incrementoColumna++;
                        cambioColumna=false;

                    }
                    y = VALOR_INICIAL_Y_ETIQUETAS +(j-4)*INCREMENTO_EJE_Y;

                }
                int x = VALOR_INICIAL_X+(i+incrementoColumna)*INCREMENTO_EJE_X;
                nombreArma.setBounds(x,y,150,21);
                nombreArma.setFont(new Font(null,Font.PLAIN,19));
                panel.add(nombreArma);
            }
        }
    }

}
