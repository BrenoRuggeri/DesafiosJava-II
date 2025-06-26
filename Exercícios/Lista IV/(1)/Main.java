public class Main {
    public static void main(String[] args) {
        ConversorMoeda moeda = new ConversorMoeda();
        moeda.setQtdDolar(30);
        System.out.println(moeda.getQtdDolar() + " Dolares, São: " + moeda.converterDolarParaReal() + " Reais");

    }
}
