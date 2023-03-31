/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posnet;

/**
 * Clase TarjetaDeCredito con sus atributos.
 * @author Ritik
 */

class TarjetaDeCredito {
    private String entidadBancaria;
    private String nroTarjeta;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;

    /**
     * Nuestro constructor por defecto de la clase TarjetaDeCredito.
     * @param entidadBancaria
     * @param nroTarjeta
     * @param saldo
     * @param titular
     * @param entidadFinanciera 
     */
    
    public TarjetaDeCredito(String entidadBancaria, String nroTarjeta, double saldo, Persona titular, EntidadFinanciera entidadFinanciera) {
        this.entidadBancaria = entidadBancaria;
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
    }

    /**
     * Método para generar cadena con los datos de la tarjeta.
     * @return cadena con los datos de la tarjeta.
     */
    
    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", nroTarjeta=" + nroTarjeta + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }

    /**
     * Método para saber si tiene saldo la tarjeta.
     * @param monto
     * @return si el saldo es mayor o igual que monto.
     */
    
    boolean tieneSaldoDisponible(double monto) {
        return saldo>=monto;
    }
    
    /**
     * Método para devolver el nombre completo del titular.
     * @return nombre completo del titular
     */
    
    public String nombreCompletoDelTitular(){
        return titular.nombreCompleto();
    }
    
    /**
     * Método para descontar a nuestro saldo el monto.
     * @param monto 
     */
    
    public void descontar(double monto){
        saldo=saldo-monto;
    }
}
