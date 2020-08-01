package com.tovar;

public class Circulo implements Figura {

    private double r;

    public Circulo(double radio) {
        this.r = radio;
    }

    @Override
    public double Perimetro() {
        return 2 * pi * r;
    }

    @Override
    public double Area() {
        return pi*Math.pow(r,2);
    }
}
