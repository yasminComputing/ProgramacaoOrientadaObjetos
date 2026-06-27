package pkg;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	public Produto(String nome,double preco, int quantidade) {
		this.nome= nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public double calcularValorTotal() {
		return preco * quantidade;
	}
	public void exibirInformacoes(){
		System.out.println("Nome do produto: " + nome);
		System.out.println("Preço: R$ " + preco);		 
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Preço total: R$ " + calcularValorTotal());
		
	}
	
}
