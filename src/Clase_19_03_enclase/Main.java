package Clase_19_03_enclase;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> employees = new ArrayList<>();
        Tecnico employee1 = new Tecnico("Juan");
        Oficial employee2 = new Oficial("Santiago");
        Directivo employee3 = new Directivo("Maria");
        Operario employee4 = new Operario("Emanuel");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        for (Empleado i :employees){
            System.out.println("El empleaso/a "+i.getNombre()+" es "+i.toString());
        }


    }
}
