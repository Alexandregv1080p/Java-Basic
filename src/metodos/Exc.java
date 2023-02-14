package metodos;


public class Exc {
    public static class Televisao{
        public boolean ligada;
        public int canal;
        public int volume = 0;

        public void ligar(){
            ligada = true;
        }
        public void desligar(){
            ligada = false;
        }
        public int mudarCanal(int a){
            return canal += a;
        }
        public int aumentarVolume(int a) {
            return volume += a;
        }
        public void info(){
            System.out.println("A televisão esta ligada? " + ligada);
            System.out.println("Volume da televisão " + volume);
            System.out.println("Canal da televisão: " + canal);
        }

    }
    public static void main(String[] args) {
        Televisao televisao = new Televisao();
        televisao.ligar();
        televisao.mudarCanal(20);
        televisao.aumentarVolume(15);
        televisao.aumentarVolume(5);
        televisao.info();
    }

}

