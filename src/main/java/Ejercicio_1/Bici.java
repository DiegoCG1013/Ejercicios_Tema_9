package Ejercicio_1;

import java.time.LocalTime;

public abstract class Bici {

    //Atributos
    private String marca;
    private String modelo;
    private LocalTime fechaCompra;

    //Constructor
    public Bici(String marca, String modelo, LocalTime fechaCompra) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
    }
}
