public class Main {
    public static void main(String[] args) {

        IdadePessoa pessoa = new IdadePessoa();

        pessoa.setNome("Breno");
        pessoa.setIdade(23);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        pessoa.verificarIdade(); 
    }
}