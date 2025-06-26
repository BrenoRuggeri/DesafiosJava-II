public class Main {
    public static void main(String[] args) {

        Aluno breno = new Aluno();

        breno.setNome("Breno");
        breno.setNota1(10);
        breno.setNota2(9);
        breno.setNota3(8);

        System.out.println("Nome: " + breno.getNome());
        System.out.println("Média: " + breno.calcularMedia());
    }
}