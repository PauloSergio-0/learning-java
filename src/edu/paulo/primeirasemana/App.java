package edu.paulo.primeirasemana;

public class App { // classe
    public static void main (String [] args) {//metodo
        final String pais = "Brasil"; /*Nunca será alterada */
        int idade = 12;
        float altura = 1.60f;
        String nome = "Paulo Sérgio";
        String sobreNome = "Madureira de Souza";
        Boolean presente = false;
        String nomeCompleto = nomeCompleto(nome, sobreNome);
        String inforUser = infoUser(nome,idade,altura,pais,presente);

        System.out.printf(nomeCompleto);
        System.out.printf(inforUser);
        // System.out.printf("Nome: %s\nIdade: %d\nAltura: %f\nPais: %s\nPresença: %s",nome, idade, altura, pais, presente);

        
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado: ".concat(primeiroNome).concat(" ").concat(segundoNome);
    }

    public static String infoUser(String nome, int idade, float altura, String pais, Boolean presenca){
        return "\nNome: " +nome +"\nIdade: " + idade + "\nAltura: "+ altura +"\nPaís: " + pais + "\nPresença: " + presenca;
    }


}