/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consulta.modelo;

/**
 *
 * @author igor
 */
public class Persona {
    private String dni;
    private  String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private  int codVerifica;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombres;
    }

    public void setNombre(String nombre) {
        this.nombres = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getCodVerifica() {
        return codVerifica;
    }

    public void setCodVerifica(int codVerifica) {
        this.codVerifica = codVerifica;
    }
    
    
    
}
