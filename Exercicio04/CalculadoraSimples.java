public class CalculadoraSimples {
    public static void main(String[] args){
        int a = 10;
        int b = 2;

        var soma = a + b;
        var subtracao = a - b;
        var multiplicacao = a * b;
        var divisao = a / b;
        //double divisao = (double) a / b;
        var restoDaDivisao = a % b;

        System.out.println("O resultado da adição é: " + soma);
        System.out.println("O resultado da subtração é: " + subtracao);
        System.out.println("O resultado da multiplicação é: " + multiplicacao);
        System.out.println("O resultado da divisão é: " + divisao);
    }
}