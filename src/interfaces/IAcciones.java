package interfaces;

/**
 * Interfaz con los metodos de defensa y ataque de las armas
 */
public interface IAcciones {

    /**
     * Metodo que crea el ataque de las armas
     * @param ValorA
     */
    int atacar(int ValorA);

    /**
     * Metodo que crea el ataque de las armas
     * @param ValorD
     */
    int defender(int ValorD);

    String getNombre();
}
