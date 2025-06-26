public class Main {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        System.out.println("Celsius para Fahrenheit: " + conversor.celsiusToFahrenheit(100) + "ºF");
        System.out.println("Fahrenheit para Celsius: " + conversor.fahrenheitToCelsius(212) + "ºC");
    }
}