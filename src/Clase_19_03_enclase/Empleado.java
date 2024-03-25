package Clase_19_03_enclase;

public class Empleado {
    private String nombre;

    //constructor
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //METODO
    @Override
    public String toString() {
        return "Person{name='" + nombre +"}";
    }
}
