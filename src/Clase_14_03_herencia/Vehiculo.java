package Clase_14_03_herencia;

public class Vehiculo {
    private String color;
    private int ruedas;

    //Constructor
    public Vehiculo(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
    }
    public Vehiculo() {

    }

    //GETTER and SETTER
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getRuedas() {
        return ruedas;
    }
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

}
