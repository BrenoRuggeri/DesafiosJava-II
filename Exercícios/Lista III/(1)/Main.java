public class Main {
    public static void main(String[] args) {

        ModeloCarro bravo = new ModeloCarro();
        bravo.defineModelo("Hatchback");
        bravo.defineMontadora("Fiat");
        bravo.defineNomeModelo("Bravo");
        bravo.exibiFichaModelo();
        bravo.definePreco(35000,33000,30000);
        bravo.exibiFichaCarro();
    }
}
