public class Produto implements Vendavel {

    private String nome;
    private double precoProduto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    @Override
    public double calculaPreco(int quantidadeProduto) {
        return precoProduto * quantidadeProduto;
    }

    @Override
    public double aplicaDesconto(double porcentagemDesconto) {
        precoProduto -= precoProduto * (porcentagemDesconto / 100.0);
        return porcentagemDesconto;
    }
}
