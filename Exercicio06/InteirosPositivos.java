public class InteirosPositivos {
    public static void main(String[] args) {
        int num = 10;
        int soma = 0;

        do {
            soma += num;
            num--;
        } while (num > 0);

        System.out.printf("A soma dos números inteiros positivos é: %d", soma);
    }
}
