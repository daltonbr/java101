/**
 * Created on 5/6/16 by:
 * Dalton Lima         github.com/daltonbr
 * Lucas Pinheiro      github.com/lucaspin
 *
 Na construção dos três métodos faça com que eles lancem exceptions relacionados aos argumentos, por exemplo, sacar,
 depositar ou setar um valor negativo para esses eventos. Lance também uma exception no caso de tentar sacar um valor
 maior que o possível.
 Nós métodos lancem a exception “IllegalArgumentException()” (Java)com comando “throw”, passe o motivo da exception(uma
 String) em seu construtor.
 Implemente a classe Main, onde se deve instanciar um objeto da classe “ContaCorrente”, usar os três métodos construídos
 acima e tratar as exceções propostas com os comandos “try” e “catch”, no catch imprimir na tela o método “getMessage()”
 da exception declarada no catch. Cause condições apropriadas para a execução das exceções.
 */

public class Main {

    public static void main (String[] args) {
        System.out.println("Sistema Bancario");

        ContaCorrente conta = new ContaCorrente();

    }
}
