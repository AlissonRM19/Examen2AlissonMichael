package com.example.examen2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    @Test
    public void testConvertirNumero() {
        assertTrue(Calculadora.convertirNumero("1010", 0) == 10); // Binario a decimal
        assertTrue(Calculadora.convertirNumero("10", 1) == 8); // Octal a decimal
        assertTrue(Calculadora.convertirNumero("FF", 3) == 255); // Hexadecimal a decimal
        assertFalse(Calculadora.convertirNumero("G", 3) != -1); // Entrada inválida en hexadecimal
    }

    @Test
    public void testRealizarOperacion() {
        assertTrue(Calculadora.realizarOperacion(2, 3, "+") == 5);// suma
        assertFalse(Calculadora.realizarOperacion(2, 3, "-") == 5); // resta
        assertTrue(Calculadora.realizarOperacion(2, 3, "*") == 6);
        assertTrue(Calculadora.realizarOperacion(6, 3, "/") == 2);
    }



    @Test
    public void testConvertirADestino() {
        assertTrue(Calculadora.convertirADestino(10, 0).equals("1010")); // Decimal a binario
        assertTrue(Calculadora.convertirADestino(10, 1).equals("12")); // Decimal a octal
        assertTrue(Calculadora.convertirADestino(10, 2).equals("10")); // Decimal a decimal
        assertTrue(Calculadora.convertirADestino(10, 3).equals("a")); // Decimal a hexadecimal

    }
    @Test
    public void testEncuentraElementoPresente() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(Calculadora.Encuentra(lista, 7)); // El elemento 3 está en la lista
    }
 

}

