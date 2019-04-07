/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carol
 */
public class CalculadoraNumerosNegativosTest {
    
    public CalculadoraNumerosNegativosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of somar method, of class Calculadora.
     */
    @Test
    public void testSomar() {
        System.out.println("somar números negativos");
        int n1 = -15;
        int n2 = 16;
        Calculadora instance = new Calculadora();
        double expResult = 1.0;
        double result = instance.somar(n1, n2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of subtrair method, of class Calculadora.
     */
    @Test
    public void testSubtrair() {
        System.out.println("subtrair números negativos");
        int n1 = 18;
        int n2 = -17;
        Calculadora instance = new Calculadora();
        double expResult = 35.0;
        double result = instance.subtrair(n1, n2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar números negativos");
        int n1 = -19;
        int n2 = 20;
        Calculadora instance = new Calculadora();
        double expResult = -380.0;
        double result = instance.multiplicar(n1, n2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir números negativos");
        int n1 = 220;
        int n2 = -10;
        Calculadora instance = new Calculadora();
        double expResult = -22.0;
        double result = instance.dividir(n1, n2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testDividirUmPorDois() {
        System.out.println("dividir 1/2");
        int n1 = 1;
        int n2 = 2;
        Calculadora instance = new Calculadora();
        double expResult = 0.5;
        double result = instance.dividir(n1, n2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testDividirPorZero() {
        System.out.println("dividir por zero");
        int n1 = 1;
        int n2 = 0;
        Calculadora instance = new Calculadora();
        double expResult = Double.POSITIVE_INFINITY;
        double result = instance.dividir(n1, n2);
        assertEquals(expResult, result, 0.0);
    }
    
}
