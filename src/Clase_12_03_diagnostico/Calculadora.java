package Clase_12_03_diagnostico;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {


        boolean cond;
        Scanner scanner = new Scanner(System.in);
         do {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1)Suma  2)Resta  3)Multiplicación  4)División");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            sumar(num1, num2);
        } else if (opcion == 2) {
            restar(num1, num2);
        } else if (opcion == 3) {
            multiplicar(num1, num2);
        } else if (opcion == 4) {
            dividir(num1, num2);
        } else {
            System.out.println("Opción inválida.");
        }

            System.out.println("Si desea realizar otra operacion oprima 0 (cero)");
            opcion= scanner.nextInt();
             cond= (opcion == 0);
         }while (cond);
    }

    //Operaciones :)
    public static void sumar(double num1, double num2) {
        double resultado = num1 + num2;
        System.out.println("La suma es: " + resultado);
    }

    public static void restar(double num1, double num2) {
        double resultado = num1 - num2;
        System.out.println("La resta es: " + resultado);
    }

    public static void multiplicar(double num1, double num2) {
        double resultado = num1 * num2;
        System.out.println("La multiplicación es: " + resultado);
    }

    public static void dividir(double num1, double num2) {
        if (num2 != 0) {
            double resultado = num1 / num2;
            System.out.println("La división es: " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}
