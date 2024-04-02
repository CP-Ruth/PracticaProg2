package Clase_21_03_Animales;

public abstract class Felino extends Animal {
    //Constructor
    public Felino(String photo, String food, String localization, String zise) {
        super(photo, food, localization, zise);
    }

    //Metodos


    @Override
    public void rigir() {
        System.out.println("Grr...");
    }
}
