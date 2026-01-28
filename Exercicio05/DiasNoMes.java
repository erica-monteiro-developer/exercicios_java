public class DiasNoMes {
    public static void main(String[] args) {
        String mes = "Abril";

        // String totalDiasMes = switch (mes) {
        // case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" ->
        // "O número de dias é 31.";
        // case "Abril", "Junho", "Setembro", "Novembro" -> "O número de dias é 30.";
        // case "Fevereiro" -> "O número de dias é 28 (exceto ano bissexto).";
        // default -> "Mês desconhecido.";

        // };

        // System.out.println(totalDiasMes);

        int numeroDeDias = switch (mes) {
            case "Janeiro", "Março", "Maio", "Julho", "Agosto",
                    "Outubro", "Dezembro" -> 31;
            case "Abril", "Junho", "Setembro", "Novembro" -> 30;
            case "Fevereiro" -> 28;
            default -> -1;
        };

        if (numeroDeDias != -1) {
            System.out.println("Número de dias em " + mes + ": " + numeroDeDias);
        } else {
            System.out.println("Mês desconhecido.");
        }
    }
}
