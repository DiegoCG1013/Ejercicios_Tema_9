package Ejercicio_1;

import java.time.LocalTime;

public abstract class Bici {

    //Atributos
    private String marca;
    private String modelo;
    private LocalTime fechaCompra;
    private final double precio;

    //Constructor
    public Bici(String marca, String modelo, LocalTime fechaCompra, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
        this.precio = precio;
    }

    public double alquilar(int horas){
        return horas * precio;
    }
}
