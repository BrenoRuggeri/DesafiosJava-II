public class ModeloCarro extends Carro {

    private String nomeModelo;
    private String montadora;

    public void defineNomeModelo(String nomeModelo){
        this.nomeModelo = nomeModelo;
    }

    public void defineMontadora(String montadora){
        this.montadora = montadora;
    }

    public void exibiFichaModelo(){
        System.out.println("Modelo: " + this.nomeModelo);
        System.out.println("Montadora: " + this.montadora);
    }
}