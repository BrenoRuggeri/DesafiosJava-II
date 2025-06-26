public class ProdutoFisico implements Calculavel {

    @Override
    public double calcularPrecoFinal(double preco) {
        double desconto = 0.1;
        double precoDesconto = preco * desconto;
        return preco - precoDesconto;
    }
}
