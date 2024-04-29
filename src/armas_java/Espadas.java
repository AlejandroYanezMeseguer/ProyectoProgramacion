package armas_java;

import interfaces.IAcciones;

public class Espadas extends Armas implements IAcciones {


    public Espadas(int daño, int durabilidad, String escalabilidad, String velocidadAtaque,String nombre) {
        super(daño, durabilidad, escalabilidad, velocidadAtaque,nombre);
    }


    public int atacar(int ValorA) {
        return calcularAtaque(ValorA);
    }


    public int defender(int ValorD) {
        return 0;
    }

   // @Override
   // public String GetName() {
    //    return Name;
    //}


    @Override
    public String toString() {
        return "Espadas" +
                "Daño=" + daño +
                ", Durabilidad=" + durabilidad +
                ", Escalabilidad=\"" + escalabilidad + '\"' +
                ", VelocidadAtaque=\"" + velocidadAtaque + '\"';
    }
}

