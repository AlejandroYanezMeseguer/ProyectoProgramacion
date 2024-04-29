package jugador;

import armas_java.ContenedorArmas;
import interfaces.IAcciones;

public abstract class Jugador {

    protected int fuerza;
    protected int destreza;
    protected int vigor;
    protected int aguante;
    protected int fe;
    protected int mente;
    protected String nombre;
    public Posicion[] armasSeleccionadas = {new Posicion(0,0),new Posicion(0,2)};
    public ContenedorArmas baul;


    public Jugador(int fuerza, int destreza, int vigor, int aguante, int fe, int mente, String nombre) {
        this.fuerza = fuerza;
        this.destreza = destreza;
        this.vigor = vigor;
        this.aguante = aguante;
        this.fe = fe;
        this.mente = mente;
        this.nombre = nombre;
    }


    public void cambiarArma(Posicion armaSeleccionada){

        armasSeleccionadas[0] = armaSeleccionada;

    }

    public void cambiarEscudo(Posicion armaSeleccionada){

        armasSeleccionadas[1] = armaSeleccionada;

    }

    public int atacar(int Valor){

        int ataque = 0;

        for (int i=0;i<2;i++){

            Posicion armaSeleccionada = armasSeleccionadas[i];

            IAcciones accion = baul.listaArmas[armaSeleccionada.x][armaSeleccionada.y];

            ataque+=accion.atacar(Valor);
        }

        return ataque;
    }

    public int defender(int Valor){

        int defensa = 0;

        for (int i=0;i<2;i++){

            Posicion armaSeleccionada = armasSeleccionadas[i];

            IAcciones accion = baul.listaArmas[armaSeleccionada.x][armaSeleccionada.y];

            defensa+=accion.defender(Valor);
        }

        return defensa;
    }

    public int recibirGolpe(int daño){

        int dañoFinal = daño- defender(1);

        vigor -=dañoFinal;

        return vigor;
    }
}
