package es.etg.dax.testing;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import es.etg.dax.testing.exception.OperacionNoValidaException;

public class CalculadoraTest {

    @Test
    void sumarPositivos() {
        int valor1 = 2;
        int valor2 = 3;
        int esperado = 5;

        assertEquals(esperado, Calculadora.sumar(valor1, valor2));
    }

    @Test
    void sumarPositivosMal() {
        int valor1 = 2;
        int valor2 = 3;
        int esperado = 5;

        assertEquals(esperado, Calculadora.sumar(valor1, valor2));
    }

    @Test
    void sumar() {
        assertAll("Suma",
                () -> assertEquals(5, Calculadora.sumar(1, 4), "1 + 4 = 5"),
                () -> assertEquals(5, Calculadora.sumar(2, 3), "2 + 3 = 5"),
                () -> assertEquals(1, Calculadora.sumar(0, 1), "0 + 1 = 1"),
                () -> assertEquals(-1, Calculadora.sumar(1, -2), "1 + (-2) = -1"));
    }

    @Test
    @DisplayName("Probar la división por cero")
    void dividirPorZeroException() {
        var ex = assertThrows(OperacionNoValidaException.class, () -> Calculadora.dividir(4, 0),
                "La división por cero no está permitida");
        assertEquals(OperacionNoValidaException.MSG, ex.getMessage());
    }

    @Test
    void dividirNormal() throws OperacionNoValidaException {
        assertEquals(5, Calculadora.dividir(10, 2));
    }

    @Test
    void dividirNumeradorCero() throws OperacionNoValidaException {
        assertEquals(0, Calculadora.dividir(0, 5));
    }

    @Test
    void dividirNumeradorNegativo() throws OperacionNoValidaException {
        assertEquals(-5, Calculadora.dividir(-10, 2));
    }

    @Test
    void dividirDenominadorNegativo() throws OperacionNoValidaException {
        assertEquals(-5, Calculadora.dividir(10, -2));
    }

    @Test
    void dividirDosNegativos() throws OperacionNoValidaException {
        assertEquals(5, Calculadora.dividir(-10, -2));
    }

    @Test
    void dividirPorUno() throws OperacionNoValidaException {
        assertEquals(7, Calculadora.dividir(7, 1));
    }
}
