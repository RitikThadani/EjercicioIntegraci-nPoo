/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posnet;

/**
 * Constructor de la Clase Posnet
 * @author Ritik
 */
public class Posnet {
    /*
    Recargo Por Cuota
    */
    public static final double RECARGO_POR_CUOTA=0.03;
    /*
    Min Cant Cuotas
    */
    public static final int MIN_CANT_CUOTAS=1;
    /*
    Max Cant Cuotas
    */
    public static final int MAX_CANT_CUOTAS=6;
    
    /**
         * Método para efectuar el pago
         * @param  tarjeta: pasará la tarjeta con la que se paga.
         * @param  montoAAbonar: el total que se quiere pagar.
         * @param  cantCuotas: la cantidad de cuotas siempre entre 1 y 6.
         * @return devolverá un objeto ticket con los campos si todo es correcto y si no un ticket null.
         * @author Ritik
         */
    
    public Ticket efectuarPago(TarjetaDeCredito tarjeta, double montoAAbonar, int cantCuotas){
        Ticket ticket=null;
        if(datosValidos(tarjeta,montoAAbonar,cantCuotas)){
            double montoFinal=montoAAbonar+montoAAbonar*recargoSegunCuotas(cantCuotas);
            if(tarjeta.tieneSaldoDisponible(montoFinal)){
                String nomApe=tarjeta.nombreCompletoDelTitular();
                tarjeta.descontar(montoFinal);
                double montoPorCuota=montoFinal/cantCuotas;
                ticket = new Ticket(nomApe,montoFinal,montoPorCuota);
            }
        }
        return ticket;
    }
    
    /**
     * Método que valida la tarjeta.
     * @param tarjeta
     * @param monto
     * @param cant
     * @return 
     */
    
    private boolean datosValidos(TarjetaDeCredito tarjeta, double monto, int cant){
        boolean esTarjetaValida = tarjeta!=null;
        boolean esMontoValido=monto>0;
        boolean cantCuotasValidas=cant>=MIN_CANT_CUOTAS && cant<=MAX_CANT_CUOTAS;
        return esTarjetaValida && esMontoValido && cantCuotasValidas;
    }
    
    /**
     * Nos dice el recargo según cuotas.
     * @param cantCuotas
     * @return Recargo por cuota.
     */
    
    private double recargoSegunCuotas(int cantCuotas){
        return (cantCuotas-1)*RECARGO_POR_CUOTA;
    }
    
}
