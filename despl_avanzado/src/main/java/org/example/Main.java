package org.example;

import org.example.calculadora.Calculadora;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Llamada a los métodos de la clase Calculadora
        double suma = Calculadora.suma(2, 2);
        double resta = Calculadora.resta(5, 3);
        double multiplicacion = Calculadora.multiplicacion(4, 3);
        double division = Calculadora.division(10, 2);
        double potencia = Calculadora.potencia(2, 3);
        double raizCuadrada = Calculadora.raizCuadrada(16);

        // Mostrar los resultados
        System.out.println("Suma (2 + 2): " + suma);
        System.out.println("Resta (5 - 3): " + resta);
        System.out.println("Multiplicación (4 * 3): " + multiplicacion);
        System.out.println("División (10 / 2): " + division);
        System.out.println("Potencia (2 ^ 3): " + potencia);
        System.out.println("Raíz Cuadrada (16): " + raizCuadrada);
    }
}
