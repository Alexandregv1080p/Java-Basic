package scanners;

import java.util.Scanner;

public class LendoTerminal {
    public static void main(String[] args) {
        //configuração que permite o usuario interagir com o terminal
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.next();//mesma forma q o c#

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite seu peso");
        double peso = scanner.nextDouble();

        System.out.println("Nome: "+ nome + " Idade: " + idade +" Peso: "+ peso);
    }
}
