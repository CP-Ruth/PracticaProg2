package Clase_9_04_Relaciones.Agregacion;

import java.util.ArrayList;

public class Department {
    private ArrayList<Employee> employees;
    private String nameDepartment;

        //Constructor
    public Department(String nameDepartment) {
        this.nameDepartment = nameDepartment;
        this.employees = new ArrayList<>();
    }

        //Getter and Setter

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public void add(Employee Empleado) {
        employees.add(Empleado);
    }
}
