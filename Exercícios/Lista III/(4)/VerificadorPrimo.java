public class VerificadorPrimo extends NumerosPrimos {

    public void ehPrimo(int num) {
        if(verificaPrimalidade(num)){
            System.out.println("O número é primo");
        }else {
            System.out.println("O número não é primo");
        }

    }
}