package pkg;

public class Livro implements Produto{

	private String nome;
	private double preco;
	private String descricao;
	
	public Livro(String nome, double preco, String descricao) {
		this.nome = nome;
	    this.preco = preco;
	    this.descricao = descricao;
	    getNome();
	    getPreco();
	    getDescricao();
	}


	@Override
	public String getNome() {
		if(nome == null|| nome.isBlank()) {
			throw new IllegalStateException("Nome informado é inválido");

		}
		return nome;
	}

	@Override
	public double getPreco() {
		if(preco <= 0 ) {
			throw new IllegalArgumentException("O preço informado não pode ser menor ou igual a zero!");
		}
		return preco;
	}

	@Override
	public String getDescricao() {
		if(descricao == null|| descricao.isBlank()) {
			throw new IllegalStateException("Nome informado é inválido");

		}
		return descricao;
	}
	@Override
	public void dados() {
		System.out.println("=== Livro ===");
		System.out.println("Título: " +getNome());
		System.out.println("Preço: R$ " + getPreco());
		System.out.println("Descrição: " + getDescricao());
	}

}
