package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;
import java.util.Date;

public class RegistroRecebimentos {

    //final static String ESC = "\033[";
    private static Vector<Recebivel> registros = new Vector<>();

    public Vector<Recebivel> getRegistros() {
        return registros;
    }

    public static void setRegistros(Vector<Recebivel> _registros) {
        registros = _registros;
    }

    public static void resetRegistros() {
        registros.clear();
    }

    public static void addRegistros(Recebivel _newRegistro) {
        registros.add(_newRegistro);
    }

    public static void printRegistros( Vector<Recebivel> _registros) {
        for (Recebivel tempRegistro : _registros)
        {
            System.out.println ("Receita: " + tempRegistro.totalizarReceita() );
        }
    }

    public static void main(String[] args) {
        //clearScreen();

        Date date = new Date();
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader bufferReader = new BufferedReader(inputStream);
        String tempString;

                String fileName = ("registers" + date.hashCode() + ".csv" );
        WriteFile data = new WriteFile( fileName, true); // creating the file
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

                    System.out.print("Nome do Produto: ");
                    try {
                        tempString = bufferReader.readLine();
                    } catch (IOException ioE) {
                        tempString = "";
                    }
                    item.setProduto(tempString);

                    System.out.print("Valor Unitario do Produto: ");
                    try {
                    tempString = bufferReader.readLine();
                    } catch (IOException ioE) {
                        tempString = "";
                    }
                    item.setPrecoUnitario(Double.parseDouble(tempString));

                    System.out.print("Quantidade: ");
                    try {
                        tempString = bufferReader.readLine();
                    } catch (IOException ioE) {
                        tempString = "";
                    }
                    item.setQuantidade(Integer.parseInt(tempString));

                    addRegistros(item);
                    data.writeToFile(item.getProduto() + "," +
                                     item.getPrecoUnitario() + "," +
                                     item.getQuantidade() + "," +
                                     item.totalizarReceita());
                    break;
                case 2:
                    System.out.println("2 - Registro de recebimentos (Serviços)");
                    Servico servico = new Servico();

                    System.out.print("Descricao do Servico: ");
                    try {
                        tempString = bufferReader.readLine();
                    } catch (IOException ioE) {
                        tempString = "";
                    }
                    servico.setDescricao(tempString);

                    System.out.print("Preco por hora: ");
                    try {
                        tempString = bufferReader.readLine();
                    } catch (IOException ioE) {
                        tempString = "";
                    }
                    servico.setPrecoHora(Double.parseDouble(tempString));

                    System.out.print("Horas: ");
                    try {
                        tempString = bufferReader.readLine();
                    } catch (IOException ioE) {
                        tempString = "";
                    }
                    servico.setHoras(Integer.parseInt(tempString));

                    addRegistros(servico);
                    data.writeToFile(servico.getDescricao() + "," +
                                     servico.getPrecoHora() + "," +
                                     servico.getHoras() + "," +
                                     servico.totalizarReceita());
                    break;
                case 3:
                    System.out.println("3 - Impressao dos registros ");
                    printRegistros(registros);
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

    public static int menu() throws IOException{
      //  clearScreen();

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
