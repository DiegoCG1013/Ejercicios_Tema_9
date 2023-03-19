package Ejercicio_1;

import java.time.LocalTime;

public class Bicicleta extends Bici{

    //Atributos
    private int velocidades;

    //Constructor
    public Bicicleta(String marca, String modelo, LocalTime fechaCompra, int velocidades) {
        super(marca, modelo, fechaCompra, 4.90);
        this.velocidades = velocidades;
    }

    @Override
    public String toString() {
        return "Bici " + super.toString() + " " + velocidades + " velocidades\t" + precio + "€/h";
    }
}
