public class Carro {
    private String modelo;
    private double precoAno1, precoAno2, precoAno3;

    public void defineModelo(String modelo){
        this.modelo = modelo;
    }

    public void definePreco(double precoAno1, double precoAno2, double precoAno3){
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public double calculaMaiorPreco(){
        double maiorPreco = precoAno1;

        if(precoAno2 > maiorPreco){
            maiorPreco = precoAno2;
        }
        if(precoAno3 > maiorPreco){
            maiorPreco = precoAno3;
        }
        return maiorPreco;
    }

    double calculaMenorPreco(){
        double menorPreco = precoAno1;

        if(precoAno2 < menorPreco){
            menorPreco = precoAno2;
        }
        if(precoAno3 < menorPreco){
            menorPreco = precoAno3;
        }
        return menorPreco;
    }

    public void exibiFichaCarro(){
        System.out.println("Modelo: " + modelo);
        System.out.println("O maior preço: " + calculaMaiorPreco());
        System.out.println("O menor preço: " + calculaMenorPreco());
    }
}