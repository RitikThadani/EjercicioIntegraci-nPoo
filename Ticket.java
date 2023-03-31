/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posnet;

/**
 * Clase Ticket con sus atributos.
 * @author Ritik
 */

class Ticket {
    private String nombreApellido;
    private double montoTotal;
    private double montoPorCuota;

    /**
     * Constructor por defecto del Ticket.
     * @param nombreApellido
     * @param montoTotal
     * @param montoPorCuota 
     */
    
    public Ticket(String nombreApellido, double montoTotal, double montoPorCuota) {
        this.nombreApellido = nombreApellido;
        this.montoTotal = montoTotal;
        this.montoPorCuota = montoPorCuota;
    }

    /**
     * Método para generar cadena con los detalles del ticket.
     * @return cadena con todos los detalles del ticket.
     */
    
    @Override
    public String toString() {
        return "Ticket{" + "nombreApellido=" + nombreApellido + ", montoTotal=" + montoTotal + ", montoPorCuota=" + montoPorCuota + '}';
    }
    
}
