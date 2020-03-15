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
public class Usuario   {
    

    private String correo;
    private String clave;
    private String nombres;
    private String apellidos;
    private String genero;
    private String facultad;
    private boolean becado;
    private char estado;
    private tipoUsuario tipo;
    
    
    
    
    
     public Usuario() {
         
         
    }
    
    public Usuario(String correo, String clave, String nombres, String apellidos, String genero, String facultad, boolean becado, char estado, tipoUsuario tipo) {
        this.correo = correo;
        this.clave = clave;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.facultad = facultad;
        this.becado = becado;
        this.estado = estado;
        this.tipo = tipo;
    }
    
     
    
    
    
    
    

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public boolean isBecado() {
        return becado;
    }

    public void setBecado(boolean becado) {
        this.becado = becado;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public tipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(tipoUsuario tipo) {
        this.tipo = tipo;
    }

 
    
}
