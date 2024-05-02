package Parcial1;

import java.lang.Math;

public class Athlete extends Person implements Agreement{
    private double height;
    private double weigh;
    private int age;

    //Constructor
    public Athlete(int dni, String name, double height, double weigh, int age) {
        super(dni, name);
        this.height = height;
        this.weigh = weigh;
        this.age = age;
    }

    //Getter and Setter
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeigh() {
        return weigh;
    }
    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //Method
    @Override
    public double calculaIMC() {
        double imc = weigh/Math.pow(height, 2);
        return imc;
    }

    @Override
    public boolean hayPesoExtra(double imc) {
        return imc>25;
    }

    @Override
    public double tomarPulsaciones() {
        return 0;
    }
}
