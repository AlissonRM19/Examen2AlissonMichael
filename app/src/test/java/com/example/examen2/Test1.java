package com.example.examen2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;




public class Test1 {
    @Test
    public void testConvertirNumero() {
        assertTrue(Calculadora.convertirNumero("1010", 0) == 10); // Binario a decimal
        assertTrue(Calculadora.convertirNumero("10", 1) == 8); // Octal a decimal

    }

    @Test
    public void testRealizarOperacion() {
        assertTrue(Calculadora.realizarOperacion(2, 3, "+") == 5);// suma
        assertFalse(Calculadora.realizarOperacion(2, 3, "-") == 5); // resta

    }



    @Test
    public void testConvertirADestino() {
        assertTrue(Calculadora.convertirADestino(10, 0).equals("1010")); // Decimal a binario
        assertTrue(Calculadora.convertirADestino(10, 1).equals("12")); // Decimal a octal

    }
}

