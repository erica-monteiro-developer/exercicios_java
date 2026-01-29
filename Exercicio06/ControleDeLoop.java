public class ControleDeLoop {
    public static void main(String[] args) {
        int codigoDeSaida = 9;

        for (int codigoCarteirinha = 1; codigoCarteirinha <= 10; codigoCarteirinha++) {
            if (codigoCarteirinha == codigoDeSaida) {
                System.out.println("Encerrando o programa...");
                break;
            } else if (codigoCarteirinha == 3 || codigoCarteirinha == 7 || codigoCarteirinha == 10) {
                System.out.println("O código " + codigoCarteirinha + " é aceito!");
                continue;
            } else {
                System.out.println("O código " + codigoCarteirinha + " NÃO é aceito!");
            }
        }
    }
}
