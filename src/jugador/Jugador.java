package jugador;

import armas_java.ContenedorArmas;
import interfaces.IAcciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase abstracta con las propiedades y metodos de las clases y jugadores
 */
public abstract class Jugador {

    protected int fuerza;
    protected int destreza;
    protected int vigor;
    protected int aguante;
    protected int fe;
    protected int mente;
    protected String nombre;
    public Posicion[] armasSeleccionadas = {new Posicion(0,0),new Posicion(2,0)};
    public ContenedorArmas baul;
    private ActionListener listener;

    /**
     * Contructos de la clase Jugador
     */
    public Jugador(int fuerza, int destreza, int vigor, int aguante, int fe, int mente, String nombre) {
        this.fuerza = fuerza;
        this.destreza = destreza;
        this.vigor = vigor;
        this.aguante = aguante;
        this.fe = fe;
        this.mente = mente;
        this.nombre = nombre;
    }

    /**
     * getter del vigor
     * @return vigor
     */
    public int getVigor() {
        return vigor;
    }

    /**
     * Metodo uqe crea la funcionalidad de cambiar de arma
     * @param armaSeleccionada
     */
    public void cambiarArma(Posicion armaSeleccionada, ActionEvent e){

        armasSeleccionadas[0] = armaSeleccionada;
        listener.actionPerformed(e);

    }

    /**
     * Metodo uqe crea la funcionalidad de cambiar de escudo
     * @param armaSeleccionada
     */
    public void cambiarEscudo(Posicion armaSeleccionada, ActionEvent e){

        armasSeleccionadas[1] = armaSeleccionada;
        listener.actionPerformed(e);

    }

    /**
     * metodo que crea la accion de atacar del jugador con el arma seleciconada en ese momento
     * @param Valor
     * @return ataque con el daño del ataque
     */
    public int atacar(int Valor){

        int ataque = 0;

        for (int i=0;i<2;i++){

            Posicion armaSeleccionada = armasSeleccionadas[i];

            IAcciones accion = baul.listaArmas[armaSeleccionada.x][armaSeleccionada.y];

            ataque+=accion.atacar(Valor);
        }

        return ataque;
    }

    /**
     * metodo que crea la accion de defenderse del jugador con el escudo seleciconado en ese momento
     * @param Valor
     * @return defensa con los puntos de ataque que bloquea
     */
    public int defender(int Valor){

        int defensa = 0;

        for (int i=0;i<2;i++){

            Posicion armaSeleccionada = armasSeleccionadas[i];

            IAcciones accion = baul.listaArmas[armaSeleccionada.x][armaSeleccionada.y];

            defensa+=accion.defender(Valor);
        }

        return defensa;
    }

    /**
     * metodo que calcula el daño que recibe un jugador despues de un golpe en base a los metodos atacar y defender
     * @param daño
     * @return vigor con el daño que recibe el jugador
     */
    public int recibirGolpe(int daño){

        int dañoFinal = daño- defender(1);

        vigor -=dañoFinal;

        return vigor;
    }

    /**
     * getter del tipo de guerrero
     * @return TipoGuerrero
     */
    public TipoGuerrero getTipoGuerrero(){
        return TipoGuerrero.valueOf(this.getClass().getSimpleName());
    }

    public void addActionListener(ActionListener listenerDesdeEscenario){
        listener = listenerDesdeEscenario;
    }

    public String getImageEscudo(){
        return baul.listaArmas[armasSeleccionadas[1].x][armasSeleccionadas[1].y].getImage();
    }
    public String getImageArma(){
        return baul.listaArmas[armasSeleccionadas[0].x][armasSeleccionadas[0].y].getImage();
    }
}
