package armas_java;

import interfaces.IAcciones;
/**
 * Clase que crea las escudo con sus variables extendidas de la superclase Armas y metodos implementados de la interfaz IAcciones
 */
public class Escudos implements IAcciones {

    protected int defensa;
    protected int peso;
    protected String nombre;

    /**
     * Constructor con parametros de escudo
     * @param defensa
     * @param peso
     */
    public Escudos(int defensa, int peso, String nombre) {
        this.defensa = defensa;
        this.peso = peso;
        this.nombre = nombre;
    }

    /**
     * Metodo implementado de la interfaz IAcciones que crea el ataque de las escudo
     * @param ValorA
     * @return 0 porque las armas no tienen defensa
     */
    public int atacar(int ValorA) {
        return 0 ;
    }

    /**
     * Metodo implementado de la interfaz IAcciones que crea la defensa de las escudo
     * @param ValorD
     * @return ValorD + la defensa y el peso del escudo que indica el la defensa del mismo
     */
    public int defender(int ValorD) {
        return ValorD+ defensa + peso;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

}
