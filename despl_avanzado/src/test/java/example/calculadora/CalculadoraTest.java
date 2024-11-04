package example.calculadora;

import org.example.calculadora.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    @Test
    public void testSuma() {
        assertEquals(5.0, Calculadora.suma(2, 3), 0.0001);
    }

    @Test
    public void testResta() {
        assertEquals(2.0, Calculadora.resta(5, 3), 0.0001);
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(12.0, Calculadora.multiplicacion(4, 3), 0.0001);
    }

    @Test
    public void testDivision() {
        assertEquals(5.0, Calculadora.division(10, 2), 0.0001);
    }

    @Test
    public void testDivisionPorCero() {
        assertThrows(ArithmeticException.class, () -> Calculadora.division(10, 0));
    }

    @Test
    public void testPotencia() {
        assertEquals(8.0, Calculadora.potencia(2, 3), 0.0001);
    }

    @Test
    public void testRaizCuadrada() {
        assertEquals(4.0, Calculadora.raizCuadrada(16), 0.0001);
    }

    @Test
    public void testRaizCuadradaNegativa() {
        assertThrows(ArithmeticException.class, () -> Calculadora.raizCuadrada(-16));
    }
}
