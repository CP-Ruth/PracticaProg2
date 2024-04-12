package Ejercicio_Interfaces;

public class Main {
    public static void main(String[] args) {

        //Crearlos personajes del juego
        Guerrero g1 =new Guerrero("Lancelot",10,1000,30);
        Mago m1 = new Mago("Merlín",15,900,25);
        Picaro p1 = new Picaro("Erin",13, 800,28);

        //Peleas parte 1
        int daño = g1.attackAttack();
        m1.defendDefend(daño);

        daño = m1.attackAttack();
        p1.defendDefend(daño);

        daño = p1.attackAttack();
        g1.defendDefend(daño);

        //Peleas parte 2
        daño = g1.attackAttack();
        p1.defendDefend(daño);

        daño = p1.attackAttack();
        m1.defendDefend(daño);

        daño = m1.attackAttack();
        g1.defendDefend(daño);

        //Pelea parte 3
        daño = p1.attackAttack();
        m1.defendDefend(daño);
        g1.defendDefend(daño);
    }
}
