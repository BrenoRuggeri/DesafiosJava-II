public class CalculaSalaRetangular implements CalculoGeometrico {

    private double tamanhoBase;
    private double tamanhoAltura;

    public double getTamanhoBase() {
        return tamanhoBase;
    }

    public void setTamanhoBase(double tamanhoBase) {
        this.tamanhoBase = tamanhoBase;
    }

    public double getTamanhoAltura() {
        return tamanhoAltura;
    }

    public void setTamanhoAltura(double tamanhoAltura) {
        this.tamanhoAltura = tamanhoAltura;
    }

    @Override
    public double calcularArea() {
        return getTamanhoAltura() * getTamanhoBase();
    }

    @Override
    public double calcularPerimetro() {
        return 2 *(getTamanhoAltura() + getTamanhoBase());
    }
}
