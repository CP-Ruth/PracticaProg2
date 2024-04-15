package Clase_9_04_Relaciones.Agregacion;

public class Main {
    public static void main(String[] args) {
        //Creamos la compania
        Company DYS =new Company("Deseos Y Sueños");
        //Creamos a los empleados
        Employee e1 = new Employee("Programador","Thomas");
        Employee e2 = new Employee("Ingeniero","Uriel");
        Employee e3 = new Employee("Diseñadora UX/UI","Paula");
        Employee e4 = new Employee("Contador","Rodrigo");

        //Creamos los departamentos;
        Department d1 = new Department("Desarollo Web");
        Department d2 = new Department("Contaduria");
        Department d3 = new Department("Sistemas");

        //Afregamos a los empleados a sus respectivas areas
        d1.add(e1);
        d1.add(e3);
        d2.add(e4);
        d3.add(e2);

        //Agregamos los departamentos a la compania
        DYS.add(d1);
        DYS.add(d2);
        DYS.add(d3);
    }
}
