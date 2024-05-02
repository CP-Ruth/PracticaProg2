package Parcial1;

import java.util.ArrayList;

public class Headquarters {
    private int phase;
    private String date;
    private String time;
    private ArrayList<Test> toDo;
    private ArrayList<Facilities> where;

    //Constructor
    public Headquarters(int phase, String date, String time) {
        this.phase = phase;
        this.date = date;
        this.time = time;
        this.toDo = new ArrayList<>();
        this.where = new ArrayList<>();
    }

    //Getter and Setter
    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ArrayList<Test> getToDo() {
        return toDo;
    }

    public void setToDo(ArrayList<Test> toDo) {
        this.toDo = toDo;
    }

    public ArrayList<Facilities> getWhere() {
        return where;
    }

    public void setWhere(ArrayList<Facilities> where) {
        this.where = where;
    }


}
