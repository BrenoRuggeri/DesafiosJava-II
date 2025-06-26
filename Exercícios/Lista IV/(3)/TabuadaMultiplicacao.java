public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostraTabuada(int numero) {
        System.out.println("Tabuada do número: " + numero);
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(resultado);
        }
    }

}