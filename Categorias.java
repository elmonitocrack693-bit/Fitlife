/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitlife;

/**
 *
 * @author APRENDIZ
 */
public class Categorias {
    private String Nombre;
    private String Descripcion;
    
    //Constructor//
    
 public Categorias(String Nombre, String Descripcion){
     this.Nombre = Nombre;
     this.Descripcion = Descripcion;
 }
 
    //Get y set//
   
 
  public String getNombre(){
      return Nombre;
  }
  
  
  public void setNombre(){;
      Nombre = Nombre;
  }
  
  
  public String getDescripcion(){
      return Descripcion;
  } 
  
  public void setDescripcion(){
      Descripcion = Descripcion;
  }
  
  public void mostrarinformacion(){ 
   System.out.println("==CATEGORIA==");
   System.out.println("Nombre:" + Nombre);
   System.out.println("Descripcion:" + Descripcion);
  
  }
}
