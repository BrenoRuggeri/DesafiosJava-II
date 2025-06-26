public class Livro {

    private String titulo;
    private String autor;

    public void String getAutor(){
        return autor;
    }

    public String setAutor(){
        this.autor = autor;
    }

     public void String getTitulo(){
        return titulo;
    }

    public String setTitulo(){
        this.titulo = titulo;
    }

    public void exibirFicha(){

        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }


}
