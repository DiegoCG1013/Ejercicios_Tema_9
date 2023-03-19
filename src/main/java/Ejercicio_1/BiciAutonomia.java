package Ejercicio_1;

import java.time.LocalTime;

public abstract class BiciAutonomia extends Bici{

    //Atributos
    private int autonomia;

    //Constructor
    public BiciAutonomia(String marca, String modelo, LocalTime fechaCompra, int autonomia, double precio) {
        super(marca, modelo, fechaCompra, precio);
        this.autonomia = autonomia;
    }

    @Override
    public String toString() {
        return super.toString() + " " + autonomia + " km de autonomía";
    }
}
