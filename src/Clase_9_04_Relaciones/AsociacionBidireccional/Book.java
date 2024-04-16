package Clase_9_04_Relaciones.AsociacionBidireccional;

import java.util.List;

public class Book {
    private String titulo;
    private List<Person> people;

    //Constructor
    public Book(){}

    public Book(String titulo, List<Person> people) {
        this.titulo = titulo;
        this.people = people;
    }

    //Getter and Setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }
}
