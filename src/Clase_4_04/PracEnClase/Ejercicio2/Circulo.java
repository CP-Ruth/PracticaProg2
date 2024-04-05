package Clase_4_04.PracEnClase.Ejercicio2;

public class Circulo implements Figura,Dibujable{
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

    @Override
    public void  dibujar() {
        System.out.println("Dibujó el circulo");
    }
}


