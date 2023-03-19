package Ejercicio_2;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        inicio();
    }

    public static void inicio(){
        try {
            System.out.println("Elige un idioma: \n1. Idioma 1 \n2. Idioma 2");
            int opcion = sc.nextInt();
            sc.nextLine();
            Interfaz idioma;
            switch (opcion) {
                case 1:
                    idioma = new Idioma1();
                    break;
                case 2:
                    idioma = new Idioma2();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + opcion);
            }
            idioma.introducirDistancia();
            int distancia = sc.nextInt();
            sc.nextLine();
            idioma.introducirTiempo();
            int tiempo = sc.nextInt();
            sc.nextLine();
            idioma.respuesta();
            System.out.println(distancia / tiempo);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
