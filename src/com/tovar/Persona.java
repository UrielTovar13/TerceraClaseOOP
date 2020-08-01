package com.tovar;

import java.util.ArrayList;

public class Persona {

    private int edad;
    private String genero;
    private String nombre;
    private String apellidos;
    private String estadoCivil;
    private String nacionalidad;
    private String fechaCumple;
    private double credito;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Persona() {

    }

    public Persona(double credito) {
        this.credito = credito;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFechaCumple() {
        return fechaCumple;
    }

    public void setFechaCumple(String fechaCumple) {
        this.fechaCumple = fechaCumple;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String NombreCompleto() {
        return this.nombre + " " + this.apellidos;
    }

    public Boolean esMayorde() {
        boolean esMayor = false;
        if (edad >= 18 ) {
            esMayor = true;
        }
        return esMayor;
    }

}

/*public class Jugador {

    int fichas;
    ArrayList<String> cartas;
    boolean estoyDentro;

    public boolean tieneFichas() {
        boolean auntiene = true;
        if (fichas == 0) {
            auntiene = false;
        }
        return auntiene;
    }

    public boolean EstaEnLaPartida() {
        return estoyDentro;
    }

    public removeAll() {
        cartas.removeAll();
    }


}*/

/*public class Vehiculo {

    String modelo;
    int llantas;
    String tranmision;

}*/