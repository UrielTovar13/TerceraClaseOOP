package com.tovar;

import java.io.Serializable;

public abstract class Individuo implements Serializable {

    private String nombre;
    private String direccion;
    private String telefono;
    private boolean llego;

    public Individuo(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void setLlego(boolean llego) {
        this.llego = llego;
    }

    public String toStringIndividuo() {
        return nombre + " " + direccion;
    }

    public boolean getStatus() {
     return llego;
    }
}
