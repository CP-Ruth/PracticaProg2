package TP2;

public class Novela extends Libro{
    private String genero;

        //Constructor
    public Novela(String genero) {
        this.genero = genero;
    }
    public Novela(String titulo, String autor, int añoDePublicacion, boolean prestado, String genero) {
        super(titulo, autor, añoDePublicacion, prestado);
        this.genero = genero;
    }


}
