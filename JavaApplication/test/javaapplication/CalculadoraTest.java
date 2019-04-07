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
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
        System.out.println("somar");
        int n1 = 15;
        int n2 = 16;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.somar(n1, n2);
        assertEquals(expResult, result, 31.0);
    }

    /**
     * Test of subtrair method, of class Calculadora.
     */
    @Test
    public void testSubtrair() {
        System.out.println("subtrair");
        int n1 = 18;
        int n2 = 17;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.subtrair(n1, n2);
        assertEquals(expResult, result, 1.0);
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int n1 = 19;
        int n2 = 20;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.multiplicar(n1, n2);
        assertEquals(expResult, result, 380.0);
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int n1 = 220;
        int n2 = 10;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.dividir(n1, n2);
        assertEquals(expResult, result, 22.0);
    }
    
}
