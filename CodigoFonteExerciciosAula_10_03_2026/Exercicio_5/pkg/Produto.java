package pkg;

public class Produto {
	public String nome;
	public double preco;
	public int quantidadeEmEstoque;
	
	
public double valorTotalEmEstoque () {
	return preco * quantidadeEmEstoque;
	}

}
