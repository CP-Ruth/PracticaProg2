package Clase_9_04_Relaciones.Agregacion;

public class Employee {
    private String position;
    private String name;

            //Constructor
    public Employee(String position, String name) {
        this.position = position;
        this.name = name;
    }

            //Getter ans Setter

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
