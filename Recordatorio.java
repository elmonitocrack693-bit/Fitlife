/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitlife;

/**
 *
 * @author Isabella
 */
public class Recordatorio {
   private String fecha;
   private String mensaje;
   
   //Constructor//
   public Recordatorio(String fecha, String mensaje){
       this.mensaje = mensaje;
       this.fecha = fecha;
   }
   
   //Get y setter//
   public String getfecha(){
       return fecha;
   }
   
   public void setfecha(){
       this.fecha= fecha;
   }
   
   public String mensaje(){
        return mensaje;
   }
   
   public void setmensaje(){
        this.mensaje = mensaje;
   }
   
   public void mostrarinformacion(){
       System.out.println("Recordatorio :"); 
       System.out.println("fecha:" + fecha);
       System.out.println("mensaje" + mensaje);
       
   }
}         
           


