package Clase_4_04.PracEnClase.Ejercicio2;

public class Cuadrado implements Figura,Dibujable,Rotable{
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

    @Override
    public void dibujar() {
        System.out.println("Dibujó el Cuadrado");
    }

    @Override
    public void rotar() {
        System.out.println("El cuadrado esta rotando");
    }
}
