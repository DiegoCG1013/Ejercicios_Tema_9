package Ejercicio_1;

import java.time.LocalTime;

public abstract class BiciAutonomia extends Bici{

    //Atributos
    private int autonomia;

    //Constructor
    public BiciAutonomia(String marca, String modelo, LocalTime fechaCompra, int autonomia) {
        super(marca, modelo, fechaCompra);
        this.autonomia = autonomia;
    }
}
