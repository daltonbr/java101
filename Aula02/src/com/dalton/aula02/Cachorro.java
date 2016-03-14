package com.dalton.aula02;

/**
 * Created by dalton on 3/11/16.
 */
public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    public Cachorro() {
        //System.out.println("Estou criando um cachorro!");
        this.setNome("Nome_Default");
        this.setIdade(1);
        this.setRaca("srd");
    }

    public Cachorro(String _nome, int _idade, String _raca) {
        //System.out.println("Estou criando um cachorro com parametros!");
        this.setNome(_nome);
        this.setIdade(_idade);
        this.setRaca(_raca);
    }

    public void setNome(String _nome) {
        this.nome = _nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setRaca(String _raca) {
        this.raca = _raca;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setIdade(int _novaIdade) {
        this.idade = _novaIdade;
    }

    public int getIdade() {
        return this.idade;
    }

    public String latir() {
        return " says Woof!";
    }

    public String correr() {
        return (this.nome + " esta correndo");
    }

}
