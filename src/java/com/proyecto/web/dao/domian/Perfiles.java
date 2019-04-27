package com.proyecto.web.dao.domian;

public class Perfiles {

    private Integer idPerfil;
    private String perfil;
   
    private String estatus;

    public Perfiles() {
    }

    public Integer getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Integer idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    

   
    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "Perfiles{" + "idPerfil=" + idPerfil + ", perfil=" + perfil + ", estatus=" + estatus + '}';
    }

    
    
}
