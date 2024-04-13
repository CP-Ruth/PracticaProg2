package TP2;

public class Infantil extends Libro{
    private int edadRecomendada;
        //Constructor
    public Infantil(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }

    public Infantil(String titulo, String autor, int añoDePublicacion, boolean prestado, int edadRecomendada) {
        super(titulo, autor, añoDePublicacion, prestado);
        this.edadRecomendada = edadRecomendada;
    }
}
