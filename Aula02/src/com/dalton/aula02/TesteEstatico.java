package com.dalton.aula02;

/**
 * Created by dalton on 3/11/16.
 */
public class TesteEstatico
{
    private static int atributoA;
    private int atributoB;


    public static int getAtributoA() {
        return atributoA;
    }

    public static void setAtributoA(int atributoA) {
        TesteEstatico.atributoA = atributoA;
    }

    public int getAtributoB() {
        return atributoB;
    }

    public void setAtributoB(int atributoB) {
        this.atributoB = atributoB;
    }

    public static void  incA() {
        atributoA++;
    }

    public void incB () {
        atributoB++;
    }
}
