public class Main {
    public static void main(String[] args) {

        Produto meuProduto = new Produto();

        meuProduto.setNome("Bala");
        meuProduto.setPreco(10);
        meuProduto.setPercentualDesconto(10); 

        System.out.println("Nome: " + meuProduto.getNome());
        System.out.println("Preço original: " + meuProduto.getPreco());
        
        meuProduto.aplicarDesconto(); 
        
        System.out.println("Preço com desconto: " + meuProduto.getPreco());
    }
}