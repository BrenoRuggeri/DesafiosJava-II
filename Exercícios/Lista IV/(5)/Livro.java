public class Livro implements Calculavel{
    @Override
    public double calcularPrecoFinal(double preco) {
        double desconto = 0.5;
        double precoDesconto = preco * desconto;
        return preco - precoDesconto;
    }
}
