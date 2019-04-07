/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo Bertaco
 */
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y;
        String sX, sY;

        sX = JOptionPane.showInputDialog(null, "Digite o primeiro número:", "Primeiro número", JOptionPane.QUESTION_MESSAGE);

        x = Integer.parseInt(sX);

        sY = JOptionPane.showInputDialog(null, "Digite o segundo número:", "Segundo número", JOptionPane.QUESTION_MESSAGE);

        y = Integer.parseInt(sY);

        // instanciação de um objeto da classe calculadora
        Calculadora calc = new Calculadora();

        JOptionPane.showMessageDialog(null, "somar: " + calc.somar(x, y));
        JOptionPane.showMessageDialog(null, "subtrair: " + calc.subtrair(x, y));
        JOptionPane.showMessageDialog(null, "multiplicar: " + calc.multiplicar(x, y));
        JOptionPane.showMessageDialog(null, "dividir: " + calc.dividir(x, y));

        System.exit(0);
    }
}
