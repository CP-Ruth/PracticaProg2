package Clase_21_03;

public class FullTimeEmployee extends Employee{
    private float yearlyBonus;

    //Constructor

    public FullTimeEmployee(int id, String name, float salary, float yearlyBonus) {
        super(id, name, salary);
        this.yearlyBonus = yearlyBonus;
    }

    //Get ans Set

    public float getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(float yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    //Metodo
    @Override
    public float calculateSalary(){
        return super.calculateSalary()+yearlyBonus;
    }

}
