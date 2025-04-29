package pOO.alquilerCoches;

import java.util.Date;

//Representa el vínculo entre cliente y coche
public class Alquiler {

    //Atributos
    private Cliente cliente;
    private Coche coche;
    private Date fechaInicio;
    private Date fechaFin;

    //Constructor
    public Alquiler(Cliente cliente, Coche coche, Date fechaInicio, Date fechaFin) {
        this.cliente = cliente;
        this.coche = coche;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
}
