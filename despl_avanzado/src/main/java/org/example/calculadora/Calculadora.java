package org.example.calculadora;

public class Calculadora {
    // Método para sumar
    public static double suma(double a, double b) {
        return a + b;
    }

    // Método para restar
    public static double resta(double a, double b) {
        return a - b;
    }

    // Método para multiplicar
    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    // Método para dividir
    public static double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Error: No se puede dividir por cero.");
        }
        return a / b;
    }

    // Método para calcular potencia
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    // Método para calcular raíz cuadrada
    public static double raizCuadrada(double numero) {
        if (numero < 0) {
            throw new ArithmeticException("Error: No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(numero);
    }
}
