public class VerificaNumero {
    public static void main(String[] args) {
        // ------------------------- Primeira verificação -------------------------
        int num = 10;

        if (num % 2 == 0) {
        System.out.println(num + " é par!");
        } else {
        System.out.println(num + " é ímpar!");
        }

        // ------------------------- Segunda verificação -------------------------
        int nivel = 1;

        // String feedback;

        // switch (nivel) {
        //     case 1 -> feedback = "Muito insatisfeito";
        //     case 2 -> feedback = "Insatisfeito";
        //     case 3 -> feedback = "Neutro";
        //     case 4 -> feedback = "Satisfeito";
        //     case 5 -> feedback = "Muito satisfeito";
        //     default -> feedback = "Opção inválida";
        // }
        // System.out.println("Nível de insatisfação: " + feedback);

        switch (nivel) {
            case 1 -> System.out.println("Muito insatisfeito");
            case 2 -> System.out.println("Insatisfeito");
            case 3 -> System.out.println("Neutro");
            case 4 -> System.out.println("Satisfeito");
            case 5 -> System.out.println("Muito satisfeito");
            default -> System.out.println("Opção inválida");
        }


        // ------------------------- Terceira verificação -------------------------
        int mes = 1;

        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Janeiro");
                break;
            case 4:
                System.out.println("Março");
                break;
            case 5:
                System.out.println("Abril");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
        }
    }
}
