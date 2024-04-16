package Clase_9_04_Relaciones.AsociacionBidireccional;

import java.util.List;

public class Person {
    private String name;
    private List<Book> books;

    //Constructor
    public Person(){}

    public Person(String name) {
        this.name = name;
        this.books = books;
    }

    //Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
