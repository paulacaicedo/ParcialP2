 
package controllers;

import contracts.IRegistro;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import models.Solicitud;
import models.Usuario;
import models.tipoUsuario;

/**
 *
 * @author PC
 */
public class PageController implements IRegistro{

    private String correo;
    private String clave;
    
    private String descripcion;
    private String prioridad;
    
    private Usuario usuarioAutenticado;
    private List<Usuario> listadoUsuarios;
    private Solicitud solicitud;
    private static List<Solicitud> solicitudes;
    private static List<Solicitud> misSolicitudes;
    
    /**
     * Creates a new instance of PageController
     */
    public PageController() {
        listadoUsuarios = new ArrayList<>(); 
        listadoUsuarios.add(new Usuario("Juan", "1","Juan", "Perez", "Masculino", "Sistemas", false, 'a', tipoUsuario.ADMINISTRATIVO));
        listadoUsuarios.add(new Usuario("Luisa", "2","Luisa", "Monsalve", "Femenino", "Industrial", false, 'i', tipoUsuario.ADMINISTRATIVO));
        listadoUsuarios.add(new Usuario("Ana", "3","Ana", "Frank", "Femenino", "Psicologia", false, 'a', tipoUsuario.ESTUDIANTE));
        listadoUsuarios.add(new Usuario("Tomas", "4","Tomas", "Edmun", "Masculino", "Derecho", false, 'i', tipoUsuario.ESTUDIANTE));
         
    }
    
    public void ValidarAdministrativo() throws IOException{
        FacesContext context= FacesContext.getCurrentInstance();
        ExternalContext ex =context.getExternalContext();
        if(usuarioAutenticado==null || usuarioAutenticado.getTipo()==tipoUsuario.ESTUDIANTE){
            usuarioAutenticado=null;
             ex.redirect("../index.xhtml");
        }
    }
    
      public void ValidarEstudiante() throws IOException{
        FacesContext context= FacesContext.getCurrentInstance();
        ExternalContext ex =context.getExternalContext();
        if(usuarioAutenticado==null || usuarioAutenticado.getTipo()==tipoUsuario.ADMINISTRATIVO){
             usuarioAutenticado=null;
             ex.redirect("../index.xhtml");
        }
    }
    
    public void login() throws IOException{
        FacesContext context= FacesContext.getCurrentInstance();
        ExternalContext ex =context.getExternalContext();
        usuarioAutenticado=null;
        for (Usuario u : listadoUsuarios) {
            if(u.getCorreo().equals(correo)&& u.getClave().equals(clave)){
                usuarioAutenticado=u;
                break;
            }
            
        }
        if(usuarioAutenticado!=null){
            if(usuarioAutenticado.getTipo()==tipoUsuario.ADMINISTRATIVO)
                ex.redirect("administrador/dashboard.xhtml");
            else
                ex.redirect("estudiante/home.xhtml");
        }
        else
            ex.redirect("index.xhtml");
    }
    
    @Override
    public void verUsuarios() {
        FacesContext context= FacesContext.getCurrentInstance();
        try {
            context.getExternalContext().redirect("verUsuarios.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(PageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void verBitacora() {
         FacesContext context= FacesContext.getCurrentInstance();
        try {
            context.getExternalContext().redirect("Bitacora.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(PageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void verSolicitudes() {
        FacesContext context= FacesContext.getCurrentInstance();
        try {
            context.getExternalContext().redirect("verSolicitudes.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(PageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void registrarSolicitud() {
        FacesContext context= FacesContext.getCurrentInstance();
        try {
            context.getExternalContext().redirect("registrarSolicitud.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(PageController.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
   
    public void guardarSolicitud(){
        solicitud = new Solicitud();
        solicitudes = new ArrayList<>(); 
        solicitudes.add(this.solicitud);
        this.solicitud=new Solicitud();
        /*
        if(solicitud.getUsuario().getNombres().equals(usuarioAutenticado.getNombres())){
           misSolicitudes.add(solicitud);
        }*/
    }

    @Override
    public void verMisSolicitudes() {
        FacesContext context= FacesContext.getCurrentInstance();
        try {
            context.getExternalContext().redirect("misSolicitudes.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(PageController.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    public Usuario getUsuarioAutenticado() {
        return usuarioAutenticado;
    }

    public void setUsuarioAutenticado(Usuario usuarioAutenticado) {
        this.usuarioAutenticado = usuarioAutenticado;
    }

    public List<Usuario> getListadoUsuarios() {
        return listadoUsuarios;
    }

    public void setListadoUsuarios(List<Usuario> listadoUsuarios) {
        this.listadoUsuarios = listadoUsuarios;
    }
    
      public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public List<Solicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(List<Solicitud> solicitudes) {
        PageController.solicitudes = solicitudes;
    }

    public List<Solicitud> getMisSolicitudes() {
        return misSolicitudes;
    }

    public void setMisSolicitudes(List<Solicitud> misSolicitudes) {
        PageController.misSolicitudes = misSolicitudes;
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
    
    
}
