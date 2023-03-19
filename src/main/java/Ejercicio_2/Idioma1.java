package Ejercicio_2;

public class Idioma1 implements Interfaz {

    @Override
    public void introducirDistancia() {
        System.out.println("(Idioma 1) Introduce la distancia en metros: ");
    }

    @Override
    public void introducirTiempo() {
        System.out.println("(Idioma 1) Introduce el tiempo en segundos: ");
    }

    @Override
    public void respuesta() {
        System.out.println("(Idioma 1) La velocidad es: ");
    }
}
