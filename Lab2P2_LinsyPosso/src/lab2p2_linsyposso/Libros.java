/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_linsyposso;

import java.util.Date;

/**
 *
 * @author 29164
 */
public class Libros {
    private String libro;
    private String autor;
    private String genero;
    private Date añoPublicacion;
    private boolean disponibilidad;

    public Libros(String libro, String autor, String genero, Date añoPublicacion, boolean disponibilidad) {
        this.libro = libro;
        this.autor = autor;
        this.genero = genero;
        this.añoPublicacion = añoPublicacion;
        this.disponibilidad = disponibilidad;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(Date añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
}
