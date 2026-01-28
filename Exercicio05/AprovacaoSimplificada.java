public class AprovacaoSimplificada {
    public static void main(String[] args) {
        int nota1 = 10;
        int nota2 = 5;
        int aulas = 200;
        int faltas = 12;

        // float media = (nota1 + nota2) / 2f;
        double media = (nota1 + nota2) / 2.0;
        double frequencia = ((double)(aulas - faltas) / aulas) * 100;
        boolean aprovado = media >= 7 && frequencia >= 75;

        if (aprovado) {
            System.out.println("Aprovado(a)! Média final é " + media + " e a frequência é de " + frequencia + "%");
        } else {
            System.out.println("Reprovado(a)! Média final é "+ media+ " e a frequência é de " + frequencia + "%");
        }
    }
}
