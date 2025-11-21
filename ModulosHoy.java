/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.moduloshoy;

/**
 *
 * @author ASUS
 */
public class ModulosHoy {

  public class Habitos {
    private String nombre;
    private String descripcion;
    private boolean cumplido;

    public Habitos(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cumplido = false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean Cumplido() {
        return cumplido;
    }

    public void marcarCumplido() {
        this.cumplido = true;
    }

    public void reiniciar() {
        this.cumplido = false;
    }

    public String String() {
        return "habito: " + nombre + "| descripccion" + descripcion + "| cumplido" + cumplido;
    }
    
  
  }
