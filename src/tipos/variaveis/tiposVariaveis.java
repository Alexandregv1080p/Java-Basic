package tipos.variaveis;

public class tiposVariaveis {
    public static void main(String[] args) {
        //tipos primitivos Java
        //int,byte,short,long,float double,boolean e char
        double salarioMinimo = 2500; //valor milhar
        byte idade = 100;
        short ano = 2023;
        int cep = 152150415;
        long cpf = 15293210696l; //necessário o L no final de todo long
        float pi = 3.14f;
        double salario = 2150.43;
        String meuNome = "Alexandre Gomes";

        //Java é fortemente tipado

        short numAleatorio = 1;
        int numInt = numAleatorio;
        //short numAleatorio2 = numInt; não será possível
        short numAleatorio2 = (short)numInt; //necessario uma conversão implícita

        System.out.println(numInt);

        //constantes no Java são definidadas por "final" e pelo seu nome em caixa alto

        int num = 2;
        num = 10;
        System.out.println(num);

        final int NUM2 = 2;
        //NUM2 = 10; não será possível

    }
}
