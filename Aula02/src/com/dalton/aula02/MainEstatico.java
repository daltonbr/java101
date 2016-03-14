package com.dalton.aula02;

/**
 * Created by dalton on 3/11/16.
 */
public class MainEstatico {
    public static void main (String[] args) {
        TesteEstatico.setAtributoA(1);
        TesteEstatico.incA();  //increments A
        System.out.println(TesteEstatico.getAtributoA() );  // print A

        TesteEstatico valorB = new TesteEstatico();
        valorB.setAtributoB(1);    //set B
        System.out.println("b" + valorB.getAtributoB() );   //print B
        valorB.incB();  //increments B
        System.out.println("b" +  valorB.getAtributoB() );   //print B

    }
}
