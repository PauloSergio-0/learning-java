package edu.paulo.quintasemana.LoopFors;

public class ForArray {
    public static void main(String[] args) {
        String alunos[] = {"Paulo", "José", "Willy", "Anny"};

//        for ( int x = 0; x < alunos.length; x++ ) {
//                System.out.println(alunos[x]);
//                System.out.println(x);
//
//        }

        for (String aluno: alunos){ //Melhor para array
            System.out.println("O nome do aluno é: "+aluno);
        }
    }
}
