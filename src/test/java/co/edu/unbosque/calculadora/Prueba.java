/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.calculadora;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author usuario
 */
public class Prueba {
@Test
public void preuevaAnalizador ()
{
    Sumar sumar = new Sumar();
    double varSum= sumar.sumar(3, 4);
    double varSumComp=7;
    Assert.assertTrue(varSumComp==varSum);
    
    Restar restar = new Restar();
    double varRest= restar.restar(3, 4);
    double varRestComp=-1;
    Assert.assertTrue(varRestComp==varRest);
    
    Multiplicar multiplicar = new Multiplicar();
    double varMult= multiplicar.multiplicar(8,8);
    double varMultComp=64;
    Assert.assertTrue(varMultComp==varMult);
    
    Division division = new Division();
    double varDiv =division.dividir(8, 4);
    double varDivComp=2;
    Assert.assertTrue(varDivComp==varDiv);
    
    Raiz raiz = new Raiz();
    double varRaiz2= raiz.raiz2(4);
    double varRaiz2Comp=2;
    Assert.assertTrue(varRaiz2Comp==varRaiz2);
    double varRaiz = raiz.raiz(3,8);
    double varRaizComp = 2;
    Assert.assertTrue(varRaizComp==varRaiz);
  
    Elevar elevar = new Elevar();
    double varElevar = elevar.elevar(2, 4);
    double varElevarComp = 16;
    Assert.assertTrue(varElevarComp==varElevar);
    
    
    Trigonometria trigonometria = new Trigonometria();
    double varSeno =trigonometria.seno(90);
    double varSenoComp = 0.8939966636005579;
    Assert.assertTrue(varSenoComp==varSeno);
    double varCoseno = trigonometria.coseno(0);
    double varCosenoComp=1;
    Assert.assertTrue(varCosenoComp==varCoseno);
    double varTang = trigonometria.tangente(45);
    double varTangComp =1.6197751905438615;
    Assert.assertTrue(varTangComp==varTang);
    
    
    AnalizadorSintactico as = new AnalizadorSintactico();
    int varAs = as.analizadorSintactico2("1");
    int varAsComp = 1;
    Assert.assertTrue(varAsComp==varAs);
  
}
    
}
