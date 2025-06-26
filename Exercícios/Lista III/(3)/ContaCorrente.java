public class ContaCorrente extends ContaBancaria {

    private String tipoConta;
    private String nomeCliente;
    private int numeroConta;

    public void defineTipoConta(String tipoConta){
        this.tipoConta = tipoConta;
    }
    public void defineNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    public void defineNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public void exibeInformacoesCliente(){
        System.out.println("Nome do cliente: " + this.nomeCliente);
        System.out.println("Numero da conta: " + this.numeroConta);
        System.out.println("Tipo da conta: " + this.tipoConta);
    }

    public double cobraTarifa(){
        double valorTarifa = 55.50;
        return saldo = saldo - valorTarifa;
    }
}
