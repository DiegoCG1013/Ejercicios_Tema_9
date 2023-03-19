package Ejercicio_2;

public class Idioma2 implements Interfaz {

    @Override
    public void introducirDistancia() {
        System.out.println("(Idioma 2) Introduce la distancia en metros: ");
    }

    @Override
    public void introducirTiempo() {
        System.out.println("(Idioma 2) Introduce el tiempo en segundos: ");
    }

    @Override
    public void respuesta() {
        System.out.println("(Idioma 2) La velocidad es: ");
    }
}
