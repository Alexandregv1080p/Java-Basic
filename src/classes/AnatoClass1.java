package classes;

public class AnatoClass1 {
    public static void main(String[] args) {
        String nome = nomeCompleto("Alexandre","Gomes");
        System.out.println(nome);
    }
    //tipoRetorno       NomeObj             Params
    public static String nomeCompleto(String fN, String sN){
        //return fN + " " + sN; primeira forma de concatenar
        return "Resultado do método é : " + fN.concat(" ").concat(sN);
    }
}



