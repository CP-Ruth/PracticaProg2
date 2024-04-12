package Ejercicio_Interfaces;

public class Picaro extends PersonajeBase{
    private int powerAP;

        //Constructor
    public Picaro(String nombre, int nivel, int vida, int powerAP) {
        super(nombre, nivel, vida);
        this.powerAP = powerAP;
    }

        //Getter and Setter

    public int getPowerAP() {
        return powerAP;
    }

    public void setPowerAP(int powerAP) {
        this.powerAP = powerAP;
    }

        //Method
    @Override
    public int attackAttack() {
        return powerAP*this.getLevel();
    }
}
