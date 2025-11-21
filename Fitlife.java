/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fitlife;

import java.util.Scanner;
/**
 *
 * @author Isabella
 */
public class Fitlife {


public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
   
   Usuario usuario1 = new Usuario("Andrea", "Andre@gmail.com","1234", 30);
   
   System.out.println("== INICIO SESION ==");

   System.out.println("Ingresa tu correo");
   String correoIngresado = sc.nextLine();
   
    System.out.println("Ingresa tu contraseña");
   String contraseña = sc.nextLine();
   
   if (correoIngresado.equals(usuario1.getCorreo()) &&
            contraseña.equals(usuario1.getContraseña())) {

            System.out.println("Inicio de sesión exitoso!");

            usuario1.mostrarinformacion(); 

            System.out.println("== Recordatorio ===");
            Recordatorio r1 = new Recordatorio("Tomar agua", "Hoy");
            r1.mostrarinformacion();

  }else{
       System.out.println("Correo o contraseña incorrecto");
    }
   }
}



