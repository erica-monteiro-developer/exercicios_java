public class PrecedenciaOperadoresAtribuicao {
    public static void main(String[] args){
        int numero = 5;
        ++numero;
        System.out.println("O resultado do pré-incremento é: " + numero);

        numero++;
        System.out.println("O resultado do pós-incremento é: " + numero);

        --numero;
        System.out.println("O resultado do pré-decremento é: " + numero);

        numero++;
        System.out.println("O resultado do pós-decremento é: " + numero);

    }
}