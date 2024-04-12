package Ejercicio_Interfaces;

public abstract class PersonajeBase implements Personaje {
    //Atributos comunes de los personajes
    private String name;
    private int level;
    private int live;

    /*private int defense;
    private int attack;*/

        //Constructor
    public PersonajeBase(String nombre, int nivel, int vida) {
        this.name = nombre;
        this.level = nivel;
        this.live = vida;
    }

        //Getter and Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public int getLive() {
        return live;
    }
    public void setLive(int live) {
        this.live = live;
    }

        //Metodos

    @Override
    public abstract int attackAttack();

    @Override
    public void defendDefend(int daño) {
        live = live - daño;
        if( live <= 0){
            System.out.println(name+" se quedó sin vida");
        } else {
            System.out.println(name+" te quedan "+live+" puntos de vida.");
        }
    }
}
