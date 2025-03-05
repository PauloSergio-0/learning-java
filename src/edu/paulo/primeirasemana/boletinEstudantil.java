package edu.paulo.primeirasemana;

class boletinEstudantil{
    public static void main (String [] args){
        int mediaAluno = 5;

        if( mediaAluno < 6){
            System.out.println("REPROVADO");
        }else if (mediaAluno == 6) {
            System.out.println("PROVA FINAL");
        } else {
            System.out.println("APROVADO");
        }
    }
}