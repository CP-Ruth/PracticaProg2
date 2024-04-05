package TP1.Ejercicio8;

public class Main {
    public static void main(String[] args) {

        Worker w1 = new Worker("Anastasio",20,20,true,"Living room");

        AssistantManager a1 = new AssistantManager("Abel",19,25000,true);

        w1.workInArea();
        a1.departmentWork();
    }
}
