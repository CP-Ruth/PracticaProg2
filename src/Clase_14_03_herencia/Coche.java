package Clase_14_03_herencia;

public class Coche extends Vehiculo {
    private int velocidad;
    private int cilindrada;

    //Constructor
    public Coche(String color, int ruedas, int velocidad, int cilindrada) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public Coche(String color, int ruedas) {
        super();
    }

    //GETTER and SETTER
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Velocidad: "+velocidad+" Cilindrada: "+cilindrada);
    }
}
