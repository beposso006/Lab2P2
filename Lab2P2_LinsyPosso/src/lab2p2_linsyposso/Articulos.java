/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_linsyposso;

/**
 *
 * @author 29164
 */
public class Articulos {
    private String titulo;
    private String autor;
    private String tema;
    private String añoPublicacion;
    private boolean acceso;

    public Articulos(String titulo, String autor, String tema, String añoPublicacion, boolean acceso) {
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.añoPublicacion = añoPublicacion;
        this.acceso = acceso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(String añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public boolean isAcceso() {
        return acceso;
    }

    public void setAcceso(boolean acceso) {
        this.acceso = acceso;
    }

    @Override
    public String toString() {
        return "Articulos{" + "titulo=" + titulo + ", autor=" + autor + ", tema=" + tema + ", a\u00f1oPublicacion=" + añoPublicacion + ", acceso=" + acceso + '}';
    }
    
    
}
