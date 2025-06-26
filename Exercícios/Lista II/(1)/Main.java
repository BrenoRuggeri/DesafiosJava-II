public class Main {
    public static void main(String[] args) {

        ContaBancaria minhaConta = new ContaBancaria();

        minhaConta.setNumeroConta(123);
        minhaConta.setSaldo(5000);
        minhaConta.titular = "Breno";

        System.out.println("Conta: " + minhaConta.getNumeroConta());
        System.out.println("Titular: " + minhaConta.titular);
        System.out.println("Saldo: R$" + minhaConta.getSaldo());
    }
}