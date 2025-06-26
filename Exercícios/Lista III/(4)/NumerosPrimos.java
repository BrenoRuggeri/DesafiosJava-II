public class NumerosPrimos {
    public boolean verificaPrimalidade(int n) {
        if (n <= 1) {
            return false;
        }
        for (int divisor = 2; divisor <= Math.sqrt(n); divisor++) {
            if (n % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public void listaPrimos(int qtdNumeros){
        System.out.println("Os números primos até: " + qtdNumeros);

        for (int i = 2; i <= qtdNumeros; i++) {
            if (verificaPrimalidade(i)) {
                System.out.println(i);
            }
        }
    }
}
