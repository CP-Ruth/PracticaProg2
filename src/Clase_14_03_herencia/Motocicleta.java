package Clase_14_03_herencia;

public class Motocicleta  extends Bicicleta{
    private int velocidad;
    private int cilindrada;

    //Constructor
    public Motocicleta(String color, int ruedas, String tipo) {
        super(color, ruedas, tipo);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
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
