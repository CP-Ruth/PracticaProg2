package Clase_4_04.PracEnClase.Ejercicio1;

import Clase_4_04.PracEnClase.Ejercicio1.Figura;

public class Circulo implements Figura {
    private float radio;

    //Constructor
    public Circulo(float radio) {
        this.radio = radio;
    }

    //GETTER and SETTER
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

        //metodos
    @Override
    public float area() {
        return (float) (radio*radio*3.14);
    }
}


