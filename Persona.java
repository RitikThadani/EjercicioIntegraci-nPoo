/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posnet;

/**
 * Clase Persona con sus atributos.
 * @author Ritik
 */

class Persona {
    private String DNI;
    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;

    /**
     * Constructor de la clase Persona por defecto.
     * @param DNI
     * @param nombre
     * @param apellido
     * @param telefono
     * @param mail 
     */
    
    public Persona(String DNI, String nombre, String apellido, String telefono, String mail) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
    }
        
    /**
     * Método para generar cadena con Nombre+Apellido
     * @return cadena con el nombre y apellido concatenado y separado con un espacio.
     */
    
    public String nombreCompleto(){
        return nombre+" "+apellido;
    }
}
