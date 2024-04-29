package armas_java;
public abstract class Armas {

    protected int daño;
    protected int durabilidad;
    protected String escalabilidad;
    protected String velocidadAtaque;
    protected String nombre;

    public Armas(int daño, int durabilidad, String escalabilidad, String velocidadAtaque,String nombre) {
        this.daño = daño;
        this.durabilidad = durabilidad;
        this.escalabilidad = escalabilidad;
        this.velocidadAtaque = velocidadAtaque;
        this.nombre = nombre;
    }

    protected int calcularAtaque(int ValorA) {


        switch (escalabilidad){
            case "a": ValorA+= (int) (ValorA+ daño + durabilidad *1.30); break;
            case "b": ValorA+= (int) (ValorA+ daño + durabilidad *1.25); break;
            case "c": ValorA+= (int) (ValorA+ daño + durabilidad *1.20); break;
            case "d": ValorA+= (int) (ValorA+ daño + durabilidad *1.15); break;
            case "e": ValorA+= (int) (ValorA+ daño + durabilidad *1.10); break;
        }
        switch (velocidadAtaque){
            case "muy_lento": ValorA+= (int) (ValorA*1.05); break;
            case "lento": ValorA+= (int) (ValorA*1.10); break;
            case "normal": ValorA+= (int) (ValorA*1.15); break;
            case "Rapido": ValorA+= (int) (ValorA*1.25); break;
            case "muy_rapido": ValorA+= (int) (ValorA*1.30); break;
        }
        return ValorA;
    }
}
