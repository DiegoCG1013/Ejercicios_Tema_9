package Ejercicio_1;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Administrador {
    private static ArrayList<Bici> bicis;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        inicio();
    }

    public static void inicio(){
         do {
             try {
                 System.out.println("1. Crear bici \t 2. Alquilar \t 3. Listar \t 4. Salir");
                 int opcion = sc.nextInt();
                 sc.nextLine();
                 switch (opcion) {
                     case 1:
                            System.out.println("1. Bicicleta \t 2. Giroscopio \t 3. Segway");
                            int opcion2 = sc.nextInt();
                            sc.nextLine();
                            switch (opcion2) {
                                case 1:
                                    crearBici();
                                    break;
                                case 2:
                                    crearGiroscopio();
                                    break;
                                case 3:
                                    crearSegway();
                                    break;
                            }
                         break;
                    case 2:
                        alquilar();
                        break;
                    case 3:
                        listar();
                        break;
                    case 4:
                        System.out.println("Adios");
                        return;
                 }
             } catch (Exception e) {
                 System.out.println("Error");
             }
         } while (true);
    }

    public static void listar(){
        for (int i = 0; i < bicis.size(); i++) {
            System.out.println((i + 1) + ". " + bicis.get(i));
        }
    }

    public static void alquilar(){
        System.out.println("Elige tu bici:");
        listar();
        int opcion = sc.nextInt();
        sc.nextLine();
        System.out.println("¿Cuantas horas?");
        int horas = sc.nextInt();
        sc.nextLine();
        System.out.println("El precio es de " + bicis.get(opcion - 1).alquilar(horas) + "€");
    }

    public static void crearBici(){
        System.out.println("Marca:");
        String marca = sc.nextLine();
        System.out.println("Modelo:");
        String modelo = sc.nextLine();
        System.out.println("Velocidades:");
        int velocidades = sc.nextInt();
        sc.nextLine();
        LocalTime antiguedad = new LocalTime();
        bicis.add(new Bicicleta(marca, modelo, antiguedad, velocidades));
    }

    public static void crearGiroscopio(){
        System.out.println("Marca:");
        String marca = sc.nextLine();
        System.out.println("Modelo:");
        String modelo = sc.nextLine();
        System.out.println("Autonomia:");
        int autonomia = sc.nextInt();
        sc.nextLine();
        LocalTime antiguedad = new LocalTime();
        bicis.add(new Giroscopio(marca, modelo, antiguedad, autonomia));
    }

    public static void crearSegway(){
        System.out.println("Marca:");
        String marca = sc.nextLine();
        System.out.println("Modelo:");
        String modelo = sc.nextLine();
        System.out.println("Autonomia:");
        int autonomia = sc.nextInt();
        sc.nextLine();
        LocalTime antiguedad = new LocalTime();
        bicis.add(new Segway(marca, modelo, antiguedad, autonomia));
    }
}
