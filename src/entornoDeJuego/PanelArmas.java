package entornoDeJuego;

import jugador.Jugador;

import javax.swing.*;
import java.awt.event.ActionListener;

public class PanelArmas {

    private JPanel panel;
    private Jugador jugador;
    final int VALOR_INICIAL_X = 230;
    final int INCREMENTO_EJE_X = 150;
    final int VALOR_INICIAL_Y = 10;
    final int INCREMENTO_EJE_Y = 89;
    final int LADO_BOTON = 75;

    /**
     * Constructior de la clase PanelArmas
     * @param panel
     * @param jugador
     */
    public PanelArmas(JPanel panel, Jugador jugador) {
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
                int y = VALOR_INICIAL_Y+j*INCREMENTO_EJE_Y;
                if (j>3){

                    if(cambioColumna){

                        incrementoColumna++;
                        cambioColumna=false;

                    }
                    y = VALOR_INICIAL_Y+(j-4)*INCREMENTO_EJE_Y;

                }
                int x = VALOR_INICIAL_X+(i+incrementoColumna)*INCREMENTO_EJE_X;
                boton.setBounds(x,y,LADO_BOTON,LADO_BOTON);
                panel.add(boton);
            }

        }

    }


}
