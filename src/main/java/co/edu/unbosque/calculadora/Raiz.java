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
public class Raiz {
    
     public double raiz2(double subradical) {
        double result;
        result = Math.sqrt(subradical);
        return result;
    }
     
      public double raiz(double indice,double radicando) {
        double result;
        result = Math.pow(radicando, 1/(indice));
        return result;
    }
     
    
}
