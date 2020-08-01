package com.tovar;

public class Cuadrado implements Figura {

    private double l;

    public Cuadrado(double lado) {
        this.l = lado;
    }

    @Override
    public double Perimetro() {
        return l * 4;
    }

    @Override
    public double Area() {
        return Math.pow(l,2);
    }
}
