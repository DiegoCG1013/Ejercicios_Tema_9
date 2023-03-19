package Ejercicio_1;

import java.time.LocalTime;

public class Segway extends BiciAutonomia{

    //Atributos
    private double alturaMinima;

    //Constructor
    public Segway(String marca, String modelo, LocalTime fechaCompra, int autonomia, double alturaMinima) {
        super(marca, modelo, fechaCompra, autonomia);
        this.alturaMinima = alturaMinima;
    }
}
