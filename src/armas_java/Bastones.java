package armas_java;

import interfaces.IAcciones;

public class Bastones extends Armas implements IAcciones {

    public Bastones(int daño, int durabilidad, String escalabilidad, String velocidadAtaque,String nombre) {
        super(daño, durabilidad, escalabilidad, velocidadAtaque,nombre);
    }

    public int atacar(int ValorA) {
        return calcularAtaque(ValorA);
    }


    public int defender(int ValorD) {
        return 0;
    }
}
