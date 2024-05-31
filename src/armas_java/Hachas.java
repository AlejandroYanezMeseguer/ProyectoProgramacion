package armas_java;

import interfaces.IAcciones;
/**
 * Clase que crea las hachas con sus variables extendidas de la superclase Armas y metodos implementados de la interfaz IAcciones
 */
public class Hachas extends Armas implements IAcciones {

    /**
     * Constructor con parametros de hachas
     *
     * @param daño
     * @param durabilidad
     * @param escalabilidad
     * @param velocidadAtaque
     * @param nombre
     * @param image
     */
    public Hachas(int daño, int durabilidad, String escalabilidad, String velocidadAtaque, String nombre, String image) {
        super(daño, durabilidad, escalabilidad, velocidadAtaque,nombre,image);
    }

    /**
     * Metodo implementado de la interfaz IAcciones que crea el ataque de las hachas
     * @param ValorA
     * @return calcularAtaque que es un metodo que calcula el daño del ataque del arma en base a sus propiedades
     */
    public int atacar(int ValorA) {
         return calcularAtaque(ValorA);
    }

    /**
     * Metodo implementado de la interfaz IAcciones que crea la defensa de las hachas
     * @param ValorD
     * @return 0 porque las armas no tienen defensa
     */
    public int defender(int ValorD) {
        return 0;
    }
}
