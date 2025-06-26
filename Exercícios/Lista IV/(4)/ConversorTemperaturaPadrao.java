public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public double celsiusToFahrenheit(double temperaturaC) {
        return (temperaturaC * 1.8) + 32;
    }

    @Override
    public double fahrenheitToCelsius(double temperaturaF) {
        return (temperaturaF - 32) * 5/9;
    }
}