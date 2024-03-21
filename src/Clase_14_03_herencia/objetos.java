package Clase_14_03_herencia;
import java.util.ArrayList;
public class objetos {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        Coche coche = new Coche("Rojo", 4, 15, 45);
        Motocicleta moto = new Motocicleta("Azul", 2, "Deportiva");
        Bicicleta bicicleta = new Bicicleta("Verde", 2, "Deportivo");
        Camioneta camioneta= new Camioneta("Morado",4, 10, 25,45);

        vehiculos.add(coche);
        vehiculos.add(moto);
        vehiculos.add(bicicleta);
        vehiculos.add(camioneta);

        catalogar(vehiculos);
        catalogar(vehiculos, 0);
        catalogar(vehiculos, 2);
        catalogar(vehiculos, 4);

    }
    public static void catalogar(ArrayList<Vehiculo> vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Clase: " + vehiculo.getClass().getSimpleName());
            vehiculo.info();
            System.out.println();
        }
    }

    public static void catalogar(ArrayList<Vehiculo> vehiculos,int ruedas){
        int count = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getRuedas() == ruedas){
                count++;

            }
        }
        if (count>0){
            System.out.println("Se han encontrado "+ count + " vehículos con "+ ruedas+" ruedas:");
        }else {
            System.out.println("No se encontraron vehículos con " + ruedas + " ruedas.");
        }
    }

}
