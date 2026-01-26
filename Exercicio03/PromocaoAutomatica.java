public class PromocaoAutomatica {
    public static void main(String[] args) {
        byte a = 10;
        short b = 100;
        char c = 'E';
        int d = 25;
        long e = 5000000000L;
        float f = 17.57F;
        double g = 26.483;

        // byte e short promovidos p/ int
        int resultado1 = a + b;
        // int e long p/ float
        float resultado2 = d + e;

        // float e int p/ double
        double resultado3 = f + d;

        System.out.println("Resultado da soma: " + resultado1);
        System.out.println("Resultado da soma: " + resultado2);
        System.out.println("Resultado da soma: " + resultado3);
        System.out.println("Valor do char: " + c);
    }
}