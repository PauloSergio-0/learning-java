package edu.paulo.quintasemana;
import java.util.Random;


public class LoopDoWhile{
    public static void main(String[] args) {
        do{
            System.out.println("Tocando...");
        }while(tocando());

        System.out.println("Atendeu!");
    }

    private static Boolean tocando(){
        Boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu;
    }
}
