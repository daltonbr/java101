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
public class Main {
    
    public static void main(String[] args){        
        //Cachorro
        
        Cachorro dogao = new Cachorro();
        dogao.setNome("Dogão");
        dogao.setIdade(2);
        float peso = 3;
        dogao.setPeso(peso);
        dogao.setRaca("Pinscher");
        
        //dogao.correr();
        //dogao.emitirSom();
        
        //Gato
        Gato gatinho = new Gato();
        gatinho.setNome("Mimi");
        gatinho.setIdade(4);
        gatinho.setPeso(1F);
        gatinho.setRaca("Siamês");
        
        //gatinho.correr();
        //gatinho.emitirSom();
        gatinho.dormir();
        
        Animal doguinho = new Cachorro();
        //doguinho.emitirSom();
        
        Animal[] animais = new Animal[5];
        animais[0] = new Cachorro();
        animais[1] = new Gato();
        animais[2] = new Vaca();
        animais[3] = new Leao();
        animais[4] = new Lobo();
        
       /* for (int i = 0; i <5; i++){
            animais[i].emitirSom();
            
        }*/
       
       /*dogao.comer();
       dogao.comer("pizza");
       dogao.comer("pizza", 2);
       dogao.comer(2, "pizza");*/
    }
    
}
