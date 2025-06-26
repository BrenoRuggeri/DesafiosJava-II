public class ContaBancaria {

    protected double saldo;
    private double deposito;
    private double saque;

    public void depositar(double valor) {
        this.deposito = valor;
        saldo += valor;
    }
    public void sacar(double valor) {
        this.saque = valor;
    }

    public void saque(double valorSaque){
        this.saque = saldo -= valorSaque;
    }

    public void exibeSaldo(){
        System.out.println("Saldo: " + saldo);
    }

}
