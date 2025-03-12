package edu.paulo.quintasemana.LoopFors;

public class BreakFor {
    public static void main (String[] args){

    for (int contador = 0; contador <=20; contador++){
        if (contador ==18){
            System.out.println("O contador chegou a "+contador);
            break;
        } else if (contador == 10) {
            continue; // pular a proxima iteração

        }
        System.out.println(contador);


    }
    }
}
