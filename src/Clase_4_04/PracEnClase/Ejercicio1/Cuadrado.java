package Clase_4_04.PracEnClase.Ejercicio1;

import Clase_4_04.PracEnClase.Ejercicio1.Figura;

public class Cuadrado implements Figura{
    private float lado;

        //Constructores
    public Cuadrado(float lado) {
        this.lado = lado;
    }

    //GETTER and SETTER
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float area() {
        return lado*lado;
    }
}
