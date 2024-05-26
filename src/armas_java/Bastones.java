package armas_java;

import interfaces.IAcciones;
/**
 * Clase que crea las bastones con sus variables extendidas de la superclase Armas y metodos implementados de la interfaz IAcciones
 */
public class Bastones extends Armas implements IAcciones {

    /**
     * Constructor con parametros de bastones
     * @param daño
     * @param durabilidad
     * @param escalabilidad
     * @param velocidadAtaque
     * @param nombre
     */
    public Bastones(int daño, int durabilidad, String escalabilidad, String velocidadAtaque,String nombre) {
        super(daño, durabilidad, escalabilidad, velocidadAtaque,nombre);
    }

    /**
     * Metodo implementado de la interfaz IAcciones que crea el ataque de las bastones
     * @param ValorA
     * @return calcularAtaque que es un metodo que calcula el daño del ataque del arma en base a sus propiedades
     */
    public int atacar(int ValorA) {
        return calcularAtaque(ValorA);
    }

    /**
     * Metodo implementado de la interfaz IAcciones que crea la defensa de las bastones
     * @param ValorD
     * @return 0 porque las armas no tienen defensa
     */
    public int defender(int ValorD) {
        return 0;
    }

}
