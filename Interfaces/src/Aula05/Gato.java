/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05;

/**
 *
 * @author Vania
 */
public class Gato extends Felino implements Pet{
    
    public Gato(){
        super();
    }
    
    public void emitirSom(){
        System.out.println("miau");
    }
    
    public void dormir(){
        super.dormir();
        System.out.println("ron ron ron ron");
    }

    @Override
    public void serAmigavel() {

    }

    @Override
    public void brincar() {

    }
}
