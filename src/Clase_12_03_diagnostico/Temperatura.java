package Clase_12_03_diagnostico;
import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la conversión que desea realizar:");
        System.out.println("1)Celsius a Fahrenheit  2)Fahrenheit a Celsius");
        int opcion = scanner.nextInt();

        System.out.print("Ingrese la temperatura a convertir: ");
        double temperatura = scanner.nextDouble();

        if (opcion == 1) {
            double resultado = celsiusAFahrenheit(temperatura);
            System.out.println(temperatura + " grados Celsius equivalen a " + resultado + " grados Fahrenheit.");
        } else if (opcion == 2) {
            double resultado = fahrenheitACelsius(temperatura);
            System.out.println(temperatura + " grados Fahrenheit equivalen a " + resultado + " grados Celsius.");
        } else {
            System.out.println("Opción inválida.");
        }
    }

    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
