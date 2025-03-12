package edu.paulo.sextasemana.cepexception;
import  java.text.NumberFormat;
import java.text.ParseException;


public class ExcecoesHieraquia {
    public static void main(String[] args) {
        try {
            Number valor = NumberFormat.getInstance().parse("a1.86");

            System.out.println(valor);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
