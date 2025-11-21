/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitlife;

public class Usuario {

    private String nombre;
    private String correo;
    private String contraseña;
    private int edad;

    // Constructor
    public Usuario(String nombre, String correo, String contraseña, int edad) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.edad = edad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrarinformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("contraseña: **************" + contraseña);
        System.out.println("Edad :" + edad );
    }
}
                  
            
     
    
    
    

