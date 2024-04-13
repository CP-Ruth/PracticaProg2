package TP2;

public class Universitario extends Libro {
    private String carrera;
        //Constructor

    public Universitario() {
    }

    public Universitario(String carrera) {
        this.carrera = carrera;
    }

    public Universitario(String titulo, String autor, int añoDePublicacion, boolean prestado, String carrera) {
        super(titulo, autor, añoDePublicacion, prestado);
        this.carrera = carrera;
    }
}
