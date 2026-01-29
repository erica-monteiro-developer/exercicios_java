public class ValoresAcumulados {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            soma += i;
        }
        System.out.printf("A soma dos números de 1 a 10 é: %d\n", soma);
    }
}