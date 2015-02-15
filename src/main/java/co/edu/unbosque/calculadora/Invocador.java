/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.calculadora;

import java.util.HashMap;
/**
 *
 * @author usuario
 */
public class Invocador {
    
    HashMap<String, Command> comandos;
    public Invocador()
    {
        comandos= new HashMap<>();
        comandos.put("+", new Sumar());
        comandos.put("-",new Restar() );
           
    }
    public double ejecutar(double op1,double op2,String Operador){
       Command cmd =comandos.getClass(operador);
       return cmd.ejecutar(op1,op2);
    } 
    
    
}
