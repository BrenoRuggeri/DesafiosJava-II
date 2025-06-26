public class Main {
    public static void main(String[] args) {
        CalculaSalaRetangular salaRetangular = new CalculaSalaRetangular();
        salaRetangular.setTamanhoBase(5);
        salaRetangular.setTamanhoAltura(12);

        System.out.println("A área da sala retangular é: " + salaRetangular.calcularArea());
        System.out.println("O perímetro da sala retangular é: " + salaRetangular.calcularPerimetro());

    }
}
    