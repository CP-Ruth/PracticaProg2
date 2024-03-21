package Clase_14_03_herencia;

public class Perro extends Animal {
    private String raza;
    private String pelaje;

    //Constructor


    public Perro(String nombre, int edad, String genero, String raza, String pelaje) {
        super(nombre, edad, genero);
        this.raza = raza;
        this.pelaje = pelaje;
    }

    //GETTER and SETTER
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPelaje() {
        return pelaje;
    }
    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    //Metodo
    public void hacerSonido(){
        System.out.println("El perro ladra");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Raza: "+raza);
        System.out.println("Pelaje: "+pelaje);
    }
}
