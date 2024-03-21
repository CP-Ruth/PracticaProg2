package Clase_14_03_herencia;

public class Animal {
    private String nombre;
    private int edad;
    private String genero;

  //Constructores
    public Animal(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    //GETTER and SETTER

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Metodos
    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico.");
    }

    public void info(){
        System.out.println("Nombre: "+nombre );
        System.out.println("Edad: "+edad );
        System.out.println("Genero: "+genero );

    }
}

