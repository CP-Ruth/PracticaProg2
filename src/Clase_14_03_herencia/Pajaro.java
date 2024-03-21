package Clase_14_03_herencia;

public class Pajaro extends Animal{
    private String especie;
    private String plumaje;

    //Constructor

    public Pajaro(String nombre, int edad, String genero, String especie, String plumaje) {
        super(nombre, edad, genero);
        this.especie = especie;
        this.plumaje = plumaje;
    }

    //GETTER and SETTER
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPlumaje() {
        return plumaje;
    }
    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }

    //Metodo
    public void hacerSonido(){
        System.out.println("El pajaro canta");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Especie: "+especie);
        System.out.println("Plumaje: "+plumaje);
    }
}
