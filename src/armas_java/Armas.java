package armas_java;

/**
 * Clase abstracta con las propiedades de todas las armas y sus metodos
 */
public abstract class Armas {

    protected int daño;
    protected int durabilidad;
    protected String escalabilidad;
    protected String velocidadAtaque;
    protected String nombre;
    protected String image;

    /**
     * Constructor de la clase armas
     * @param daño
     * @param durabilidad
     * @param escalabilidad
     * @param velocidadAtaque
     * @param nombre
     */
    public Armas(int daño, int durabilidad, String escalabilidad, String velocidadAtaque,String nombre) {
        this.daño = daño;
        this.durabilidad = durabilidad;
        this.escalabilidad = escalabilidad;
        this.velocidadAtaque = velocidadAtaque;
        this.nombre = nombre;
    }

    /**
     * Metodo que calcula el ataque que hara un arma en base a sus propiedades
     * @param ValorA
     * @return ValorA que guarda el daño que hara el arma
     */
    protected int calcularAtaque(int ValorA) {

        //Switch que dependiendo la escalabilidad, daño y durabilidad calcula el daño que hara el arma asignandose a la variable ValorA
        switch (escalabilidad){
            case "a": ValorA+= (int) (ValorA+ daño + durabilidad *1.30); break;
            case "b": ValorA+= (int) (ValorA+ daño + durabilidad *1.25); break;
            case "c": ValorA+= (int) (ValorA+ daño + durabilidad *1.20); break;
            case "d": ValorA+= (int) (ValorA+ daño + durabilidad *1.15); break;
            case "e": ValorA+= (int) (ValorA+ daño + durabilidad *1.10); break;
        }

        //En base a la velocidad de ataque de un arma incrementa mas o menos la variable ValorA
        switch (velocidadAtaque){
            case "muy_lento": ValorA+= (int) (ValorA*1.05); break;
            case "lento": ValorA+= (int) (ValorA*1.10); break;
            case "normal": ValorA+= (int) (ValorA*1.15); break;
            case "Rapido": ValorA+= (int) (ValorA*1.25); break;
            case "muy_rapido": ValorA+= (int) (ValorA*1.30); break;
        }
        return ValorA;
    }


    public String getNombre() {
        return nombre;
    }

    public String getImage() {
        return image;
    }
}
