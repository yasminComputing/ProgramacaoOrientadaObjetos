package pkg;

public class Produto {

    private String nome;
    private float preco;
    private int quantidade;

    public Produto(String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    
    public float calcularValorTotalEstoque() {
        return preco * quantidade;
    }

   
    public boolean temEstoque() {
        return quantidade > 0;
    }

    public void adicionarEstoque(int quantidadeAdicionar) {
        if (quantidadeAdicionar > 0) {
            this.quantidade += quantidadeAdicionar;
        }
    }

    public boolean vender(int quantidadeVenda) {
        if (quantidadeVenda > 0 && quantidadeVenda <= quantidade) {
            quantidade -= quantidadeVenda;
            return true;
        }
        return false;
    }
 
    public int getQuantidade() {
        return quantidade;
    }

    
    public String getNome() {
        return nome;
    }

    
    public float getPreco() {
        return preco;
    }
  
}