package Clase_21_03;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee e1 = new FullTimeEmployee(1,"Roberto",1500,700);
        System.out.println("El salario del empleado "+e1.getId()+" es "+e1.calculateSalary());

        ParTimeEmployee e2 = new ParTimeEmployee(2,"Juliana",2000, 25,500);
        System.out.println("El salario del empleado "+e2.getId()+" es "+e2.calculateSalary());
    }
}
