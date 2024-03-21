package Clase_14_03_herencia;

public class Camioneta  extends Coche{
    private int carga;

    //Constructor

    public Camioneta(String color, int ruedas, int velocidad, int cilindrada, int carga) {
        super(color, ruedas, velocidad, cilindrada);
        this.carga = carga;
    }

    //GETTER and SETTER
    public int getCarga() {
        return carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }

    //Metodos


    @Override
    public void info() {
        super.info();
        System.out.println("Carga: "+carga);
    }
}
