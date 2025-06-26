public class Servico implements Vendavel{

    private String tipoServico;
    private double precoServico;


    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public double getPrecoServico() {
        return precoServico;
    }

    public void setPrecoServico(double precoServico) {
        this.precoServico = precoServico;
    }

    @Override
    public double calculaPreco(int quantidadeProduto) {
        return precoServico * quantidadeProduto;
    }

    @Override
    public double aplicaDesconto(double porcentagemDesconto) {
        return precoServico -= precoServico * (porcentagemDesconto/100.0);
    }
}
