public class ConversorMoeda implements ConversaoFinanceira {

    private double qtdDolar;

    public double getQtdDolar() {
        return qtdDolar;
    }

    public void setQtdDolar(double qtdDolar) {
        this.qtdDolar = qtdDolar;
    }

    @Override
    public double converterDolarParaReal() {
        return  qtdDolar * 5.50;
    }
}
