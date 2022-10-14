public class Main {
    public static void main(String[] args) {
        suma(20, 40, 60);

        Coche miCoche = new Coche();
        miCoche.aumentarpuertas();
        miCoche.aumentarpuertas();
        miCoche.aumentarpuertas();
        miCoche.aumentarpuertas();
        System.out.println("mi coche tiene:" + miCoche.puertas + " puertas");

    }

    public static void suma(int a, int b, int c){

        int resultado;
        resultado= a + b + c;

        System.out.println("la suma total es:" + resultado);
    }
    static class Coche{
        int puertas= 0;
        public void aumentarpuertas(){
            this.puertas++;
        }
    }
}













