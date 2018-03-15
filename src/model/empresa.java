/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author orlando
 */
public class empresa {
    
    private String nombre;
    private String servicio;
    private String direccion;
    private String nit;

    public empresa(String nombre, String servicio, String direccion, String nit) {
        this.nombre = nombre;
        this.servicio = servicio;
        this.direccion = direccion;
        this.nit = nit;
    }

    public empresa() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
   
    
    
    
}
