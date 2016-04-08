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
public abstract class Animal {
    protected String nome = "";
    private String raca;
    private int idade;
    private Float peso;
    private String cor;
    
    
    public void correr(){
        System.out.println(this.nome + " está correndo");
    }
    
    public void comer(){
        System.out.println(this.nome + " está comendo");
    }
    
    public void comer(String comida){
        System.out.println(this.nome + " está comendo "+ comida);
    }
    
    public String comer(String comida, int tempo){
        System.out.println(this.nome + " está comendo "+ comida +" por "+ tempo+" min");
        return "";
    }
    public String comer(int tempo, String comida){
        System.out.println(this.nome + " está comendo "+ comida +" por "+ tempo+" min");
        return "";
    }    
    
    public void dormir(){
        System.out.println(this.nome+ " está dormingo");
    }
    
    public abstract void emitirSom();

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the raca
     */
    public String getRaca() {
        return raca;
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the peso
     */
    public Float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Float peso) {
        this.peso = peso;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    
}
