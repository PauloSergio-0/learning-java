package edu.paulo.quartasemana;
import java.util.Locale;
import java.util.Scanner;

public class CondicionalCase {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Qual a sue plano de saúde: ");
        String planoSaude = scaner.nextLine();
        scaner.close();

        switch (planoSaude){
            case "B":{
                System.out.println("Vocé tem um desconto de 40% nas consultas");
                break;
            }
            case "P":{
                System.out.println("Vocé tem um desconto de 60% nas consultas");
                break;
            }
            case "PR":{
                System.out.println("Vocé tem um desconto de 80% nas consultas");
                break;
            }
            default:{
                System.out.println("Você não tem plano de saíde");
                break;
            }
        }
    }
}
