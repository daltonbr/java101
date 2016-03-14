package com.dalton.aula02;

public class Main {

    public static void main(String[] args) {
        Cachorro astolfo = new Cachorro();
        Cachorro gato = new Cachorro();

        astolfo.setNome("Bob Jose");
        astolfo.setIdade(2);
        astolfo.setRaca("pinscher");

        gato.setNome("Leao");
        gato.setIdade(33);
        gato.setRaca("srd");

        Cachorro marley = new Cachorro();
        Cachorro toto = new Cachorro("Jose", 24, "rotweiller");

        System.out.println(marley.getNome() + marley.getIdade() + marley.getRaca() );
        System.out.println(toto.getNome() + toto.getIdade() + toto.getRaca() );

//        System.out.println( astolfo.getNome() + astolfo.latir() );   //method
//        System.out.println( gato.getNome() + gato.latir() ) ;
//        System.out.println( astolfo.correr() );

        System.out.println(gato.getNome() + " tem " + gato.getIdade() + " anos");
        gato.setIdade(5);
        System.out.println(gato.getNome() + " tem " + gato.getIdade() + " anos");
    }
}
