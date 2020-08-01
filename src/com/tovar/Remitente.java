package com.tovar;

public class Remitente extends Individuo {

    public Remitente(String nombre, String direccion) {
        super(nombre, direccion);
    }

    @Override
    public void setLlego(boolean llego) {
        super.setLlego(llego);
    }

    @Override
    public String toStringIndividuo() {
        return super.toStringIndividuo() + "\n";
    }
}
