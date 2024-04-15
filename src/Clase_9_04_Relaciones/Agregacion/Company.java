package Clase_9_04_Relaciones.Agregacion;

import java.util.ArrayList;

public class Company {
    private String nameCompany;
    private ArrayList<Department> departments;

        //Constructor
    public Company(String nameCompany) {
        this.nameCompany = nameCompany;
        this.departments = departments;
    }

            //Getter and Setter
    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

    public void add(Department departamento) {
        departments.add(departamento);
    }
}
