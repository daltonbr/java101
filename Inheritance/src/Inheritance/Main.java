package Inheritance;

/**
 * Created by dalton on 4/8/16.
 */
public class Main {

    public static void main (String args[])
    {
        Porta portaTeste = new Porta();
        portaTeste.fecha();
        portaTeste.abre();
        portaTeste.pinta("Amarelo");
        portaTeste.pinta("Ambar");
        portaTeste.estaAberta();

        Casa casaTeste = new Casa();
        casaTeste.pinta("Preto");

        casaTeste.getPorta2().abre();

        System.out.println("Portas abertas na casa teste: " + casaTeste.quantasPortasEstaoAbertas() );

    }

}
