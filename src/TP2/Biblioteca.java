package TP2;

import java.util.ArrayList;

public class Biblioteca {
        private String nombre;
        private ArrayList<Libro> libros = new ArrayList<>();

                //Constructor
        public Biblioteca(String nombre) {
                this.nombre = nombre;
        }

                //GETTER and SETTER
        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public ArrayList<Libro> getLibros() {
                return libros;
        }

        public void setLibros(ArrayList<Libro> libros) {
                this.libros = libros;
        }


}
