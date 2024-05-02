package Parcial1;

public class Headquarters {
    private int phase;
    private String date;
    private String time;
    private Test toDo;
    private Facilities where;


    //Constructor


    public Headquarters(int phase, String date, String time, Test toDo, Facilities where) {
        this.phase = phase;
        this.date = date;
        this.time = time;
        this.toDo = toDo;
        this.where = where;
    }

    //Getter and Setter


    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public Facilities getWhere() {
        return where;
    }

    public void setWhere(Facilities where) {
        this.where = where;
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

    public Test getToDo() {
        return toDo;
    }

    public void setToDo(Test toDo) {
        this.toDo = toDo;
    }
}
