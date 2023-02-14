package metodos;

public class Methods {
    public static void main(String[] args) {
        int a = 10, b = 5;
        int res = somar(a,b);
        System.out.println("Soma dos dois valores é : " + res );
        System.out.println("Os dois valores são verdadeiros ? " + validar(a,b) );
        System.out.println("A divisão dos dois números é : " + dividir(a,b) );
    }
    public static int somar(int a, int b){//métodos static só podem ser referenciados dentro do método main
        return a + b;
    }
    public static double dividir(int a, int b) {
        return a / b;
    }
    public static boolean validar(int a,int b){
        boolean isTrue = a == b ? true : false;
        return isTrue;
    }

}
