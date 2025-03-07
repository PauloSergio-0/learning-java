package edu.paulo.segundasemana;
import java.util.Scanner;

public class tiposVariaveis {

    public static void main (String [] args){

        //Primitivos
        int numeroInteiro = 1;
        double salario = 2500.78;
        float altura = 1.60f;
        short numeroPequeno = 12;
        long numeroGrande = 1231231241412312312L;
        char caracter = 'P';
        boolean gostou = true;

        // referenciados
        String nome = "Paulo Sérgio";
        String[] paises = {"Brasil", "Argentina", "Peru"};
        Integer nota = 100;// Wrapper para int
        Double valor = 99.99;// Wrapper para double
        Boolean status = Boolean.TRUE;// Wrapper para Boolean


        final int anoNascimento = 2005; /*Não poderá ser redeclarada seja por "final" ou CAIXA ALTA*/
        int idade = 20;

        idade = 21;

    }

    public static void imprimirNome(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tipos Váriaveis !");

        System.out.println("Qual o seu nome ?");

        String nome = scanner.nextLine();
        scanner.close();

        System.out.printf("O seu nome é: %s", nome);

    }

}
