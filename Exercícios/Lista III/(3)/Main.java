public class Main {
    public static void main(String[] args) {

        ContaCorrente breno = new ContaCorrente();
        breno.defineNomeCliente("Breno");
        breno.defineNumeroConta(1234);
        breno.defineTipoConta("Corrente");
        breno.exibeInformacoesCliente();
        
        // Realizando o deposito na conta
        breno.depositar(5000);
        breno.exibeSaldo();
        
        // Realizando um saque
        breno.saque(2500);
        breno.exibeSaldo();
    }
}
