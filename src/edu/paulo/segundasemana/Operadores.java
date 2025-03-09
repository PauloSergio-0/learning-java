package edu.paulo.segundasemana;

public class Operadores {

    public static void main(String[] args) {
        double alturaMedia = 50.8 / 12;
        int idade = -2005 + 2025;
        int resto = 10%3; // resto da divisão

        String nome = "Paulo Sérgio";
        String sobreNome="Madureira de Souza";
//        System.out.println("resto: " + nome +" ".concat(sobreNome));

//        incrementos();
        relacionais();
    }

    public static void incrementos(){
        int inicio = 1;
        inicio++;
        String message = inicio > 1 ? "eles": "ele";
        System.out.println(message);
    }

    public static void relacionais(){
        int num = 13;
        int num2 = 2;

        String nome1 = "Paulo";
        String nome2 = new String("Paulo"); // novo objeto string

        System.out.println(nome1 == nome2);
        System.out.println(nome1.equals(nome2)); // para objetos strings

//        if(num > num2) {
//            System.out.println("Sim");
//        }else {
//            System.out.println("Não");
//        }
        if(num == num2 || nome1.equals(nome2)) {
            System.out.println("Sim");
        }else {
            System.out.println("Não");
        }
    }

}
