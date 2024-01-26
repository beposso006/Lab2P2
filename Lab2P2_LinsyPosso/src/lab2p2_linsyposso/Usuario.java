/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_linsyposso;

import java.util.ArrayList;

/**
 *
 * @author 29164
 */
public class Usuario {

   
    private String nombreU;
    private String contra;
    private String tipo;

    public Usuario(String nombreU, String contra, String tipo) {
        this.nombreU = nombreU;
        this.contra = contra;
        this.tipo = tipo;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
