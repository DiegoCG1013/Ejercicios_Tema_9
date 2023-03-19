package Ejercicio_1;

import java.time.LocalTime;

public class Giroscopio extends BiciAutonomia{

    //Constructor
    public Giroscopio(String marca, String modelo, LocalTime fechaCompra, int autonomia) {
        super(marca, modelo, fechaCompra, autonomia, 29.90);
    }
}
