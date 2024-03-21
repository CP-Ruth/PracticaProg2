package Clase_14_03_herencia;

public class Bicicleta extends Vehiculo {
    private String tipo;

    //Constructor

    public Bicicleta(String color, int ruedas, String tipo) {
        super(color, ruedas);
        this.tipo = tipo;
    }

    //GETTER and SETTER

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Tipo: "+tipo);
    }
}
