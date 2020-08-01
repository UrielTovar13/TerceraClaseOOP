package com.tovar;

public class Rectangulo implements Figura {

    private double b;
    private double h;

    public Rectangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    @Override
    public double Perimetro() {
        return (b * 2) + (h * 2);
    }

    @Override
    public double Area() {
        return b * h;
    }
}
