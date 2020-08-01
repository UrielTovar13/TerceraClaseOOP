package com.tovar;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Persona usuario = new Persona("Uriel", "Tovar", 24);
        Persona usuarioDos = new Persona();
        Persona usuarioTres = new Persona("Daniel", "Pineda", 23);
        Persona usuarioCuatro = new Persona(50.0);

        /*Jugador armando = new Jugador();

        armando.addCarta("2 C");
        armando.removeAllCartas();*/

        /*usuario.setNombre("Uriel");
        usuario.setApellidos("Tovar");
        usuario.setEdad(24);*/

        System.out.println(usuario.getNombre() + " ¿Es mayor de edad?: " + usuario.esMayorde());

        if (usuario.esMayorde()) {
            System.out.println("Puede ingresar al casino");
        } else  {
            System.out.println("No puede ingresar al casino");
        }


        System.out.println("Usuario: " + usuario.NombreCompleto());

        Persona usuarioKaren = new Persona("Karen", "Villegas", 23);

        /*usuarioKaren.setNombre("Karen");
        usuarioKaren.setApellidos("Villegas");
        usuarioKaren.setEdad(23);*/

        System.out.println("Usuario: " + usuarioKaren.NombreCompleto());

        Remitente remitente = new Remitente("Gibram", "YEUEIFFH");
        remitente.setLlego(true);
        System.out.println(remitente.toStringIndividuo());

        Circulo circulo = new Circulo(3);
        System.out.println("El area del circulo es: " + circulo.Area());
        System.out.println("El perimetro del circulo es: " + circulo.Perimetro());

        Cuadrado cuadrado = new Cuadrado(7);
        System.out.println("El area del cuadrado es: " + cuadrado.Area());
        System.out.println("El perimetro del cuadrado es: " + cuadrado.Perimetro());

        Rectangulo rectangulo = new Rectangulo(9,3);
        System.out.println("El area del rectangulo es: " + rectangulo.Area());
        System.out.println("El perimetro del rectangulo es: " + rectangulo.Perimetro());

    }
}
