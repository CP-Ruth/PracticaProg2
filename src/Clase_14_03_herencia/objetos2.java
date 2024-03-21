package Clase_14_03_herencia;

import java.util.ArrayList;

public class objetos2 {
    public static void main(String[] args){
        ArrayList<Animal> animales= new ArrayList<>();
        Perro perro = new Perro("Toto",5, "Macho","Golden", "Dorado");
        Perro perro2 = new Perro("Pipi",2, "Hembra","Golden", "Dorado");
        Pajaro pajaro = new Pajaro("Lorito", 1,"Macho","Loro","Verde y naranja");
        animales.add(pajaro);
        animales.add(perro2);
        animales.add(perro);

        for(Animal animal: animales){
            System.out.println("clase: "+ animal.getClass().getSimpleName());
            animal.info();
            System.out.println();
        }
    }
}
