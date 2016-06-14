import sun.security.util.AuthResources_it;
import sun.security.util.PropertyExpander;

/**
 * Created on 5/5/16 by:
 * Dalton Lima         github.com/daltonbr
 * Lucas Pinheiro      github.com/lucaspin
 *

 1) Pesquise na API Java os tipos de Exceção IllegalArgumentException e NumberFormatException. O que causa essas
  exceções (escreva como comentário em seu código)? Implemente um programa em Java que faça o tratamento dessas exceções

 2) Implemente a classe “ContaCorrente”: Atributos (todos float):
 • “limite” que armazena a quantidade atual disponível do limite da conta que o usuário possui;
 • “saldo” que é o valor que realmente é pertencente ao usuário;
 • “valorLimite” que consiste no valor máximo que o banco lhe fornece como valor de limite.

 Métodos:
 • public void sacar(float valor)
 • depositar(float valor)
 • setValorLimite(float valor).

 Na construção dos três métodos faça com que eles lancem exceptions relacionados aos argumentos, por exemplo, sacar,
 depositar ou setar um valor negativo para esses eventos. Lance também uma exception no caso de tentar sacar um valor
 maior que o possível.
 Nós métodos lancem a exception “IllegalArgumentException()” (Java)com comando “throw”, passe o motivo da exception(uma
 String) em seu construtor.
 Implemente a classe Main, onde se deve instanciar um objeto da classe “ContaCorrente”, usar os três métodos construídos
 acima e tratar as exceções propostas com os comandos “try” e “catch”, no catch imprimir na tela o método “getMessage()”
 da exception declarada no catch. Cause condições apropriadas para a execução das exceções.

 */
public class ContaCorrente {

    private float limite;
    private float saldo;
    private float valorLimite;      // "cheque especial"

    public ContaCorrente() {}

    public ContaCorrente(float _limite, float _saldo, float _valorLimite) {
        this.setLimite( _limite);
        this.setSaldo( _saldo);
        this.setValorLimite( _valorLimite);
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getValorLimite() {
        return valorLimite;
    }

    public void sacar(float _valor) throws Exception{
        if (_valor <= 0) throw new ArithmeticException(); // sacar valores nao-positivos
        float saldo = getSaldo();
        float limite = getLimite();
        if ( _valor < saldo + limite ) {
            throw new Exception();
        }
    }
    public void depositar (float _valor) throws Exception{}
    public void setValorLimite (float _valor ) {}
}
