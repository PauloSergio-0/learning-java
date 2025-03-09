package edu.paulo.terceirasemana;

import java.util.Locale;
import java.util.Scanner;

public class Argumentos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Qual o seu Sobre-nome: ");
        String sobreNome = scanner.nextLine();


        System.out.println("Qual a sua idade: ");
        int idade =scanner.nextInt();

        System.out.println("Qual a sua altura: ");
        double altura = scanner.nextDouble();

        scanner.close();
        String[] resultado = {nome, sobreNome, String.valueOf(idade), String.valueOf(altura)};
        aboutMe(resultado);
    }

    public static void aboutMe(String[] dataUser){
        String nome = dataUser[0];
        String sobreNome = dataUser[1];
        int idade = Integer.parseInt(dataUser[2]);
        double altura = Double.parseDouble(dataUser[3]);

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobreNome + "\nIdade: " + idade+ "\nAltura: " + altura);

    }
}
