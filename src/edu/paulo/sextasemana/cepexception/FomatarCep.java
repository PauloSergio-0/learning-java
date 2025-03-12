package edu.paulo.sextasemana.cepexception;

public class FomatarCep {
    public static void main(String[] args) {
        try {
            String cepFormat = fomatarCeps("49101258");
            System.out.println(cepFormat);
        } catch (CepInvalidoException e) {
            System.out.println("Cep não corresponde com a regra de negocio");
        }
    }

    static String fomatarCeps(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw  new CepInvalidoException();
        }
            return "49.101-268";
    }

}
