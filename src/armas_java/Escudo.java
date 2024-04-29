package armas_java;

import interfaces.IAcciones;

public class Escudo implements IAcciones {

    protected int defensa;
    protected int peso;

    public Escudo(int defensa, int peso) {
        this.defensa = defensa;
        this.peso = peso;
    }


    public int atacar(int ValorA) {
        return 0 ;
    }


    public int defender(int ValorD) {
        return ValorD+ defensa + peso;
    }
}
