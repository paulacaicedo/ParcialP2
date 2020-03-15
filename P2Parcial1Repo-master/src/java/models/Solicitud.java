/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

 

/**
 *
 * @author PC
 */
public class Solicitud  {
    private String descripcion;
    private String prioridad;
    private Usuario usuario;
  

    
    public Solicitud() {
        
    }
    public Solicitud(String descripcion, String prioridad, Usuario usuario) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.usuario = usuario;
         
    }
 
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

   
    
    
}
