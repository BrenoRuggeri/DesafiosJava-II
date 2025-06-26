public class Main {
    public static void main(String[] args) {

       Musica mp3 = new Musica();
       mp3.titulo = "One More Light";
       mp3.artista = "Linkin Park";
       mp3.anoLancamento = 2017;
       mp3.avaliacao = 4.8;
       mp3.numAvaliacoes = 1;

       mp3.fichaTecnica();
       mp3.exibirAvaliacoes();
       System.out.println(mp3.calculaMedia());

    }
}