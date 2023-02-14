package escopo;

public class EscopoVariaveis {
    static class Conta{
        double saldo = 10.0;

        public void sacar(double valor){ double novoSaldo = saldo - valor;}
        public void imprimirSaldo(){
            System.out.println(saldo);
            //System.out.println(novoSaldo); novoSaldo estará disponível apenas no sacar()

        }
        public double calcularDivida(){
            double valorParcela = 50.0;
            double valorMontate = 0.00;
            for (int x = 1; x <= 5; x++ ){
                double valorCalculado = valorParcela * x;//valor calculado será apenas utilizado dentro do loop
                valorMontate = valorMontate + valorCalculado;
            }
            return valorMontate;
        }


    }

}
