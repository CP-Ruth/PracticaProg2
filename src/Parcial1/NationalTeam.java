package Parcial1;

import java.util.ArrayList;

public class NationalTeam {
    private String color;
    private String country;
    private ArrayList<Athlete> athletes;

    //Constructor
    public NationalTeam(String color, String country) {
        this.color = color;
        this.country = country;
        this.athletes = new ArrayList<>();
    }

    //Getter and Setter
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<Athlete> getAthletes() {
        return athletes;
    }
    public void setAthletes(ArrayList<Athlete> athletes) {
        this.athletes = athletes;
    }

    //Method
    //Metodo para añadir atletas al equipo.
    public void add(Athlete athl){
        athletes.add(athl);
    }

    public void show(){
        System.out.println("Los integrantes del equipo Nacional "+country);

        for(Athlete athe : athletes){
            System.out.println(athe.getName()+"  ->Altura: "+athe.getHeight()+"m  ->Peso:"+athe.getWeigh()+"kg  ->Peso extra:"+athe.hayPesoExtra(athe.calculaIMC()));
        }
    }
}
