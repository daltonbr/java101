package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public class RegistroRecebimentos {

    final static String ESC = "\033[";

    public static void main(String[] args) {
        clearScreen();
        int opcao = 0;
        do {
            try {
                opcao = menu();
            } catch (IOException ioE) {
                System.err.println("Erro de IO!");
                opcao = 0;
            }

            switch (opcao) {
                case 1:
                    System.out.println("1 - Registro de recebimentos (Venda)");
                    ItemVenda item = new ItemVenda();
                    item.setProduto("Disquete");
                    item.setPrecoUnitario(3.50d);
                    item.setQuantidade(2);
                    item.totalizarReceita();

                    break;
                case 2:
                    System.out.println("2 - Registro de recebimentos (Serviços)");
                    Servico servico = new Servico();
                    servico.setDescricao("Formatacao");
                    servico.setPrecoHora(50.00d);
                    servico.setHoras(2);
                    servico.totalizarReceita();

                case 3:
                    System.out.println("3 - Impressao dos registros ");
                    break;
                case 0:
                    System.out.println("0 - Sair");
                    break;
                default:
                    System.out.println("Opcao Invalida");
                    break;
            }
        } while ( opcao != 0 );
    }


    public static void clearScreen() {
        System.out.print(ESC + "2J");
    }

    public static int menu() throws IOException{
        clearScreen();

        int opcao = 0;
        System.out.println("|---=== Sistema Loja de Informatica  ===---|");
        System.out.println("|                                          |");
        System.out.println("| 1 - Registro de recebimentos (Venda)     |");
        System.out.println("| 2 - Registro de recebimentos (Servicos)  |");
        System.out.println("| 3 - Impressao dos registros              |");
        System.out.println("|------------------------------------------|");
        System.out.println("| 0 - Sair                                 |");
        System.out.println("|------------------------------------------|");

        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Entre com a opcao: ");
        String str = bufferReader.readLine();

        //try {
            opcao = Integer.parseInt( str );
        //} catch (NumberFormatException nfe) {
        //    System.err.println("Formato Invalido!");
            //opcao = 999;
        //}

        return opcao;
    }
}
