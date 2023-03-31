package Posnet;

/**
 * Implementación de un datáfono sencillo con pago a plazos.
 * Ejemplo 
 * @author 1dam
 */ 
public class Principal {

    /**
     * Esta es la clase principal.
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Posnet posnet = new Posnet();
        Persona p=new Persona("79256544Q", "Ritik","Punjabi","649011184","ritikthadani@gmail.com");    
        TarjetaDeCredito t=new TarjetaDeCredito("Fakebank","2223333444",15000,p,EntidadFinanciera.BIRZA);
        
        System.out.println("Tarjeta antes del pago");
        System.out.println(t);
        
        System.out.println("Ticket tras pagar...");
        Ticket ticketGenerado= posnet.efectuarPago(t, 10000, 5);
        System.out.println(ticketGenerado);
        
        System.out.println("Tarjeta después del pago");
        System.out.println(t);
    }
}
