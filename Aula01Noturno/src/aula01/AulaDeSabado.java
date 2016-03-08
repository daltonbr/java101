package aula01;

public class AulaDeSabado
{
    public static void main(String[] args)
    {
        System.out.println("Estou com fome!");
        //System.out.println(args[].length);
        System.out.println(args[0]);  //os argumentos sao separados por espaco
        System.out.println(args[2]);
        System.out.println("soma:"+ soma(3,5));
    }
    
    public static int soma (int a, int b)
    {
        return a+b;
    }
}