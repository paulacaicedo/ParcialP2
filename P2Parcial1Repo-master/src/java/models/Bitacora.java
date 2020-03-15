          /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

 
import java.util.Date;

/**
 *
 * @author PC
 */
public class Bitacora  {
    
    private String accion;
    private Usuario usuario;
    private Date fecha;

    public Bitacora(String accion, Usuario usuario) {
        this.accion = accion;
        this.usuario = usuario;
        this.fecha=new Date();
    }

    
    
    
    
    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    
    
}
