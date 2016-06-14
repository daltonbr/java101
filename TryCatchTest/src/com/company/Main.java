package com.company;
import java.io.*;
import java.util.ArrayList;
import java.lang.StackTraceElement;

public class Main {

    public static void main(String[] args) {

        System.out.println("Inicio Main");
        //m1();
        //m2();
        //aritmeticaError();
        try {
            aritmeticaError2(3.0f, 0.0f);
        } catch (DivisionByZeroException e ) {
            System.out.println(e.getMessage());
        }
        //castClassError();
        //fileReaderExceptionTest();
        try {
            methodA();
        } catch (IOException ioE) {System.out.println("IO ERROR tratado no main()");
        StackTraceElement[] stack =  ioE.getStackTrace();

//            for (StackTraceElement elem : stack) {
//                System.out.println(elem.getLineNumber() +
//                                    elem.getMethodName());
//            }

        }
        System.out.println("Fim Main");
    }

    public static void methodA() throws IOException {
        methodB();
    }

    public static void methodB() throws IOException {
        fileReaderExceptionTest();
    }

    public static void fileReaderExceptionTest() throws IOException {
        //try {
            FileReader fr = new FileReader("teste.txt");
        //} catch (IOException ioE) {System.out.println("IO ERROR!");}
        //        FileOutputStream fileOut = new FileOutputStream("itemFile.ser");
//        ObjectOutputStream out = new ObjectOutputStream(fileOut);
//        out.writeObject(iFile);
//        out.close();
//        fileOut.close();
//        System.out.println("Serialized data is saved in itemFile.ser ");
    }
//    public static void aritmeticaError() throws ArithmeticException {
//        try {
//            int a = 3/0;
//        } catch (ArithmeticException ae) {System.out.println("Erro aritmetico" + ae.getMessage() + ae.getLocalizedMessage());
//        }
//        catch (Exception e) {System.out.println("Erro Geral");}
//
//    }

    public static float aritmeticaError2(float a, float b) {
        if (b == 0) {
            throw new DivisionByZeroException();
        } else {
            return (a / b);
        }
    }

//    public static void castClassError() {
//        int a = (ArrayList<String>)3;
//    }

    public static void m1() {
        System.out.println("Inicio m1");
        m2();
        System.out.println("Fim m1");
    }

    public static void m2() {
        System.out.println("Inicio m2");
        int[] vetor= new int[10];
        try {
            for (int i = 0; i <= 9; i++){
                vetor[i] = i;
                System.out.println("Valor de i:  " + i);
            }
        } catch (Exception e){
            System.out.println("Operação inválida: Out of bounds!");
        } finally {
            System.out.println("Terminou o laco");
        }

        System.out.println("Fim m2");
    }
}
