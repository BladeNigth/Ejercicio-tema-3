public class Main {
    public static void main(String[] args) {

        int num1 = 11;
        int num2 = 4;
        int num3 = 8;
        int result = suma(num1,num2,num3);

    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }

    public static class coche {
        public static int numpuertas = 4;

        public static void miChoche(){
            numpuertas += 1;
        }

        public static int getNumpuertas() {
            return numpuertas;
        }
    }
}