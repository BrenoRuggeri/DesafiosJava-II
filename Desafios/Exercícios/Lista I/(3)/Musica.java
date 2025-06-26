public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void fichaTecnica(){

        System.out.println("Titulo: " + this.titulo);
        System.out.println("Artista: " + this.artista);
        System.out.println("Lançamento: " + this.anoLancamento);
        System.out.println("Avaliacao: " + this.avaliacao);
        System.out.println("Num Avaliacoes: " + this.numAvaliacoes);
    }

    void exibirAvaliacoes(){
        System.out.println("Avaliacoes: " + this.numAvaliacoes);
    }

    double calculaMedia(){
        return avaliacao/numAvaliacoes;
    }

}
