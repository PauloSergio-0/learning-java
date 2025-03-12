package edu.paulo.sextasemana;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;


public class Excecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Qual o seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Qual a sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Qual a sua altura: ");
            double altura = scanner.nextDouble();

            String[] retorno = {nome, String.valueOf(idade), String.valueOf(altura)};
            aboutMe(retorno);

        } catch (InputMismatchException e) {
            System.out.println("Os tipos de entradas estão incorretos: "+ e);

        }


    }

    public static void aboutMe(String[] args){
        System.out.println(
                "Nome: " + args[0]+
                "\nidade: " + Integer.parseInt(args[1])+
                "\nAltura: " + Double.parseDouble(args[2])
        );

    }

}
