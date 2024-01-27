/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_linsyposso;

/**
 *
 * @author 29164
 */
public class Cursos_en_Linea {   
    private String titulo;
    private String instructor;
    private int duracionS;
    private String plataforma;

    public Cursos_en_Linea(String titulo, String instructor, int duracionS, String plataforma) {
        this.titulo = titulo;
        this.instructor = instructor;
        this.duracionS = duracionS;
        this.plataforma = plataforma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getDuracion() {
        return duracionS;
    }

    public void setDuracion(int duracion) {
        this.duracionS = duracion;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Cursos_en_Linea{" + "Titulo: " + titulo + ", Instructor: " + instructor + ", Duracion: " + duracionS + ", Plataforma: " + plataforma + '}';
    }
    
    
}
