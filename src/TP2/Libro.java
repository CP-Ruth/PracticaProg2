package TP2;

public class Libro implements Prestable {
    private String titulo;
    private String autor;
    private int añoDePublicacion;
    private boolean prestado;

    //Cinstructor
    public Libro() {
    }

    public Libro(String titulo, String autor, int añoDePublicacion, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoDePublicacion = añoDePublicacion;
        this.prestado = prestado;
    }

    //GETTER ans SETTER
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoDePublicacion() {
        return añoDePublicacion;
    }

    public void setAñoDePublicacion(int añoDePublicacion) {
        this.añoDePublicacion = añoDePublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

        //Method
    @Override
    public boolean prestar() {
        return false;
    }

    @Override
    public boolean devolver() {
        return false;
    }
}
