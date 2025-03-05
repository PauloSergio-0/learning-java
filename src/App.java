public class App { // classe 
    public static void main (String [] args) {//metodo
        final String pais = "Brasil"; /*Nunca será alterada */
        int idade = 12;
        float altura = 1.60f;
        String nome = "Paulo Sérgio";
        String sobreNome = "Madureira de Souza";
        Boolean presente = false;
        String nomeCompleto = nomeCompleto(nome, sobreNome);
        

        System.out.printf(nomeCompleto);
        // System.out.printf("Nome: %s\nIdade: %d\nAltura: %f\nPais: %s\nPresença: %s",nome, idade, altura, pais, presente);

        
    }

        public static String nomeCompleto(String primeiroNome, String segundoNome){
            return "Resultado: ".concat(primeiroNome).concat(" ").concat(segundoNome);
    }


}