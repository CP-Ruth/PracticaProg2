package Parcial1;

import java.util.ArrayList;

public class Test {
    private int code;
    private String title;
    private ArrayList<Athlete> athletesTest;
    private Headquarters sedeTest;

    //Constructor
    public Test(int code, String title) {
        this.code = code;
        this.title = title;
        this.athletesTest = new ArrayList<>();
    }

    //Getter and Setter
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Athlete> getAthletesTest() {
        return athletesTest;
    }

    public void setAthletesTest(ArrayList<Athlete> athletesTest) {
        this.athletesTest = athletesTest;
    }

    //Methods
    public void add(Athlete athl){
        athletesTest.add(athl);
    }

}
