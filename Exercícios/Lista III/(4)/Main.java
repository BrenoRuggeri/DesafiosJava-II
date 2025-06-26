public class Main {
    public static void main(String[] args) {

        VerificadorPrimo verificadorPrimo = new VerificadorPrimo();
        verificadorPrimo.verificaPrimalidade(3);

        GeradorPrimo geradorPrimo = new GeradorPrimo();
        int proximoPrimo = geradorPrimo.gerarNumeroPrimo(3);
        System.out.println("O próximo número primo é: "+ proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listaPrimos(10);

    }
}
