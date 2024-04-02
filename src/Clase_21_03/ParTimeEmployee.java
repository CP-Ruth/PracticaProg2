package Clase_21_03;

public class ParTimeEmployee extends Employee{

    private int hoursWorked;
    private float hoursRate;

    //Constructor

    public ParTimeEmployee(int id, String name, float salary, int hoursWorked, float hoursRate) {
        super(id, name, salary);
        this.hoursWorked = hoursWorked;
        this.hoursRate = hoursRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getHoursRate() {
        return hoursRate;
    }

    public void setHoursRate(float hoursRate) {
        this.hoursRate = hoursRate;
    }

    //Metodo

    @Override
    public float calculateSalary() {
        return super.calculateSalary()+(hoursWorked*hoursRate);
    }
}


