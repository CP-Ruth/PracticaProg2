package Clase_14_03_herencia;

public class Camioneta  extends Coche{
    private int carga;

    //Constructor
    public Camioneta(String color, int ruedas, int carga) {
        super(color, ruedas);
        this.carga = carga;
    }

    //GETTER and SETTER
    public int getCarga() {
        return carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }
}
