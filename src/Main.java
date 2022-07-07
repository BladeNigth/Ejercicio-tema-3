public class Main {
    public static void main(String[] args) {

        int num1 = 11;
        int num2 = 4;
        int num3 = 8;
        int result = suma(num1,num2,num3);
        System.out.println("La suma de " + num1 + " + "+  num2 + " + " + num3 + " es: " + result);

        coche micoche = new coche();
        micoche.miCoche();
        System.out.println("El numero de puertas es: " + micoche.getNumpuertas());
    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }

    public static class coche {
        public static int numpuertas = 4;

        public static void miCoche(){
            numpuertas += 1;
        }

        public static int getNumpuertas() {
            return numpuertas;
        }
    }
}