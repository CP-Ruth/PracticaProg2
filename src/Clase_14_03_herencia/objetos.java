package Clase_14_03_herencia;
import java.util.ArrayList;
public class objetos {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        Coche coche = new Coche("Rojo", 2, 15, 45);
        Motocicleta moto = new Motocicleta("Azul", 2, "Deportiva");
        Bicicleta bicicleta = new Bicicleta("Verde", 2, "");
        Camioneta camioneta= new Camioneta("Purpura",4,50);

        vehiculos.add(coche);
        vehiculos.add(moto);
        vehiculos.add(bicicleta);
        vehiculos.add(camioneta);

        catalogar(vehiculos);

    }
    public static void catalogar(ArrayList<Vehiculo> vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Clase: " + vehiculo.getClass().getSimpleName());
            vehiculo.info();
            System.out.println();
        }
    }


}
