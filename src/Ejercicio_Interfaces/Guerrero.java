package Ejercicio_Interfaces;

public class Guerrero extends PersonajeBase{
    private int powerAG;

        //Constructor
    public Guerrero(String name, int level, int live, int powerG) {
        super(name, level, live);
        this.powerAG = powerG;
    }

        //Get and Set
    public int getPowerG() {
        return powerAG;
    }
    public void setPowerG(int powerG) {
        this.powerAG = powerG;
    }

        //Method


    @Override
    public int attackAttack() {
        return powerAG*this.getLevel();
    }

}
