/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.calculadora;

/**
 *
 * @author usuario
 */
public class MainCalculadora {
    
    public static void main(String[] args) {
    Calculadora calc = new Calculadora();
    double p  = calc.sumar(1,2);
    System.out.print(p);
    calc.restar(21,5);
    
        
    }
    
}
