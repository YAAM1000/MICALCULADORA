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
public class Division {
    
      public double dividir(double dividendo, double divisor) {
        double result;
        result = dividendo / divisor;
        return result;
    }      
       public double residuo(double dividendo, double divisor) {
        double result;
        result =  dividendo  %  divisor;
        return result;
    }
    
}
