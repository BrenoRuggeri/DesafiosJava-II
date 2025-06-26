public class GeradorPrimo extends NumerosPrimos {

    public int gerarNumeroPrimo(int primo){
        int proximoPrimo = primo + 1;
        while(!verificaPrimalidade(proximoPrimo)){
            proximoPrimo++;
        }
        return proximoPrimo;
    }

}
