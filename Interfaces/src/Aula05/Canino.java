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
public abstract class Canino extends Animal{
    
    @Override
    public void correr(){
        System.out.println(this.nome + " está correndo --> canino!");
    }
    
}
