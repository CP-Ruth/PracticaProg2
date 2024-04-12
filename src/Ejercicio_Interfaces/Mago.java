package Ejercicio_Interfaces;

public class Mago extends PersonajeBase{
    private int powerAM;
        //Constructoe

    public Mago(String nombre, int nivel, int vida, int powerAM) {
        super(nombre, nivel, vida);
        this.powerAM = powerAM;
    }

        //Getter and Setter
    public int getPowerAM() {
        return powerAM;
    }
    public void setPowerAM(int powerAM) {
        this.powerAM = powerAM;
    }

        //Method
    @Override
    public int attackAttack() {
        return powerAM*this.getLevel();
    }
}

