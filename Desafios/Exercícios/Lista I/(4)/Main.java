public class Main {
    public static void main(String[] args) {

       Carro myCar = new Carro();

       myCar.ano = 2016;
       myCar.cor = "Preto";
       myCar.modelo = "Bravo T-jet";

       myCar.fichaTecnica();
       System.out.println(myCar.exibirIdade() + " anos");


    }
}